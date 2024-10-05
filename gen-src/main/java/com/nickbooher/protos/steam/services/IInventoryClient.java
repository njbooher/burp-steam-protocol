
package com.nickbooher.protos.steam.services;

import com.nickbooher.protos.steam.SteamMsgInventory;

public interface IInventoryClient {

    public void NotifyNewItems(SteamMsgInventory.CInventoryClient_NewItems_Notification request);
    
}

