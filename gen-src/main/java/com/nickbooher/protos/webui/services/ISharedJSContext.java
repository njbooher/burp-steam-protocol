
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgSharedJSContext;

public interface ISharedJSContext {

    public SteamMsgSharedJSContext.CSharedJSContext_GetDesiredSteamUIWindows_Response GetDesiredSteamUIWindows(SteamMsgSharedJSContext.CSharedJSContext_GetDesiredSteamUIWindows_Request request);
    
}

