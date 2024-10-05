
package com.nickbooher.protos.steam.services;

import com.nickbooher.protos.steam.SteamMsgBroadcast;

public interface IBroadcastClient {

    public void NotifyBroadcastViewerState(SteamMsgBroadcast.CBroadcast_BroadcastViewerState_Notification request);

    public void NotifyWaitingBroadcastViewer(SteamMsgBroadcast.CBroadcast_WaitingBroadcastViewer_Notification request);

    public void NotifyBroadcastUploadStarted(SteamMsgBroadcast.CBroadcast_BroadcastUploadStarted_Notification request);

    public void NotifyStopBroadcastUpload(SteamMsgBroadcast.CBroadcast_StopBroadcastUpload_Notification request);

    public void NotifySessionClosed(SteamMsgBroadcast.CBroadcast_SessionClosed_Notification request);

    public void NotifyViewerBroadcastInvite(SteamMsgBroadcast.CBroadcast_ViewerBroadcastInvite_Notification request);

    public void NotifyBroadcastStatus(SteamMsgBroadcast.CBroadcast_BroadcastStatus_Notification request);

    public void NotifyBroadcastChannelLive(SteamMsgBroadcast.CBroadcast_BroadcastChannelLive_Notification request);

    public void SendThumbnailToRelay(SteamMsgBroadcast.CBroadcast_SendThumbnailToRelay_Notification request);

    public void NotifyWebRTCNeedTURNServer(SteamMsgBroadcast.CBroadcast_WebRTCNeedTURNServer_Notification request);

    public void NotifyWebRTCStart(SteamMsgBroadcast.CBroadcast_WebRTCStart_Notification request);

    public void NotifyWebRTCSetAnswer(SteamMsgBroadcast.CBroadcast_WebRTCSetAnswer_Notification request);

    public void NotifyWebRTCAddViewerCandidate(SteamMsgBroadcast.CBroadcast_WebRTCAddViewerCandidate_Notification request);
    
}

