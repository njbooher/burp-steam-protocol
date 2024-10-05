
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgAccountPrivateApps;

public interface IAccountPrivateAppsClient {

    public void NotifyPrivateAppListChanged(SteamMsgAccountPrivateApps.CAccountPrivateApsClient_NotifyPrivateAppListChanged_Notification request);
    
}

