
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgSaleItemRewards;

public interface ISaleItemRewards {

    public SteamMsgSaleItemRewards.CSaleItemRewards_CanClaimItem_Response CanClaimItem(SteamMsgSaleItemRewards.CSaleItemRewards_CanClaimItem_Request request);

    public SteamMsgSaleItemRewards.CSaleItemRewards_ClaimItem_Response ClaimItem(SteamMsgSaleItemRewards.CSaleItemRewards_ClaimItem_Request request);

    public SteamMsgSaleItemRewards.CSaleItemRewards_GetRewardDefinitions_Response GetRewardDefinitions(SteamMsgSaleItemRewards.CSaleItemRewards_GetRewardDefinitions_Request request);

    public SteamMsgSaleItemRewards.CSaleItemRewards_SetRewardDefinitions_Response SetRewardDefinitions(SteamMsgSaleItemRewards.CSaleItemRewards_SetRewardDefinitions_Request request);
    
}

