
package com.nickbooher.protos.steam.services;

import com.nickbooher.protos.steam.SteamMsgFriendMessages;

public interface IFriendMessagesClient {

    public void IncomingMessage(SteamMsgFriendMessages.CFriendMessages_IncomingMessage_Notification request);

    public void NotifyAckMessageEcho(SteamMsgFriendMessages.CFriendMessages_AckMessage_Notification request);

    public void MessageReaction(SteamMsgFriendMessages.CFriendMessages_MessageReaction_Notification request);
    
}

