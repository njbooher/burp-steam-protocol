
package com.nickbooher.protos.steam.services;

import com.nickbooher.protos.steam.SteamMsgChat;

public interface IChatRoomClient {

    public void NotifyIncomingChatMessage(SteamMsgChat.CChatRoom_IncomingChatMessage_Notification request);

    public void NotifyChatMessageModified(SteamMsgChat.CChatRoom_ChatMessageModified_Notification request);

    public void NotifyMemberStateChange(SteamMsgChat.CChatRoom_MemberStateChange_Notification request);

    public void NotifyChatRoomHeaderStateChange(SteamMsgChat.CChatRoom_ChatRoomHeaderState_Notification request);

    public void NotifyChatRoomGroupRoomsChange(SteamMsgChat.CChatRoom_ChatRoomGroupRoomsChange_Notification request);

    public void NotifyShouldRejoinChatRoomVoiceChat(SteamMsgChat.CChatRoom_NotifyShouldRejoinChatRoomVoiceChat_Notification request);

    public void NotifyChatGroupUserStateChanged(SteamMsgChat.ChatRoomClient_NotifyChatGroupUserStateChanged_Notification request);

    public void NotifyAckChatMessageEcho(SteamMsgChat.CChatRoom_AckChatMessage_Notification request);

    public void NotifyChatRoomDisconnect(SteamMsgChat.ChatRoomClient_NotifyChatRoomDisconnect_Notification request);

    public void NotifyMemberListViewUpdated(SteamMsgChat.CChatRoomClient_MemberListViewUpdated_Notification request);

    public void NotifyMessageReaction(SteamMsgChat.CChatRoom_MessageReaction_Notification request);
    
}

