
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgPartnerDeadline;

public interface IPartnerDeadline {

    public SteamMsgPartnerDeadline.CPartnerDeadline_GetDeadlineByTimeRange_Response GetDeadlineByTimeRange(SteamMsgPartnerDeadline.CPartnerDeadline_GetDeadlineByTimeRange_Request request);

    public SteamMsgPartnerDeadline.CPartnerDeadline_GetDeadlinesForPartner_Response GetDeadlinesForPartner(SteamMsgPartnerDeadline.CPartnerDeadline_GetDeadlinesForPartner_Request request);
    
}

