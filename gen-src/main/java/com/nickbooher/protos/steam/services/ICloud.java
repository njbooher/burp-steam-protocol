
package com.nickbooher.protos.steam.services;

import com.nickbooher.protos.steam.SteamMsgCloud;

public interface ICloud {

    public void ClientLogUploadCheck(SteamMsgCloud.CCloud_ClientLogUploadCheck_Notification request);

    public void ClientLogUploadComplete(SteamMsgCloud.CCloud_ClientLogUploadComplete_Notification request);

    public SteamMsgCloud.CCloud_GetUploadServerInfo_Response GetUploadServerInfo(SteamMsgCloud.CCloud_GetUploadServerInfo_Request request);

    public SteamMsgCloud.CCloud_BeginHTTPUpload_Response BeginHTTPUpload(SteamMsgCloud.CCloud_BeginHTTPUpload_Request request);

    public SteamMsgCloud.CCloud_CommitHTTPUpload_Response CommitHTTPUpload(SteamMsgCloud.CCloud_CommitHTTPUpload_Request request);

    public SteamMsgCloud.CCloud_BeginUGCUpload_Response BeginUGCUpload(SteamMsgCloud.CCloud_BeginUGCUpload_Request request);

    public SteamMsgCloud.CCloud_CommitUGCUpload_Response CommitUGCUpload(SteamMsgCloud.CCloud_CommitUGCUpload_Request request);

    public SteamMsgCloud.CCloud_GetFileDetails_Response GetFileDetails(SteamMsgCloud.CCloud_GetFileDetails_Request request);

    public SteamMsgCloud.CCloud_EnumerateUserFiles_Response EnumerateUserFiles(SteamMsgCloud.CCloud_EnumerateUserFiles_Request request);

    public SteamMsgCloud.CCloud_Delete_Response Delete(SteamMsgCloud.CCloud_Delete_Request request);

    public SteamMsgCloud.CCloud_GetClientEncryptionKey_Response GetClientEncryptionKey(SteamMsgCloud.CCloud_GetClientEncryptionKey_Request request);

    public void CDNReport(SteamMsgCloud.CCloud_CDNReport_Notification request);

    public void ExternalStorageTransferReport(SteamMsgCloud.CCloud_ExternalStorageTransferReport_Notification request);

    public SteamMsgCloud.CCloud_BeginAppUploadBatch_Response BeginAppUploadBatch(SteamMsgCloud.CCloud_BeginAppUploadBatch_Request request);

    public void CompleteAppUploadBatch(SteamMsgCloud.CCloud_CompleteAppUploadBatch_Notification request);

    public SteamMsgCloud.CCloud_CompleteAppUploadBatch_Response CompleteAppUploadBatchBlocking(SteamMsgCloud.CCloud_CompleteAppUploadBatch_Request request);

    public SteamMsgCloud.CCloud_ClientBeginFileUpload_Response ClientBeginFileUpload(SteamMsgCloud.CCloud_ClientBeginFileUpload_Request request);

    public SteamMsgCloud.CCloud_ClientCommitFileUpload_Response ClientCommitFileUpload(SteamMsgCloud.CCloud_ClientCommitFileUpload_Request request);

    public SteamMsgCloud.CCloud_ClientFileDownload_Response ClientFileDownload(SteamMsgCloud.CCloud_ClientFileDownload_Request request);

    public SteamMsgCloud.CCloud_ClientDeleteFile_Response ClientDeleteFile(SteamMsgCloud.CCloud_ClientDeleteFile_Request request);

    public void ClientConflictResolution(SteamMsgCloud.CCloud_ClientConflictResolution_Notification request);

    public SteamMsgCloud.CCloud_EnumerateUserApps_Response EnumerateUserApps(SteamMsgCloud.CCloud_EnumerateUserApps_Request request);

    public SteamMsgCloud.CCloud_GetAppFileChangelist_Response GetAppFileChangelist(SteamMsgCloud.CCloud_GetAppFileChangelist_Request request);

    public SteamMsgCloud.CCloud_AppSessionSuspend_Response SuspendAppSession(SteamMsgCloud.CCloud_AppSessionSuspend_Request request);

    public SteamMsgCloud.CCloud_AppSessionResume_Response ResumeAppSession(SteamMsgCloud.CCloud_AppSessionResume_Request request);

    public SteamMsgCloud.CCloud_AppLaunchIntent_Response SignalAppLaunchIntent(SteamMsgCloud.CCloud_AppLaunchIntent_Request request);

    public void SignalAppExitSyncDone(SteamMsgCloud.CCloud_AppExitSyncDone_Notification request);

    public SteamMsgCloud.CCloud_ClientGetAppQuotaUsage_Response ClientGetAppQuotaUsage(SteamMsgCloud.CCloud_ClientGetAppQuotaUsage_Request request);
    
}

