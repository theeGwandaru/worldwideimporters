package com.worldwideimporters.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class StockGroup {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "StockGroupID")
    private int stockGroupId;
    @Basic
    @Column(name = "StockGroupName")
    private String stockGroupName;
    @Basic
    @Column(name = "LastEditedBy")
    private int lastEditedBy;
    @Basic
    @Column(name = "ValidFrom")
    private Date validFrom;
    @Basic
    @Column(name = "ValidTo")
    private Date validTo;

    public int getStockGroupId() {
        return stockGroupId;
    }

    public void setStockGroupId(int stockGroupId) {
        this.stockGroupId = stockGroupId;
    }

    public String getStockGroupName() {
        return stockGroupName;
    }

    public void setStockGroupName(String stockGroupName) {
        this.stockGroupName = stockGroupName;
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

        StockGroup that = (StockGroup) o;

        if (stockGroupId != that.stockGroupId) return false;
        if (lastEditedBy != that.lastEditedBy) return false;
        if (stockGroupName != null ? !stockGroupName.equals(that.stockGroupName) : that.stockGroupName != null)
            return false;
        if (validFrom != null ? !validFrom.equals(that.validFrom) : that.validFrom != null) return false;
        if (validTo != null ? !validTo.equals(that.validTo) : that.validTo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = stockGroupId;
        result = 31 * result + (stockGroupName != null ? stockGroupName.hashCode() : 0);
        result = 31 * result + lastEditedBy;
        result = 31 * result + (validFrom != null ? validFrom.hashCode() : 0);
        result = 31 * result + (validTo != null ? validTo.hashCode() : 0);
        return result;
    }
}
