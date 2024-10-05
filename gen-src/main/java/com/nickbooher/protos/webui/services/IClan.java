
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgClan;

public interface IClan {

    public SteamMsgClan.CClan_GetDraftAndRecentPartnerEventSnippet_Response GetDraftAndRecentPartnerEventSnippet(SteamMsgClan.CClan_GetDraftAndRecentPartnerEventSnippet_Request request);

    public SteamMsgClan.CClan_GetPartnerEventsByBuildIDRange_Response GetPartnerEventsByBuildIDRange(SteamMsgClan.CClan_GetPartnerEventsByBuildIDRange_Request request);

    public SteamMsgClan.CClan_RespondToClanInvite_Response RespondToClanInvite(SteamMsgClan.CClan_RespondToClanInvite_Request request);
    
}

