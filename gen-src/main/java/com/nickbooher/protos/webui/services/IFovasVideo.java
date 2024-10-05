
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgFovasVideo;

public interface IFovasVideo {

    public SteamMsgFovasVideo.CFovasVideo_ClientGetOPFSettings_Response ClientGetOPFSettings(SteamMsgFovasVideo.CFovasVideo_ClientGetOPFSettings_Request request);
    
}

