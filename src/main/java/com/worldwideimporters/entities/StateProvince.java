package com.worldwideimporters.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(schema = "Application", name="StateProvinces")
public class StateProvince {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "StateProvinceID")
    private int stateProvinceId;
    @Basic
    @Column(name = "StateProvinceCode")
    private String stateProvinceCode;
    @Basic
    @Column(name = "StateProvinceName")
    private String stateProvinceName;
    @Basic
    @Column(name = "CountryID")
    private int countryId;
    @Basic
    @Column(name = "SalesTerritory")
    private String salesTerritory;
    @Basic
    @Column(name = "Border")
    private Object border;
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

    public int getStateProvinceId() {
        return stateProvinceId;
    }

    public void setStateProvinceId(int stateProvinceId) {
        this.stateProvinceId = stateProvinceId;
    }

    public String getStateProvinceCode() {
        return stateProvinceCode;
    }

    public void setStateProvinceCode(String stateProvinceCode) {
        this.stateProvinceCode = stateProvinceCode;
    }

    public String getStateProvinceName() {
        return stateProvinceName;
    }

    public void setStateProvinceName(String stateProvinceName) {
        this.stateProvinceName = stateProvinceName;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public String getSalesTerritory() {
        return salesTerritory;
    }

    public void setSalesTerritory(String salesTerritory) {
        this.salesTerritory = salesTerritory;
    }

    public Object getBorder() {
        return border;
    }

    public void setBorder(Object border) {
        this.border = border;
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

        StateProvince that = (StateProvince) o;

        if (stateProvinceId != that.stateProvinceId) return false;
        if (countryId != that.countryId) return false;
        if (lastEditedBy != that.lastEditedBy) return false;
        if (stateProvinceCode != null ? !stateProvinceCode.equals(that.stateProvinceCode) : that.stateProvinceCode != null)
            return false;
        if (stateProvinceName != null ? !stateProvinceName.equals(that.stateProvinceName) : that.stateProvinceName != null)
            return false;
        if (salesTerritory != null ? !salesTerritory.equals(that.salesTerritory) : that.salesTerritory != null)
            return false;
        if (border != null ? !border.equals(that.border) : that.border != null) return false;
        if (latestRecordedPopulation != null ? !latestRecordedPopulation.equals(that.latestRecordedPopulation) : that.latestRecordedPopulation != null)
            return false;
        if (validFrom != null ? !validFrom.equals(that.validFrom) : that.validFrom != null) return false;
        if (validTo != null ? !validTo.equals(that.validTo) : that.validTo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = stateProvinceId;
        result = 31 * result + (stateProvinceCode != null ? stateProvinceCode.hashCode() : 0);
        result = 31 * result + (stateProvinceName != null ? stateProvinceName.hashCode() : 0);
        result = 31 * result + countryId;
        result = 31 * result + (salesTerritory != null ? salesTerritory.hashCode() : 0);
        result = 31 * result + (border != null ? border.hashCode() : 0);
        result = 31 * result + (latestRecordedPopulation != null ? latestRecordedPopulation.hashCode() : 0);
        result = 31 * result + lastEditedBy;
        result = 31 * result + (validFrom != null ? validFrom.hashCode() : 0);
        result = 31 * result + (validTo != null ? validTo.hashCode() : 0);
        return result;
    }
}
