
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgMobilePerAccount;

public interface IMobilePerAccount {

    public SteamMsgMobilePerAccount.CMobilePerAccount_GetSettings_Response GetSettings(SteamMsgMobilePerAccount.CMobilePerAccount_GetSettings_Request request);

    public SteamMsgMobilePerAccount.CMobilePerAccount_SetSettings_Response SetSettings(SteamMsgMobilePerAccount.CMobilePerAccount_SetSettings_Request request);
    
}

