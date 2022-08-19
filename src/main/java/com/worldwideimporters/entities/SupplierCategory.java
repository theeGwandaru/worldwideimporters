package com.worldwideimporters.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class SupplierCategory {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "SupplierCategoryID")
    private int supplierCategoryId;
    @Basic
    @Column(name = "SupplierCategoryName")
    private String supplierCategoryName;
    @Basic
    @Column(name = "LastEditedBy")
    private int lastEditedBy;
    @Basic
    @Column(name = "ValidFrom")
    private Date validFrom;
    @Basic
    @Column(name = "ValidTo")
    private Date validTo;

    public int getSupplierCategoryId() {
        return supplierCategoryId;
    }

    public void setSupplierCategoryId(int supplierCategoryId) {
        this.supplierCategoryId = supplierCategoryId;
    }

    public String getSupplierCategoryName() {
        return supplierCategoryName;
    }

    public void setSupplierCategoryName(String supplierCategoryName) {
        this.supplierCategoryName = supplierCategoryName;
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

        SupplierCategory that = (SupplierCategory) o;

        if (supplierCategoryId != that.supplierCategoryId) return false;
        if (lastEditedBy != that.lastEditedBy) return false;
        if (supplierCategoryName != null ? !supplierCategoryName.equals(that.supplierCategoryName) : that.supplierCategoryName != null)
            return false;
        if (validFrom != null ? !validFrom.equals(that.validFrom) : that.validFrom != null) return false;
        if (validTo != null ? !validTo.equals(that.validTo) : that.validTo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = supplierCategoryId;
        result = 31 * result + (supplierCategoryName != null ? supplierCategoryName.hashCode() : 0);
        result = 31 * result + lastEditedBy;
        result = 31 * result + (validFrom != null ? validFrom.hashCode() : 0);
        result = 31 * result + (validTo != null ? validTo.hashCode() : 0);
        return result;
    }
}
