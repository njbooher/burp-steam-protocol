
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgPartnerAppNotes;

public interface IPartnerAppNotes {

    public SteamMsgPartnerAppNotes.CPartnerAppNotes_CreateNotes_Response CreateNotes(SteamMsgPartnerAppNotes.CPartnerAppNotes_CreateNotes_Request request);

    public SteamMsgPartnerAppNotes.CPartnerAppNotes_GetMultipleNotes_Response GetMultipleNotes(SteamMsgPartnerAppNotes.CPartnerAppNotes_GetMultipleNotes_Request request);

    public SteamMsgPartnerAppNotes.CPartnerAppNotes_GetNotes_Response GetNotes(SteamMsgPartnerAppNotes.CPartnerAppNotes_GetNotes_Request request);

    public SteamMsgPartnerAppNotes.CPartnerAppNotes_UpdateNotes_Response UpdateNotes(SteamMsgPartnerAppNotes.CPartnerAppNotes_UpdateNotes_Request request);
    
}

