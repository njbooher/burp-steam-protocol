
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgGameScope;

public interface IGamescope {

    public SteamMsgGameScope.CGamescope_GetState_Response GetState(SteamMsgGameScope.CGamescope_GetState_Request request);

    public void NotifyStateChanged(SteamMsgGameScope.CGamescope_StateChanged_Notification request);

    public SteamMsgGameScope.CGamescope_ReArmMuraCalibration_Response ReArmMuraCalibration(SteamMsgGameScope.CGamescope_ReArmMuraCalibration_Request request);

    public SteamMsgGameScope.CGamescope_SetBlurParams_Response SetBlurParams(SteamMsgGameScope.CGamescope_SetBlurParams_Request request);
    
}

