
package com.nickbooher.protos.steamworks.services;

import com.nickbooher.protos.steamworks.SteamMsgHelpRequestSteamworks;

public interface IHelpRequestLogs {

    public SteamMsgHelpRequestSteamworks.CHelpRequestLogs_UploadUserApplicationLog_Response UploadUserApplicationLog(SteamMsgHelpRequestSteamworks.CHelpRequestLogs_UploadUserApplicationLog_Request request);
    
}

