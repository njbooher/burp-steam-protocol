
package com.nickbooher.protos.steam.services;

import com.nickbooher.protos.steam.SteamMsgParental;

public interface IParentalClient {

    public void NotifySettingsChange(SteamMsgParental.CParental_ParentalSettingsChange_Notification request);

    public void NotifyUnlock(SteamMsgParental.CParental_ParentalUnlock_Notification request);

    public void NotifyLock(SteamMsgParental.CParental_ParentalLock_Notification request);

    public void NotifyPlaytimeUsed(SteamMsgParental.CParental_PlaytimeUsed_Notification request);
    
}

