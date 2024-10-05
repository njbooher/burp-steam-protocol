
package com.nickbooher.protos.steam.services;

import com.nickbooher.protos.steam.SteamMsgSiteLicense;

public interface ISiteLicense {

    public SteamMsgSiteLicense.CSiteLicense_InitiateAssociation_Response InitiateAssociation(SteamMsgSiteLicense.CSiteLicense_InitiateAssociation_Request request);

    public SteamMsgSiteLicense.CSiteLicense_LCSAuthenticate_Response LCSAuthenticate(SteamMsgSiteLicense.CSiteLicense_LCSAuthenticate_Request request);

    public SteamMsgSiteLicense.CSiteLicense_LCSAssociateUser_Response LCSAssociateUser(SteamMsgSiteLicense.CSiteLicense_LCSAssociateUser_Request request);

    public SteamMsgSiteLicense.CSiteLicense_ClientSeatCheckout_Response ClientSeatCheckout(SteamMsgSiteLicense.CSiteLicense_ClientSeatCheckout_Request request);

    public SteamMsgSiteLicense.CSiteLicense_ClientGetAvailableSeats_Response ClientGetAvailableSeats(SteamMsgSiteLicense.CSiteLicense_ClientGetAvailableSeats_Request request);
    
}

