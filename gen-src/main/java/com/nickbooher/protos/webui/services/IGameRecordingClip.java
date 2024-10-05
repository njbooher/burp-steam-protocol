
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgGameRecordingClip;

public interface IGameRecordingClip {

    public SteamMsgGameRecordingClip.CGameRecording_CreateShareClip_Response CreateShareClip(SteamMsgGameRecordingClip.CGameRecording_CreateShareClip_Request request);

    public SteamMsgGameRecordingClip.CGameRecording_DeleteSharedClip_Response DeleteSharedClip(SteamMsgGameRecordingClip.CGameRecording_DeleteSharedClip_Request request);

    public SteamMsgGameRecordingClip.CGameRecording_GetSingleSharedClip_Response GetSingleSharedClip(SteamMsgGameRecordingClip.CGameRecording_GetSingleSharedClip_Request request);
    
}

