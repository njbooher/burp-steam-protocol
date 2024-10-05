
package com.nickbooher.protos.steam.services;

import com.nickbooher.protos.steam.SteamMsgEcon;

public interface IEcon {

    public SteamMsgEcon.CEcon_GetInventoryItemsWithDescriptions_Response GetInventoryItemsWithDescriptions(SteamMsgEcon.CEcon_GetInventoryItemsWithDescriptions_Request request);

    public SteamMsgEcon.CEcon_GetTradeOfferAccessToken_Response GetTradeOfferAccessToken(SteamMsgEcon.CEcon_GetTradeOfferAccessToken_Request request);

    public SteamMsgEcon.CEcon_ClientGetItemShopOverlayAuthURL_Response ClientGetItemShopOverlayAuthURL(SteamMsgEcon.CEcon_ClientGetItemShopOverlayAuthURL_Request request);

    public SteamMsgEcon.CEcon_GetAssetClassInfo_Response GetAssetClassInfo(SteamMsgEcon.CEcon_GetAssetClassInfo_Request request);
    
}

