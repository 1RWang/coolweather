package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * @author wangyiran
 * @date 19-5-26
 */
public class County extends DataSupport {
    private int id;
    /**
     县名
     */
    private String countyName;
    /**
     天气
     */
    private int weatherId;
    /**
     * 当前市所属省份id
     */
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {

        this.countyName = countyName;
    }

    public int getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(int weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId(){
        return cityId;
    }

    public void setCityId(int cityId){
        this.cityId = cityId;
    }
}
