import csv
import os
import os.path
import shutil
import subprocess
import re
import argparse

import glob

PROTOWORKPATH="build/tmp/protobuf"
SERVICEOUTPATH="gen-src/main/java/com/nickbooher/protos"

proto_transforms = {
    re.compile(r'(\s+)\.CMsg'): r'\1{protobuf_package_name}.CMsg',
    re.compile(r'\((\.(?:C|GameServerClient|LobbyMatchmakingLegacy)[A-Za-z0-9_]+_(?:Request|Response|Notification))\)'): r'({protobuf_package_name}\1)',
    re.compile(r'\t\t(\.CRemote[A-Za-z0-9_]+_(?:Request|Response|Notification))'): r'{protobuf_package_name}\1',
    re.compile(r'\((\.description)\)'): r'({protobuf_package_name}\1)',
    re.compile(r'\((\.NoResponse|\.NotImplemented|\.CSteamVR_Header)\)'): r'({protobuf_package_name}\1)',
    re.compile(r'(optional|repeated|required) \.([A-Za-z])'): r'\1 {protobuf_package_name}.\2',
}


proto_header_template = """
syntax = "proto2";
package {protobuf_package_name};
option java_outer_classname = "{java_class_name}";
option java_package = "{java_package_name}";

"""

service_interface_template = """
package {java_package_name}.services;

import {java_package_name}.{java_class_name};

public interface I{service_name} {{
{rpcs}    
}}

"""

webui_service_interface_template = """
package {java_package_name}.services;

import {java_package_name}.SteamMsgCommon;
import {java_package_name}.{java_class_name};

public interface I{service_name} {{
{rpcs}    
}}

"""

service_method_template = """
    public {response_java_class_name}.{response_class} {rpc_name}({request_java_class_name}.{request_class} request);
"""

service_notification_template = """
    public void {rpc_name}({request_java_class_name}.{request_class} request);
"""

service_pattern = r'^service (?P<service_name>[A-Za-z0-9]+) \{(?P<service_body>[^}]+)\}'
rpc_pattern = r'^\s+rpc (?P<rpc_name>[A-Za-z0-9_-]+) \([A-Za-z0-9_-]+\.(?P<request_class>[A-Za-z0-9_-]+)\) returns \([A-Za-z0-9_-]+\.(?P<response_class>[A-Za-z0-9_-]+)\)'

def copy_and_transform(PROTOSRCPATH, protos):

    all_protos = {}
    
    for proto in protos:

        filedir = os.path.dirname(proto['File'])
        filename = os.path.basename(proto['File'])

        protobuf_package = filedir

        work_filedir = os.path.join(PROTOWORKPATH, filedir)

        src_filedir = os.path.join(PROTOSRCPATH, filedir)
        src_filepath = os.path.join(PROTOSRCPATH, proto['File'])
        work_filepath = os.path.join(PROTOWORKPATH, proto['File'])

        os.makedirs(work_filedir, exist_ok=True)

        if src_filedir not in all_protos:
            all_protos[src_filedir] = set([proto_filename for proto_filename in glob.glob('*.proto', root_dir=src_filedir)])
        
        all_protos[src_filedir].remove(filename)

        with open(src_filepath, 'r') as input_file:
            proto_text = input_file.read()
        
        for pattern, replacement in proto_transforms.items():
            formatted_replacement = replacement.format(protobuf_package_name=protobuf_package)
            proto_text = pattern.sub(formatted_replacement, proto_text)
        
        header = proto_header_template.format(protobuf_package_name=protobuf_package, java_class_name=proto['ClassName'], java_package_name=proto['Package'])

        proto_text = header + proto_text

        with open(work_filepath, 'w') as output_file:
            output_file.write(proto_text)
    

    for src_filedir in all_protos:

        if len(all_protos[src_filedir]) > 0:
            print(f"Warning: {len(all_protos[src_filedir])} unused protos in {src_filedir}")
            for proto_filename in sorted(all_protos[src_filedir]):
                print(f"\t{proto_filename}")
        

def build(protos):
    for proto in protos:

        filedir = os.path.dirname(proto['File'])

        work_filedir = os.path.join(PROTOWORKPATH, filedir)
        work_filepath = os.path.join(PROTOWORKPATH, proto['File'])

        cmd = ['protoc', '--java_out', './gen-src/main/java/', '--proto_path', work_filedir, work_filepath]
        subprocess.check_output(cmd)

