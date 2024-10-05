
package com.nickbooher.protos.steam.services;

import com.nickbooher.protos.steam.SteamMsgGameNotifications;

public interface IGameNotificationsClient {

    public void OnNotificationsRequested(SteamMsgGameNotifications.CGameNotifications_OnNotificationsRequested_Notification request);

    public void OnUserStatusChanged(SteamMsgGameNotifications.CGameNotifications_OnUserStatusChanged_Notification request);
    
}

