
package com.nickbooher.protos.steam.services;

import com.nickbooher.protos.steam.SteamMsgUserAccount;

public interface IEmbeddedClient {

    public SteamMsgUserAccount.CEmbeddedClient_AuthorizeDevice_Response AuthorizeCurrentDevice(SteamMsgUserAccount.CEmbeddedClient_AuthorizeCurrentDevice_Request request);
    
}

