package com.zwh.aqi.db;

/**
 * Created by zwh on 2017/11/21 0021.
 */

public class no2 {

    /**
     * aqi : 39
     * area : 珠海
     * no2 : 31
     * no2_24h : 33
     * position_name : 吉大
     * primary_pollutant : null
     * quality : 优
     * station_code : 1367A
     * time_point : 2017-11-21T14:00:00Z
     */

    private int aqi;
    private String area;
    private int no2;
    private int no2_24h;
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

    public void setNo2(int no2) {
        this.no2 = no2;
    }

    public void setNo2_24h(int no2_24h) {
        this.no2_24h = no2_24h;
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

    public int getNo2() {
        return no2;
    }

    public int getNo2_24h() {
        return no2_24h;
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
