
package com.nickbooher.protos.steam.services;

import com.nickbooher.protos.steam.SteamMsgAuth;

public interface ICloudGaming {

    public SteamMsgAuth.CCloudGaming_CreateNonce_Response CreateNonce(SteamMsgAuth.CCloudGaming_CreateNonce_Request request);

    public SteamMsgAuth.CCloudGaming_GetTimeRemaining_Response GetTimeRemaining(SteamMsgAuth.CCloudGaming_GetTimeRemaining_Request request);
    
}

