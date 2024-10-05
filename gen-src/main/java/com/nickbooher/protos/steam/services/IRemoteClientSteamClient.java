
package com.nickbooher.protos.steam.services;

import com.nickbooher.protos.steam.SteamMsgRemoteClientMessages;

public interface IRemoteClientSteamClient {

    public void NotifyRegisterStatusUpdate(SteamMsgRemoteClientMessages.CRemoteClient_RegisterStatusUpdate_Notification request);

    public void NotifyUnregisterStatusUpdate(SteamMsgRemoteClientMessages.CRemoteClient_UnregisterStatusUpdate_Notification request);

    public void NotifyRemotePacket(SteamMsgRemoteClientMessages.CRemoteClient_RemotePacket_Notification request);

    public void NotifySteamBroadcastPacket(SteamMsgRemoteClientMessages.CRemoteClient_SteamBroadcast_Notification request);

    public void NotifySteamToSteamPacket(SteamMsgRemoteClientMessages.CRemoteClient_SteamToSteam_Notification request);

    public void NotifyRemotePlayTogetherPacket(SteamMsgRemoteClientMessages.CRemotePlayTogether_Notification request);

    public void NotifyTaskList(SteamMsgRemoteClientMessages.CRemoteClient_TaskList_Notification request);
    
}

