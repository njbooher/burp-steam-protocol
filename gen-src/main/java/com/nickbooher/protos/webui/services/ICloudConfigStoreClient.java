
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgCloudConfigStore;

public interface ICloudConfigStoreClient {

    public void NotifyChange(SteamMsgCloudConfigStore.CCloudConfigStore_Change_Notification request);
    
}

