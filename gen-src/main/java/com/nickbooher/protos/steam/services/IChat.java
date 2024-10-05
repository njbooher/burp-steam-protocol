
package com.nickbooher.protos.steam.services;

import com.nickbooher.protos.steam.SteamMsgChat;

public interface IChat {

    public SteamMsgChat.CChat_RequestFriendPersonaStates_Response RequestFriendPersonaStates(SteamMsgChat.CChat_RequestFriendPersonaStates_Request request);
    
}

