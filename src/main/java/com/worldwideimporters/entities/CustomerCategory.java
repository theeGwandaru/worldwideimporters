package com.worldwideimporters.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class CustomerCategory {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CustomerCategoryID")
    private int customerCategoryId;
    @Basic
    @Column(name = "CustomerCategoryName")
    private String customerCategoryName;
    @Basic
    @Column(name = "LastEditedBy")
    private int lastEditedBy;
    @Basic
    @Column(name = "ValidFrom")
    private Date validFrom;
    @Basic
    @Column(name = "ValidTo")
    private Date validTo;

    public int getCustomerCategoryId() {
        return customerCategoryId;
    }

    public void setCustomerCategoryId(int customerCategoryId) {
        this.customerCategoryId = customerCategoryId;
    }

    public String getCustomerCategoryName() {
        return customerCategoryName;
    }

    public void setCustomerCategoryName(String customerCategoryName) {
        this.customerCategoryName = customerCategoryName;
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

        CustomerCategory that = (CustomerCategory) o;

        if (customerCategoryId != that.customerCategoryId) return false;
        if (lastEditedBy != that.lastEditedBy) return false;
        if (customerCategoryName != null ? !customerCategoryName.equals(that.customerCategoryName) : that.customerCategoryName != null)
            return false;
        if (validFrom != null ? !validFrom.equals(that.validFrom) : that.validFrom != null) return false;
        if (validTo != null ? !validTo.equals(that.validTo) : that.validTo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = customerCategoryId;
        result = 31 * result + (customerCategoryName != null ? customerCategoryName.hashCode() : 0);
        result = 31 * result + lastEditedBy;
        result = 31 * result + (validFrom != null ? validFrom.hashCode() : 0);
        result = 31 * result + (validTo != null ? validTo.hashCode() : 0);
        return result;
    }
}
