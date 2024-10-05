
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgPartnerMembershipInvite;

public interface IPartnerMembershipInvite {

    public SteamMsgPartnerMembershipInvite.CPartnerMembershipInvite_GetInvites_Response GetInvites(SteamMsgPartnerMembershipInvite.CPartnerMembershipInvite_GetInvites_Request request);
    
}

