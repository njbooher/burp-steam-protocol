
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgUserReviews;

public interface IUserReviews {

    public SteamMsgUserReviews.CUserReviews_GetFriendsRecommendedApp_Response GetFriendsRecommendedApp(SteamMsgUserReviews.CUserReviews_GetFriendsRecommendedApp_Request request);

    public SteamMsgUserReviews.CUserReviews_GetIndividualRecommendations_Response GetIndividualRecommendations(SteamMsgUserReviews.CUserReviews_GetIndividualRecommendations_Request request);

    public SteamMsgUserReviews.CUserReviews_Update_Response Update(SteamMsgUserReviews.CUserReviews_Update_Request request);
    
}

