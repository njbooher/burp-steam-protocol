
package com.nickbooher.protos.steam.services;

import com.nickbooher.protos.steam.SteamMsgUserAccount;

public interface IAccountLinking {

    public SteamMsgUserAccount.CAccountLinking_GetLinkedAccountInfo_Response GetLinkedAccountInfo(SteamMsgUserAccount.CAccountLinking_GetLinkedAccountInfo_Request request);
    
}

