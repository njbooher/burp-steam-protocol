
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgUserNews;

public interface IUserNews {

    public SteamMsgUserNews.CUserNews_GetAppDetailsSpotlight_Response GetAppDetailsSpotlight(SteamMsgUserNews.CUserNews_GetAppDetailsSpotlight_Request request);

    public SteamMsgUserNews.CUserNews_GetUserNews_Response GetUserNews(SteamMsgUserNews.CUserNews_GetUserNews_Request request);
    
}

