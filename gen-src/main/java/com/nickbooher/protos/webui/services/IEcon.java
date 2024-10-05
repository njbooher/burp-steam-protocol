
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgEcon;

public interface IEcon {

    public SteamMsgEcon.CEcon_ClientGetItemShopOverlayAuthURL_Response ClientGetItemShopOverlayAuthURL(SteamMsgEcon.CEcon_ClientGetItemShopOverlayAuthURL_Request request);

    public SteamMsgEcon.CEcon_GetAssetClassInfo_Response GetAssetClassInfo(SteamMsgEcon.CEcon_GetAssetClassInfo_Request request);

    public SteamMsgEcon.CEcon_GetInventoryItemsWithDescriptions_Response GetInventoryItemsWithDescriptions(SteamMsgEcon.CEcon_GetInventoryItemsWithDescriptions_Request request);

    public SteamMsgEcon.CEcon_GetTradeOfferAccessToken_Response GetTradeOfferAccessToken(SteamMsgEcon.CEcon_GetTradeOfferAccessToken_Request request);
    
}

