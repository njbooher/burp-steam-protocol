
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgMobileDevice;

public interface IMobileDevice {

    public void DeregisterMobileDevice(SteamMsgMobileDevice.CMobileDevice_DeregisterMobileDevice_Notification request);

    public SteamMsgMobileDevice.CMobileDevice_HasMobileDevice_Response HasMobileDevice(SteamMsgMobileDevice.CMobileDevice_HasMobileDevice_Request request);

    public SteamMsgMobileDevice.CMobileDevice_RegisterMobileDevice_Response RegisterMobileDevice(SteamMsgMobileDevice.CMobileDevice_RegisterMobileDevice_Request request);
    
}

