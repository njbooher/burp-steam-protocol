
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgPublishedFile;

public interface IPublishedFileClient {

    public void NotifyFileDeleted(SteamMsgPublishedFile.CPublishedFile_FileDeleted_Client_Notification request);

    public void NotifyFileSubscribed(SteamMsgPublishedFile.CPublishedFile_FileSubscribed_Notification request);

    public void NotifyFileUnsubscribed(SteamMsgPublishedFile.CPublishedFile_FileUnsubscribed_Notification request);
    
}

