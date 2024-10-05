
package com.nickbooher.protos.steam.services;

import com.nickbooher.protos.steam.SteamMsgVideo;

public interface IVideoClient {

    public void NotifyUnlockedH264(SteamMsgVideo.CVideo_UnlockedH264_Notification request);
    
}

