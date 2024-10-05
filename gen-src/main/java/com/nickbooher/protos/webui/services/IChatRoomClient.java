
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgChatRoom;

public interface IChatRoomClient {

    public void NotifyAckChatMessageEcho(SteamMsgChatRoom.CChatRoom_AckChatMessage_Notification request);

    public void NotifyChatGroupUserStateChanged(SteamMsgChatRoom.ChatRoomClient_NotifyChatGroupUserStateChanged_Notification request);

    public void NotifyChatMessageModified(SteamMsgChatRoom.CChatRoom_ChatMessageModified_Notification request);

    public void NotifyChatRoomDisconnect(SteamMsgChatRoom.ChatRoomClient_NotifyChatRoomDisconnect_Notification request);

    public void NotifyChatRoomGroupRoomsChange(SteamMsgChatRoom.CChatRoom_ChatRoomGroupRoomsChange_Notification request);

    public void NotifyChatRoomHeaderStateChange(SteamMsgChatRoom.CChatRoom_ChatRoomHeaderState_Notification request);

    public void NotifyIncomingChatMessage(SteamMsgChatRoom.CChatRoom_IncomingChatMessage_Notification request);

    public void NotifyMemberListViewUpdated(SteamMsgChatRoom.CChatRoomClient_MemberListViewUpdated_Notification request);

    public void NotifyMemberStateChange(SteamMsgChatRoom.CChatRoom_MemberStateChange_Notification request);

    public void NotifyMessageReaction(SteamMsgChatRoom.CChatRoom_MessageReaction_Notification request);

    public void NotifyShouldRejoinChatRoomVoiceChat(SteamMsgChatRoom.CChatRoom_NotifyShouldRejoinChatRoomVoiceChat_Notification request);
    
}

