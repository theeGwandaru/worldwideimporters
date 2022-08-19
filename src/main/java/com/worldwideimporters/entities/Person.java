package com.worldwideimporters.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Arrays;

@Entity
public class Person {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "PersonID")
    private int personId;
    @Basic
    @Column(name = "FullName")
    private String fullName;
    @Basic
    @Column(name = "PreferredName")
    private String preferredName;
    @Basic
    @Column(name = "SearchName")
    private String searchName;
    @Basic
    @Column(name = "IsPermittedToLogon")
    private boolean isPermittedToLogon;
    @Basic
    @Column(name = "LogonName")
    private String logonName;
    @Basic
    @Column(name = "IsExternalLogonProvider")
    private boolean isExternalLogonProvider;
    @Basic
    @Column(name = "HashedPassword")
    private byte[] hashedPassword;
    @Basic
    @Column(name = "IsSystemUser")
    private boolean isSystemUser;
    @Basic
    @Column(name = "IsEmployee")
    private boolean isEmployee;
    @Basic
    @Column(name = "IsSalesperson")
    private boolean isSalesperson;
    @Basic
    @Column(name = "UserPreferences")
    private String userPreferences;
    @Basic
    @Column(name = "PhoneNumber")
    private String phoneNumber;
    @Basic
    @Column(name = "FaxNumber")
    private String faxNumber;
    @Basic
    @Column(name = "EmailAddress")
    private String emailAddress;
    @Basic
    @Column(name = "Photo")
    private byte[] photo;
    @Basic
    @Column(name = "CustomFields")
    private String customFields;
    @Basic
    @Column(name = "OtherLanguages")
    private String otherLanguages;
    @Basic
    @Column(name = "LastEditedBy")
    private int lastEditedBy;
    @Basic
    @Column(name = "ValidFrom")
    private Date validFrom;
    @Basic
    @Column(name = "ValidTo")
    private Date validTo;

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPreferredName() {
        return preferredName;
    }

    public void setPreferredName(String preferredName) {
        this.preferredName = preferredName;
    }

    public String getSearchName() {
        return searchName;
    }

    public void setSearchName(String searchName) {
        this.searchName = searchName;
    }

    public boolean isPermittedToLogon() {
        return isPermittedToLogon;
    }

    public void setPermittedToLogon(boolean permittedToLogon) {
        isPermittedToLogon = permittedToLogon;
    }

    public String getLogonName() {
        return logonName;
    }

    public void setLogonName(String logonName) {
        this.logonName = logonName;
    }

    public boolean isExternalLogonProvider() {
        return isExternalLogonProvider;
    }

    public void setExternalLogonProvider(boolean externalLogonProvider) {
        isExternalLogonProvider = externalLogonProvider;
    }

    public byte[] getHashedPassword() {
        return hashedPassword;
    }

    public void setHashedPassword(byte[] hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

    public boolean isSystemUser() {
        return isSystemUser;
    }

    public void setSystemUser(boolean systemUser) {
        isSystemUser = systemUser;
    }

    public boolean isEmployee() {
        return isEmployee;
    }

    public void setEmployee(boolean employee) {
        isEmployee = employee;
    }

    public boolean isSalesperson() {
        return isSalesperson;
    }

    public void setSalesperson(boolean salesperson) {
        isSalesperson = salesperson;
    }

    public String getUserPreferences() {
        return userPreferences;
    }

    public void setUserPreferences(String userPreferences) {
        this.userPreferences = userPreferences;
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

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public String getCustomFields() {
        return customFields;
    }

    public void setCustomFields(String customFields) {
        this.customFields = customFields;
    }

    public String getOtherLanguages() {
        return otherLanguages;
    }

    public void setOtherLanguages(String otherLanguages) {
        this.otherLanguages = otherLanguages;
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

        Person people = (Person) o;

        if (personId != people.personId) return false;
        if (isPermittedToLogon != people.isPermittedToLogon) return false;
        if (isExternalLogonProvider != people.isExternalLogonProvider) return false;
        if (isSystemUser != people.isSystemUser) return false;
        if (isEmployee != people.isEmployee) return false;
        if (isSalesperson != people.isSalesperson) return false;
        if (lastEditedBy != people.lastEditedBy) return false;
        if (fullName != null ? !fullName.equals(people.fullName) : people.fullName != null) return false;
        if (preferredName != null ? !preferredName.equals(people.preferredName) : people.preferredName != null)
            return false;
        if (searchName != null ? !searchName.equals(people.searchName) : people.searchName != null) return false;
        if (logonName != null ? !logonName.equals(people.logonName) : people.logonName != null) return false;
        if (!Arrays.equals(hashedPassword, people.hashedPassword)) return false;
        if (userPreferences != null ? !userPreferences.equals(people.userPreferences) : people.userPreferences != null)
            return false;
        if (phoneNumber != null ? !phoneNumber.equals(people.phoneNumber) : people.phoneNumber != null) return false;
        if (faxNumber != null ? !faxNumber.equals(people.faxNumber) : people.faxNumber != null) return false;
        if (emailAddress != null ? !emailAddress.equals(people.emailAddress) : people.emailAddress != null)
            return false;
        if (!Arrays.equals(photo, people.photo)) return false;
        if (customFields != null ? !customFields.equals(people.customFields) : people.customFields != null)
            return false;
        if (otherLanguages != null ? !otherLanguages.equals(people.otherLanguages) : people.otherLanguages != null)
            return false;
        if (validFrom != null ? !validFrom.equals(people.validFrom) : people.validFrom != null) return false;
        if (validTo != null ? !validTo.equals(people.validTo) : people.validTo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = personId;
        result = 31 * result + (fullName != null ? fullName.hashCode() : 0);
        result = 31 * result + (preferredName != null ? preferredName.hashCode() : 0);
        result = 31 * result + (searchName != null ? searchName.hashCode() : 0);
        result = 31 * result + (isPermittedToLogon ? 1 : 0);
        result = 31 * result + (logonName != null ? logonName.hashCode() : 0);
        result = 31 * result + (isExternalLogonProvider ? 1 : 0);
        result = 31 * result + Arrays.hashCode(hashedPassword);
        result = 31 * result + (isSystemUser ? 1 : 0);
        result = 31 * result + (isEmployee ? 1 : 0);
        result = 31 * result + (isSalesperson ? 1 : 0);
        result = 31 * result + (userPreferences != null ? userPreferences.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        result = 31 * result + (faxNumber != null ? faxNumber.hashCode() : 0);
        result = 31 * result + (emailAddress != null ? emailAddress.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(photo);
        result = 31 * result + (customFields != null ? customFields.hashCode() : 0);
        result = 31 * result + (otherLanguages != null ? otherLanguages.hashCode() : 0);
        result = 31 * result + lastEditedBy;
        result = 31 * result + (validFrom != null ? validFrom.hashCode() : 0);
        result = 31 * result + (validTo != null ? validTo.hashCode() : 0);
        return result;
    }
}
