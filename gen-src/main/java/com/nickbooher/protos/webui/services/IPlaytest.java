
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgPlaytest;

public interface IPlaytest {

    public SteamMsgPlaytest.CPlaytest_GetInvites_Response GetInvites(SteamMsgPlaytest.CPlaytest_GetInvites_Request request);

    public SteamMsgPlaytest.CPlaytest_UpdateInvites_Response UpdateInvites(SteamMsgPlaytest.CPlaytest_UpdateInvites_Request request);
    
}

