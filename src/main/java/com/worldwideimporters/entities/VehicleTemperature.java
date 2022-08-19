package com.worldwideimporters.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.Arrays;

@Entity
public class VehicleTemperature {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "VehicleTemperatureID")
    private long vehicleTemperatureId;
    @Basic
    @Column(name = "VehicleRegistration")
    private String vehicleRegistration;
    @Basic
    @Column(name = "ChillerSensorNumber")
    private int chillerSensorNumber;
    @Basic
    @Column(name = "RecordedWhen")
    private Date recordedWhen;
    @Basic
    @Column(name = "Temperature")
    private BigDecimal temperature;
    @Basic
    @Column(name = "FullSensorData")
    private String fullSensorData;
    @Basic
    @Column(name = "IsCompressed")
    private boolean isCompressed;
    @Basic
    @Column(name = "CompressedSensorData")
    private byte[] compressedSensorData;

    public long getVehicleTemperatureId() {
        return vehicleTemperatureId;
    }

    public void setVehicleTemperatureId(long vehicleTemperatureId) {
        this.vehicleTemperatureId = vehicleTemperatureId;
    }

    public String getVehicleRegistration() {
        return vehicleRegistration;
    }

    public void setVehicleRegistration(String vehicleRegistration) {
        this.vehicleRegistration = vehicleRegistration;
    }

    public int getChillerSensorNumber() {
        return chillerSensorNumber;
    }

    public void setChillerSensorNumber(int chillerSensorNumber) {
        this.chillerSensorNumber = chillerSensorNumber;
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

    public String getFullSensorData() {
        return fullSensorData;
    }

    public void setFullSensorData(String fullSensorData) {
        this.fullSensorData = fullSensorData;
    }

    public boolean isCompressed() {
        return isCompressed;
    }

    public void setCompressed(boolean compressed) {
        isCompressed = compressed;
    }

    public byte[] getCompressedSensorData() {
        return compressedSensorData;
    }

    public void setCompressedSensorData(byte[] compressedSensorData) {
        this.compressedSensorData = compressedSensorData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VehicleTemperature that = (VehicleTemperature) o;

        if (vehicleTemperatureId != that.vehicleTemperatureId) return false;
        if (chillerSensorNumber != that.chillerSensorNumber) return false;
        if (isCompressed != that.isCompressed) return false;
        if (vehicleRegistration != null ? !vehicleRegistration.equals(that.vehicleRegistration) : that.vehicleRegistration != null)
            return false;
        if (recordedWhen != null ? !recordedWhen.equals(that.recordedWhen) : that.recordedWhen != null) return false;
        if (temperature != null ? !temperature.equals(that.temperature) : that.temperature != null) return false;
        if (fullSensorData != null ? !fullSensorData.equals(that.fullSensorData) : that.fullSensorData != null)
            return false;
        if (!Arrays.equals(compressedSensorData, that.compressedSensorData)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (vehicleTemperatureId ^ (vehicleTemperatureId >>> 32));
        result = 31 * result + (vehicleRegistration != null ? vehicleRegistration.hashCode() : 0);
        result = 31 * result + chillerSensorNumber;
        result = 31 * result + (recordedWhen != null ? recordedWhen.hashCode() : 0);
        result = 31 * result + (temperature != null ? temperature.hashCode() : 0);
        result = 31 * result + (fullSensorData != null ? fullSensorData.hashCode() : 0);
        result = 31 * result + (isCompressed ? 1 : 0);
        result = 31 * result + Arrays.hashCode(compressedSensorData);
        return result;
    }
}
