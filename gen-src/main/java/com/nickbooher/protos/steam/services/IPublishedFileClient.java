
package com.nickbooher.protos.steam.services;

import com.nickbooher.protos.steam.SteamMsgPublishedFile;

public interface IPublishedFileClient {

    public void NotifyFileSubscribed(SteamMsgPublishedFile.CPublishedFile_FileSubscribed_Notification request);

    public void NotifyFileUnsubscribed(SteamMsgPublishedFile.CPublishedFile_FileUnsubscribed_Notification request);

    public void NotifyFileDeleted(SteamMsgPublishedFile.CPublishedFile_FileDeleted_Client_Notification request);
    
}

