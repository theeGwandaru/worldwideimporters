package com.worldwideimporters.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(schema = "Application", name="Cities")
public class City {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CityID")
    private int cityId;
    @Basic
    @Column(name = "CityName")
    private String cityName;
    @Basic
    @Column(name = "StateProvinceID")
    private int stateProvinceId;
    @Basic
    @Column(name = "Location")
    private Object location;
    @Basic
    @Column(name = "LatestRecordedPopulation")
    private Long latestRecordedPopulation;
    @Basic
    @Column(name = "LastEditedBy")
    private int lastEditedBy;
    @Basic
    @Column(name = "ValidFrom")
    private Date validFrom;
    @Basic
    @Column(name = "ValidTo")
    private Date validTo;

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getStateProvinceId() {
        return stateProvinceId;
    }

    public void setStateProvinceId(int stateProvinceId) {
        this.stateProvinceId = stateProvinceId;
    }

    public Object getLocation() {
        return location;
    }

    public void setLocation(Object location) {
        this.location = location;
    }

    public Long getLatestRecordedPopulation() {
        return latestRecordedPopulation;
    }

    public void setLatestRecordedPopulation(Long latestRecordedPopulation) {
        this.latestRecordedPopulation = latestRecordedPopulation;
    }

    public int getLastEditedBy() {
        return lastEditedBy;
    }

    public void setLastEditedBy(int lastEditedBy) {
        this.lastEditedBy = lastEditedBy;
    }

    public Date getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(Date validFrom) {
        this.validFrom = validFrom;
    }

    public Date getValidTo() {
        return validTo;
    }

    public void setValidTo(Date validTo) {
        this.validTo = validTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        City cities = (City) o;

        if (cityId != cities.cityId) return false;
        if (stateProvinceId != cities.stateProvinceId) return false;
        if (lastEditedBy != cities.lastEditedBy) return false;
        if (cityName != null ? !cityName.equals(cities.cityName) : cities.cityName != null) return false;
        if (location != null ? !location.equals(cities.location) : cities.location != null) return false;
        if (latestRecordedPopulation != null ? !latestRecordedPopulation.equals(cities.latestRecordedPopulation) : cities.latestRecordedPopulation != null)
            return false;
        if (validFrom != null ? !validFrom.equals(cities.validFrom) : cities.validFrom != null) return false;
        if (validTo != null ? !validTo.equals(cities.validTo) : cities.validTo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cityId;
        result = 31 * result + (cityName != null ? cityName.hashCode() : 0);
        result = 31 * result + stateProvinceId;
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (latestRecordedPopulation != null ? latestRecordedPopulation.hashCode() : 0);
        result = 31 * result + lastEditedBy;
        result = 31 * result + (validFrom != null ? validFrom.hashCode() : 0);
        result = 31 * result + (validTo != null ? validTo.hashCode() : 0);
        return result;
    }
}
