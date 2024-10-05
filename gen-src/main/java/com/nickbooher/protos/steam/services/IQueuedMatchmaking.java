
package com.nickbooher.protos.steam.services;

import com.nickbooher.protos.steam.SteamMsgQMS;

public interface IQueuedMatchmaking {

    public SteamMsgQMS.CQueuedMatchmaking_SearchForGame_Response SearchForGame(SteamMsgQMS.CQueuedMatchmaking_SearchForGame_Request request);
    
}

