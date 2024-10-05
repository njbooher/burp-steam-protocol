
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgClientMetrics;

public interface IClientMetrics {

    public void ReportClientError(SteamMsgClientMetrics.CClientMetrics_ReportClientError_Notification request);
    
}

