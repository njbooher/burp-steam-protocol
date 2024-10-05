
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgGameNotes;

public interface IGameNotes {

    public SteamMsgGameNotes.CGameNotes_UploadImage_Response UploadImage(SteamMsgGameNotes.CGameNotes_UploadImage_Request request);
    
}

