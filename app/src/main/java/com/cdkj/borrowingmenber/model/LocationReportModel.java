package com.cdkj.borrowingmenber.model;

/**
 * Created by 李先俊 on 2017/12/13.
 */

public class LocationReportModel {
    /*        map.put("address", locationModel.getAddress() + ".");
        map.put("city", locationModel.getCity() + ".");
        map.put("latitude", locationModel.getLatitude() + ".");
        map.put("longitude", locationModel.getLongitude() + ".");
        map.put("province", locationModel.getProvince() + ".");*/

    private String address;
    private String city;
    private String latitude;
    private String longitude;
    private String province;
    private String area;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}
