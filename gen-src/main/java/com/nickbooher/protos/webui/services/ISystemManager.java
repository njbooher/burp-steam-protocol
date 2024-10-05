
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgSystemManager;

public interface ISystemManager {

    public SteamMsgSystemManager.CSystemManager_Hibernate_Response Hibernate(SteamMsgSystemManager.CSystemManager_Hibernate_Request request);

    public SteamMsgSystemManager.CSystemManager_WriteFile_Response WriteFile(SteamMsgSystemManager.CSystemManager_WriteFile_Request request);
    
}

