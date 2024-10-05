
package com.nickbooher.protos.steam.services;

import com.nickbooher.protos.steam.SteamMsgVideo;

public interface IVideo {

    public SteamMsgVideo.CVideo_ClientGetVideoURL_Response ClientGetVideoURL(SteamMsgVideo.CVideo_ClientGetVideoURL_Request request);

    public void SetVideoBookmark(SteamMsgVideo.CVideo_SetVideoBookmark_Notification request);

    public SteamMsgVideo.CVideo_GetVideoBookmarks_Response GetVideoBookmarks(SteamMsgVideo.CVideo_GetVideoBookmarks_Request request);
    
}

