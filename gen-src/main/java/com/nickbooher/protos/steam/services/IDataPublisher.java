
package com.nickbooher.protos.steam.services;

import com.nickbooher.protos.steam.SteamMsgDataPublisher;

public interface IDataPublisher {

    public void ClientContentCorruptionReport(SteamMsgDataPublisher.CDataPublisher_ClientContentCorruptionReport_Notification request);

    public void ClientUpdateAppJobReport(SteamMsgDataPublisher.CDataPublisher_ClientUpdateAppJob_Notification request);

    public SteamMsgDataPublisher.CDataPublisher_GetVRDeviceInfo_Response GetVRDeviceInfo(SteamMsgDataPublisher.CDataPublisher_GetVRDeviceInfo_Request request);

    public SteamMsgDataPublisher.CDataPublisher_SetVRDeviceInfoAggregationReference_Response SetVRDeviceInfoAggregationReference(SteamMsgDataPublisher.CDataPublisher_SetVRDeviceInfoAggregationReference_Request request);

    public SteamMsgDataPublisher.CDataPublisher_AddVRDeviceInfo_Response AddVRDeviceInfo(SteamMsgDataPublisher.CDataPublisher_AddVRDeviceInfo_Request request);
    
}

