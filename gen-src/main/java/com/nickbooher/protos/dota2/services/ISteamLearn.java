
package com.nickbooher.protos.steamworks.services;

import com.nickbooher.protos.steamworks.SteamMsgSteamLearnSteamworks;

public interface ISteamLearn {

    public SteamMsgSteamLearnSteamworks.CMsgSteamLearn_RegisterDataSource_Response RegisterDataSource(SteamMsgSteamLearnSteamworks.CMsgSteamLearn_RegisterDataSource_Request request);
    
}

