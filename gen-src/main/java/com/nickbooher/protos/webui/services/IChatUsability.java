
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgchatUsability;

public interface IChatUsability {

    public void NotifyClientUsabilityMetrics(SteamMsgchatUsability.CChatUsability_ClientUsabilityMetrics_Notification request);
    
}

