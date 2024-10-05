
package com.nickbooher.protos.steam.services;

import com.nickbooher.protos.steam.SteamMsgGameRecording;

public interface IGameRecordingClip {

    public SteamMsgGameRecording.CGameRecording_CreateShareClip_Response CreateShareClip(SteamMsgGameRecording.CGameRecording_CreateShareClip_Request request);

    public SteamMsgGameRecording.CGameRecording_DeleteSharedClip_Response DeleteSharedClip(SteamMsgGameRecording.CGameRecording_DeleteSharedClip_Request request);

    public SteamMsgGameRecording.CGameRecording_GetSingleSharedClip_Response GetSingleSharedClip(SteamMsgGameRecording.CGameRecording_GetSingleSharedClip_Request request);
    
}

