
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgClanChatRooms;

public interface IClanChatRooms {

    public SteamMsgClanChatRooms.CClanChatRooms_GetClanChatRoomInfo_Response GetClanChatRoomInfo(SteamMsgClanChatRooms.CClanChatRooms_GetClanChatRoomInfo_Request request);

    public SteamMsgClanChatRooms.CClanChatRooms_SetClanChatRoomPrivate_Response SetClanChatRoomPrivate(SteamMsgClanChatRooms.CClanChatRooms_SetClanChatRoomPrivate_Request request);
    
}

