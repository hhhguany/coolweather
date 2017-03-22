package org.udidi.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by He.RO on 2017/3/21.
 */

public class County extends DataSupport {
    private int id;
    private String countryName;
    private String weatherId;
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCityId() {
        return cityId;
    }

    public String getCountyName() {
        return countryName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public void setCountyName(String countryName) {
        this.countryName = countryName;

    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }
}

