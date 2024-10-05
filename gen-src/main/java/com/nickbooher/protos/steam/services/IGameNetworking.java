
package com.nickbooher.protos.steam.services;

import com.nickbooher.protos.steam.SteamMsgGameNetworking;

public interface IGameNetworking {

    public SteamMsgGameNetworking.CGameNetworking_AllocateFakeIP_Response AllocateFakeIP(SteamMsgGameNetworking.CGameNetworking_AllocateFakeIP_Request request);

    public void NotifyReleaseFakeIP(SteamMsgGameNetworking.CGameNetworking_ReleaseFakeIP_Notification request);
    
}

