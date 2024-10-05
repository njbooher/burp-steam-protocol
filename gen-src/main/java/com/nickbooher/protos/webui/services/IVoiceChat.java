
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgVoiceChat;

public interface IVoiceChat {

    public SteamMsgVoiceChat.CVoiceChat_AnswerOneOnOneChat_Response AnswerOneOnOneChat(SteamMsgVoiceChat.CVoiceChat_AnswerOneOnOneChat_Request request);

    public SteamMsgVoiceChat.CVoiceChat_EndOneOnOneChat_Response EndOneOnOneChat(SteamMsgVoiceChat.CVoiceChat_EndOneOnOneChat_Request request);

    public SteamMsgVoiceChat.CVoiceChat_LeaveOneOnOneChat_Response LeaveOneOnOneChat(SteamMsgVoiceChat.CVoiceChat_LeaveOneOnOneChat_Request request);

    public SteamMsgVoiceChat.CVoiceChat_LeaveVoiceChat_Response LeaveVoiceChat(SteamMsgVoiceChat.CVoiceChat_LeaveVoiceChat_Request request);

    public void NotifyUserVoiceStatus(SteamMsgVoiceChat.CVoiceChat_UserVoiceStatus_Notification request);

    public SteamMsgVoiceChat.CVoiceChat_RequestOneOnOneChat_Response RequestOneOnOneChat(SteamMsgVoiceChat.CVoiceChat_RequestOneOnOneChat_Request request);

    public SteamMsgVoiceChat.CVoiceChat_UpdateUserVideoStatus_Response UpdateUserVideoStatus(SteamMsgVoiceChat.CVoiceChat_UpdateUserVideoStatus_Request request);

    public SteamMsgVoiceChat.CVoiceChat_UpdateVoiceChatWebRTCData_Response UpdateVoiceChatWebRTCData(SteamMsgVoiceChat.CVoiceChat_UpdateVoiceChatWebRTCData_Request request);

    public SteamMsgVoiceChat.CVoiceChat_UploadClientVoiceChatLogs_Response UploadClientVoiceChatLogs(SteamMsgVoiceChat.CVoiceChat_UploadClientVoiceChatLogs_Request request);
    
}

