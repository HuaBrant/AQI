package com.zwh.aqi.db;

/**
 * Created by zwh on 2017/11/21 0021.
 */

public class pm2_5 {

    /**
     * aqi : 39
     * area : 珠海
     * pm2_5 : 27
     * pm2_5_24h : 16
     * position_name : 吉大
     * primary_pollutant : null
     * quality : 优
     * station_code : 1367A
     * time_point : 2017-11-21T14:00:00Z
     */

    private int aqi;
    private String area;
    private int pm2_5;
    private int pm2_5_24h;
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

    public void setPm2_5(int pm2_5) {
        this.pm2_5 = pm2_5;
    }

    public void setPm2_5_24h(int pm2_5_24h) {
        this.pm2_5_24h = pm2_5_24h;
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

    public int getPm2_5() {
        return pm2_5;
    }

    public int getPm2_5_24h() {
        return pm2_5_24h;
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
