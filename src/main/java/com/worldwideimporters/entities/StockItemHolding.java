package com.worldwideimporters.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

@Entity
public class StockItemHolding {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "StockItemID")
    private int stockItemId;
    @Basic
    @Column(name = "QuantityOnHand")
    private int quantityOnHand;
    @Basic
    @Column(name = "BinLocation")
    private String binLocation;
    @Basic
    @Column(name = "LastStocktakeQuantity")
    private int lastStocktakeQuantity;
    @Basic
    @Column(name = "LastCostPrice")
    private BigDecimal lastCostPrice;
    @Basic
    @Column(name = "ReorderLevel")
    private int reorderLevel;
    @Basic
    @Column(name = "TargetStockLevel")
    private int targetStockLevel;
    @Basic
    @Column(name = "LastEditedBy")
    private int lastEditedBy;
    @Basic
    @Column(name = "LastEditedWhen")
    private Date lastEditedWhen;

    public int getStockItemId() {
        return stockItemId;
    }

    public void setStockItemId(int stockItemId) {
        this.stockItemId = stockItemId;
    }

    public int getQuantityOnHand() {
        return quantityOnHand;
    }

    public void setQuantityOnHand(int quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }

    public String getBinLocation() {
        return binLocation;
    }

    public void setBinLocation(String binLocation) {
        this.binLocation = binLocation;
    }

    public int getLastStocktakeQuantity() {
        return lastStocktakeQuantity;
    }

    public void setLastStocktakeQuantity(int lastStocktakeQuantity) {
        this.lastStocktakeQuantity = lastStocktakeQuantity;
    }

    public BigDecimal getLastCostPrice() {
        return lastCostPrice;
    }

    public void setLastCostPrice(BigDecimal lastCostPrice) {
        this.lastCostPrice = lastCostPrice;
    }

    public int getReorderLevel() {
        return reorderLevel;
    }

    public void setReorderLevel(int reorderLevel) {
        this.reorderLevel = reorderLevel;
    }

    public int getTargetStockLevel() {
        return targetStockLevel;
    }

    public void setTargetStockLevel(int targetStockLevel) {
        this.targetStockLevel = targetStockLevel;
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

        StockItemHolding that = (StockItemHolding) o;

        if (stockItemId != that.stockItemId) return false;
        if (quantityOnHand != that.quantityOnHand) return false;
        if (lastStocktakeQuantity != that.lastStocktakeQuantity) return false;
        if (reorderLevel != that.reorderLevel) return false;
        if (targetStockLevel != that.targetStockLevel) return false;
        if (lastEditedBy != that.lastEditedBy) return false;
        if (binLocation != null ? !binLocation.equals(that.binLocation) : that.binLocation != null) return false;
        if (lastCostPrice != null ? !lastCostPrice.equals(that.lastCostPrice) : that.lastCostPrice != null)
            return false;
        if (lastEditedWhen != null ? !lastEditedWhen.equals(that.lastEditedWhen) : that.lastEditedWhen != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = stockItemId;
        result = 31 * result + quantityOnHand;
        result = 31 * result + (binLocation != null ? binLocation.hashCode() : 0);
        result = 31 * result + lastStocktakeQuantity;
        result = 31 * result + (lastCostPrice != null ? lastCostPrice.hashCode() : 0);
        result = 31 * result + reorderLevel;
        result = 31 * result + targetStockLevel;
        result = 31 * result + lastEditedBy;
        result = 31 * result + (lastEditedWhen != null ? lastEditedWhen.hashCode() : 0);
        return result;
    }
}
