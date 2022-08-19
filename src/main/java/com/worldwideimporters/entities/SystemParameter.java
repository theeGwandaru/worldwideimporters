package com.worldwideimporters.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class SystemParameter {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "SystemParameterID")
    private int systemParameterId;
    @Basic
    @Column(name = "DeliveryAddressLine1")
    private String deliveryAddressLine1;
    @Basic
    @Column(name = "DeliveryAddressLine2")
    private String deliveryAddressLine2;
    @Basic
    @Column(name = "DeliveryCityID")
    private int deliveryCityId;
    @Basic
    @Column(name = "DeliveryPostalCode")
    private String deliveryPostalCode;
    @Basic
    @Column(name = "DeliveryLocation")
    private Object deliveryLocation;
    @Basic
    @Column(name = "PostalAddressLine1")
    private String postalAddressLine1;
    @Basic
    @Column(name = "PostalAddressLine2")
    private String postalAddressLine2;
    @Basic
    @Column(name = "PostalCityID")
    private int postalCityId;
    @Basic
    @Column(name = "PostalPostalCode")
    private String postalPostalCode;
    @Basic
    @Column(name = "ApplicationSettings")
    private String applicationSettings;
    @Basic
    @Column(name = "LastEditedBy")
    private int lastEditedBy;
    @Basic
    @Column(name = "LastEditedWhen")
    private Date lastEditedWhen;

    public int getSystemParameterId() {
        return systemParameterId;
    }

    public void setSystemParameterId(int systemParameterId) {
        this.systemParameterId = systemParameterId;
    }

    public String getDeliveryAddressLine1() {
        return deliveryAddressLine1;
    }

    public void setDeliveryAddressLine1(String deliveryAddressLine1) {
        this.deliveryAddressLine1 = deliveryAddressLine1;
    }

    public String getDeliveryAddressLine2() {
        return deliveryAddressLine2;
    }

    public void setDeliveryAddressLine2(String deliveryAddressLine2) {
        this.deliveryAddressLine2 = deliveryAddressLine2;
    }

    public int getDeliveryCityId() {
        return deliveryCityId;
    }

    public void setDeliveryCityId(int deliveryCityId) {
        this.deliveryCityId = deliveryCityId;
    }

    public String getDeliveryPostalCode() {
        return deliveryPostalCode;
    }

    public void setDeliveryPostalCode(String deliveryPostalCode) {
        this.deliveryPostalCode = deliveryPostalCode;
    }

    public Object getDeliveryLocation() {
        return deliveryLocation;
    }

    public void setDeliveryLocation(Object deliveryLocation) {
        this.deliveryLocation = deliveryLocation;
    }

    public String getPostalAddressLine1() {
        return postalAddressLine1;
    }

    public void setPostalAddressLine1(String postalAddressLine1) {
        this.postalAddressLine1 = postalAddressLine1;
    }

    public String getPostalAddressLine2() {
        return postalAddressLine2;
    }

    public void setPostalAddressLine2(String postalAddressLine2) {
        this.postalAddressLine2 = postalAddressLine2;
    }

    public int getPostalCityId() {
        return postalCityId;
    }

    public void setPostalCityId(int postalCityId) {
        this.postalCityId = postalCityId;
    }

    public String getPostalPostalCode() {
        return postalPostalCode;
    }

    public void setPostalPostalCode(String postalPostalCode) {
        this.postalPostalCode = postalPostalCode;
    }

    public String getApplicationSettings() {
        return applicationSettings;
    }

    public void setApplicationSettings(String applicationSettings) {
        this.applicationSettings = applicationSettings;
    }

    public int getLastEditedBy() {
        return lastEditedBy;
    }

    public void setLastEditedBy(int lastEditedBy) {
        this.lastEditedBy = lastEditedBy;
    }

    public Date getLastEditedWhen() {
        return lastEditedWhen;
    }

    public void setLastEditedWhen(Date lastEditedWhen) {
        this.lastEditedWhen = lastEditedWhen;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SystemParameter that = (SystemParameter) o;

        if (systemParameterId != that.systemParameterId) return false;
        if (deliveryCityId != that.deliveryCityId) return false;
        if (postalCityId != that.postalCityId) return false;
        if (lastEditedBy != that.lastEditedBy) return false;
        if (deliveryAddressLine1 != null ? !deliveryAddressLine1.equals(that.deliveryAddressLine1) : that.deliveryAddressLine1 != null)
            return false;
        if (deliveryAddressLine2 != null ? !deliveryAddressLine2.equals(that.deliveryAddressLine2) : that.deliveryAddressLine2 != null)
            return false;
        if (deliveryPostalCode != null ? !deliveryPostalCode.equals(that.deliveryPostalCode) : that.deliveryPostalCode != null)
            return false;
        if (deliveryLocation != null ? !deliveryLocation.equals(that.deliveryLocation) : that.deliveryLocation != null)
            return false;
        if (postalAddressLine1 != null ? !postalAddressLine1.equals(that.postalAddressLine1) : that.postalAddressLine1 != null)
            return false;
        if (postalAddressLine2 != null ? !postalAddressLine2.equals(that.postalAddressLine2) : that.postalAddressLine2 != null)
            return false;
        if (postalPostalCode != null ? !postalPostalCode.equals(that.postalPostalCode) : that.postalPostalCode != null)
            return false;
        if (applicationSettings != null ? !applicationSettings.equals(that.applicationSettings) : that.applicationSettings != null)
            return false;
        if (lastEditedWhen != null ? !lastEditedWhen.equals(that.lastEditedWhen) : that.lastEditedWhen != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = systemParameterId;
        result = 31 * result + (deliveryAddressLine1 != null ? deliveryAddressLine1.hashCode() : 0);
        result = 31 * result + (deliveryAddressLine2 != null ? deliveryAddressLine2.hashCode() : 0);
        result = 31 * result + deliveryCityId;
        result = 31 * result + (deliveryPostalCode != null ? deliveryPostalCode.hashCode() : 0);
        result = 31 * result + (deliveryLocation != null ? deliveryLocation.hashCode() : 0);
        result = 31 * result + (postalAddressLine1 != null ? postalAddressLine1.hashCode() : 0);
        result = 31 * result + (postalAddressLine2 != null ? postalAddressLine2.hashCode() : 0);
        result = 31 * result + postalCityId;
        result = 31 * result + (postalPostalCode != null ? postalPostalCode.hashCode() : 0);
        result = 31 * result + (applicationSettings != null ? applicationSettings.hashCode() : 0);
        result = 31 * result + lastEditedBy;
        result = 31 * result + (lastEditedWhen != null ? lastEditedWhen.hashCode() : 0);
        return result;
    }
}
