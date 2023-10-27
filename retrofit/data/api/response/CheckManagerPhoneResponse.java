package org.ws.iranskill_prov_1400.data.api.response;

import org.ws.iranskill_prov_1400.data.models.CenterManager;

public class CheckManagerPhoneResponse {
    String status;
    CenterManager manager;

    public String getStatus() {
        return status;
    }

    public CenterManager getManager() {
        return manager;
    }
}
