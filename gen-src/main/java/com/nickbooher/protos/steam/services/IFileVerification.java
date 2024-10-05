
package com.nickbooher.protos.steam.services;

import com.nickbooher.protos.steam.SteamMsgVAC;

public interface IFileVerification {

    public SteamMsgVAC.CFileVerification_SignatureCheck_Response SignatureCheck(SteamMsgVAC.CFileVerification_SignatureCheck_Request request);

    public SteamMsgVAC.CFileVerification_SteamServiceCheck_Response SteamServiceCheck(SteamMsgVAC.CFileVerification_SteamServiceCheck_Request request);
    
}

