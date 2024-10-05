
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgFriendsList;

public interface IFriendsListClient {

    public void FavoritesChanged(SteamMsgFriendsList.CFriendsList_FavoritesChanged_Notification request);
    
}

