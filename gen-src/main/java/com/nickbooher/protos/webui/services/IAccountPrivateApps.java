
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgAccountPrivateApps;

public interface IAccountPrivateApps {

    public SteamMsgAccountPrivateApps.CAccountPrivateApps_GetPrivateAppList_Response GetPrivateAppList(SteamMsgAccountPrivateApps.CAccountPrivateApps_GetPrivateAppList_Request request);

    public SteamMsgAccountPrivateApps.CAccountPrivateApps_ToggleAppPrivacy_Response ToggleAppPrivacy(SteamMsgAccountPrivateApps.CAccountPrivateApps_ToggleAppPrivacy_Request request);
    
}

