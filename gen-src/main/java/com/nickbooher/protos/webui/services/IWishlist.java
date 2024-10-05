
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgWishlist;

public interface IWishlist {

    public SteamMsgWishlist.CWishlist_GetWishlistItemsOnSale_Response GetWishlistItemsOnSale(SteamMsgWishlist.CWishlist_GetWishlistItemsOnSale_Request request);
    
}

