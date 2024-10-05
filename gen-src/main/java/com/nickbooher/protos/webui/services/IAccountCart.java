
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgAccountCart;

public interface IAccountCart {

    public SteamMsgAccountCart.CAccountCart_AddItemsToCart_Response AddItemsToCart(SteamMsgAccountCart.CAccountCart_AddItemsToCart_Request request);

    public SteamMsgAccountCart.CAccountCart_DeleteCart_Response DeleteCart(SteamMsgAccountCart.CAccountCart_DeleteCart_Request request);

    public SteamMsgAccountCart.CAccountCart_GetCart_Response GetCart(SteamMsgAccountCart.CAccountCart_GetCart_Request request);

    public SteamMsgAccountCart.CAccountCart_GetRelevantCoupons_Response GetRelevantCoupons(SteamMsgAccountCart.CAccountCart_GetRelevantCoupons_Request request);

    public SteamMsgAccountCart.CAccountCart_MergeShoppingCartContents_Response MergeShoppingCartContents(SteamMsgAccountCart.CAccountCart_MergeShoppingCartContents_Request request);

    public SteamMsgAccountCart.CAccountCart_ModifyLineItem_Response ModifyLineItem(SteamMsgAccountCart.CAccountCart_ModifyLineItem_Request request);

    public SteamMsgAccountCart.CAccountCart_RemoveItemFromCart_Response RemoveItemFromCart(SteamMsgAccountCart.CAccountCart_RemoveItemFromCart_Request request);
    
}

