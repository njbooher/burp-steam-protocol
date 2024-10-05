
package com.nickbooher.protos.steam.services;

import com.nickbooher.protos.steam.SteamMsgStore;

public interface IStoreClient {

    public void NotifyStorePreferencesChanged(SteamMsgStore.CStore_StorePreferencesChanged_Notification request);
    
}

