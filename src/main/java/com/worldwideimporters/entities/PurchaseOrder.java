package com.worldwideimporters.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class PurchaseOrder {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "PurchaseOrderID")
    private int purchaseOrderId;
    @Basic
    @Column(name = "SupplierID")
    private int supplierId;
    @Basic
    @Column(name = "OrderDate")
    private Date orderDate;
    @Basic
    @Column(name = "DeliveryMethodID")
    private int deliveryMethodId;
    @Basic
    @Column(name = "ContactPersonID")
    private int contactPersonId;
    @Basic
    @Column(name = "ExpectedDeliveryDate")
    private Date expectedDeliveryDate;
    @Basic
    @Column(name = "SupplierReference")
    private String supplierReference;
    @Basic
    @Column(name = "IsOrderFinalized")
    private boolean isOrderFinalized;
    @Basic
    @Column(name = "Comments")
    private String comments;
    @Basic
    @Column(name = "InternalComments")
    private String internalComments;
    @Basic
    @Column(name = "LastEditedBy")
    private int lastEditedBy;
    @Basic
    @Column(name = "LastEditedWhen")
    private Date lastEditedWhen;

    public int getPurchaseOrderId() {
        return purchaseOrderId;
    }

    public void setPurchaseOrderId(int purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public int getDeliveryMethodId() {
        return deliveryMethodId;
    }

    public void setDeliveryMethodId(int deliveryMethodId) {
        this.deliveryMethodId = deliveryMethodId;
    }

    public int getContactPersonId() {
        return contactPersonId;
    }

    public void setContactPersonId(int contactPersonId) {
        this.contactPersonId = contactPersonId;
    }

    public Date getExpectedDeliveryDate() {
        return expectedDeliveryDate;
    }

    public void setExpectedDeliveryDate(Date expectedDeliveryDate) {
        this.expectedDeliveryDate = expectedDeliveryDate;
    }

    public String getSupplierReference() {
        return supplierReference;
    }

    public void setSupplierReference(String supplierReference) {
        this.supplierReference = supplierReference;
    }

    public boolean isOrderFinalized() {
        return isOrderFinalized;
    }

    public void setOrderFinalized(boolean orderFinalized) {
        isOrderFinalized = orderFinalized;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getInternalComments() {
        return internalComments;
    }

    public void setInternalComments(String internalComments) {
        this.internalComments = internalComments;
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

        PurchaseOrder that = (PurchaseOrder) o;

        if (purchaseOrderId != that.purchaseOrderId) return false;
        if (supplierId != that.supplierId) return false;
        if (deliveryMethodId != that.deliveryMethodId) return false;
        if (contactPersonId != that.contactPersonId) return false;
        if (isOrderFinalized != that.isOrderFinalized) return false;
        if (lastEditedBy != that.lastEditedBy) return false;
        if (orderDate != null ? !orderDate.equals(that.orderDate) : that.orderDate != null) return false;
        if (expectedDeliveryDate != null ? !expectedDeliveryDate.equals(that.expectedDeliveryDate) : that.expectedDeliveryDate != null)
            return false;
        if (supplierReference != null ? !supplierReference.equals(that.supplierReference) : that.supplierReference != null)
            return false;
        if (comments != null ? !comments.equals(that.comments) : that.comments != null) return false;
        if (internalComments != null ? !internalComments.equals(that.internalComments) : that.internalComments != null)
            return false;
        if (lastEditedWhen != null ? !lastEditedWhen.equals(that.lastEditedWhen) : that.lastEditedWhen != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = purchaseOrderId;
        result = 31 * result + supplierId;
        result = 31 * result + (orderDate != null ? orderDate.hashCode() : 0);
        result = 31 * result + deliveryMethodId;
        result = 31 * result + contactPersonId;
        result = 31 * result + (expectedDeliveryDate != null ? expectedDeliveryDate.hashCode() : 0);
        result = 31 * result + (supplierReference != null ? supplierReference.hashCode() : 0);
        result = 31 * result + (isOrderFinalized ? 1 : 0);
        result = 31 * result + (comments != null ? comments.hashCode() : 0);
        result = 31 * result + (internalComments != null ? internalComments.hashCode() : 0);
        result = 31 * result + lastEditedBy;
        result = 31 * result + (lastEditedWhen != null ? lastEditedWhen.hashCode() : 0);
        return result;
    }
}
