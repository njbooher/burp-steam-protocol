
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgsSteamVRVoiceChat;

public interface ISteamVRVoiceChat {

    public void Active(SteamMsgsSteamVRVoiceChat.CSteamVR_VoiceChat_Active_Notification request);

    public void GroupName(SteamMsgsSteamVRVoiceChat.CSteamVR_VoiceChat_GroupName_Notification request);

    public void Inactive(SteamMsgsSteamVRVoiceChat.CSteamVR_VoiceChat_Inactive_Notification request);

    public void NewGroupChatMsgAdded(SteamMsgsSteamVRVoiceChat.CSteamVR_VoiceChat_NewGroupChatMsgAdded_Notification request);

    public void PerUserGainValue(SteamMsgsSteamVRVoiceChat.CSteamVR_VoiceChat_PerUserGainValue_Notification request);

    public void PerUserVoiceStatus(SteamMsgsSteamVRVoiceChat.CSteamVR_VoiceChat_PerUserVoiceStatus_Notification request);

    public void SetDefaultSession(SteamMsgsSteamVRVoiceChat.CSteamVR_VoiceChat_SetDefaultSession_Notification request);

    public void SetSpatialAudioListener(SteamMsgsSteamVRVoiceChat.CSteamVR_VoiceChat_SetSpatialAudioListener_Notification request);

    public void SetSpatialAudioSource(SteamMsgsSteamVRVoiceChat.CSteamVR_VoiceChat_SetSpatialAudioSource_Notification request);
    
}

