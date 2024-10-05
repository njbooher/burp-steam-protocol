
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgSteamNotification;

public interface ISteamNotificationClient {

    public void NotificationsReceived(SteamMsgSteamNotification.CSteamNotification_NotificationsReceived_Notification request);

    public void PreferencesUpdated(SteamMsgSteamNotification.CSteamNotification_PreferencesUpdated_Notification request);
    
}

