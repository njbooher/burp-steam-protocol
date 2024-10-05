
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgPlayer;

public interface IPlayerClient {

    public void NotifyCommunityPreferencesChanged(SteamMsgPlayer.CPlayer_CommunityPreferencesChanged_Notification request);

    public void NotifyFriendEquippedProfileItemsChanged(SteamMsgPlayer.CPlayer_FriendEquippedProfileItemsChanged_Notification request);

    public void NotifyFriendNicknameChanged(SteamMsgPlayer.CPlayer_FriendNicknameChanged_Notification request);

    public void NotifyLastPlayedTimes(SteamMsgPlayer.CPlayer_LastPlayedTimes_Notification request);

    public void NotifyNewSteamAnnouncementState(SteamMsgPlayer.CPlayer_NewSteamAnnouncementState_Notification request);

    public void NotifyPerFriendPreferencesChanged(SteamMsgPlayer.CPlayer_PerFriendPreferencesChanged_Notification request);

    public void NotifyPrivacyPrivacySettingsChanged(SteamMsgPlayer.CPlayer_PrivacySettingsChanged_Notification request);

    public void NotifyTextFilterWordsChanged(SteamMsgPlayer.CPlayer_TextFilterWordsChanged_Notification request);
    
}

