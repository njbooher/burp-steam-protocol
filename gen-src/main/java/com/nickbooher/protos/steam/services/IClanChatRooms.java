
package com.nickbooher.protos.steam.services;

import com.nickbooher.protos.steam.SteamMsgChat;

public interface IClanChatRooms {

    public SteamMsgChat.CClanChatRooms_GetClanChatRoomInfo_Response GetClanChatRoomInfo(SteamMsgChat.CClanChatRooms_GetClanChatRoomInfo_Request request);

    public SteamMsgChat.CClanChatRooms_SetClanChatRoomPrivate_Response SetClanChatRoomPrivate(SteamMsgChat.CClanChatRooms_SetClanChatRoomPrivate_Request request);
    
}

