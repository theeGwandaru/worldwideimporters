package com.worldwideimporters.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

@Entity
public class Customer {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CustomerID")
    private int customerId;
    @Basic
    @Column(name = "CustomerName")
    private String customerName;
    @Basic
    @Column(name = "BillToCustomerID")
    private int billToCustomerId;
    @Basic
    @Column(name = "CustomerCategoryID")
    private int customerCategoryId;
    @Basic
    @Column(name = "BuyingGroupID")
    private Integer buyingGroupId;
    @Basic
    @Column(name = "PrimaryContactPersonID")
    private int primaryContactPersonId;
    @Basic
    @Column(name = "AlternateContactPersonID")
    private Integer alternateContactPersonId;
    @Basic
    @Column(name = "DeliveryMethodID")
    private int deliveryMethodId;
    @Basic
    @Column(name = "DeliveryCityID")
    private int deliveryCityId;
    @Basic
    @Column(name = "PostalCityID")
    private int postalCityId;
    @Basic
    @Column(name = "CreditLimit")
    private BigDecimal creditLimit;
    @Basic
    @Column(name = "AccountOpenedDate")
    private Date accountOpenedDate;
    @Basic
    @Column(name = "StandardDiscountPercentage")
    private BigDecimal standardDiscountPercentage;
    @Basic
    @Column(name = "IsStatementSent")
    private boolean isStatementSent;
    @Basic
    @Column(name = "IsOnCreditHold")
    private boolean isOnCreditHold;
    @Basic
    @Column(name = "PaymentDays")
    private int paymentDays;
    @Basic
    @Column(name = "PhoneNumber")
    private String phoneNumber;
    @Basic
    @Column(name = "FaxNumber")
    private String faxNumber;
    @Basic
    @Column(name = "DeliveryRun")
    private String deliveryRun;
    @Basic
    @Column(name = "RunPosition")
    private String runPosition;
    @Basic
    @Column(name = "WebsiteURL")
    private String websiteUrl;
    @Basic
    @Column(name = "DeliveryAddressLine1")
    private String deliveryAddressLine1;
    @Basic
    @Column(name = "DeliveryAddressLine2")
    private String deliveryAddressLine2;
    @Basic
    @Column(name = "DeliveryPostalCode")
    private String deliveryPostalCode;
    @Basic
    @Column(name = "DeliveryLocation")
    private Object deliveryLocation;
    @Basic
    @Column(name = "PostalAddressLine1")
    private String postalAddressLine1;
    @Basic
    @Column(name = "PostalAddressLine2")
    private String postalAddressLine2;
    @Basic
    @Column(name = "PostalPostalCode")
    private String postalPostalCode;
    @Basic
    @Column(name = "LastEditedBy")
    private int lastEditedBy;
    @Basic
    @Column(name = "ValidFrom")
    private Date validFrom;
    @Basic
    @Column(name = "ValidTo")
    private Date validTo;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getBillToCustomerId() {
        return billToCustomerId;
    }

    public void setBillToCustomerId(int billToCustomerId) {
        this.billToCustomerId = billToCustomerId;
    }

    public int getCustomerCategoryId() {
        return customerCategoryId;
    }

    public void setCustomerCategoryId(int customerCategoryId) {
        this.customerCategoryId = customerCategoryId;
    }

    public Integer getBuyingGroupId() {
        return buyingGroupId;
    }

    public void setBuyingGroupId(Integer buyingGroupId) {
        this.buyingGroupId = buyingGroupId;
    }

    public int getPrimaryContactPersonId() {
        return primaryContactPersonId;
    }

    public void setPrimaryContactPersonId(int primaryContactPersonId) {
        this.primaryContactPersonId = primaryContactPersonId;
    }

    public Integer getAlternateContactPersonId() {
        return alternateContactPersonId;
    }

    public void setAlternateContactPersonId(Integer alternateContactPersonId) {
        this.alternateContactPersonId = alternateContactPersonId;
    }

    public int getDeliveryMethodId() {
        return deliveryMethodId;
    }

    public void setDeliveryMethodId(int deliveryMethodId) {
        this.deliveryMethodId = deliveryMethodId;
    }

    public int getDeliveryCityId() {
        return deliveryCityId;
    }

    public void setDeliveryCityId(int deliveryCityId) {
        this.deliveryCityId = deliveryCityId;
    }

