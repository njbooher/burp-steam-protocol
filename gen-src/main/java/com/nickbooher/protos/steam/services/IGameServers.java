
package com.nickbooher.protos.steam.services;

import com.nickbooher.protos.steam.SteamMsgGameServers;

public interface IGameServers {

    public SteamMsgGameServers.CGameServers_GetServerList_Response GetServerList(SteamMsgGameServers.CGameServers_GetServerList_Request request);

    public SteamMsgGameServers.CGameServers_IPsWithSteamIDs_Response GetServerSteamIDsByIP(SteamMsgGameServers.CGameServers_GetServerSteamIDsByIP_Request request);

    public SteamMsgGameServers.CGameServers_IPsWithSteamIDs_Response GetServerIPsBySteamID(SteamMsgGameServers.CGameServers_GetServerIPsBySteamID_Request request);

    public SteamMsgGameServers.CGameServers_GameServerQuery_Response QueryByFakeIP(SteamMsgGameServers.CGameServers_QueryByFakeIP_Request request);
    
}

