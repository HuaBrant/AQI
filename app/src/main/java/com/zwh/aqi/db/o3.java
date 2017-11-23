package com.zwh.aqi.db;

/**
 * Created by zwh on 2017/11/21 0021.
 */

public class o3 {

    /**
     * aqi : 39
     * area : 珠海
     * o3 : 90
     * o3_24h : 90
     * o3_8h : 48
     * o3_8h_24h : 48
     * position_name : 吉大
     * primary_pollutant : null
     * quality : 优
     * station_code : 1367A
     * time_point : 2017-11-21T14:00:00Z
     */

    private int aqi;
    private String area;
    private int o3;
    private int o3_24h;
    private int o3_8h;
    private int o3_8h_24h;
    private String position_name;
    private Object primary_pollutant;
    private String quality;
    private String station_code;
    private String time_point;

    public void setAqi(int aqi) {
        this.aqi = aqi;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setO3(int o3) {
        this.o3 = o3;
    }

    public void setO3_24h(int o3_24h) {
        this.o3_24h = o3_24h;
    }

    public void setO3_8h(int o3_8h) {
        this.o3_8h = o3_8h;
    }

    public void setO3_8h_24h(int o3_8h_24h) {
        this.o3_8h_24h = o3_8h_24h;
    }

    public void setPosition_name(String position_name) {
        this.position_name = position_name;
    }

    public void setPrimary_pollutant(Object primary_pollutant) {
        this.primary_pollutant = primary_pollutant;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public void setStation_code(String station_code) {
        this.station_code = station_code;
    }

    public void setTime_point(String time_point) {
        this.time_point = time_point;
    }

    public int getAqi() {
        return aqi;
    }

    public String getArea() {
        return area;
    }

    public int getO3() {
        return o3;
    }

    public int getO3_24h() {
        return o3_24h;
    }

    public int getO3_8h() {
        return o3_8h;
    }

    public int getO3_8h_24h() {
        return o3_8h_24h;
    }

    public String getPosition_name() {
        return position_name;
    }

    public Object getPrimary_pollutant() {
        return primary_pollutant;
    }

    public String getQuality() {
        return quality;
    }

    public String getStation_code() {
        return station_code;
    }

    public String getTime_point() {
        return time_point;
    }
}
