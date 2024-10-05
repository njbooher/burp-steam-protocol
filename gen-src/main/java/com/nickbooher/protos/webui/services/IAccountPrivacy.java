
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgAccountPrivacy;

public interface IAccountPrivacy {

    public SteamMsgAccountPrivacy.CAccountPrivacy_GetCookiePreferences_Response GetCookiePreferences(SteamMsgAccountPrivacy.CAccountPrivacy_GetCookiePreferences_Request request);
    
}

