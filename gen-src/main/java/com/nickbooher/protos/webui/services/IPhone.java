
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgPhone;

public interface IPhone {

    public SteamMsgPhone.CPhone_AddPhoneToAccount_Response ConfirmAddPhoneToAccount(SteamMsgPhone.CPhone_ConfirmAddPhoneToAccount_Request request);

    public SteamMsgPhone.CPhone_IsAccountWaitingForEmailConfirmation_Response IsAccountWaitingForEmailConfirmation(SteamMsgPhone.CPhone_IsAccountWaitingForEmailConfirmation_Request request);

    public SteamMsgPhone.CPhone_SendPhoneVerificationCode_Response SendPhoneVerificationCode(SteamMsgPhone.CPhone_SendPhoneVerificationCode_Request request);

    public SteamMsgPhone.CPhone_SetAccountPhoneNumber_Response SetAccountPhoneNumber(SteamMsgPhone.CPhone_SetAccountPhoneNumber_Request request);

    public SteamMsgPhone.CPhone_VerifyAccountPhoneWithCode_Response VerifyAccountPhoneWithCode(SteamMsgPhone.CPhone_VerifyAccountPhoneWithCode_Request request);
    
}

