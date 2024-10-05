
package com.nickbooher.protos.steam.services;

import com.nickbooher.protos.steam.SteamMsgLobbyMatchmaking;

public interface ILobbyMatchmakingLegacy {

    public SteamMsgLobbyMatchmaking.LobbyMatchmakingLegacy_GetLobbyStatus_Response GetLobbyStatus(SteamMsgLobbyMatchmaking.LobbyMatchmakingLegacy_GetLobbyStatus_Request request);
    
}

