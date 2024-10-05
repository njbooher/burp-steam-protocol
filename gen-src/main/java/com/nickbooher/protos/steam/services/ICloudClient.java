
package com.nickbooher.protos.steam.services;

import com.nickbooher.protos.steam.SteamMsgCloud;

public interface ICloudClient {

    public void NotifyAppStateChange(SteamMsgCloud.CCloud_AppCloudStateChange_Notification request);

    public void ClientLogUploadRequest(SteamMsgCloud.CCloud_ClientLogUploadRequest_Notification request);
    
}

