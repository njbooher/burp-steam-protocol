
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgWebRTC;

public interface IWebRTCClientNotifications {

    public void NotifyWebRTCSessionConnected(SteamMsgWebRTC.CWebRTC_WebRTCSessionConnected_Notification request);

    public void NotifyWebRTCUpdateRemoteDescription(SteamMsgWebRTC.CWebRTC_WebRTCUpdateRemoteDescription_Notification request);
    
}

