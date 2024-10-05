
package com.nickbooher.protos.steam.services;

import com.nickbooher.protos.steam.SteamMsgSiteLicense;

public interface ISiteManagerClient {

    public SteamMsgSiteLicense.CSiteManagerClient_IncomingClient_Response IncomingClient(SteamMsgSiteLicense.CSiteManagerClient_IncomingClient_Request request);

    public void ClientSeatCheckoutNotification(SteamMsgSiteLicense.CSiteLicense_ClientSeatCheckout_Notification request);

    public void TrackedPaymentsNotification(SteamMsgSiteLicense.CSiteManagerClient_TrackedPayments_Notification request);
    
}

