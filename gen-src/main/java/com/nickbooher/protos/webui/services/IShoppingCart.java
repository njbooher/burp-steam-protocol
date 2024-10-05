
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgShoppingCart;

public interface IShoppingCart {

    public SteamMsgShoppingCart.CShoppingCart_AddBundle_Response AddBundle(SteamMsgShoppingCart.CShoppingCart_AddBundle_Request request);

    public SteamMsgShoppingCart.CShoppingCart_AddPackages_Response AddPackages(SteamMsgShoppingCart.CShoppingCart_AddPackages_Request request);

    public SteamMsgShoppingCart.CShoppingCart_CreateNew_Response CreateNewShoppingCart(SteamMsgShoppingCart.CShoppingCart_CreateNew_Request request);

    public SteamMsgShoppingCart.CShoppingCart_GetContents_Response GetShoppingCartContents(SteamMsgShoppingCart.CShoppingCart_GetContents_Request request);

    public SteamMsgShoppingCart.CShoppingCart_RemoveLineItems_Response RemoveLineItems(SteamMsgShoppingCart.CShoppingCart_RemoveLineItems_Request request);

    public SteamMsgShoppingCart.CShoppingCart_UpdatePackageQuantity_Response UpdatePackageQuantity(SteamMsgShoppingCart.CShoppingCart_UpdatePackageQuantity_Request request);
    
}

