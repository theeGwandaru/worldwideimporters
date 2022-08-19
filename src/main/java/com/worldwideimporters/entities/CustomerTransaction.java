package com.worldwideimporters.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

@Entity
public class CustomerTransaction {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CustomerTransactionID")
    private int customerTransactionId;
    @Basic
    @Column(name = "CustomerID")
    private int customerId;
    @Basic
    @Column(name = "TransactionTypeID")
    private int transactionTypeId;
    @Basic
    @Column(name = "InvoiceID")
    private Integer invoiceId;
    @Basic
    @Column(name = "PaymentMethodID")
    private Integer paymentMethodId;
    @Basic
    @Column(name = "TransactionDate")
    private Date transactionDate;
    @Basic
    @Column(name = "AmountExcludingTax")
    private BigDecimal amountExcludingTax;
    @Basic
    @Column(name = "TaxAmount")
    private BigDecimal taxAmount;
    @Basic
    @Column(name = "TransactionAmount")
    private BigDecimal transactionAmount;
    @Basic
    @Column(name = "OutstandingBalance")
    private BigDecimal outstandingBalance;
    @Basic
    @Column(name = "FinalizationDate")
    private Date finalizationDate;
    @Basic
    @Column(name = "IsFinalized")
    private Boolean isFinalized;
    @Basic
    @Column(name = "LastEditedBy")
    private int lastEditedBy;
    @Basic
    @Column(name = "LastEditedWhen")
    private Date lastEditedWhen;

    public int getCustomerTransactionId() {
        return customerTransactionId;
    }

    public void setCustomerTransactionId(int customerTransactionId) {
        this.customerTransactionId = customerTransactionId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getTransactionTypeId() {
        return transactionTypeId;
    }

    public void setTransactionTypeId(int transactionTypeId) {
        this.transactionTypeId = transactionTypeId;
    }

    public Integer getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Integer invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Integer getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(Integer paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public BigDecimal getAmountExcludingTax() {
        return amountExcludingTax;
    }

    public void setAmountExcludingTax(BigDecimal amountExcludingTax) {
        this.amountExcludingTax = amountExcludingTax;
    }

    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
    }

    public BigDecimal getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(BigDecimal transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public BigDecimal getOutstandingBalance() {
        return outstandingBalance;
    }

    public void setOutstandingBalance(BigDecimal outstandingBalance) {
        this.outstandingBalance = outstandingBalance;
    }

    public Date getFinalizationDate() {
        return finalizationDate;
    }

    public void setFinalizationDate(Date finalizationDate) {
        this.finalizationDate = finalizationDate;
    }

    public Boolean getFinalized() {
        return isFinalized;
    }

    public void setFinalized(Boolean finalized) {
        isFinalized = finalized;
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

        CustomerTransaction that = (CustomerTransaction) o;

        if (customerTransactionId != that.customerTransactionId) return false;
        if (customerId != that.customerId) return false;
        if (transactionTypeId != that.transactionTypeId) return false;
        if (lastEditedBy != that.lastEditedBy) return false;
        if (invoiceId != null ? !invoiceId.equals(that.invoiceId) : that.invoiceId != null) return false;
        if (paymentMethodId != null ? !paymentMethodId.equals(that.paymentMethodId) : that.paymentMethodId != null)
            return false;
        if (transactionDate != null ? !transactionDate.equals(that.transactionDate) : that.transactionDate != null)
            return false;
        if (amountExcludingTax != null ? !amountExcludingTax.equals(that.amountExcludingTax) : that.amountExcludingTax != null)
            return false;
        if (taxAmount != null ? !taxAmount.equals(that.taxAmount) : that.taxAmount != null) return false;
        if (transactionAmount != null ? !transactionAmount.equals(that.transactionAmount) : that.transactionAmount != null)
            return false;
        if (outstandingBalance != null ? !outstandingBalance.equals(that.outstandingBalance) : that.outstandingBalance != null)
            return false;
        if (finalizationDate != null ? !finalizationDate.equals(that.finalizationDate) : that.finalizationDate != null)
            return false;
        if (isFinalized != null ? !isFinalized.equals(that.isFinalized) : that.isFinalized != null) return false;
        if (lastEditedWhen != null ? !lastEditedWhen.equals(that.lastEditedWhen) : that.lastEditedWhen != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = customerTransactionId;
        result = 31 * result + customerId;
        result = 31 * result + transactionTypeId;
        result = 31 * result + (invoiceId != null ? invoiceId.hashCode() : 0);
        result = 31 * result + (paymentMethodId != null ? paymentMethodId.hashCode() : 0);
        result = 31 * result + (transactionDate != null ? transactionDate.hashCode() : 0);
        result = 31 * result + (amountExcludingTax != null ? amountExcludingTax.hashCode() : 0);
        result = 31 * result + (taxAmount != null ? taxAmount.hashCode() : 0);
        result = 31 * result + (transactionAmount != null ? transactionAmount.hashCode() : 0);
        result = 31 * result + (outstandingBalance != null ? outstandingBalance.hashCode() : 0);
        result = 31 * result + (finalizationDate != null ? finalizationDate.hashCode() : 0);
        result = 31 * result + (isFinalized != null ? isFinalized.hashCode() : 0);
        result = 31 * result + lastEditedBy;
        result = 31 * result + (lastEditedWhen != null ? lastEditedWhen.hashCode() : 0);
        return result;
    }
}
