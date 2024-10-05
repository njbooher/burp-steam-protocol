
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgsSteamEngine;

public interface ISteamEngine {

    public SteamMsgsSteamEngine.CSteamEngine_GetGameIDForPID_Response GetGameIDForPID(SteamMsgsSteamEngine.CSteamEngine_GetGameIDForPID_Request request);

    public SteamMsgsSteamEngine.CSteamEngine_GetTextFilterDictionary_Response GetTextFilterDictionary(SteamMsgsSteamEngine.CSteamEngine_GetTextFilterDictionary_Request request);

    public void NotifyTextFilterDictionaryChanged(SteamMsgsSteamEngine.CSteamEngine_TextFilterDictionaryChanged_Notification request);

    public void SetOverlayEscapeKeyHandling(SteamMsgsSteamEngine.CSteamEngine_SetOverlayEscapeKeyHandling_Notification request);

    public void UpdateTextFilterDictionary(SteamMsgsSteamEngine.CSteamEngine_UpdateTextFilterDictionary_Notification request);
    
}

