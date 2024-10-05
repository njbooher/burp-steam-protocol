
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgNews;

public interface INews {

    public SteamMsgNews.CNews_ConvertHTMLToBBCode_Response ConvertHTMLToBBCode(SteamMsgNews.CNews_ConvertHTMLToBBCode_Request request);

    public SteamMsgNews.CNews_GetBatchPublishedPartnerEvent_Response GetBatchPublishedPartnerEvent(SteamMsgNews.CNews_GetBatchPublishedPartnerEvent_Request request);

    public SteamMsgNews.CNews_GetNewsFeedByRepublishClan_Response GetNewsFeedByRepublishClan(SteamMsgNews.CNews_GetNewsFeedByRepublishClan_Request request);

    public SteamMsgNews.CNews_PreviewPartnerEvents_Response PreviewPartnerEvents(SteamMsgNews.CNews_PreviewPartnerEvents_Request request);

    public SteamMsgNews.CNews_PublishPartnerEvent_Response PublishPartnerEvent(SteamMsgNews.CNews_PublishPartnerEvent_Request request);
    
}

