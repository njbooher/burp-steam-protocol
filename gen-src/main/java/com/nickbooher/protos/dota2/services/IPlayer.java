
package com.nickbooher.protos.steamworks.services;

import com.nickbooher.protos.steamworks.SteamMsgPlayerSteamworks;

public interface IPlayer {

    public SteamMsgPlayerSteamworks.CPlayer_GetMutualFriendsForIncomingInvites_Response GetMutualFriendsForIncomingInvites(SteamMsgPlayerSteamworks.CPlayer_GetMutualFriendsForIncomingInvites_Request request);
    
}

