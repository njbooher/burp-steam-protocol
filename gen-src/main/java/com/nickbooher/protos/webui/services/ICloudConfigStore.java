
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgCloudConfigStore;

public interface ICloudConfigStore {

    public SteamMsgCloudConfigStore.CCloudConfigStore_Download_Response Download(SteamMsgCloudConfigStore.CCloudConfigStore_Download_Request request);

    public SteamMsgCloudConfigStore.CCloudConfigStore_Upload_Response Upload(SteamMsgCloudConfigStore.CCloudConfigStore_Upload_Request request);
    
}

