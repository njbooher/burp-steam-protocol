
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgUserGameNotes;

public interface IUserGameNotes {

    public SteamMsgUserGameNotes.CUserGameNotes_DeleteNote_Response DeleteNote(SteamMsgUserGameNotes.CUserGameNotes_DeleteNote_Request request);

    public SteamMsgUserGameNotes.CUserGameNotes_GetGamesWithNotes_Response GetGamesWithNotes(SteamMsgUserGameNotes.CUserGameNotes_GetGamesWithNotes_Request request);

    public SteamMsgUserGameNotes.CUserGameNotes_GetNotesForGame_Response GetNotesForGame(SteamMsgUserGameNotes.CUserGameNotes_GetNotesForGame_Request request);

    public SteamMsgUserGameNotes.CUserGameNotes_SaveNote_Response SaveNote(SteamMsgUserGameNotes.CUserGameNotes_SaveNote_Request request);
    
}

