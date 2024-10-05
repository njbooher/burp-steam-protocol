
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgPromotionStats;

public interface IPromotionStats {

    public SteamMsgPromotionStats.CPromotionStats_GetOptInDemoStats_Response GetOptInDemoStats(SteamMsgPromotionStats.CPromotionStats_GetOptInDemoStats_Request request);
    
}

