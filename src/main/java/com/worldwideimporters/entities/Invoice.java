package com.worldwideimporters.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Invoice {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "InvoiceID")
    private int invoiceId;
    @Basic
    @Column(name = "CustomerID")
    private int customerId;
    @Basic
    @Column(name = "BillToCustomerID")
    private int billToCustomerId;
    @Basic
    @Column(name = "OrderID")
    private Integer orderId;
    @Basic
    @Column(name = "DeliveryMethodID")
    private int deliveryMethodId;
    @Basic
    @Column(name = "ContactPersonID")
    private int contactPersonId;
    @Basic
    @Column(name = "AccountsPersonID")
    private int accountsPersonId;
    @Basic
    @Column(name = "SalespersonPersonID")
    private int salespersonPersonId;
    @Basic
    @Column(name = "PackedByPersonID")
    private int packedByPersonId;
    @Basic
    @Column(name = "InvoiceDate")
    private Date invoiceDate;
    @Basic
    @Column(name = "CustomerPurchaseOrderNumber")
    private String customerPurchaseOrderNumber;
    @Basic
    @Column(name = "IsCreditNote")
    private boolean isCreditNote;
    @Basic
    @Column(name = "CreditNoteReason")
    private String creditNoteReason;
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
    @Column(name = "TotalDryItems")
    private int totalDryItems;
    @Basic
    @Column(name = "TotalChillerItems")
    private int totalChillerItems;
    @Basic
    @Column(name = "DeliveryRun")
    private String deliveryRun;
    @Basic
    @Column(name = "RunPosition")
    private String runPosition;
    @Basic
    @Column(name = "ReturnedDeliveryData")
    private String returnedDeliveryData;
    @Basic
    @Column(name = "ConfirmedDeliveryTime")
    private Date confirmedDeliveryTime;
    @Basic
    @Column(name = "ConfirmedReceivedBy")
    private String confirmedReceivedBy;
    @Basic
    @Column(name = "LastEditedBy")
    private int lastEditedBy;
    @Basic
    @Column(name = "LastEditedWhen")
    private Date lastEditedWhen;

    public int getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getBillToCustomerId() {
        return billToCustomerId;
    }

    public void setBillToCustomerId(int billToCustomerId) {
        this.billToCustomerId = billToCustomerId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
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

    public int getAccountsPersonId() {
        return accountsPersonId;
    }

    public void setAccountsPersonId(int accountsPersonId) {
        this.accountsPersonId = accountsPersonId;
    }

    public int getSalespersonPersonId() {
        return salespersonPersonId;
    }

    public void setSalespersonPersonId(int salespersonPersonId) {
        this.salespersonPersonId = salespersonPersonId;
    }

    public int getPackedByPersonId() {
        return packedByPersonId;
    }

    public void setPackedByPersonId(int packedByPersonId) {
        this.packedByPersonId = packedByPersonId;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getCustomerPurchaseOrderNumber() {
        return customerPurchaseOrderNumber;
    }

    public void setCustomerPurchaseOrderNumber(String customerPurchaseOrderNumber) {
        this.customerPurchaseOrderNumber = customerPurchaseOrderNumber;
    }

    public boolean isCreditNote() {
        return isCreditNote;
    }

    public void setCreditNote(boolean creditNote) {
        isCreditNote = creditNote;
    }

    public String getCreditNoteReason() {
        return creditNoteReason;
    }

    public void setCreditNoteReason(String creditNoteReason) {
        this.creditNoteReason = creditNoteReason;
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

    public int getTotalDryItems() {
        return totalDryItems;
    }

    public void setTotalDryItems(int totalDryItems) {
        this.totalDryItems = totalDryItems;
    }

    public int getTotalChillerItems() {
        return totalChillerItems;
    }

    public void setTotalChillerItems(int totalChillerItems) {
        this.totalChillerItems = totalChillerItems;
    }

    public String getDeliveryRun() {
        return deliveryRun;
    }

    public void setDeliveryRun(String deliveryRun) {
        this.deliveryRun = deliveryRun;
    }

    public String getRunPosition() {
        return runPosition;
    }

    public void setRunPosition(String runPosition) {
        this.runPosition = runPosition;
    }

    public String getReturnedDeliveryData() {
        return returnedDeliveryData;
    }

    public void setReturnedDeliveryData(String returnedDeliveryData) {
        this.returnedDeliveryData = returnedDeliveryData;
    }

    public Date getConfirmedDeliveryTime() {
        return confirmedDeliveryTime;
    }

    public void setConfirmedDeliveryTime(Date confirmedDeliveryTime) {
        this.confirmedDeliveryTime = confirmedDeliveryTime;
    }

    public String getConfirmedReceivedBy() {
        return confirmedReceivedBy;
    }

    public void setConfirmedReceivedBy(String confirmedReceivedBy) {
        this.confirmedReceivedBy = confirmedReceivedBy;
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

        Invoice invoices = (Invoice) o;

        if (invoiceId != invoices.invoiceId) return false;
        if (customerId != invoices.customerId) return false;
        if (billToCustomerId != invoices.billToCustomerId) return false;
        if (deliveryMethodId != invoices.deliveryMethodId) return false;
        if (contactPersonId != invoices.contactPersonId) return false;
        if (accountsPersonId != invoices.accountsPersonId) return false;
        if (salespersonPersonId != invoices.salespersonPersonId) return false;
        if (packedByPersonId != invoices.packedByPersonId) return false;
        if (isCreditNote != invoices.isCreditNote) return false;
        if (totalDryItems != invoices.totalDryItems) return false;
        if (totalChillerItems != invoices.totalChillerItems) return false;
        if (lastEditedBy != invoices.lastEditedBy) return false;
        if (orderId != null ? !orderId.equals(invoices.orderId) : invoices.orderId != null) return false;
        if (invoiceDate != null ? !invoiceDate.equals(invoices.invoiceDate) : invoices.invoiceDate != null)
            return false;
        if (customerPurchaseOrderNumber != null ? !customerPurchaseOrderNumber.equals(invoices.customerPurchaseOrderNumber) : invoices.customerPurchaseOrderNumber != null)
            return false;
        if (creditNoteReason != null ? !creditNoteReason.equals(invoices.creditNoteReason) : invoices.creditNoteReason != null)
            return false;
        if (comments != null ? !comments.equals(invoices.comments) : invoices.comments != null) return false;
        if (deliveryInstructions != null ? !deliveryInstructions.equals(invoices.deliveryInstructions) : invoices.deliveryInstructions != null)
            return false;
        if (internalComments != null ? !internalComments.equals(invoices.internalComments) : invoices.internalComments != null)
            return false;
        if (deliveryRun != null ? !deliveryRun.equals(invoices.deliveryRun) : invoices.deliveryRun != null)
            return false;
        if (runPosition != null ? !runPosition.equals(invoices.runPosition) : invoices.runPosition != null)
            return false;
        if (returnedDeliveryData != null ? !returnedDeliveryData.equals(invoices.returnedDeliveryData) : invoices.returnedDeliveryData != null)
            return false;
        if (confirmedDeliveryTime != null ? !confirmedDeliveryTime.equals(invoices.confirmedDeliveryTime) : invoices.confirmedDeliveryTime != null)
            return false;
        if (confirmedReceivedBy != null ? !confirmedReceivedBy.equals(invoices.confirmedReceivedBy) : invoices.confirmedReceivedBy != null)
            return false;
        if (lastEditedWhen != null ? !lastEditedWhen.equals(invoices.lastEditedWhen) : invoices.lastEditedWhen != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = invoiceId;
        result = 31 * result + customerId;
        result = 31 * result + billToCustomerId;
        result = 31 * result + (orderId != null ? orderId.hashCode() : 0);
        result = 31 * result + deliveryMethodId;
        result = 31 * result + contactPersonId;
        result = 31 * result + accountsPersonId;
        result = 31 * result + salespersonPersonId;
        result = 31 * result + packedByPersonId;
        result = 31 * result + (invoiceDate != null ? invoiceDate.hashCode() : 0);
        result = 31 * result + (customerPurchaseOrderNumber != null ? customerPurchaseOrderNumber.hashCode() : 0);
        result = 31 * result + (isCreditNote ? 1 : 0);
        result = 31 * result + (creditNoteReason != null ? creditNoteReason.hashCode() : 0);
        result = 31 * result + (comments != null ? comments.hashCode() : 0);
        result = 31 * result + (deliveryInstructions != null ? deliveryInstructions.hashCode() : 0);
        result = 31 * result + (internalComments != null ? internalComments.hashCode() : 0);
        result = 31 * result + totalDryItems;
        result = 31 * result + totalChillerItems;
        result = 31 * result + (deliveryRun != null ? deliveryRun.hashCode() : 0);
        result = 31 * result + (runPosition != null ? runPosition.hashCode() : 0);
        result = 31 * result + (returnedDeliveryData != null ? returnedDeliveryData.hashCode() : 0);
        result = 31 * result + (confirmedDeliveryTime != null ? confirmedDeliveryTime.hashCode() : 0);
        result = 31 * result + (confirmedReceivedBy != null ? confirmedReceivedBy.hashCode() : 0);
        result = 31 * result + lastEditedBy;
        result = 31 * result + (lastEditedWhen != null ? lastEditedWhen.hashCode() : 0);
        return result;
    }
}
