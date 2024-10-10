
package com.nickbooher.protos.steamworks.services;

import com.nickbooher.protos.steamworks.SteamMsgCloudSteamworks;

public interface ICloud {

    public SteamMsgCloudSteamworks.CCloud_GetUploadServerInfo_Response GetUploadServerInfo(SteamMsgCloudSteamworks.CCloud_GetUploadServerInfo_Request request);
    
}

