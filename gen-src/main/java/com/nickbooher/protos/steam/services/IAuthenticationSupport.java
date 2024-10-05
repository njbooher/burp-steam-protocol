
package com.nickbooher.protos.steam.services;

import com.nickbooher.protos.steam.SteamMsgAuth;

public interface IAuthenticationSupport {

    public SteamMsgAuth.CAuthenticationSupport_QueryRefreshTokensByAccount_Response QueryRefreshTokensByAccount(SteamMsgAuth.CAuthenticationSupport_QueryRefreshTokensByAccount_Request request);

    public SteamMsgAuth.CAuthenticationSupport_QueryRefreshTokenByID_Response QueryRefreshTokenByID(SteamMsgAuth.CAuthenticationSupport_QueryRefreshTokenByID_Request request);

    public SteamMsgAuth.CAuthenticationSupport_RevokeToken_Response RevokeToken(SteamMsgAuth.CAuthenticationSupport_RevokeToken_Request request);

    public SteamMsgAuth.CAuthenticationSupport_GetTokenHistory_Response GetTokenHistory(SteamMsgAuth.CAuthenticationSupport_GetTokenHistory_Request request);
    
}