    public int getPostalCityId() {
        return postalCityId;
    }

    public void setPostalCityId(int postalCityId) {
        this.postalCityId = postalCityId;
    }

    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
    }

    public Date getAccountOpenedDate() {
        return accountOpenedDate;
    }

    public void setAccountOpenedDate(Date accountOpenedDate) {
        this.accountOpenedDate = accountOpenedDate;
    }

    public BigDecimal getStandardDiscountPercentage() {
        return standardDiscountPercentage;
    }

    public void setStandardDiscountPercentage(BigDecimal standardDiscountPercentage) {
        this.standardDiscountPercentage = standardDiscountPercentage;
    }

    public boolean isStatementSent() {
        return isStatementSent;
    }

    public void setStatementSent(boolean statementSent) {
        isStatementSent = statementSent;
    }

    public boolean isOnCreditHold() {
        return isOnCreditHold;
    }

    public void setOnCreditHold(boolean onCreditHold) {
        isOnCreditHold = onCreditHold;
    }

    public int getPaymentDays() {
        return paymentDays;
    }

    public void setPaymentDays(int paymentDays) {
        this.paymentDays = paymentDays;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
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

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    public String getDeliveryAddressLine1() {
        return deliveryAddressLine1;
    }

    public void setDeliveryAddressLine1(String deliveryAddressLine1) {
        this.deliveryAddressLine1 = deliveryAddressLine1;
    }

    public String getDeliveryAddressLine2() {
        return deliveryAddressLine2;
    }

    public void setDeliveryAddressLine2(String deliveryAddressLine2) {
        this.deliveryAddressLine2 = deliveryAddressLine2;
    }

    public String getDeliveryPostalCode() {
        return deliveryPostalCode;
    }

    public void setDeliveryPostalCode(String deliveryPostalCode) {
        this.deliveryPostalCode = deliveryPostalCode;
    }

    public Object getDeliveryLocation() {
        return deliveryLocation;
    }

    public void setDeliveryLocation(Object deliveryLocation) {
        this.deliveryLocation = deliveryLocation;
    }

    public String getPostalAddressLine1() {
        return postalAddressLine1;
    }

    public void setPostalAddressLine1(String postalAddressLine1) {
        this.postalAddressLine1 = postalAddressLine1;
    }

    public String getPostalAddressLine2() {
        return postalAddressLine2;
    }

    public void setPostalAddressLine2(String postalAddressLine2) {
        this.postalAddressLine2 = postalAddressLine2;
    }

    public String getPostalPostalCode() {
        return postalPostalCode;
    }

    public void setPostalPostalCode(String postalPostalCode) {
        this.postalPostalCode = postalPostalCode;
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

        Customer customers = (Customer) o;

        if (customerId != customers.customerId) return false;
        if (billToCustomerId != customers.billToCustomerId) return false;
        if (customerCategoryId != customers.customerCategoryId) return false;
        if (primaryContactPersonId != customers.primaryContactPersonId) return false;
        if (deliveryMethodId != customers.deliveryMethodId) return false;
        if (deliveryCityId != customers.deliveryCityId) return false;
        if (postalCityId != customers.postalCityId) return false;
        if (isStatementSent != customers.isStatementSent) return false;
        if (isOnCreditHold != customers.isOnCreditHold) return false;
        if (paymentDays != customers.paymentDays) return false;
        if (lastEditedBy != customers.lastEditedBy) return false;
        if (customerName != null ? !customerName.equals(customers.customerName) : customers.customerName != null)
            return false;
        if (buyingGroupId != null ? !buyingGroupId.equals(customers.buyingGroupId) : customers.buyingGroupId != null)
            return false;
        if (alternateContactPersonId != null ? !alternateContactPersonId.equals(customers.alternateContactPersonId) : customers.alternateContactPersonId != null)
            return false;
        if (creditLimit != null ? !creditLimit.equals(customers.creditLimit) : customers.creditLimit != null)
            return false;
        if (accountOpenedDate != null ? !accountOpenedDate.equals(customers.accountOpenedDate) : customers.accountOpenedDate != null)
            return false;
        if (standardDiscountPercentage != null ? !standardDiscountPercentage.equals(customers.standardDiscountPercentage) : customers.standardDiscountPercentage != null)
            return false;
        if (phoneNumber != null ? !phoneNumber.equals(customers.phoneNumber) : customers.phoneNumber != null)
            return false;
        if (faxNumber != null ? !faxNumber.equals(customers.faxNumber) : customers.faxNumber != null) return false;
        if (deliveryRun != null ? !deliveryRun.equals(customers.deliveryRun) : customers.deliveryRun != null)
            return false;
        if (runPosition != null ? !runPosition.equals(customers.runPosition) : customers.runPosition != null)
            return false;
        if (websiteUrl != null ? !websiteUrl.equals(customers.websiteUrl) : customers.websiteUrl != null) return false;
        if (deliveryAddressLine1 != null ? !deliveryAddressLine1.equals(customers.deliveryAddressLine1) : customers.deliveryAddressLine1 != null)
            return false;
        if (deliveryAddressLine2 != null ? !deliveryAddressLine2.equals(customers.deliveryAddressLine2) : customers.deliveryAddressLine2 != null)
            return false;
        if (deliveryPostalCode != null ? !deliveryPostalCode.equals(customers.deliveryPostalCode) : customers.deliveryPostalCode != null)
            return false;
        if (deliveryLocation != null ? !deliveryLocation.equals(customers.deliveryLocation) : customers.deliveryLocation != null)
            return false;
        if (postalAddressLine1 != null ? !postalAddressLine1.equals(customers.postalAddressLine1) : customers.postalAddressLine1 != null)
            return false;
        if (postalAddressLine2 != null ? !postalAddressLine2.equals(customers.postalAddressLine2) : customers.postalAddressLine2 != null)
            return false;
        if (postalPostalCode != null ? !postalPostalCode.equals(customers.postalPostalCode) : customers.postalPostalCode != null)
            return false;
        if (validFrom != null ? !validFrom.equals(customers.validFrom) : customers.validFrom != null) return false;
        if (validTo != null ? !validTo.equals(customers.validTo) : customers.validTo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = customerId;
        result = 31 * result + (customerName != null ? customerName.hashCode() : 0);
        result = 31 * result + billToCustomerId;
        result = 31 * result + customerCategoryId;
        result = 31 * result + (buyingGroupId != null ? buyingGroupId.hashCode() : 0);
        result = 31 * result + primaryContactPersonId;
        result = 31 * result + (alternateContactPersonId != null ? alternateContactPersonId.hashCode() : 0);
        result = 31 * result + deliveryMethodId;
        result = 31 * result + deliveryCityId;
        result = 31 * result + postalCityId;
        result = 31 * result + (creditLimit != null ? creditLimit.hashCode() : 0);
        result = 31 * result + (accountOpenedDate != null ? accountOpenedDate.hashCode() : 0);
        result = 31 * result + (standardDiscountPercentage != null ? standardDiscountPercentage.hashCode() : 0);
        result = 31 * result + (isStatementSent ? 1 : 0);
        result = 31 * result + (isOnCreditHold ? 1 : 0);
        result = 31 * result + paymentDays;
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        result = 31 * result + (faxNumber != null ? faxNumber.hashCode() : 0);
        result = 31 * result + (deliveryRun != null ? deliveryRun.hashCode() : 0);
        result = 31 * result + (runPosition != null ? runPosition.hashCode() : 0);
        result = 31 * result + (websiteUrl != null ? websiteUrl.hashCode() : 0);
        result = 31 * result + (deliveryAddressLine1 != null ? deliveryAddressLine1.hashCode() : 0);
        result = 31 * result + (deliveryAddressLine2 != null ? deliveryAddressLine2.hashCode() : 0);
        result = 31 * result + (deliveryPostalCode != null ? deliveryPostalCode.hashCode() : 0);
        result = 31 * result + (deliveryLocation != null ? deliveryLocation.hashCode() : 0);
        result = 31 * result + (postalAddressLine1 != null ? postalAddressLine1.hashCode() : 0);
        result = 31 * result + (postalAddressLine2 != null ? postalAddressLine2.hashCode() : 0);
        result = 31 * result + (postalPostalCode != null ? postalPostalCode.hashCode() : 0);
        result = 31 * result + lastEditedBy;
        result = 31 * result + (validFrom != null ? validFrom.hashCode() : 0);
        result = 31 * result + (validTo != null ? validTo.hashCode() : 0);
        return result;
    }
}
