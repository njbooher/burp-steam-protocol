
package com.nickbooher.protos.steam.services;

import com.nickbooher.protos.steam.SteamMsgChat;

public interface IChatRoom {

    public SteamMsgChat.CChatRoom_CreateChatRoomGroup_Response CreateChatRoomGroup(SteamMsgChat.CChatRoom_CreateChatRoomGroup_Request request);

    public SteamMsgChat.CChatRoom_SaveChatRoomGroup_Response SaveChatRoomGroup(SteamMsgChat.CChatRoom_SaveChatRoomGroup_Request request);

    public SteamMsgChat.CChatRoom_RenameChatRoomGroup_Response RenameChatRoomGroup(SteamMsgChat.CChatRoom_RenameChatRoomGroup_Request request);

    public SteamMsgChat.CChatRoom_SetChatRoomGroupTagline_Response SetChatRoomGroupTagline(SteamMsgChat.CChatRoom_SetChatRoomGroupTagline_Request request);

    public SteamMsgChat.CChatRoom_SetChatRoomGroupAvatar_Response SetChatRoomGroupAvatar(SteamMsgChat.CChatRoom_SetChatRoomGroupAvatar_Request request);

    public SteamMsgChat.CChatRoom_SetChatRoomGroupWatchingBroadcast_Response SetChatRoomGroupWatchingBroadcast(SteamMsgChat.CChatRoom_SetChatRoomGroupWatchingBroadcast_Request request);

    public SteamMsgChat.CChatRoom_JoinMiniGameForChatRoomGroup_Response JoinMiniGameForChatRoomGroup(SteamMsgChat.CChatRoom_JoinMiniGameForChatRoomGroup_Request request);

    public SteamMsgChat.CChatRoom_EndMiniGameForChatRoomGroup_Response EndMiniGameForChatRoomGroup(SteamMsgChat.CChatRoom_EndMiniGameForChatRoomGroup_Request request);

    public SteamMsgChat.CChatRoom_MuteUser_Response MuteUserInGroup(SteamMsgChat.CChatRoom_MuteUser_Request request);

    public SteamMsgChat.CChatRoom_KickUser_Response KickUserFromGroup(SteamMsgChat.CChatRoom_KickUser_Request request);

    public SteamMsgChat.CChatRoom_SetUserBanState_Response SetUserBanState(SteamMsgChat.CChatRoom_SetUserBanState_Request request);

    public SteamMsgChat.CChatRoom_RevokeInvite_Response RevokeInviteToGroup(SteamMsgChat.CChatRoom_RevokeInvite_Request request);

    public SteamMsgChat.CChatRoom_CreateRole_Response CreateRole(SteamMsgChat.CChatRoom_CreateRole_Request request);

    public SteamMsgChat.CChatRoom_GetRoles_Response GetRoles(SteamMsgChat.CChatRoom_GetRoles_Request request);

    public SteamMsgChat.CChatRoom_RenameRole_Response RenameRole(SteamMsgChat.CChatRoom_RenameRole_Request request);

    public SteamMsgChat.CChatRoom_ReorderRole_Response ReorderRole(SteamMsgChat.CChatRoom_ReorderRole_Request request);

    public SteamMsgChat.CChatRoom_DeleteRole_Response DeleteRole(SteamMsgChat.CChatRoom_DeleteRole_Request request);

    public SteamMsgChat.CChatRoom_GetRoleActions_Response GetRoleActions(SteamMsgChat.CChatRoom_GetRoleActions_Request request);

    public SteamMsgChat.CChatRoom_ReplaceRoleActions_Response ReplaceRoleActions(SteamMsgChat.CChatRoom_ReplaceRoleActions_Request request);

    public SteamMsgChat.CChatRoom_AddRoleToUser_Response AddRoleToUser(SteamMsgChat.CChatRoom_AddRoleToUser_Request request);

    public SteamMsgChat.CChatRoom_GetRolesForUser_Response GetRolesForUser(SteamMsgChat.CChatRoom_GetRolesForUser_Request request);

    public SteamMsgChat.CChatRoom_DeleteRoleFromUser_Response DeleteRoleFromUser(SteamMsgChat.CChatRoom_DeleteRoleFromUser_Request request);

    public SteamMsgChat.CChatRoom_JoinChatRoomGroup_Response JoinChatRoomGroup(SteamMsgChat.CChatRoom_JoinChatRoomGroup_Request request);

    public SteamMsgChat.CChatRoom_InviteFriendToChatRoomGroup_Response InviteFriendToChatRoomGroup(SteamMsgChat.CChatRoom_InviteFriendToChatRoomGroup_Request request);

    public SteamMsgChat.CChatRoom_LeaveChatRoomGroup_Response LeaveChatRoomGroup(SteamMsgChat.CChatRoom_LeaveChatRoomGroup_Request request);

