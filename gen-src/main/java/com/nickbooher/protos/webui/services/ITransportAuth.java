
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgTransportAuth;

public interface ITransportAuth {

    public SteamMsgTransportAuth.CTransportAuth_Authenticate_Response Authenticate(SteamMsgTransportAuth.CTransportAuth_Authenticate_Request request);

    public void NotifyStartShutdown(SteamMsgTransportAuth.CTransportAuth_StartShutdown_Notification request);
    
}

