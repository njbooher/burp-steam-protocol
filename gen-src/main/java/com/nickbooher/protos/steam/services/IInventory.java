
package com.nickbooher.protos.steam.services;

import com.nickbooher.protos.steam.SteamMsgInventory;

public interface IInventory {

    public SteamMsgInventory.CInventory_Response GetInventory(SteamMsgInventory.CInventory_GetInventory_Request request);

    public SteamMsgInventory.CInventory_Response ExchangeItem(SteamMsgInventory.CInventory_ExchangeItem_Request request);

    public SteamMsgInventory.CInventory_GetEligiblePromoItemDefIDs_Response GetEligiblePromoItemDefIDs(SteamMsgInventory.CInventory_GetEligiblePromoItemDefIDs_Request request);

    public SteamMsgInventory.CInventory_Response AddPromoItem(SteamMsgInventory.CInventory_AddItem_Request request);

    public SteamMsgInventory.CInventory_Response SafeModifyItems(SteamMsgInventory.CInventory_ModifyItems_Request request);

    public SteamMsgInventory.CInventory_Response ConsumePlaytime(SteamMsgInventory.CInventory_ConsumePlaytime_Request request);

    public SteamMsgInventory.CInventory_Response ConsumeItem(SteamMsgInventory.CInventory_ConsumeItem_Request request);

    public SteamMsgInventory.CInventory_Response DevGenerateItem(SteamMsgInventory.CInventory_AddItem_Request request);

    public SteamMsgInventory.CInventory_Response DevSetNextDrop(SteamMsgInventory.CInventory_DevSetNextDrop_Request request);

    public SteamMsgInventory.CInventory_Response SplitItemStack(SteamMsgInventory.CInventory_SplitItemStack_Request request);

    public SteamMsgInventory.CInventory_Response CombineItemStacks(SteamMsgInventory.CInventory_CombineItemStacks_Request request);

    public SteamMsgInventory.CInventory_GetItemDefMeta_Response GetItemDefMeta(SteamMsgInventory.CInventory_GetItemDefMeta_Request request);

    public SteamMsgInventory.CInventory_GetUserPurchaseInfo_Response GetUserPurchaseInfo(SteamMsgInventory.CInventory_GetUserPurchaseInfo_Request request);

    public SteamMsgInventory.CInventory_PurchaseInit_Response PurchaseInit(SteamMsgInventory.CInventory_PurchaseInit_Request request);

    public SteamMsgInventory.CInventory_Response PurchaseFinalize(SteamMsgInventory.CInventory_PurchaseFinalize_Request request);

    public SteamMsgInventory.CInventory_Response InspectItem(SteamMsgInventory.CInventory_InspectItem_Request request);
    
}

