
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgStoreTopSellers;

public interface IStoreTopSellers {

    public SteamMsgStoreTopSellers.CStoreTopSellers_GetCountryList_Response GetCountryList(SteamMsgStoreTopSellers.CStoreTopSellers_GetCountryList_Request request);

    public SteamMsgStoreTopSellers.CStoreTopSellers_GetWeeklyTopSellers_Response GetWeeklyTopSellers(SteamMsgStoreTopSellers.CStoreTopSellers_GetWeeklyTopSellers_Request request);
    
}

