
package com.nickbooher.protos.steam.services;

import com.nickbooher.protos.steam.SteamMsgVideo;

public interface IFovasVideo {

    public SteamMsgVideo.CFovasVideo_ClientGetOPFSettings_Response ClientGetOPFSettings(SteamMsgVideo.CFovasVideo_ClientGetOPFSettings_Request request);
    
}

