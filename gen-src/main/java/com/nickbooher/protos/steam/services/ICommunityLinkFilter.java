
package com.nickbooher.protos.steam.services;

import com.nickbooher.protos.steam.SteamMsgLinkFilter;

public interface ICommunityLinkFilter {

    public SteamMsgLinkFilter.CCommunity_GetLinkFilterHashPrefixes_Response GetLinkFilterHashPrefixes(SteamMsgLinkFilter.CCommunity_GetLinkFilterHashPrefixes_Request request);

    public SteamMsgLinkFilter.CCommunity_GetLinkFilterHashes_Response GetLinkFilterHashes(SteamMsgLinkFilter.CCommunity_GetLinkFilterHashes_Request request);

    public SteamMsgLinkFilter.CCommunity_GetLinkFilterListVersion_Response GetLinkFilterListVersion(SteamMsgLinkFilter.CCommunity_GetLinkFilterListVersion_Request request);
    
}

