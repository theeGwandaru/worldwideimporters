package com.worldwideimporters.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Country {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CountryID")
    private int countryId;
    @Basic
    @Column(name = "CountryName")
    private String countryName;
    @Basic
    @Column(name = "FormalName")
    private String formalName;
    @Basic
    @Column(name = "IsoAlpha3Code")
    private String isoAlpha3Code;
    @Basic
    @Column(name = "IsoNumericCode")
    private Integer isoNumericCode;
    @Basic
    @Column(name = "CountryType")
    private String countryType;
    @Basic
    @Column(name = "LatestRecordedPopulation")
    private Long latestRecordedPopulation;
    @Basic
    @Column(name = "Continent")
    private String continent;
    @Basic
    @Column(name = "Region")
    private String region;
    @Basic
    @Column(name = "Subregion")
    private String subregion;
    @Basic
    @Column(name = "Border")
    private Object border;
    @Basic
    @Column(name = "LastEditedBy")
    private int lastEditedBy;
    @Basic
    @Column(name = "ValidFrom")
    private Date validFrom;
    @Basic
    @Column(name = "ValidTo")
    private Date validTo;

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getFormalName() {
        return formalName;
    }

    public void setFormalName(String formalName) {
        this.formalName = formalName;
    }

    public String getIsoAlpha3Code() {
        return isoAlpha3Code;
    }

    public void setIsoAlpha3Code(String isoAlpha3Code) {
        this.isoAlpha3Code = isoAlpha3Code;
    }

    public Integer getIsoNumericCode() {
        return isoNumericCode;
    }

    public void setIsoNumericCode(Integer isoNumericCode) {
        this.isoNumericCode = isoNumericCode;
    }

    public String getCountryType() {
        return countryType;
    }

    public void setCountryType(String countryType) {
        this.countryType = countryType;
    }

    public Long getLatestRecordedPopulation() {
        return latestRecordedPopulation;
    }

    public void setLatestRecordedPopulation(Long latestRecordedPopulation) {
        this.latestRecordedPopulation = latestRecordedPopulation;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSubregion() {
        return subregion;
    }

    public void setSubregion(String subregion) {
        this.subregion = subregion;
    }

    public Object getBorder() {
        return border;
    }

    public void setBorder(Object border) {
        this.border = border;
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

        Country countries = (Country) o;

        if (countryId != countries.countryId) return false;
        if (lastEditedBy != countries.lastEditedBy) return false;
        if (countryName != null ? !countryName.equals(countries.countryName) : countries.countryName != null)
            return false;
        if (formalName != null ? !formalName.equals(countries.formalName) : countries.formalName != null) return false;
        if (isoAlpha3Code != null ? !isoAlpha3Code.equals(countries.isoAlpha3Code) : countries.isoAlpha3Code != null)
            return false;
        if (isoNumericCode != null ? !isoNumericCode.equals(countries.isoNumericCode) : countries.isoNumericCode != null)
            return false;
        if (countryType != null ? !countryType.equals(countries.countryType) : countries.countryType != null)
            return false;
        if (latestRecordedPopulation != null ? !latestRecordedPopulation.equals(countries.latestRecordedPopulation) : countries.latestRecordedPopulation != null)
            return false;
        if (continent != null ? !continent.equals(countries.continent) : countries.continent != null) return false;
        if (region != null ? !region.equals(countries.region) : countries.region != null) return false;
        if (subregion != null ? !subregion.equals(countries.subregion) : countries.subregion != null) return false;
        if (border != null ? !border.equals(countries.border) : countries.border != null) return false;
        if (validFrom != null ? !validFrom.equals(countries.validFrom) : countries.validFrom != null) return false;
        if (validTo != null ? !validTo.equals(countries.validTo) : countries.validTo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = countryId;
        result = 31 * result + (countryName != null ? countryName.hashCode() : 0);
        result = 31 * result + (formalName != null ? formalName.hashCode() : 0);
        result = 31 * result + (isoAlpha3Code != null ? isoAlpha3Code.hashCode() : 0);
        result = 31 * result + (isoNumericCode != null ? isoNumericCode.hashCode() : 0);
        result = 31 * result + (countryType != null ? countryType.hashCode() : 0);
        result = 31 * result + (latestRecordedPopulation != null ? latestRecordedPopulation.hashCode() : 0);
        result = 31 * result + (continent != null ? continent.hashCode() : 0);
        result = 31 * result + (region != null ? region.hashCode() : 0);
        result = 31 * result + (subregion != null ? subregion.hashCode() : 0);
        result = 31 * result + (border != null ? border.hashCode() : 0);
        result = 31 * result + lastEditedBy;
        result = 31 * result + (validFrom != null ? validFrom.hashCode() : 0);
        result = 31 * result + (validTo != null ? validTo.hashCode() : 0);
        return result;
    }
}
