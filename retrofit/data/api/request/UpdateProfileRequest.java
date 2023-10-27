package org.ws.iranskill_prov_1400.data.api.request;

public class UpdateProfileRequest {
    private String firstName;
    private String lastName;
    private String image;

    public UpdateProfileRequest(String firstName, String lastName, String image) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.image = image;
    }
}
