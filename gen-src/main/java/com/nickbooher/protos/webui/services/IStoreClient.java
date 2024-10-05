
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgStore;

public interface IStoreClient {

    public void NotifyStorePreferencesChanged(SteamMsgStore.CStore_StorePreferencesChanged_Notification request);
    
}

