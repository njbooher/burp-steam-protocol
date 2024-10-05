
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgFriendMessages;

public interface IFriendMessages {

    public void AckMessage(SteamMsgFriendMessages.CFriendMessages_AckMessage_Notification request);

    public SteamMsgFriendMessages.CFriendsMessages_GetActiveMessageSessions_Response GetActiveMessageSessions(SteamMsgFriendMessages.CFriendsMessages_GetActiveMessageSessions_Request request);

    public SteamMsgFriendMessages.CFriendMessages_GetRecentMessages_Response GetRecentMessages(SteamMsgFriendMessages.CFriendMessages_GetRecentMessages_Request request);

    public SteamMsgFriendMessages.CFriendMessages_IsInFriendsUIBeta_Response IsInFriendsUIBeta(SteamMsgFriendMessages.CFriendMessages_IsInFriendsUIBeta_Request request);

    public SteamMsgFriendMessages.CFriendMessages_SendMessage_Response SendMessage(SteamMsgFriendMessages.CFriendMessages_SendMessage_Request request);

    public SteamMsgFriendMessages.CFriendMessages_UpdateMessageReaction_Response UpdateMessageReaction(SteamMsgFriendMessages.CFriendMessages_UpdateMessageReaction_Request request);
    
}

