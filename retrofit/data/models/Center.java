package org.ws.iranskill_prov_1400.data.models;

import androidx.annotation.Nullable;

import com.google.gson.annotations.SerializedName;

public class Center {
    int id;
    CenterType centerType;
    String name;
    String address;
    double longitude;
    double latitude;
    @Nullable
    String image;
    @Nullable
    String telephone;
    @Nullable
    int score;
    @Nullable
    CenterManager manager;

    public Center Builder(int id, CenterType centerType, String name, String address, double longitude, double latitude, @Nullable String image, @Nullable String telephone, int score, @Nullable CenterManager manager) {
        this.id = id;
        this.centerType = centerType;
        this.name = name;
        this.address = address;
        this.longitude = longitude;
        this.latitude = latitude;
        this.image = image;
        this.telephone = telephone;
        this.score = score;
        this.manager = manager;
        return this;
    }

    public int getId() {
        return id;
    }

    public CenterType getCenterType() {
        return centerType;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    @Nullable
    public String getImage() {
        return image;
    }

    @Nullable
    public String getTelephone() {
        return telephone;
    }

    public int getScore() {
        return score;
    }

    @Nullable
    public CenterManager getManager() {
        return manager;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCenterType(CenterType centerType) {
        this.centerType = centerType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setImage(@Nullable String image) {
        this.image = image;
    }

    public void setTelephone(@Nullable String telephone) {
        this.telephone = telephone;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setManager(@Nullable CenterManager manager) {
        this.manager = manager;
    }
}
