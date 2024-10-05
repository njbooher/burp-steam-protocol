
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgStoreSales;

public interface IStoreSales {

    public SteamMsgStoreSales.CStore_GetUserVotes_Response GetUserVotes(SteamMsgStoreSales.CStore_GetUserVotes_Request request);

    public SteamMsgStoreSales.CStore_GetVoteDefinitions_Response GetVoteDefinitions(SteamMsgStoreSales.CStore_GetVoteDefinitions_Request request);

    public SteamMsgStoreSales.CStore_SetVote_Response SetVote(SteamMsgStoreSales.CStore_SetVote_Request request);
    
}

