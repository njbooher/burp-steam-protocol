
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgCloud;

public interface ICloudClient {

    public void ClientLogUploadRequest(SteamMsgCloud.CCloud_ClientLogUploadRequest_Notification request);

    public void NotifyAppStateChange(SteamMsgCloud.CCloud_AppCloudStateChange_Notification request);
    
}

