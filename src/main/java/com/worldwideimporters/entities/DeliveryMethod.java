package com.worldwideimporters.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class DeliveryMethod {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "DeliveryMethodID")
    private int deliveryMethodId;
    @Basic
    @Column(name = "DeliveryMethodName")
    private String deliveryMethodName;
    @Basic
    @Column(name = "LastEditedBy")
    private int lastEditedBy;
    @Basic
    @Column(name = "ValidFrom")
    private Date validFrom;
    @Basic
    @Column(name = "ValidTo")
    private Date validTo;

    public int getDeliveryMethodId() {
        return deliveryMethodId;
    }

    public void setDeliveryMethodId(int deliveryMethodId) {
        this.deliveryMethodId = deliveryMethodId;
    }

    public String getDeliveryMethodName() {
        return deliveryMethodName;
    }

    public void setDeliveryMethodName(String deliveryMethodName) {
        this.deliveryMethodName = deliveryMethodName;
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

        DeliveryMethod that = (DeliveryMethod) o;

        if (deliveryMethodId != that.deliveryMethodId) return false;
        if (lastEditedBy != that.lastEditedBy) return false;
        if (deliveryMethodName != null ? !deliveryMethodName.equals(that.deliveryMethodName) : that.deliveryMethodName != null)
            return false;
        if (validFrom != null ? !validFrom.equals(that.validFrom) : that.validFrom != null) return false;
        if (validTo != null ? !validTo.equals(that.validTo) : that.validTo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = deliveryMethodId;
        result = 31 * result + (deliveryMethodName != null ? deliveryMethodName.hashCode() : 0);
        result = 31 * result + lastEditedBy;
        result = 31 * result + (validFrom != null ? validFrom.hashCode() : 0);
        result = 31 * result + (validTo != null ? validTo.hashCode() : 0);
        return result;
    }
}
