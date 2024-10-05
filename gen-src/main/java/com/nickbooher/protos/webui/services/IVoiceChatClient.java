
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgVoiceChat;

public interface IVoiceChatClient {

    public void NotifyAllUsersVoiceStatus(SteamMsgVoiceChat.CVoiceChat_AllMembersStatus_Notification request);

    public void NotifyOneOnOneChatRequested(SteamMsgVoiceChat.CVoiceChat_OneOnOneChatRequested_Notification request);

    public void NotifyOneOnOneChatResponse(SteamMsgVoiceChat.CVoiceChat_OneOnOneChatRequestResponse_Notification request);

    public void NotifyUserJoinedVoiceChat(SteamMsgVoiceChat.CVoiceChat_UserJoinedVoiceChat_Notification request);

    public void NotifyUserLeftVoiceChat(SteamMsgVoiceChat.CVoiceChat_UserLeftVoiceChat_Notification request);

    public void NotifyUserVoiceStatus(SteamMsgVoiceChat.CVoiceChat_UserVoiceStatus_Notification request);

    public void NotifyVoiceChatEnded(SteamMsgVoiceChat.CVoiceChat_VoiceChatEnded_Notification request);
    
}

