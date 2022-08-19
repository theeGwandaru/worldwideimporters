package com.worldwideimporters.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class StockItemStockGroup {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "StockItemStockGroupID")
    private int stockItemStockGroupId;
    @Basic
    @Column(name = "StockItemID")
    private int stockItemId;
    @Basic
    @Column(name = "StockGroupID")
    private int stockGroupId;
    @Basic
    @Column(name = "LastEditedBy")
    private int lastEditedBy;
    @Basic
    @Column(name = "LastEditedWhen")
    private Date lastEditedWhen;

    public int getStockItemStockGroupId() {
        return stockItemStockGroupId;
    }

    public void setStockItemStockGroupId(int stockItemStockGroupId) {
        this.stockItemStockGroupId = stockItemStockGroupId;
    }

    public int getStockItemId() {
        return stockItemId;
    }

    public void setStockItemId(int stockItemId) {
        this.stockItemId = stockItemId;
    }

    public int getStockGroupId() {
        return stockGroupId;
    }

    public void setStockGroupId(int stockGroupId) {
        this.stockGroupId = stockGroupId;
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

        StockItemStockGroup that = (StockItemStockGroup) o;

        if (stockItemStockGroupId != that.stockItemStockGroupId) return false;
        if (stockItemId != that.stockItemId) return false;
        if (stockGroupId != that.stockGroupId) return false;
        if (lastEditedBy != that.lastEditedBy) return false;
        if (lastEditedWhen != null ? !lastEditedWhen.equals(that.lastEditedWhen) : that.lastEditedWhen != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = stockItemStockGroupId;
        result = 31 * result + stockItemId;
        result = 31 * result + stockGroupId;
        result = 31 * result + lastEditedBy;
        result = 31 * result + (lastEditedWhen != null ? lastEditedWhen.hashCode() : 0);
        return result;
    }
}
