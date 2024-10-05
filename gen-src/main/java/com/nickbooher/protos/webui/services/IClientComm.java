
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgClientComm;

public interface IClientComm {

    public SteamMsgClientComm.CClientComm_EnableOrDisableDownloads_Response EnableOrDisableDownloads(SteamMsgClientComm.CClientComm_EnableOrDisableDownloads_Request request);

    public SteamMsgClientComm.CClientComm_GetAllClientLogonInfo_Response GetAllClientLogonInfo(SteamMsgClientComm.CClientComm_GetAllClientLogonInfo_Request request);

    public SteamMsgClientComm.CClientComm_GetClientAppList_Response GetClientAppList(SteamMsgClientComm.CClientComm_GetClientAppList_Request request);

    public SteamMsgClientComm.CClientComm_GetClientInfo_Response GetClientInfo(SteamMsgClientComm.CClientComm_GetClientInfo_Request request);

    public SteamMsgClientComm.CClientComm_GetClientLogonInfo_Response GetClientLogonInfo(SteamMsgClientComm.CClientComm_GetClientLogonInfo_Request request);

    public SteamMsgClientComm.CClientComm_InstallClientApp_Response InstallClientApp(SteamMsgClientComm.CClientComm_InstallClientApp_Request request);

    public SteamMsgClientComm.CClientComm_LaunchClientApp_Response LaunchClientApp(SteamMsgClientComm.CClientComm_LaunchClientApp_Request request);

    public SteamMsgClientComm.CClientComm_SetClientAppUpdateState_Response SetClientAppUpdateState(SteamMsgClientComm.CClientComm_SetClientAppUpdateState_Request request);

    public SteamMsgClientComm.CClientComm_UninstallClientApp_Response UninstallClientApp(SteamMsgClientComm.CClientComm_UninstallClientApp_Request request);
    
}

