
package com.nickbooher.protos.steam.services;

import com.nickbooher.protos.steam.SteamMsgFamilyGroups;

public interface IFamilyGroupsClient {

    public void NotifyRunningApps(SteamMsgFamilyGroups.CFamilyGroupsClient_NotifyRunningApps_Notification request);

    public void NotifyInviteStatus(SteamMsgFamilyGroups.CFamilyGroupsClient_InviteStatus_Notification request);

    public void NotifyGroupChanged(SteamMsgFamilyGroups.CFamilyGroupsClient_GroupChanged_Notification request);
    
}

