
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgClanFAQs;

public interface IClanFAQS {

    public SteamMsgClanFAQs.CClanFAQS_CheckFAQPermissions_Response CheckFAQPermissions(SteamMsgClanFAQs.CClanFAQS_CheckFAQPermissions_Request request);

    public SteamMsgClanFAQs.CClanFAQS_Create_Response Create(SteamMsgClanFAQs.CClanFAQS_Create_Request request);

    public SteamMsgClanFAQs.CClanFAQS_Delete_Response Delete(SteamMsgClanFAQs.CClanFAQS_Delete_Request request);

    public SteamMsgClanFAQs.CClanFAQS_GetAllDrafts_Response GetAllDrafts(SteamMsgClanFAQs.CClanFAQS_GetAllDrafts_Request request);

    public SteamMsgClanFAQs.CClanFAQS_GetAllFAQsForClan_Response GetAllFAQsForClan(SteamMsgClanFAQs.CClanFAQS_GetAllFAQsForClan_Request request);

    public SteamMsgClanFAQs.CClanFAQS_GetAllLatestVersionPublishedFAQS_Response GetAllLatestVersionPublishedFAQS(SteamMsgClanFAQs.CClanFAQS_GetAllLatestVersionPublishedFAQS_Request request);

    public SteamMsgClanFAQs.CClanFAQS_GetFAQ_Response GetFAQ(SteamMsgClanFAQs.CClanFAQS_GetFAQ_Request request);

    public SteamMsgClanFAQs.CClanFAQS_GetFAQVersion_Response GetFAQVersion(SteamMsgClanFAQs.CClanFAQS_GetFAQVersion_Request request);

    public SteamMsgClanFAQs.CClanFAQS_PreviewDraft_Response PreviewDraft(SteamMsgClanFAQs.CClanFAQS_PreviewDraft_Request request);

    public SteamMsgClanFAQs.CClanFAQS_PublishDraft_Response PublishDraft(SteamMsgClanFAQs.CClanFAQS_PublishDraft_Request request);

    public SteamMsgClanFAQs.CClanFAQS_SearchFAQs_Response SearchFAQs(SteamMsgClanFAQs.CClanFAQS_SearchFAQs_Request request);

    public SteamMsgClanFAQs.CClanFAQS_SetVisibility_Response SetVisibility(SteamMsgClanFAQs.CClanFAQS_SetVisibility_Request request);

    public SteamMsgClanFAQs.CClanFAQS_UpdateDraft_Response UpdateDraft(SteamMsgClanFAQs.CClanFAQS_UpdateDraft_Request request);

    public SteamMsgClanFAQs.CClanFAQS_UpdateInternalName_Response UpdateInternalName(SteamMsgClanFAQs.CClanFAQS_UpdateInternalName_Request request);

    public SteamMsgClanFAQs.CClanFAQS_UpdateJsonData_Response UpdateJsonData(SteamMsgClanFAQs.CClanFAQS_UpdateJsonData_Request request);
    
}

