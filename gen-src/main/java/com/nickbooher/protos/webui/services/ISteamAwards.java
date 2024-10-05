
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgsSteamAwards;

public interface ISteamAwards {

    public SteamMsgsSteamAwards.CSteamAwards_GetNominationRecommendations_Response GetNominationRecommendations(SteamMsgsSteamAwards.CSteamAwards_GetNominationRecommendations_Request request);

    public SteamMsgsSteamAwards.CSteamAwards_GetNominationShareLink_Response GetNominationShareLink(SteamMsgsSteamAwards.CSteamAwards_GetNominationShareLink_Request request);

    public SteamMsgsSteamAwards.CSteamAwards_GetUserNominations_Response GetOtherUserNominations(SteamMsgsSteamAwards.CSteamAwards_GetOtherUserNominations_Request request);

    public SteamMsgsSteamAwards.CSteamAwards_GetUserNominations_Response GetUserNominations(SteamMsgsSteamAwards.CSteamAwards_GetUserNominations_Request request);

    public SteamMsgsSteamAwards.CSteamAwards_Nominate_Response Nominate(SteamMsgsSteamAwards.CSteamAwards_Nominate_Request request);
    
}

