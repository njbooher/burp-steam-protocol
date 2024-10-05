
package com.nickbooher.protos.steam.services;

import com.nickbooher.protos.steam.SteamMsgWorkshop;

public interface IWorkshop {

    public SteamMsgWorkshop.CWorkshop_GetEULAStatus_Response GetEULAStatus(SteamMsgWorkshop.CWorkshop_GetEULAStatus_Request request);
    
}

