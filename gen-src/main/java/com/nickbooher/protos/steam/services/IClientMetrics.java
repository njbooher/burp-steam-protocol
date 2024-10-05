
package com.nickbooher.protos.steam.services;

import com.nickbooher.protos.steam.SteamMsgClientMetrics;

public interface IClientMetrics {

    public void ClientAppInterfaceStatsReport(SteamMsgClientMetrics.CClientMetrics_AppInterfaceStats_Notification request);

    public void ClientIPv6ConnectivityReport(SteamMsgClientMetrics.CClientMetrics_IPv6Connectivity_Notification request);

    public void SteamPipeWorkStatsReport(SteamMsgClientMetrics.CClientMetrics_SteamPipeWorkStats_Notification request);

    public void ReportReactUsage(SteamMsgClientMetrics.CClientMetrics_ReportReactUsage_Notification request);

    public void ReportClientError(SteamMsgClientMetrics.CClientMetrics_ReportClientError_Notification request);

    public void ClientBootstrapReport(SteamMsgClientMetrics.CClientMetrics_ClientBootstrap_Notification request);

    public void ClientDownloadRatesReport(SteamMsgClientMetrics.CClientMetrics_DownloadRates_Notification request);

    public void ClientContentValidationReport(SteamMsgClientMetrics.CClientMetrics_ContentValidation_Notification request);

    public void ClientCloudAppSyncStats(SteamMsgClientMetrics.CClientMetrics_CloudAppSyncStats_Notification request);

    public void ClientDownloadResponseCodeCounts(SteamMsgClientMetrics.CClientMetrics_ContentDownloadResponse_Counts_Notification request);

    public void ReportClientArgs(SteamMsgClientMetrics.CClientMetrics_ReportClientArgs_Notification request);

    public void ReportClipShare(SteamMsgClientMetrics.CClientMetrics_ClipShare_Notification request);

    public void ReportClipRange(SteamMsgClientMetrics.CClientMetrics_ClipRange_Notification request);

    public void ReportEndGameRecording(SteamMsgClientMetrics.CClientMetrics_EndGameRecording_Notification request);
    
}

