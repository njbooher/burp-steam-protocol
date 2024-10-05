
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgPartnerStoreBrowse;

public interface IPartnerStoreBrowse {

    public SteamMsgPartnerStoreBrowse.CPartnerStoreBrowse_GetCountryRestrictions_Response GetCountryRestrictions(SteamMsgPartnerStoreBrowse.CPartnerStoreBrowse_GetCountryRestrictions_Request request);

    public SteamMsgCommon.CStoreBrowse_GetItems_Response GetItems(SteamMsgCommon.CStoreBrowse_GetItems_Request request);
    
}

