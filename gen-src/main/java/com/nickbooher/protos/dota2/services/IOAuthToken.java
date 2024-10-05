
package com.nickbooher.protos.steamworks.services;

import com.nickbooher.protos.steamworks.SteamMsgOAuthSteamworks;

public interface IOAuthToken {

    public SteamMsgOAuthSteamworks.COAuthToken_ImplicitGrantNoPrompt_Response ImplicitGrantNoPrompt(SteamMsgOAuthSteamworks.COAuthToken_ImplicitGrantNoPrompt_Request request);
    
}

