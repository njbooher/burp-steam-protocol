
package com.nickbooher.protos.steam.services;

import com.nickbooher.protos.steam.SteamMsgNotifications;

public interface ISteamNotificationClient {

    public void NotificationsReceived(SteamMsgNotifications.CSteamNotification_NotificationsReceived_Notification request);

    public void PreferencesUpdated(SteamMsgNotifications.CSteamNotification_PreferencesUpdated_Notification request);
    
}

