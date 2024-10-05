
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgMobileAuth;

public interface IMobileAuth {

    public SteamMsgMobileAuth.CMobileAuth_MigrateMobileSession_Response MigrateMobileSession(SteamMsgMobileAuth.CMobileAuth_MigrateMobileSession_Request request);
    
}

