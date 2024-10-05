
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgDailyDeal;

public interface IDailyDeal {

    public SteamMsgDailyDeal.CDailyDeal_CancelDailyDeal_Response CancelDailyDeal(SteamMsgDailyDeal.CDailyDeal_CancelDailyDeal_Request request);

    public SteamMsgDailyDeal.CDailyDeal_CreateDailyDeal_Response CreateDailyDeal(SteamMsgDailyDeal.CDailyDeal_CreateDailyDeal_Request request);

    public SteamMsgDailyDeal.CDailyDeal_DeleteDailyDeal_Response DeleteDailyDeal(SteamMsgDailyDeal.CDailyDeal_DeleteDailyDeal_Request request);

    public SteamMsgDailyDeal.CDailyDeal_GetDailyDeals_Response GetDailyDeals(SteamMsgDailyDeal.CDailyDeal_GetDailyDeals_Request request);

    public SteamMsgDailyDeal.CDailyDeal_GetDailyDealsForApps_Response GetDailyDealsForApps(SteamMsgDailyDeal.CDailyDeal_GetDailyDealsForApps_Request request);

    public SteamMsgDailyDeal.CDailyDeal_UpdateDailyDeal_Response UpdateDailyDeal(SteamMsgDailyDeal.CDailyDeal_UpdateDailyDeal_Request request);
    
}

