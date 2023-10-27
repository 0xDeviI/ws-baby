package org.ws.iranskill_prov_1400.data.models;

public class CenterManager {
    String firstName;
    String lastName;
    String nationalCode;
    String phoneNumber;
    String birthDate;
    transient boolean isPreSubmitted;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isPreSubmitted() {
        return isPreSubmitted;
    }

    public void setPreSubmitted(boolean preSubmitted) {
        isPreSubmitted = preSubmitted;
    }
}
