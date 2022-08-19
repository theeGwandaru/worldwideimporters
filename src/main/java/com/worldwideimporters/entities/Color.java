package com.worldwideimporters.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(schema = "Warehouse", name="Colors")
public class Color {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ColorID")
    private int colorId;
    @Basic
    @Column(name = "ColorName")
    private String colorName;
    @Basic
    @Column(name = "LastEditedBy")
    private int lastEditedBy;
    @Basic
    @Column(name = "ValidFrom")
    private Date validFrom;
    @Basic
    @Column(name = "ValidTo")
    private Date validTo;

    public int getColorId() {
        return colorId;
    }

    public void setColorId(int colorId) {
        this.colorId = colorId;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
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

        Color colors = (Color) o;

        if (colorId != colors.colorId) return false;
        if (lastEditedBy != colors.lastEditedBy) return false;
        if (colorName != null ? !colorName.equals(colors.colorName) : colors.colorName != null) return false;
        if (validFrom != null ? !validFrom.equals(colors.validFrom) : colors.validFrom != null) return false;
        if (validTo != null ? !validTo.equals(colors.validTo) : colors.validTo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = colorId;
        result = 31 * result + (colorName != null ? colorName.hashCode() : 0);
        result = 31 * result + lastEditedBy;
        result = 31 * result + (validFrom != null ? validFrom.hashCode() : 0);
        result = 31 * result + (validTo != null ? validTo.hashCode() : 0);
        return result;
    }
}
