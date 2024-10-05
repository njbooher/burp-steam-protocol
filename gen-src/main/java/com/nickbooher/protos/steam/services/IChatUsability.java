
package com.nickbooher.protos.steam.services;

import com.nickbooher.protos.steam.SteamMsgChat;

public interface IChatUsability {

    public void NotifyClientUsabilityMetrics(SteamMsgChat.CChatUsability_ClientUsabilityMetrics_Notification request);
    
}

