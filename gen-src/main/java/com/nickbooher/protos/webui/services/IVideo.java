
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgVideo;

public interface IVideo {

    public SteamMsgVideo.CVideo_ClientGetVideoURL_Response ClientGetVideoURL(SteamMsgVideo.CVideo_ClientGetVideoURL_Request request);

    public SteamMsgVideo.CVideo_GetVideoBookmarks_Response GetVideoBookmarks(SteamMsgVideo.CVideo_GetVideoBookmarks_Request request);

    public void SetVideoBookmark(SteamMsgVideo.CVideo_SetVideoBookmark_Notification request);
    
}

