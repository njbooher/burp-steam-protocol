
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgStoreBrowse;

public interface IStoreBrowse {

    public SteamMsgStoreBrowse.CStoreBrowse_GetDLCForApps_Response GetDLCForApps(SteamMsgStoreBrowse.CStoreBrowse_GetDLCForApps_Request request);

    public SteamMsgStoreBrowse.CStoreBrowse_GetDLCForAppsSolr_Response GetDLCForAppsSolr(SteamMsgStoreBrowse.CStoreBrowse_GetDLCForAppsSolr_Request request);

    public SteamMsgStoreBrowse.CStoreBrowse_GetHardwareItems_Response GetHardwareItems(SteamMsgStoreBrowse.CStoreBrowse_GetHardwareItems_Request request);

    public SteamMsgCommon.CStoreBrowse_GetItems_Response GetItems(SteamMsgCommon.CStoreBrowse_GetItems_Request request);

    public SteamMsgStoreBrowse.CStoreBrowse_GetPriceStops_Response GetPriceStops(SteamMsgStoreBrowse.CStoreBrowse_GetPriceStops_Request request);

    public SteamMsgStoreBrowse.CStoreBrowse_GetStoreCategories_Response GetStoreCategories(SteamMsgStoreBrowse.CStoreBrowse_GetStoreCategories_Request request);
    
}

