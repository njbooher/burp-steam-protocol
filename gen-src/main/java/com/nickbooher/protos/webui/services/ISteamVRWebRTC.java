
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgsSteamVRWebRTC;

public interface ISteamVRWebRTC {

    public void Active(SteamMsgsSteamVRWebRTC.CSteamVR_WebRTC_Active_Notification request);

    public void Header(SteamMsgsSteamVRWebRTC.CSteamVR_Header request);

    public void Inactive(SteamMsgsSteamVRWebRTC.CSteamVR_WebRTC_Inactive_Notification request);

    public void Notify_DataChannelClose(SteamMsgsSteamVRWebRTC.CSteamVR_WebRTC_DataChannel_Close_Notification request);

    public void Notify_DataChannelError(SteamMsgsSteamVRWebRTC.CSteamVR_WebRTC_DataChannel_Error_Notification request);

    public void Notify_DataChannelMessage(SteamMsgsSteamVRWebRTC.CSteamVR_WebRTC_DataChannel_Message_Notification request);

    public void Notify_DataChannelOpen(SteamMsgsSteamVRWebRTC.CSteamVR_WebRTC_DataChannel_Open_Notification request);

    public void Notify_OnDataChannel(SteamMsgsSteamVRWebRTC.CSteamVR_WebRTC_OnDataChannel_Notification request);
    
}

