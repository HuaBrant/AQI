package com.zwh.aqi.db;

/**
 * Created by zwh on 2017/11/21 0021.
 */

public class api {

    /**
     * aqi : 39
     * area : 珠海
     * co : 0.9
     * co_24h : 0.9
     * no2 : 31
     * no2_24h : 33
     * o3 : 90
     * o3_24h : 90
     * o3_8h : 48
     * o3_8h_24h : 48
     * pm10 : 37
     * pm10_24h : 29
     * pm2_5 : 27
     * pm2_5_24h : 16
     * position_name : 吉大
     * primary_pollutant : null
     * quality : 优
     * so2 : 9
     * so2_24h : 9
     * station_code : 1367A
     * time_point : 2017-11-21T14:00:00Z
     */

    private int aqi;
    private String area;
    private double co;
    private double co_24h;
    private int no2;
    private int no2_24h;
    private int o3;
    private int o3_24h;
    private int o3_8h;
    private int o3_8h_24h;
    private int pm10;
    private int pm10_24h;
    private int pm2_5;
    private int pm2_5_24h;
    private String position_name;
    private Object primary_pollutant;
    private String quality;
    private int so2;
    private int so2_24h;
    private String station_code;
    private String time_point;

    public void setAqi(int aqi) {
        this.aqi = aqi;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setCo(double co) {
        this.co = co;
    }

    public void setCo_24h(double co_24h) {
        this.co_24h = co_24h;
    }

    public void setNo2(int no2) {
        this.no2 = no2;
    }

    public void setNo2_24h(int no2_24h) {
        this.no2_24h = no2_24h;
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

    public void setPm10(int pm10) {
        this.pm10 = pm10;
    }

    public void setPm10_24h(int pm10_24h) {
        this.pm10_24h = pm10_24h;
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

    public void setSo2(int so2) {
        this.so2 = so2;
    }

    public void setSo2_24h(int so2_24h) {
        this.so2_24h = so2_24h;
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

    public double getCo() {
        return co;
    }

    public double getCo_24h() {
        return co_24h;
    }

    public int getNo2() {
        return no2;
    }

    public int getNo2_24h() {
        return no2_24h;
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

    public int getPm10() {
        return pm10;
    }

    public int getPm10_24h() {
        return pm10_24h;
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

    public int getSo2() {
        return so2;
    }

    public int getSo2_24h() {
        return so2_24h;
    }

    public String getStation_code() {
        return station_code;
    }

    public String getTime_point() {
        return time_point;
    }
}
