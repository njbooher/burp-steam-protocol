
package com.nickbooher.protos.steamworks.services;

import com.nickbooher.protos.steamworks.SteamMsgPublishedFileSteamworks;

public interface IPublishedFile {

    public SteamMsgPublishedFileSteamworks.CPublishedFile_Subscribe_Response Subscribe(SteamMsgPublishedFileSteamworks.CPublishedFile_Subscribe_Request request);
    
}

