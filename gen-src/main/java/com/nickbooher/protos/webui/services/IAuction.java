
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgAuction;

public interface IAuction {

    public SteamMsgAuction.CAuction_CancelBid_Response CancelBid(SteamMsgAuction.CAuction_CancelBid_Request request);

    public SteamMsgAuction.CAuction_GetAllItems_Response GetAllItems(SteamMsgAuction.CAuction_GetAllItems_Request request);

    public SteamMsgAuction.CAuction_GetBidsForItem_Response GetBidsForItem(SteamMsgAuction.CAuction_GetBidsForItem_Request request);

    public SteamMsgAuction.CAuction_GetBidsForUser_Response GetBidsForUser(SteamMsgAuction.CAuction_GetBidsForUser_Request request);

    public SteamMsgAuction.CAuction_GetItemDetails_Response GetItemDetails(SteamMsgAuction.CAuction_GetItemDetails_Request request);

    public SteamMsgAuction.CAuction_GetUserBidForItem_Response GetUserBidForItem(SteamMsgAuction.CAuction_GetUserBidForItem_Request request);

    public SteamMsgAuction.CAuction_PlaceBid_Response PlaceBid(SteamMsgAuction.CAuction_PlaceBid_Request request);
    
}