def gen_services(protos):

    for proto in protos:

        filedir = os.path.dirname(proto['File'])
        
        if proto['Package'] == 'com.nickbooher.protos.steamworks':
            filedir = 'steamworks'

        proto_filepath = os.path.join(PROTOWORKPATH, proto['File'])

        with open(proto_filepath, 'r') as input_file:
            proto_text = input_file.read()

        for smatch in re.finditer(service_pattern, proto_text, re.MULTILINE):

            if smatch.group('service_name') == 'RemoteClient' or smatch.group('service_name') == 'RemoteClientSteamClient':
                service_java_class_name = "SteamMsgRemoteClientMessages"
                request_java_class_name = response_java_class_name = "SteamMsgRemoteClientMessages"
            else:
                service_java_class_name = proto['ClassName']
                request_java_class_name = response_java_class_name = proto['ClassName']

            interface_body = ""

            for rmatch in re.finditer(rpc_pattern, smatch.group('service_body'), re.MULTILINE):

                if rmatch.group('response_class') == 'NoResponse':
                    interface_body += service_notification_template.format(rpc_name=rmatch.group('rpc_name'), 
                                                                           request_java_class_name=request_java_class_name, 
                                                                           request_class=rmatch.group('request_class'))
                else:
                    interface_body += service_method_template.format(rpc_name=rmatch.group('rpc_name'), 
                                                                     request_java_class_name=request_java_class_name, 
                                                                     request_class=rmatch.group('request_class'), 
                                                                     response_java_class_name=response_java_class_name, 
                                                                     response_class=rmatch.group('response_class'))

        
            service_text = service_interface_template.format(service_name=smatch.group('service_name'), 
                                                             java_class_name=service_java_class_name, 
                                                             java_package_name=proto['Package'], 
                                                             rpcs=interface_body)
            
            service_filepath = os.path.join(SERVICEOUTPATH, filedir, 'services', 'I' + smatch.group('service_name') + '.java')
            service_filedir = os.path.dirname(service_filepath)

            os.makedirs(service_filedir, exist_ok=True)

            with open(service_filepath, 'w') as output_file:
                output_file.write(service_text)

def gen_services_webui(protos):

    for proto in protos:

        filedir = os.path.dirname(proto['File'])

        proto_filepath = os.path.join(PROTOWORKPATH, proto['File'])

        with open(proto_filepath, 'r') as input_file:
            proto_text = input_file.read()

        for smatch in re.finditer(service_pattern, proto_text, re.MULTILINE):

            interface_body = ""

            for rmatch in re.finditer(rpc_pattern, smatch.group('service_body'), re.MULTILINE):

                if rmatch.group('request_class') == 'NotImplemented':
                    continue

                if rmatch.group('request_class') == "CStoreBrowse_GetItems_Request":
                    request_java_class_name = response_java_class_name = "SteamMsgCommon"
                elif rmatch.group('response_class') == "CChatRoom_GetChatRoomGroupSummary_Response":
                    request_java_class_name = proto['ClassName']
                    response_java_class_name = "SteamMsgCommon"
                else:
                    request_java_class_name = response_java_class_name = proto['ClassName']


                if rmatch.group('response_class') == 'NoResponse':
                    interface_body += service_notification_template.format(rpc_name=rmatch.group('rpc_name'), 
                                                                           request_java_class_name=request_java_class_name,
                                                                           request_class=rmatch.group('request_class'))
                else:
                    interface_body += service_method_template.format(rpc_name=rmatch.group('rpc_name'), 
                                                                     request_java_class_name=request_java_class_name, 
                                                                     request_class=rmatch.group('request_class'), 
                                                                     response_java_class_name=response_java_class_name, 
                                                                     response_class=rmatch.group('response_class'))

            service_text = webui_service_interface_template.format(service_name=smatch.group('service_name'), 
                                                                   java_class_name=proto['ClassName'], 
                                                                   java_package_name=proto['Package'], 
                                                                   rpcs=interface_body)
            
            service_filepath = os.path.join(SERVICEOUTPATH, filedir, 'services', 'I' + smatch.group('service_name') + '.java')
            service_filedir = os.path.dirname(service_filepath)

            os.makedirs(service_filedir, exist_ok=True)

            with open(service_filepath, 'w') as output_file:
                output_file.write(service_text)

def main_base(proto_csv_path, proto_basedir, gen_services_fn):

    os.makedirs('gen-src/main/java', exist_ok=True)
    os.makedirs(PROTOWORKPATH, exist_ok=True)

    protos = []

    if os.path.exists(proto_csv_path):
        with open(proto_csv_path, 'r') as csvfile:
            reader = csv.DictReader(csvfile)
            for row in reader:
                protos.append(row)

    copy_and_transform(proto_basedir, protos)
    build(protos)
    gen_services_fn(protos)

    shutil.rmtree(PROTOWORKPATH)

def main_game():
    main_base('resources/protos_game.csv', 'Protobufs', gen_services)

def main_custom():
    main_base('custom/resources/protos_custom.csv', 'custom/resources', gen_services)

def main_webui():
    main_base('resources/protos_webui.csv', 'Protobufs', gen_services_webui)

def main_client():
    main_base('resources/protos.csv', 'Protobufs', gen_services)

if __name__ == "__main__":
    parser = argparse.ArgumentParser(description='Compile protobufs.')
    parser.add_argument('--mode', help='client, game, webui, or custom', required=False, default='client')
    args = parser.parse_args()

    if args.mode == 'game':
        main_game()
    elif args.mode == 'custom':
        main_custom()
    elif args.mode == 'webui':
        main_webui()
    else:
        main_client()



