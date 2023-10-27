package org.ws.iranskill_prov_1400.data.api.response;

public class UserInfoResponse {
    String firstName;
    String lastName;
    String image;
    int allCenters;
    int userCenters;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getImage() {
        return image;
    }

    public int getAllCenters() {
        return allCenters;
    }

    public int getUserCenters() {
        return userCenters;
    }
}
