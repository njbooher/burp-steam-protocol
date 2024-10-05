
package com.nickbooher.protos.webui.services;

import com.nickbooher.protos.webui.SteamMsgCommon;
import com.nickbooher.protos.webui.SteamMsgPhysicalGoods;

public interface IPhysicalGoods {

    public SteamMsgPhysicalGoods.CPhysicalGoods_CheckInventoryAvailableByPackage_Response CheckInventoryAvailableByPackage(SteamMsgPhysicalGoods.CPhysicalGoods_CheckInventoryAvailableByPackage_Request request);
    
}

