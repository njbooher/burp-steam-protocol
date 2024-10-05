
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgFriendsList;

public interface IFriendsList {

    public SteamMsgFriendsList.CFriendsList_GetCategories_Response GetCategories(SteamMsgFriendsList.CFriendsList_GetCategories_Request request);

    public SteamMsgFriendsList.CFriendsList_GetFavorites_Response GetFavorites(SteamMsgFriendsList.CFriendsList_GetFavorites_Request request);

    public SteamMsgFriendsList.CFriendsList_GetFriendsList_Response GetFriendsList(SteamMsgFriendsList.CFriendsList_GetFriendsList_Request request);

    public SteamMsgFriendsList.CFriendsList_SetFavorites_Response SetFavorites(SteamMsgFriendsList.CFriendsList_SetFavorites_Request request);
    
}

