
package com.nickbooher.protos.steam.services;

import com.nickbooher.protos.steam.SteamMsgFriendMessages;

public interface IFriendMessages {

    public SteamMsgFriendMessages.CFriendMessages_GetRecentMessages_Response GetRecentMessages(SteamMsgFriendMessages.CFriendMessages_GetRecentMessages_Request request);

    public SteamMsgFriendMessages.CFriendsMessages_GetActiveMessageSessions_Response GetActiveMessageSessions(SteamMsgFriendMessages.CFriendsMessages_GetActiveMessageSessions_Request request);

    public SteamMsgFriendMessages.CFriendMessages_SendMessage_Response SendMessage(SteamMsgFriendMessages.CFriendMessages_SendMessage_Request request);

    public void AckMessage(SteamMsgFriendMessages.CFriendMessages_AckMessage_Notification request);

    public SteamMsgFriendMessages.CFriendMessages_IsInFriendsUIBeta_Response IsInFriendsUIBeta(SteamMsgFriendMessages.CFriendMessages_IsInFriendsUIBeta_Request request);

    public SteamMsgFriendMessages.CFriendMessages_UpdateMessageReaction_Response UpdateMessageReaction(SteamMsgFriendMessages.CFriendMessages_UpdateMessageReaction_Request request);
    
}

