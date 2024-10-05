
package com.nickbooher.protos.steam.services;

import com.nickbooher.protos.steam.SteamMsgShader;

public interface IShader {

    public SteamMsgShader.CShader_GetShaderReportingCadence_Response GetShaderReportingCadence(SteamMsgShader.CShader_GetShaderReportingCadence_Request request);

    public SteamMsgShader.CShader_RegisterShader_Response RegisterShader(SteamMsgShader.CShader_RegisterShader_Request request);

    public SteamMsgShader.CShader_SendShader_Response SendShader(SteamMsgShader.CShader_SendShader_Request request);

    public SteamMsgShader.CShader_GetBucketManifest_Response GetBucketManifest(SteamMsgShader.CShader_GetBucketManifest_Request request);

    public SteamMsgShader.CShader_GetStaleBucket_Response GetStaleBucket(SteamMsgShader.CShader_GetStaleBucket_Request request);

    public SteamMsgShader.CShader_ReportExternalBuild_Response ReportExternalBuild(SteamMsgShader.CShader_ReportExternalBuild_Request request);
    
}

