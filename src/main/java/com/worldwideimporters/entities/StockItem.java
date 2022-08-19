package com.worldwideimporters.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.Arrays;

@Entity
public class StockItem {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "StockItemID")
    private int stockItemId;
    @Basic
    @Column(name = "StockItemName")
    private String stockItemName;
    @Basic
    @Column(name = "SupplierID")
    private int supplierId;
    @Basic
    @Column(name = "ColorID")
    private Integer colorId;
    @Basic
    @Column(name = "UnitPackageID")
    private int unitPackageId;
    @Basic
    @Column(name = "OuterPackageID")
    private int outerPackageId;
    @Basic
    @Column(name = "Brand")
    private String brand;
    @Basic
    @Column(name = "Size")
    private String size;
    @Basic
    @Column(name = "LeadTimeDays")
    private int leadTimeDays;
    @Basic
    @Column(name = "QuantityPerOuter")
    private int quantityPerOuter;
    @Basic
    @Column(name = "IsChillerStock")
    private boolean isChillerStock;
    @Basic
    @Column(name = "Barcode")
    private String barcode;
    @Basic
    @Column(name = "TaxRate")
    private BigDecimal taxRate;
    @Basic
    @Column(name = "UnitPrice")
    private BigDecimal unitPrice;
    @Basic
    @Column(name = "RecommendedRetailPrice")
    private BigDecimal recommendedRetailPrice;
    @Basic
    @Column(name = "TypicalWeightPerUnit")
    private BigDecimal typicalWeightPerUnit;
    @Basic
    @Column(name = "MarketingComments")
    private String marketingComments;
    @Basic
    @Column(name = "InternalComments")
    private String internalComments;
    @Basic
    @Column(name = "Photo")
    private byte[] photo;
    @Basic
    @Column(name = "CustomFields")
    private String customFields;
    @Basic
    @Column(name = "Tags")
    private String tags;
    @Basic
    @Column(name = "SearchDetails")
    private String searchDetails;
    @Basic
    @Column(name = "LastEditedBy")
    private int lastEditedBy;
    @Basic
    @Column(name = "ValidFrom")
    private Date validFrom;
    @Basic
    @Column(name = "ValidTo")
    private Date validTo;

    public int getStockItemId() {
        return stockItemId;
    }

    public void setStockItemId(int stockItemId) {
        this.stockItemId = stockItemId;
    }

    public String getStockItemName() {
        return stockItemName;
    }

    public void setStockItemName(String stockItemName) {
        this.stockItemName = stockItemName;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public Integer getColorId() {
        return colorId;
    }

    public void setColorId(Integer colorId) {
        this.colorId = colorId;
    }

    public int getUnitPackageId() {
        return unitPackageId;
    }

    public void setUnitPackageId(int unitPackageId) {
        this.unitPackageId = unitPackageId;
    }

    public int getOuterPackageId() {
        return outerPackageId;
    }

    public void setOuterPackageId(int outerPackageId) {
        this.outerPackageId = outerPackageId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getLeadTimeDays() {
        return leadTimeDays;
    }

    public void setLeadTimeDays(int leadTimeDays) {
        this.leadTimeDays = leadTimeDays;
    }

    public int getQuantityPerOuter() {
        return quantityPerOuter;
    }

    public void setQuantityPerOuter(int quantityPerOuter) {
        this.quantityPerOuter = quantityPerOuter;
    }

    public boolean isChillerStock() {
        return isChillerStock;
    }

    public void setChillerStock(boolean chillerStock) {
        isChillerStock = chillerStock;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public BigDecimal getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getRecommendedRetailPrice() {
        return recommendedRetailPrice;
    }

    public void setRecommendedRetailPrice(BigDecimal recommendedRetailPrice) {
        this.recommendedRetailPrice = recommendedRetailPrice;
    }

    public BigDecimal getTypicalWeightPerUnit() {
        return typicalWeightPerUnit;
    }

    public void setTypicalWeightPerUnit(BigDecimal typicalWeightPerUnit) {
        this.typicalWeightPerUnit = typicalWeightPerUnit;
    }

    public String getMarketingComments() {
        return marketingComments;
    }

    public void setMarketingComments(String marketingComments) {
        this.marketingComments = marketingComments;
    }

    public String getInternalComments() {
        return internalComments;
    }

    public void setInternalComments(String internalComments) {
        this.internalComments = internalComments;
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

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getSearchDetails() {
        return searchDetails;
    }

    public void setSearchDetails(String searchDetails) {
        this.searchDetails = searchDetails;
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

        StockItem that = (StockItem) o;

        if (stockItemId != that.stockItemId) return false;
        if (supplierId != that.supplierId) return false;
        if (unitPackageId != that.unitPackageId) return false;
        if (outerPackageId != that.outerPackageId) return false;
        if (leadTimeDays != that.leadTimeDays) return false;
        if (quantityPerOuter != that.quantityPerOuter) return false;
        if (isChillerStock != that.isChillerStock) return false;
        if (lastEditedBy != that.lastEditedBy) return false;
        if (stockItemName != null ? !stockItemName.equals(that.stockItemName) : that.stockItemName != null)
            return false;
        if (colorId != null ? !colorId.equals(that.colorId) : that.colorId != null) return false;
        if (brand != null ? !brand.equals(that.brand) : that.brand != null) return false;
        if (size != null ? !size.equals(that.size) : that.size != null) return false;
        if (barcode != null ? !barcode.equals(that.barcode) : that.barcode != null) return false;
        if (taxRate != null ? !taxRate.equals(that.taxRate) : that.taxRate != null) return false;
        if (unitPrice != null ? !unitPrice.equals(that.unitPrice) : that.unitPrice != null) return false;
        if (recommendedRetailPrice != null ? !recommendedRetailPrice.equals(that.recommendedRetailPrice) : that.recommendedRetailPrice != null)
            return false;
        if (typicalWeightPerUnit != null ? !typicalWeightPerUnit.equals(that.typicalWeightPerUnit) : that.typicalWeightPerUnit != null)
            return false;
        if (marketingComments != null ? !marketingComments.equals(that.marketingComments) : that.marketingComments != null)
            return false;
        if (internalComments != null ? !internalComments.equals(that.internalComments) : that.internalComments != null)
            return false;
        if (!Arrays.equals(photo, that.photo)) return false;
        if (customFields != null ? !customFields.equals(that.customFields) : that.customFields != null) return false;
        if (tags != null ? !tags.equals(that.tags) : that.tags != null) return false;
        if (searchDetails != null ? !searchDetails.equals(that.searchDetails) : that.searchDetails != null)
            return false;
        if (validFrom != null ? !validFrom.equals(that.validFrom) : that.validFrom != null) return false;
        if (validTo != null ? !validTo.equals(that.validTo) : that.validTo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = stockItemId;
        result = 31 * result + (stockItemName != null ? stockItemName.hashCode() : 0);
        result = 31 * result + supplierId;
        result = 31 * result + (colorId != null ? colorId.hashCode() : 0);
        result = 31 * result + unitPackageId;
        result = 31 * result + outerPackageId;
        result = 31 * result + (brand != null ? brand.hashCode() : 0);
        result = 31 * result + (size != null ? size.hashCode() : 0);
        result = 31 * result + leadTimeDays;
        result = 31 * result + quantityPerOuter;
        result = 31 * result + (isChillerStock ? 1 : 0);
        result = 31 * result + (barcode != null ? barcode.hashCode() : 0);
        result = 31 * result + (taxRate != null ? taxRate.hashCode() : 0);
        result = 31 * result + (unitPrice != null ? unitPrice.hashCode() : 0);
        result = 31 * result + (recommendedRetailPrice != null ? recommendedRetailPrice.hashCode() : 0);
        result = 31 * result + (typicalWeightPerUnit != null ? typicalWeightPerUnit.hashCode() : 0);
        result = 31 * result + (marketingComments != null ? marketingComments.hashCode() : 0);
        result = 31 * result + (internalComments != null ? internalComments.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(photo);
        result = 31 * result + (customFields != null ? customFields.hashCode() : 0);
        result = 31 * result + (tags != null ? tags.hashCode() : 0);
        result = 31 * result + (searchDetails != null ? searchDetails.hashCode() : 0);
        result = 31 * result + lastEditedBy;
        result = 31 * result + (validFrom != null ? validFrom.hashCode() : 0);
        result = 31 * result + (validTo != null ? validTo.hashCode() : 0);
        return result;
    }
}
