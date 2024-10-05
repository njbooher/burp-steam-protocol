
package com.nickbooher.protos.steam.services;

import com.nickbooher.protos.steam.SteamMsgDataPublisher;

public interface IValveHWSurvey {

    public SteamMsgDataPublisher.CValveHWSurvey_GetSurveySchedule_Response GetSurveySchedule(SteamMsgDataPublisher.CValveHWSurvey_GetSurveySchedule_Request request);
    
}

