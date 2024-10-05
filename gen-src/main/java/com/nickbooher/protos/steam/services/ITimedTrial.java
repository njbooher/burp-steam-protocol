
package com.nickbooher.protos.steam.services;

import com.nickbooher.protos.steam.SteamMsgTimedTrial;

public interface ITimedTrial {

    public SteamMsgTimedTrial.CTimedTrial_GetTimeRemaining_Response GetTimeRemaining(SteamMsgTimedTrial.CTimedTrial_GetTimeRemaining_Request request);

    public SteamMsgTimedTrial.CTimedTrial_RecordPlaytime_Response RecordPlaytime(SteamMsgTimedTrial.CTimedTrial_RecordPlaytime_Request request);

    public SteamMsgTimedTrial.CTimedTrial_ResetPlaytime_Response ResetPlaytime(SteamMsgTimedTrial.CTimedTrial_ResetPlaytime_Request request);
    
}

