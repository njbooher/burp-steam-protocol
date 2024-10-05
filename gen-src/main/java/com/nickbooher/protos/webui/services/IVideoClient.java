
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgVideo;

public interface IVideoClient {

    public void NotifyUnlockedH264(SteamMsgVideo.CVideo_UnlockedH264_Notification request);
    
}

