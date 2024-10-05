
package com.nickbooher.protos.steam.services;

import com.nickbooher.protos.steam.SteamMsgGameServers;

public interface IGameServerClient {

    public SteamMsgGameServers.GameServerClient_QueryServerData_Response QueryServerData(SteamMsgGameServers.GameServerClient_QueryServerData_Request request);
    
}

