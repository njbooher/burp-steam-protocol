
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgStoreCatalog;

public interface IStoreCatalog {

    public SteamMsgStoreCatalog.CStoreCatalog_GetDevPageAllAppsLinked_Response GetDevPageAllAppsLinked(SteamMsgStoreCatalog.CStoreCatalog_GetDevPageAllAppsLinked_Request request);
    
}

