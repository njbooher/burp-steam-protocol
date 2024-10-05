
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgCloudGaming;

public interface ICloudGaming {

    public SteamMsgCloudGaming.CCloudGaming_CreateNonce_Response CreateNonce(SteamMsgCloudGaming.CCloudGaming_CreateNonce_Request request);

    public SteamMsgCloudGaming.CCloudGaming_GetTimeRemaining_Response GetTimeRemaining(SteamMsgCloudGaming.CCloudGaming_GetTimeRemaining_Request request);
    
}

