package com.worldwideimporters.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Supplier {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "SupplierID")
    private int supplierId;
    @Basic
    @Column(name = "SupplierName")
    private String supplierName;
    @Basic
    @Column(name = "SupplierCategoryID")
    private int supplierCategoryId;
    @Basic
    @Column(name = "PrimaryContactPersonID")
    private int primaryContactPersonId;
    @Basic
    @Column(name = "AlternateContactPersonID")
    private int alternateContactPersonId;
    @Basic
    @Column(name = "DeliveryMethodID")
    private Integer deliveryMethodId;
    @Basic
    @Column(name = "DeliveryCityID")
    private int deliveryCityId;
    @Basic
    @Column(name = "PostalCityID")
    private int postalCityId;
    @Basic
    @Column(name = "SupplierReference")
    private String supplierReference;
    @Basic
    @Column(name = "BankAccountName")
    private String bankAccountName;
    @Basic
    @Column(name = "BankAccountBranch")
    private String bankAccountBranch;
    @Basic
    @Column(name = "BankAccountCode")
    private String bankAccountCode;
    @Basic
    @Column(name = "BankAccountNumber")
    private String bankAccountNumber;
    @Basic
    @Column(name = "BankInternationalCode")
    private String bankInternationalCode;
    @Basic
    @Column(name = "PaymentDays")
    private int paymentDays;
    @Basic
    @Column(name = "InternalComments")
    private String internalComments;
    @Basic
    @Column(name = "PhoneNumber")
    private String phoneNumber;
    @Basic
    @Column(name = "FaxNumber")
    private String faxNumber;
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

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public int getSupplierCategoryId() {
        return supplierCategoryId;
    }

    public void setSupplierCategoryId(int supplierCategoryId) {
        this.supplierCategoryId = supplierCategoryId;
    }

    public int getPrimaryContactPersonId() {
        return primaryContactPersonId;
    }

    public void setPrimaryContactPersonId(int primaryContactPersonId) {
        this.primaryContactPersonId = primaryContactPersonId;
    }

    public int getAlternateContactPersonId() {
        return alternateContactPersonId;
    }

    public void setAlternateContactPersonId(int alternateContactPersonId) {
        this.alternateContactPersonId = alternateContactPersonId;
    }

    public Integer getDeliveryMethodId() {
        return deliveryMethodId;
    }

    public void setDeliveryMethodId(Integer deliveryMethodId) {
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

    public String getSupplierReference() {
        return supplierReference;
    }

    public void setSupplierReference(String supplierReference) {
        this.supplierReference = supplierReference;
    }

    public String getBankAccountName() {
        return bankAccountName;
    }

    public void setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName;
    }

    public String getBankAccountBranch() {
        return bankAccountBranch;
    }

    public void setBankAccountBranch(String bankAccountBranch) {
        this.bankAccountBranch = bankAccountBranch;
    }

    public String getBankAccountCode() {
        return bankAccountCode;
    }

    public void setBankAccountCode(String bankAccountCode) {
        this.bankAccountCode = bankAccountCode;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getBankInternationalCode() {
        return bankInternationalCode;
    }

    public void setBankInternationalCode(String bankInternationalCode) {
        this.bankInternationalCode = bankInternationalCode;
    }

    public int getPaymentDays() {
        return paymentDays;
    }

    public void setPaymentDays(int paymentDays) {
        this.paymentDays = paymentDays;
    }

    public String getInternalComments() {
        return internalComments;
    }

    public void setInternalComments(String internalComments) {
        this.internalComments = internalComments;
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

        Supplier suppliers = (Supplier) o;

        if (supplierId != suppliers.supplierId) return false;
        if (supplierCategoryId != suppliers.supplierCategoryId) return false;
        if (primaryContactPersonId != suppliers.primaryContactPersonId) return false;
        if (alternateContactPersonId != suppliers.alternateContactPersonId) return false;
        if (deliveryCityId != suppliers.deliveryCityId) return false;
        if (postalCityId != suppliers.postalCityId) return false;
        if (paymentDays != suppliers.paymentDays) return false;
        if (lastEditedBy != suppliers.lastEditedBy) return false;
        if (supplierName != null ? !supplierName.equals(suppliers.supplierName) : suppliers.supplierName != null)
            return false;
        if (deliveryMethodId != null ? !deliveryMethodId.equals(suppliers.deliveryMethodId) : suppliers.deliveryMethodId != null)
            return false;
        if (supplierReference != null ? !supplierReference.equals(suppliers.supplierReference) : suppliers.supplierReference != null)
            return false;
        if (bankAccountName != null ? !bankAccountName.equals(suppliers.bankAccountName) : suppliers.bankAccountName != null)
            return false;
        if (bankAccountBranch != null ? !bankAccountBranch.equals(suppliers.bankAccountBranch) : suppliers.bankAccountBranch != null)
            return false;
        if (bankAccountCode != null ? !bankAccountCode.equals(suppliers.bankAccountCode) : suppliers.bankAccountCode != null)
            return false;
        if (bankAccountNumber != null ? !bankAccountNumber.equals(suppliers.bankAccountNumber) : suppliers.bankAccountNumber != null)
            return false;
        if (bankInternationalCode != null ? !bankInternationalCode.equals(suppliers.bankInternationalCode) : suppliers.bankInternationalCode != null)
            return false;
        if (internalComments != null ? !internalComments.equals(suppliers.internalComments) : suppliers.internalComments != null)
            return false;
        if (phoneNumber != null ? !phoneNumber.equals(suppliers.phoneNumber) : suppliers.phoneNumber != null)
            return false;
        if (faxNumber != null ? !faxNumber.equals(suppliers.faxNumber) : suppliers.faxNumber != null) return false;
        if (websiteUrl != null ? !websiteUrl.equals(suppliers.websiteUrl) : suppliers.websiteUrl != null) return false;
        if (deliveryAddressLine1 != null ? !deliveryAddressLine1.equals(suppliers.deliveryAddressLine1) : suppliers.deliveryAddressLine1 != null)
            return false;
        if (deliveryAddressLine2 != null ? !deliveryAddressLine2.equals(suppliers.deliveryAddressLine2) : suppliers.deliveryAddressLine2 != null)
            return false;
        if (deliveryPostalCode != null ? !deliveryPostalCode.equals(suppliers.deliveryPostalCode) : suppliers.deliveryPostalCode != null)
            return false;
        if (deliveryLocation != null ? !deliveryLocation.equals(suppliers.deliveryLocation) : suppliers.deliveryLocation != null)
            return false;
        if (postalAddressLine1 != null ? !postalAddressLine1.equals(suppliers.postalAddressLine1) : suppliers.postalAddressLine1 != null)
            return false;
        if (postalAddressLine2 != null ? !postalAddressLine2.equals(suppliers.postalAddressLine2) : suppliers.postalAddressLine2 != null)
            return false;
        if (postalPostalCode != null ? !postalPostalCode.equals(suppliers.postalPostalCode) : suppliers.postalPostalCode != null)
            return false;
        if (validFrom != null ? !validFrom.equals(suppliers.validFrom) : suppliers.validFrom != null) return false;
        if (validTo != null ? !validTo.equals(suppliers.validTo) : suppliers.validTo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = supplierId;
        result = 31 * result + (supplierName != null ? supplierName.hashCode() : 0);
        result = 31 * result + supplierCategoryId;
        result = 31 * result + primaryContactPersonId;
        result = 31 * result + alternateContactPersonId;
        result = 31 * result + (deliveryMethodId != null ? deliveryMethodId.hashCode() : 0);
        result = 31 * result + deliveryCityId;
        result = 31 * result + postalCityId;
        result = 31 * result + (supplierReference != null ? supplierReference.hashCode() : 0);
        result = 31 * result + (bankAccountName != null ? bankAccountName.hashCode() : 0);
        result = 31 * result + (bankAccountBranch != null ? bankAccountBranch.hashCode() : 0);
        result = 31 * result + (bankAccountCode != null ? bankAccountCode.hashCode() : 0);
        result = 31 * result + (bankAccountNumber != null ? bankAccountNumber.hashCode() : 0);
        result = 31 * result + (bankInternationalCode != null ? bankInternationalCode.hashCode() : 0);
        result = 31 * result + paymentDays;
        result = 31 * result + (internalComments != null ? internalComments.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        result = 31 * result + (faxNumber != null ? faxNumber.hashCode() : 0);
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
