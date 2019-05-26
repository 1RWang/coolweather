package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * @author wangyiran
 * @date 19-5-26
 */
public class City extends DataSupport {
    private int id;
    /**
      市名
     */
    private String cityName;
    /**
      市代号
     */
    private int cityCode;
    /**
     * 当前市所属省份id
     */
    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {

        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId(){
        return provinceId;
    }

    public void setProvinceId(int provinceId){
        this.provinceId = provinceId;
    }
}
