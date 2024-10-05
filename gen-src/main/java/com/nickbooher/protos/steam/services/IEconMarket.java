
package com.nickbooher.protos.steam.services;

import com.nickbooher.protos.steam.SteamMsgMarket;

public interface IEconMarket {

    public SteamMsgMarket.CEconMarket_IsMarketplaceAllowed_Response IsMarketplaceAllowed(SteamMsgMarket.CEconMarket_IsMarketplaceAllowed_Request request);
    
}

