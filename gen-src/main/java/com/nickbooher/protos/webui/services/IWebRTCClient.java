
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgWebRTC;

public interface IWebRTCClient {

    public SteamMsgWebRTC.CWebRTCClient_AcknowledgeUpdatedRemoteDescription_Response AcknowledgeUpdatedRemoteDescription(SteamMsgWebRTC.CWebRTCClient_AcknowledgeUpdatedRemoteDescription_Request request);

    public SteamMsgWebRTC.CWebRTCClient_InitiateWebRTCConnection_Response InitiateWebRTCConnection(SteamMsgWebRTC.CWebRTCClient_InitiateWebRTCConnection_Request request);

    public SteamMsgWebRTC.CWebRTCClient_UpdateWebRTCConnection_Response UpdateWebRTCConnection(SteamMsgWebRTC.CWebRTCClient_UpdateWebRTCConnection_Request request);
    
}

