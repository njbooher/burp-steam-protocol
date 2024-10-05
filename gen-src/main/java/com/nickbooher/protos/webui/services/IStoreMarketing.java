
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgStoreMarketing;

public interface IStoreMarketing {

    public SteamMsgStoreMarketing.CStoreMarketing_GetItemsToFeature_Response GetItemsToFeature(SteamMsgStoreMarketing.CStoreMarketing_GetItemsToFeature_Request request);
    
}

