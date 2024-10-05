
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgFriendMessages;

public interface IFriendMessagesClient {

    public void IncomingMessage(SteamMsgFriendMessages.CFriendMessages_IncomingMessage_Notification request);

    public void MessageReaction(SteamMsgFriendMessages.CFriendMessages_MessageReaction_Notification request);

    public void NotifyAckMessageEcho(SteamMsgFriendMessages.CFriendMessages_AckMessage_Notification request);
    
}

