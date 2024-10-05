
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgSteamNotification;

public interface ISteamNotification {

    public SteamMsgSteamNotification.CSteamNotification_GetPreferences_Response GetPreferences(SteamMsgSteamNotification.CSteamNotification_GetPreferences_Request request);

    public SteamMsgSteamNotification.CSteamNotification_GetSteamNotifications_Response GetSteamNotifications(SteamMsgSteamNotification.CSteamNotification_GetSteamNotifications_Request request);

    public SteamMsgSteamNotification.CSteamNotification_SetPreferences_Response SetPreferences(SteamMsgSteamNotification.CSteamNotification_SetPreferences_Request request);
    
}

