package com.worldwideimporters.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

@Entity
public class PurchaseOrderLine {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "PurchaseOrderLineID")
    private int purchaseOrderLineId;
    @Basic
    @Column(name = "PurchaseOrderID")
    private int purchaseOrderId;
    @Basic
    @Column(name = "StockItemID")
    private int stockItemId;
    @Basic
    @Column(name = "OrderedOuters")
    private int orderedOuters;
    @Basic
    @Column(name = "Description")
    private String description;
    @Basic
    @Column(name = "ReceivedOuters")
    private int receivedOuters;
    @Basic
    @Column(name = "PackageTypeID")
    private int packageTypeId;
    @Basic
    @Column(name = "ExpectedUnitPricePerOuter")
    private BigDecimal expectedUnitPricePerOuter;
    @Basic
    @Column(name = "LastReceiptDate")
    private Date lastReceiptDate;
    @Basic
    @Column(name = "IsOrderLineFinalized")
    private boolean isOrderLineFinalized;
    @Basic
    @Column(name = "LastEditedBy")
    private int lastEditedBy;
    @Basic
    @Column(name = "LastEditedWhen")
    private Date lastEditedWhen;

    public int getPurchaseOrderLineId() {
        return purchaseOrderLineId;
    }

    public void setPurchaseOrderLineId(int purchaseOrderLineId) {
        this.purchaseOrderLineId = purchaseOrderLineId;
    }

    public int getPurchaseOrderId() {
        return purchaseOrderId;
    }

    public void setPurchaseOrderId(int purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
    }

    public int getStockItemId() {
        return stockItemId;
    }

    public void setStockItemId(int stockItemId) {
        this.stockItemId = stockItemId;
    }

    public int getOrderedOuters() {
        return orderedOuters;
    }

    public void setOrderedOuters(int orderedOuters) {
        this.orderedOuters = orderedOuters;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getReceivedOuters() {
        return receivedOuters;
    }

    public void setReceivedOuters(int receivedOuters) {
        this.receivedOuters = receivedOuters;
    }

    public int getPackageTypeId() {
        return packageTypeId;
    }

    public void setPackageTypeId(int packageTypeId) {
        this.packageTypeId = packageTypeId;
    }

    public BigDecimal getExpectedUnitPricePerOuter() {
        return expectedUnitPricePerOuter;
    }

    public void setExpectedUnitPricePerOuter(BigDecimal expectedUnitPricePerOuter) {
        this.expectedUnitPricePerOuter = expectedUnitPricePerOuter;
    }

    public Date getLastReceiptDate() {
        return lastReceiptDate;
    }

    public void setLastReceiptDate(Date lastReceiptDate) {
        this.lastReceiptDate = lastReceiptDate;
    }

    public boolean isOrderLineFinalized() {
        return isOrderLineFinalized;
    }

    public void setOrderLineFinalized(boolean orderLineFinalized) {
        isOrderLineFinalized = orderLineFinalized;
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

        PurchaseOrderLine that = (PurchaseOrderLine) o;

        if (purchaseOrderLineId != that.purchaseOrderLineId) return false;
        if (purchaseOrderId != that.purchaseOrderId) return false;
        if (stockItemId != that.stockItemId) return false;
        if (orderedOuters != that.orderedOuters) return false;
        if (receivedOuters != that.receivedOuters) return false;
        if (packageTypeId != that.packageTypeId) return false;
        if (isOrderLineFinalized != that.isOrderLineFinalized) return false;
        if (lastEditedBy != that.lastEditedBy) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (expectedUnitPricePerOuter != null ? !expectedUnitPricePerOuter.equals(that.expectedUnitPricePerOuter) : that.expectedUnitPricePerOuter != null)
            return false;
        if (lastReceiptDate != null ? !lastReceiptDate.equals(that.lastReceiptDate) : that.lastReceiptDate != null)
            return false;
        if (lastEditedWhen != null ? !lastEditedWhen.equals(that.lastEditedWhen) : that.lastEditedWhen != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = purchaseOrderLineId;
        result = 31 * result + purchaseOrderId;
        result = 31 * result + stockItemId;
        result = 31 * result + orderedOuters;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + receivedOuters;
        result = 31 * result + packageTypeId;
        result = 31 * result + (expectedUnitPricePerOuter != null ? expectedUnitPricePerOuter.hashCode() : 0);
        result = 31 * result + (lastReceiptDate != null ? lastReceiptDate.hashCode() : 0);
        result = 31 * result + (isOrderLineFinalized ? 1 : 0);
        result = 31 * result + lastEditedBy;
        result = 31 * result + (lastEditedWhen != null ? lastEditedWhen.hashCode() : 0);
        return result;
    }
}
