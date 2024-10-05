
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgParental;

public interface IParentalClient {

    public void NotifyLock(SteamMsgParental.CParental_ParentalLock_Notification request);

    public void NotifyPlaytimeUsed(SteamMsgParental.CParental_PlaytimeUsed_Notification request);

    public void NotifySettingsChange(SteamMsgParental.CParental_ParentalSettingsChange_Notification request);

    public void NotifyUnlock(SteamMsgParental.CParental_ParentalUnlock_Notification request);
    
}

