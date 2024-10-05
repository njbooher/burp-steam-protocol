
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgsSteamOSManager;

public interface ISteamOSManager {

    public SteamMsgsSteamOSManager.CSteamOSManager_ApplyMandatoryUpdate_Response ApplyMandatoryUpdate(SteamMsgsSteamOSManager.CSteamOSManager_ApplyMandatoryUpdate_Request request);

    public SteamMsgsSteamOSManager.CSteamOSManager_FactoryReset_Response FactoryReset(SteamMsgsSteamOSManager.CSteamOSManager_FactoryReset_Request request);

    public SteamMsgsSteamOSManager.CSteamOSManager_GetState_Response GetState(SteamMsgsSteamOSManager.CSteamOSManager_GetState_Request request);

    public void NotifyStateChanged(SteamMsgsSteamOSManager.CSteamOSManager_StateChanged_Notification request);

    public SteamMsgsSteamOSManager.CSteamOSManager_OptOutOfSideloadedClient_Response OptOutOfSideloadedClient(SteamMsgsSteamOSManager.CSteamOSManager_OptOutOfSideloadedClient_Request request);
    
}

