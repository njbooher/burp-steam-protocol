
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgStoreAppSimilarity;

public interface IStoreAppSimilarity {

    public SteamMsgStoreAppSimilarity.CStoreAppSimilarity_IdentifyClustersFromPlaytime_Response IdentifyClustersFromPlaytime(SteamMsgStoreAppSimilarity.CStoreAppSimilarity_IdentifyClustersFromPlaytime_Request request);

    public SteamMsgStoreAppSimilarity.CStoreAppSimilarity_PrioritizeAppsForUser_Response PrioritizeAppsForUser(SteamMsgStoreAppSimilarity.CStoreAppSimilarity_PrioritizeAppsForUser_Request request);
    
}

