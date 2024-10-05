
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgAchievements;

public interface IAchievements {

    public SteamMsgAchievements.CAchievements_GetInfo_Response GetInfo(SteamMsgAchievements.CAchievements_GetInfo_Request request);
    
}

