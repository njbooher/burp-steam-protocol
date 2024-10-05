
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgStoreQuery;

public interface IStoreQuery {

    public SteamMsgStoreQuery.CStoreQuery_GetItemsByUserRecommendedTags_Response GetItemsByUserRecommendedTags(SteamMsgStoreQuery.CStoreQuery_GetItemsByUserRecommendedTags_Request request);

    public SteamMsgStoreQuery.CStoreQuery_Query_Response Query(SteamMsgStoreQuery.CStoreQuery_Query_Request request);

    public SteamMsgStoreQuery.CStoreQuery_SearchSuggestions_Response SearchSuggestions(SteamMsgStoreQuery.CStoreQuery_SearchSuggestions_Request request);
    
}

