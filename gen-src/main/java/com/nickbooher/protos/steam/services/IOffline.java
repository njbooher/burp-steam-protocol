
package com.nickbooher.protos.steam.services;

import com.nickbooher.protos.steam.SteamMsgOffline;

public interface IOffline {

    public SteamMsgOffline.COffline_GetOfflineLogonTicket_Response GetOfflineLogonTicket(SteamMsgOffline.COffline_GetOfflineLogonTicket_Request request);

    public SteamMsgOffline.COffline_GetUnsignedOfflineLogonTicket_Response GetUnsignedOfflineLogonTicket(SteamMsgOffline.COffline_GetUnsignedOfflineLogonTicket_Request request);
    
}

