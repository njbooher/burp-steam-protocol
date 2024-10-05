
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgPartnerDismiss;

public interface IPartnerDismiss {

    public SteamMsgPartnerDismiss.CPartnerDismiss_CreateDismiss_Response CreateDismiss(SteamMsgPartnerDismiss.CPartnerDismiss_CreateDismiss_Request request);

    public SteamMsgPartnerDismiss.CPartnerDismiss_DeleteDismiss_Response DeleteDismiss(SteamMsgPartnerDismiss.CPartnerDismiss_DeleteDismiss_Request request);

    public SteamMsgPartnerDismiss.CPartnerDismiss_GetDismissTimeRange_Response GetDismissTimeRange(SteamMsgPartnerDismiss.CPartnerDismiss_GetDismissTimeRange_Request request);
    
}

