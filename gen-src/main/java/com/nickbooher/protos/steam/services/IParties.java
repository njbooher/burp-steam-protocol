
package com.nickbooher.protos.steam.services;

import com.nickbooher.protos.steam.SteamMsgParties;

public interface IParties {

    public SteamMsgParties.CParties_JoinParty_Response JoinParty(SteamMsgParties.CParties_JoinParty_Request request);

    public SteamMsgParties.CParties_CreateBeacon_Response CreateBeacon(SteamMsgParties.CParties_CreateBeacon_Request request);

    public SteamMsgParties.CParties_OnReservationCompleted_Response OnReservationCompleted(SteamMsgParties.CParties_OnReservationCompleted_Request request);

    public SteamMsgParties.CParties_CancelReservation_Response CancelReservation(SteamMsgParties.CParties_CancelReservation_Request request);

    public SteamMsgParties.CParties_ChangeNumOpenSlots_Response ChangeNumOpenSlots(SteamMsgParties.CParties_ChangeNumOpenSlots_Request request);

    public SteamMsgParties.CParties_DestroyBeacon_Response DestroyBeacon(SteamMsgParties.CParties_DestroyBeacon_Request request);
    
}

