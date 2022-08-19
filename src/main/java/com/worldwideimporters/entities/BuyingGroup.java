package com.worldwideimporters.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "BuyingGroups", schema = "Sales", catalog = "WideWorldImporters")
public class BuyingGroup {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "BuyingGroupID")
    private int buyingGroupId;
    @Basic
    @Column(name = "BuyingGroupName")
    private String buyingGroupName;
    @Basic
    @Column(name = "LastEditedBy")
    private int lastEditedBy;
    @Basic
    @Column(name = "ValidFrom")
    private Date validFrom;
    @Basic
    @Column(name = "ValidTo")
    private Date validTo;

    public int getBuyingGroupId() {
        return buyingGroupId;
    }

    public void setBuyingGroupId(int buyingGroupId) {
        this.buyingGroupId = buyingGroupId;
    }

    public String getBuyingGroupName() {
        return buyingGroupName;
    }

    public void setBuyingGroupName(String buyingGroupName) {
        this.buyingGroupName = buyingGroupName;
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

        BuyingGroup that = (BuyingGroup) o;

        if (buyingGroupId != that.buyingGroupId) return false;
        if (lastEditedBy != that.lastEditedBy) return false;
        if (buyingGroupName != null ? !buyingGroupName.equals(that.buyingGroupName) : that.buyingGroupName != null)
            return false;
        if (validFrom != null ? !validFrom.equals(that.validFrom) : that.validFrom != null) return false;
        if (validTo != null ? !validTo.equals(that.validTo) : that.validTo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = buyingGroupId;
        result = 31 * result + (buyingGroupName != null ? buyingGroupName.hashCode() : 0);
        result = 31 * result + lastEditedBy;
        result = 31 * result + (validFrom != null ? validFrom.hashCode() : 0);
        result = 31 * result + (validTo != null ? validTo.hashCode() : 0);
        return result;
    }
}
