
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgHelpRequestLogs;

public interface IHelpRequestLogs {

    public SteamMsgHelpRequestLogs.CHelpRequestLogs_UploadUserApplicationLog_Response UploadUserApplicationLog(SteamMsgHelpRequestLogs.CHelpRequestLogs_UploadUserApplicationLog_Request request);
    
}

