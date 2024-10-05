
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgsSteamOSSLS;

public interface ISteamOSSLS {

    public SteamMsgsSteamOSSLS.CSteamOSSLS_GetState_Response GetState(SteamMsgsSteamOSSLS.CSteamOSSLS_GetState_Request request);

    public void NotifyStateChanged(SteamMsgsSteamOSSLS.CSteamOSSLS_StateChanged_Notification request);

    public SteamMsgsSteamOSSLS.CSteamOSSLS_SetEnabled_Response SetEnabled(SteamMsgsSteamOSSLS.CSteamOSSLS_SetEnabled_Request request);

    public SteamMsgsSteamOSSLS.CSteamOSSLS_SetPluginEnabled_Response SetPluginEnabled(SteamMsgsSteamOSSLS.CSteamOSSLS_SetPluginEnabled_Request request);
    
}

