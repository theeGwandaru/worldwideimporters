package com.worldwideimporters.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

@Entity
public class StockItemTransaction {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "StockItemTransactionID")
    private int stockItemTransactionId;
    @Basic
    @Column(name = "StockItemID")
    private int stockItemId;
    @Basic
    @Column(name = "TransactionTypeID")
    private int transactionTypeId;
    @Basic
    @Column(name = "CustomerID")
    private Integer customerId;
    @Basic
    @Column(name = "InvoiceID")
    private Integer invoiceId;
    @Basic
    @Column(name = "SupplierID")
    private Integer supplierId;
    @Basic
    @Column(name = "PurchaseOrderID")
    private Integer purchaseOrderId;
    @Basic
    @Column(name = "TransactionOccurredWhen")
    private Date transactionOccurredWhen;
    @Basic
    @Column(name = "Quantity")
    private BigDecimal quantity;
    @Basic
    @Column(name = "LastEditedBy")
    private int lastEditedBy;
    @Basic
    @Column(name = "LastEditedWhen")
    private Date lastEditedWhen;

    public int getStockItemTransactionId() {
        return stockItemTransactionId;
    }

    public void setStockItemTransactionId(int stockItemTransactionId) {
        this.stockItemTransactionId = stockItemTransactionId;
    }

    public int getStockItemId() {
        return stockItemId;
    }

    public void setStockItemId(int stockItemId) {
        this.stockItemId = stockItemId;
    }

    public int getTransactionTypeId() {
        return transactionTypeId;
    }

    public void setTransactionTypeId(int transactionTypeId) {
        this.transactionTypeId = transactionTypeId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Integer invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public Integer getPurchaseOrderId() {
        return purchaseOrderId;
    }

    public void setPurchaseOrderId(Integer purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
    }

    public Date getTransactionOccurredWhen() {
        return transactionOccurredWhen;
    }

    public void setTransactionOccurredWhen(Date transactionOccurredWhen) {
        this.transactionOccurredWhen = transactionOccurredWhen;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
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

        StockItemTransaction that = (StockItemTransaction) o;

        if (stockItemTransactionId != that.stockItemTransactionId) return false;
        if (stockItemId != that.stockItemId) return false;
        if (transactionTypeId != that.transactionTypeId) return false;
        if (lastEditedBy != that.lastEditedBy) return false;
        if (customerId != null ? !customerId.equals(that.customerId) : that.customerId != null) return false;
        if (invoiceId != null ? !invoiceId.equals(that.invoiceId) : that.invoiceId != null) return false;
        if (supplierId != null ? !supplierId.equals(that.supplierId) : that.supplierId != null) return false;
        if (purchaseOrderId != null ? !purchaseOrderId.equals(that.purchaseOrderId) : that.purchaseOrderId != null)
            return false;
        if (transactionOccurredWhen != null ? !transactionOccurredWhen.equals(that.transactionOccurredWhen) : that.transactionOccurredWhen != null)
            return false;
        if (quantity != null ? !quantity.equals(that.quantity) : that.quantity != null) return false;
        if (lastEditedWhen != null ? !lastEditedWhen.equals(that.lastEditedWhen) : that.lastEditedWhen != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = stockItemTransactionId;
        result = 31 * result + stockItemId;
        result = 31 * result + transactionTypeId;
        result = 31 * result + (customerId != null ? customerId.hashCode() : 0);
        result = 31 * result + (invoiceId != null ? invoiceId.hashCode() : 0);
        result = 31 * result + (supplierId != null ? supplierId.hashCode() : 0);
        result = 31 * result + (purchaseOrderId != null ? purchaseOrderId.hashCode() : 0);
        result = 31 * result + (transactionOccurredWhen != null ? transactionOccurredWhen.hashCode() : 0);
        result = 31 * result + (quantity != null ? quantity.hashCode() : 0);
        result = 31 * result + lastEditedBy;
        result = 31 * result + (lastEditedWhen != null ? lastEditedWhen.hashCode() : 0);
        return result;
    }
}
