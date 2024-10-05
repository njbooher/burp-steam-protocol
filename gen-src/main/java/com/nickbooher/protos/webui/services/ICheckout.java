
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgCheckout;

public interface ICheckout {

    public SteamMsgCheckout.CCheckout_GetFriendOwnershipForGifting_Response GetFriendOwnershipForGifting(SteamMsgCheckout.CCheckout_GetFriendOwnershipForGifting_Request request);

    public SteamMsgCheckout.CCheckout_ValidateCart_Response ValidateCart(SteamMsgCheckout.CCheckout_ValidateCart_Request request);
    
}

