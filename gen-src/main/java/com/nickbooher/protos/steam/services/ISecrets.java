
package com.nickbooher.protos.steam.services;

import com.nickbooher.protos.steam.SteamMsgSecrets;

public interface ISecrets {

    public SteamMsgSecrets.CKeyEscrow_Response KeyEscrow(SteamMsgSecrets.CKeyEscrow_Request request);
    
}

