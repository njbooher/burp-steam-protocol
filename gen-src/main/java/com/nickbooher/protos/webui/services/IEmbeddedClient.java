
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgEmbedded;

public interface IEmbeddedClient {

    public SteamMsgEmbedded.CEmbeddedClient_AuthorizeDevice_Response AuthorizeCurrentDevice(SteamMsgEmbedded.CEmbeddedClient_AuthorizeCurrentDevice_Request request);
    
}

