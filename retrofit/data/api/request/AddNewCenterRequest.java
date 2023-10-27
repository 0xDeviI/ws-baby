package org.ws.iranskill_prov_1400.data.api.request;

import androidx.annotation.Nullable;

import org.ws.iranskill_prov_1400.data.models.AddCenter;
import org.ws.iranskill_prov_1400.data.models.Center;
import org.ws.iranskill_prov_1400.data.models.CenterManager;
import org.ws.iranskill_prov_1400.data.models.CenterType;

public class AddNewCenterRequest extends AddCenter {
    public AddNewCenterRequest(int id, CenterType centerType, String name, String address, double longitude, double latitude, @Nullable String image, @Nullable String telephone, int score, @Nullable CenterManager manager, int centerTypeId) {
        Builder(id, centerType, name, address, longitude, latitude, image, telephone, score, manager);
        setCenterTypeId(centerTypeId);
    }

    @Override
    public int getCenterTypeId() {
        return super.getCenterTypeId();
    }
}