    public SteamMsgChat.CChatRoom_CreateChatRoom_Response CreateChatRoom(SteamMsgChat.CChatRoom_CreateChatRoom_Request request);

    public SteamMsgChat.CChatRoom_DeleteChatRoom_Response DeleteChatRoom(SteamMsgChat.CChatRoom_DeleteChatRoom_Request request);

    public SteamMsgChat.CChatRoom_RenameChatRoom_Response RenameChatRoom(SteamMsgChat.CChatRoom_RenameChatRoom_Request request);

    public SteamMsgChat.CChatRoom_ReorderChatRoom_Response ReorderChatRoom(SteamMsgChat.CChatRoom_ReorderChatRoom_Request request);

    public SteamMsgChat.CChatRoom_SendChatMessage_Response SendChatMessage(SteamMsgChat.CChatRoom_SendChatMessage_Request request);

    public SteamMsgChat.CChatRoom_JoinVoiceChat_Response JoinVoiceChat(SteamMsgChat.CChatRoom_JoinVoiceChat_Request request);

    public SteamMsgChat.CChatRoom_LeaveVoiceChat_Response LeaveVoiceChat(SteamMsgChat.CChatRoom_LeaveVoiceChat_Request request);

    public SteamMsgChat.CChatRoom_GetMessageHistory_Response GetMessageHistory(SteamMsgChat.CChatRoom_GetMessageHistory_Request request);

    public SteamMsgChat.CChatRoom_GetMyChatRoomGroups_Response GetMyChatRoomGroups(SteamMsgChat.CChatRoom_GetMyChatRoomGroups_Request request);

    public SteamMsgChat.CChatRoom_GetChatRoomGroupState_Response GetChatRoomGroupState(SteamMsgChat.CChatRoom_GetChatRoomGroupState_Request request);

    public SteamMsgChat.CChatRoom_GetChatRoomGroupSummary_Response GetChatRoomGroupSummary(SteamMsgChat.CChatRoom_GetChatRoomGroupSummary_Request request);

    public SteamMsgChat.CChatRoom_SetAppChatRoomGroupForceActive_Response SetAppChatRoomGroupForceActive(SteamMsgChat.CChatRoom_SetAppChatRoomGroupForceActive_Request request);

    public void SetAppChatRoomGroupStopForceActive(SteamMsgChat.CChatRoom_SetAppChatRoomGroupStopForceActive_Notification request);

    public void AckChatMessage(SteamMsgChat.CChatRoom_AckChatMessage_Notification request);

    public SteamMsgChat.CChatRoom_CreateInviteLink_Response CreateInviteLink(SteamMsgChat.CChatRoom_CreateInviteLink_Request request);

    public SteamMsgChat.CChatRoom_GetInviteLinkInfo_Response GetInviteLinkInfo(SteamMsgChat.CChatRoom_GetInviteLinkInfo_Request request);

    public SteamMsgChat.CChatRoom_GetInviteInfo_Response GetInviteInfo(SteamMsgChat.CChatRoom_GetInviteInfo_Request request);

    public SteamMsgChat.CChatRoom_GetInviteLinksForGroup_Response GetInviteLinksForGroup(SteamMsgChat.CChatRoom_GetInviteLinksForGroup_Request request);

    public SteamMsgChat.CChatRoom_GetBanList_Response GetBanList(SteamMsgChat.CChatRoom_GetBanList_Request request);

    public SteamMsgChat.CChatRoom_GetInviteList_Response GetInviteList(SteamMsgChat.CChatRoom_GetInviteList_Request request);

    public SteamMsgChat.CChatRoom_DeleteInviteLink_Response DeleteInviteLink(SteamMsgChat.CChatRoom_DeleteInviteLink_Request request);

    public SteamMsgChat.CChatRoom_SetSessionActiveChatRoomGroups_Response SetSessionActiveChatRoomGroups(SteamMsgChat.CChatRoom_SetSessionActiveChatRoomGroups_Request request);

    public SteamMsgChat.CChatRoom_SetUserChatGroupPreferences_Response SetUserChatGroupPreferences(SteamMsgChat.CChatRoom_SetUserChatGroupPreferences_Request request);

    public SteamMsgChat.CChatRoom_DeleteChatMessages_Response DeleteChatMessages(SteamMsgChat.CChatRoom_DeleteChatMessages_Request request);

    public void UpdateMemberListView(SteamMsgChat.CChatRoom_UpdateMemberListView_Notification request);

    public SteamMsgChat.CChatRoom_SearchMembers_Response SearchMembers(SteamMsgChat.CChatRoom_SearchMembers_Request request);

    public SteamMsgChat.CChatRoom_UpdateMessageReaction_Response UpdateMessageReaction(SteamMsgChat.CChatRoom_UpdateMessageReaction_Request request);

    public SteamMsgChat.CChatRoom_GetMessageReactionReactors_Response GetMessageReactionReactors(SteamMsgChat.CChatRoom_GetMessageReactionReactors_Request request);
    
}

