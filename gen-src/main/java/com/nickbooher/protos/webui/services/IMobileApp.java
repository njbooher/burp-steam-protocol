
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgMobileApp;

public interface IMobileApp {

    public SteamMsgMobileApp.CMobileApp_GetMobileSummary_Response GetMobileSummary(SteamMsgMobileApp.CMobileApp_GetMobileSummary_Request request);
    
}

