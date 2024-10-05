
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgUserGameActivity;

public interface IUserGameActivity {

    public SteamMsgUserGameActivity.CUserGameActivity_GetActivity_Response GetActivity(SteamMsgUserGameActivity.CUserGameActivity_GetActivity_Request request);
    
}

