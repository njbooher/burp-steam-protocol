
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgFamilyGroups;

public interface IFamilyGroupsClient {

    public void NotifyGroupChanged(SteamMsgFamilyGroups.CFamilyGroupsClient_GroupChanged_Notification request);

    public void NotifyInviteStatus(SteamMsgFamilyGroups.CFamilyGroupsClient_InviteStatus_Notification request);

    public void NotifyRunningApps(SteamMsgFamilyGroups.CFamilyGroupsClient_NotifyRunningApps_Notification request);
    
}

