
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgChat;

public interface IChat {

    public SteamMsgChat.CChat_RequestFriendPersonaStates_Response RequestFriendPersonaStates(SteamMsgChat.CChat_RequestFriendPersonaStates_Request request);
    
}

