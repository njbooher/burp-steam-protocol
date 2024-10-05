
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgParental;

public interface IParental {

    public SteamMsgParental.CParental_ApproveFeatureAccess_Response ApproveFeatureAccess(SteamMsgParental.CParental_ApproveFeatureAccess_Request request);

    public SteamMsgParental.CParental_ApprovePlaytime_Response ApprovePlaytime(SteamMsgParental.CParental_ApprovePlaytime_Request request);

    public SteamMsgParental.CParental_DisableParentalSettings_Response DisableParentalSettings(SteamMsgParental.CParental_DisableParentalSettings_Request request);

    public SteamMsgParental.CParental_DisableWithRecoveryCode_Response DisableWithRecoveryCode(SteamMsgParental.CParental_DisableWithRecoveryCode_Request request);

    public SteamMsgParental.CParental_EnableParentalSettings_Response EnableParentalSettings(SteamMsgParental.CParental_EnableParentalSettings_Request request);

    public SteamMsgParental.CParental_GetParentalSettings_Response GetParentalSettings(SteamMsgParental.CParental_GetParentalSettings_Request request);

    public SteamMsgParental.CParental_GetRequests_Response GetRequests(SteamMsgParental.CParental_GetRequests_Request request);

    public SteamMsgParental.CParental_GetSignedParentalSettings_Response GetSignedParentalSettings(SteamMsgParental.CParental_GetSignedParentalSettings_Request request);

    public SteamMsgParental.CParental_LockClient_Response LockClient(SteamMsgParental.CParental_LockClient_Request request);

    public SteamMsgParental.CParental_ReportPlaytimeAndNotify_Response ReportPlaytimeAndNotify(SteamMsgParental.CParental_ReportPlaytimeAndNotify_Request request);

    public SteamMsgParental.CParental_RequestFeatureAccess_Response RequestFeatureAccess(SteamMsgParental.CParental_RequestFeatureAccess_Request request);

    public SteamMsgParental.CParental_RequestPlaytime_Response RequestPlaytime(SteamMsgParental.CParental_RequestPlaytime_Request request);

    public SteamMsgParental.CParental_RequestRecoveryCode_Response RequestRecoveryCode(SteamMsgParental.CParental_RequestRecoveryCode_Request request);

    public SteamMsgParental.CParental_SetParentalSettings_Response SetParentalSettings(SteamMsgParental.CParental_SetParentalSettings_Request request);

    public SteamMsgParental.CParental_ValidatePassword_Response ValidatePassword(SteamMsgParental.CParental_ValidatePassword_Request request);

    public SteamMsgParental.CParental_ValidateToken_Response ValidateToken(SteamMsgParental.CParental_ValidateToken_Request request);
    
}

