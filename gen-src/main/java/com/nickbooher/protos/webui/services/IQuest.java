
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgQuest;

public interface IQuest {

    public SteamMsgQuest.CQuest_ActivateProfileModifierItem_Response ActivateProfileModifierItem(SteamMsgQuest.CQuest_ActivateProfileModifierItem_Request request);

    public SteamMsgQuest.CQuest_GetCommunityInventory_Response GetCommunityInventory(SteamMsgQuest.CQuest_GetCommunityInventory_Request request);

    public SteamMsgQuest.CQuest_GetCommunityItemDefinitions_Response GetCommunityItemDefinitions(SteamMsgQuest.CQuest_GetCommunityItemDefinitions_Request request);

    public SteamMsgQuest.CQuest_GetNumTradingCardsEarned_Response GetNumTradingCardsEarned(SteamMsgQuest.CQuest_GetNumTradingCardsEarned_Request request);

    public SteamMsgQuest.CQuest_VirtualItemRewardDefinition_Response GetVirtualItemRewardDefinition(SteamMsgQuest.CQuest_VirtualItemRewardDefinition_Request request);

    public SteamMsgQuest.CQuest_SetVirtualItemRewardDefinition_Response SetVirtualItemRewardDefinition(SteamMsgQuest.CQuest_SetVirtualItemRewardDefinition_Request request);
    
}

