package com.worldwideimporters.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Order {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "OrderID")
    private int orderId;
    @Basic
    @Column(name = "CustomerID")
    private int customerId;
    @Basic
    @Column(name = "SalespersonPersonID")
    private int salespersonPersonId;
    @Basic
    @Column(name = "PickedByPersonID")
    private Integer pickedByPersonId;
    @Basic
    @Column(name = "ContactPersonID")
    private int contactPersonId;
    @Basic
    @Column(name = "BackorderOrderID")
    private Integer backorderOrderId;
    @Basic
    @Column(name = "OrderDate")
    private Date orderDate;
    @Basic
    @Column(name = "ExpectedDeliveryDate")
    private Date expectedDeliveryDate;
    @Basic
    @Column(name = "CustomerPurchaseOrderNumber")
    private String customerPurchaseOrderNumber;
    @Basic
    @Column(name = "IsUndersupplyBackordered")
    private boolean isUndersupplyBackordered;
    @Basic
    @Column(name = "Comments")
    private String comments;
    @Basic
    @Column(name = "DeliveryInstructions")
    private String deliveryInstructions;
    @Basic
    @Column(name = "InternalComments")
    private String internalComments;
    @Basic
    @Column(name = "PickingCompletedWhen")
    private Date pickingCompletedWhen;
    @Basic
    @Column(name = "LastEditedBy")
    private int lastEditedBy;
    @Basic
    @Column(name = "LastEditedWhen")
    private Date lastEditedWhen;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getSalespersonPersonId() {
        return salespersonPersonId;
    }

    public void setSalespersonPersonId(int salespersonPersonId) {
        this.salespersonPersonId = salespersonPersonId;
    }

    public Integer getPickedByPersonId() {
        return pickedByPersonId;
    }

    public void setPickedByPersonId(Integer pickedByPersonId) {
        this.pickedByPersonId = pickedByPersonId;
    }

    public int getContactPersonId() {
        return contactPersonId;
    }

    public void setContactPersonId(int contactPersonId) {
        this.contactPersonId = contactPersonId;
    }

    public Integer getBackorderOrderId() {
        return backorderOrderId;
    }

    public void setBackorderOrderId(Integer backorderOrderId) {
        this.backorderOrderId = backorderOrderId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getExpectedDeliveryDate() {
        return expectedDeliveryDate;
    }

    public void setExpectedDeliveryDate(Date expectedDeliveryDate) {
        this.expectedDeliveryDate = expectedDeliveryDate;
    }

    public String getCustomerPurchaseOrderNumber() {
        return customerPurchaseOrderNumber;
    }

    public void setCustomerPurchaseOrderNumber(String customerPurchaseOrderNumber) {
        this.customerPurchaseOrderNumber = customerPurchaseOrderNumber;
    }

    public boolean isUndersupplyBackordered() {
        return isUndersupplyBackordered;
    }

    public void setUndersupplyBackordered(boolean undersupplyBackordered) {
        isUndersupplyBackordered = undersupplyBackordered;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getDeliveryInstructions() {
        return deliveryInstructions;
    }

    public void setDeliveryInstructions(String deliveryInstructions) {
        this.deliveryInstructions = deliveryInstructions;
    }

    public String getInternalComments() {
        return internalComments;
    }

    public void setInternalComments(String internalComments) {
        this.internalComments = internalComments;
    }

    public Date getPickingCompletedWhen() {
        return pickingCompletedWhen;
    }

    public void setPickingCompletedWhen(Date pickingCompletedWhen) {
        this.pickingCompletedWhen = pickingCompletedWhen;
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

        Order orders = (Order) o;

        if (orderId != orders.orderId) return false;
        if (customerId != orders.customerId) return false;
        if (salespersonPersonId != orders.salespersonPersonId) return false;
        if (contactPersonId != orders.contactPersonId) return false;
        if (isUndersupplyBackordered != orders.isUndersupplyBackordered) return false;
        if (lastEditedBy != orders.lastEditedBy) return false;
        if (pickedByPersonId != null ? !pickedByPersonId.equals(orders.pickedByPersonId) : orders.pickedByPersonId != null)
            return false;
        if (backorderOrderId != null ? !backorderOrderId.equals(orders.backorderOrderId) : orders.backorderOrderId != null)
            return false;
        if (orderDate != null ? !orderDate.equals(orders.orderDate) : orders.orderDate != null) return false;
        if (expectedDeliveryDate != null ? !expectedDeliveryDate.equals(orders.expectedDeliveryDate) : orders.expectedDeliveryDate != null)
            return false;
        if (customerPurchaseOrderNumber != null ? !customerPurchaseOrderNumber.equals(orders.customerPurchaseOrderNumber) : orders.customerPurchaseOrderNumber != null)
            return false;
        if (comments != null ? !comments.equals(orders.comments) : orders.comments != null) return false;
        if (deliveryInstructions != null ? !deliveryInstructions.equals(orders.deliveryInstructions) : orders.deliveryInstructions != null)
            return false;
        if (internalComments != null ? !internalComments.equals(orders.internalComments) : orders.internalComments != null)
            return false;
        if (pickingCompletedWhen != null ? !pickingCompletedWhen.equals(orders.pickingCompletedWhen) : orders.pickingCompletedWhen != null)
            return false;
        if (lastEditedWhen != null ? !lastEditedWhen.equals(orders.lastEditedWhen) : orders.lastEditedWhen != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = orderId;
        result = 31 * result + customerId;
        result = 31 * result + salespersonPersonId;
        result = 31 * result + (pickedByPersonId != null ? pickedByPersonId.hashCode() : 0);
        result = 31 * result + contactPersonId;
        result = 31 * result + (backorderOrderId != null ? backorderOrderId.hashCode() : 0);
        result = 31 * result + (orderDate != null ? orderDate.hashCode() : 0);
        result = 31 * result + (expectedDeliveryDate != null ? expectedDeliveryDate.hashCode() : 0);
        result = 31 * result + (customerPurchaseOrderNumber != null ? customerPurchaseOrderNumber.hashCode() : 0);
        result = 31 * result + (isUndersupplyBackordered ? 1 : 0);
        result = 31 * result + (comments != null ? comments.hashCode() : 0);
        result = 31 * result + (deliveryInstructions != null ? deliveryInstructions.hashCode() : 0);
        result = 31 * result + (internalComments != null ? internalComments.hashCode() : 0);
        result = 31 * result + (pickingCompletedWhen != null ? pickingCompletedWhen.hashCode() : 0);
        result = 31 * result + lastEditedBy;
        result = 31 * result + (lastEditedWhen != null ? lastEditedWhen.hashCode() : 0);
        return result;
    }
}
