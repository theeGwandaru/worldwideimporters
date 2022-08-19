package com.worldwideimporters.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Table(schema = "Warehouse", name = "ColdRoomTemperatures")
public class ColdRoomTemperature {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ColdRoomTemperatureID")
    private long coldRoomTemperatureId;
    @Basic
    @Column(name = "ColdRoomSensorNumber")
    private int coldRoomSensorNumber;
    @Basic
    @Column(name = "RecordedWhen")
    private Date recordedWhen;
    @Basic
    @Column(name = "Temperature")
    private BigDecimal temperature;
    @Basic
    @Column(name = "ValidFrom")
    private Date validFrom;
    @Basic
    @Column(name = "ValidTo")
    private Date validTo;

    public long getColdRoomTemperatureId() {
        return coldRoomTemperatureId;
    }

    public void setColdRoomTemperatureId(long coldRoomTemperatureId) {
        this.coldRoomTemperatureId = coldRoomTemperatureId;
    }

    public int getColdRoomSensorNumber() {
        return coldRoomSensorNumber;
    }

    public void setColdRoomSensorNumber(int coldRoomSensorNumber) {
        this.coldRoomSensorNumber = coldRoomSensorNumber;
    }

    public Date getRecordedWhen() {
        return recordedWhen;
    }

    public void setRecordedWhen(Date recordedWhen) {
        this.recordedWhen = recordedWhen;
    }

    public BigDecimal getTemperature() {
        return temperature;
    }

    public void setTemperature(BigDecimal temperature) {
        this.temperature = temperature;
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

        ColdRoomTemperature that = (ColdRoomTemperature) o;

        if (coldRoomTemperatureId != that.coldRoomTemperatureId) return false;
        if (coldRoomSensorNumber != that.coldRoomSensorNumber) return false;
        if (recordedWhen != null ? !recordedWhen.equals(that.recordedWhen) : that.recordedWhen != null) return false;
        if (temperature != null ? !temperature.equals(that.temperature) : that.temperature != null) return false;
        if (validFrom != null ? !validFrom.equals(that.validFrom) : that.validFrom != null) return false;
        if (validTo != null ? !validTo.equals(that.validTo) : that.validTo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (coldRoomTemperatureId ^ (coldRoomTemperatureId >>> 32));
        result = 31 * result + coldRoomSensorNumber;
        result = 31 * result + (recordedWhen != null ? recordedWhen.hashCode() : 0);
        result = 31 * result + (temperature != null ? temperature.hashCode() : 0);
        result = 31 * result + (validFrom != null ? validFrom.hashCode() : 0);
        result = 31 * result + (validTo != null ? validTo.hashCode() : 0);
        return result;
    }
}
