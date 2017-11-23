package com.zwh.aqi.db;

/**
 * Created by zwh on 2017/11/21 0021.
 */

public class pm10 {

    /**
     * aqi : 39
     * area : 珠海
     * pm10 : 37
     * pm10_24h : 29
     * position_name : 吉大
     * primary_pollutant : null
     * quality : 优
     * station_code : 1367A
     * time_point : 2017-11-21T14:00:00Z
     */

    private int aqi;
    private String area;
    private int pm10;
    private int pm10_24h;
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

    public void setPm10(int pm10) {
        this.pm10 = pm10;
    }

    public void setPm10_24h(int pm10_24h) {
        this.pm10_24h = pm10_24h;
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

    public int getPm10() {
        return pm10;
    }

    public int getPm10_24h() {
        return pm10_24h;
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
