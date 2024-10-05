
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgchatUsability;

public interface IChatUsabilityClient {

    public void NotifyRequestClientUsabilityMetrics(SteamMsgchatUsability.CChatUsability_RequestClientUsabilityMetrics_Notification request);
    
}

