
package com.nickbooher.protos.steam.services;

import com.nickbooher.protos.steam.SteamMsgChat;

public interface IChatUsabilityClient {

    public void NotifyRequestClientUsabilityMetrics(SteamMsgChat.CChatUsability_RequestClientUsabilityMetrics_Notification request);
    
}

