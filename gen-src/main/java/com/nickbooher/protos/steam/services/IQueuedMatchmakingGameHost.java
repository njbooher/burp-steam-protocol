
package com.nickbooher.protos.steam.services;

import com.nickbooher.protos.steam.SteamMsgQMS;

public interface IQueuedMatchmakingGameHost {

    public SteamMsgQMS.CQueuedMatchmakingGameHost_SearchForPlayers_Response SearchForPlayers(SteamMsgQMS.CQueuedMatchmakingGameHost_SearchForPlayers_Request request);

    public SteamMsgQMS.CQueuedMatchmakingGameHost_SubmitPlayerResult_Response SubmitPlayerResult(SteamMsgQMS.CQueuedMatchmakingGameHost_SubmitPlayerResult_Request request);

    public SteamMsgQMS.CQueuedMatchmakingGameHost_EndGame_Response EndGame(SteamMsgQMS.CQueuedMatchmakingGameHost_EndGame_Request request);
    
}

