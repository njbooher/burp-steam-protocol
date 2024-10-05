
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgAccountLinking;

public interface IAccountLinking {

    public SteamMsgAccountLinking.CAccountLinking_GetLinkedAccountInfo_Response GetLinkedAccountInfo(SteamMsgAccountLinking.CAccountLinking_GetLinkedAccountInfo_Request request);
    
}

