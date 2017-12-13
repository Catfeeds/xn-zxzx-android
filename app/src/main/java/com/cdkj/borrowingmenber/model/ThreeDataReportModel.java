package com.cdkj.borrowingmenber.model;

/**
 * 欺诈3接口
 * Created by cdkj on 2017/12/13.
 */

public class ThreeDataReportModel {
    /*  if (mCanGetIemi) {
            map.put("imei", SystemUtils.getIMEI(this));
        }
        map.put("ip", SystemUtils.getIPAddress(true));
        map.put("mac", SystemUtils.getMacAddress(this));
        map.put("wifimac", SystemUtils.getMacAddress(this));*/

    private String imei;
    private String ip;
    private String mac;
    private String wifimac;

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getWifimac() {
        return wifimac;
    }

    public void setWifimac(String wifimac) {
        this.wifimac = wifimac;
    }
}
