package uk.co.crowderconsult;

import java.util.Objects;

public class MeterType {
    private Integer meterTypeId;
    private String meterTypeName;
    private Double maxSize;
    private Double maxFlow;
    private Double maxPressure;

    public MeterType() {
    }

    public MeterType(Integer meterTypeId, String meterTypeName) {
        this.meterTypeId = meterTypeId;
        this.meterTypeName = meterTypeName;
    }

    public MeterType(Integer meterTypeId, String meterTypeName, Double maxSize, Double maxFlow, Double maxPressure) {
        this(meterTypeId, meterTypeName);
        this.maxSize = maxSize;
        this.maxFlow = maxFlow;
        this.maxPressure = maxPressure;
    }

    public Integer getMeterTypeId() {
        return meterTypeId;
    }

    public void setMeterTypeId(Integer meterTypeId) {
        this.meterTypeId = meterTypeId;
    }

    public String getMeterTypeName() {
        return meterTypeName;
    }

    public void setMeterTypeName(String meterTypeName) {
        this.meterTypeName = meterTypeName;
    }

    public Double getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(Double maxSize) {
        this.maxSize = maxSize;
    }

    public Double getMaxFlow() {
        return maxFlow;
    }

    public void setMaxFlow(Double maxFlow) {
        this.maxFlow = maxFlow;
    }

    public Double getMaxPressure() {
        return maxPressure;
    }

    public void setMaxPressure(Double maxPressure) {
        this.maxPressure = maxPressure;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MeterType meterType = (MeterType) o;
        return Objects.equals(meterTypeId, meterType.meterTypeId) &&
                Objects.equals(meterTypeName, meterType.meterTypeName) &&
                Objects.equals(maxSize, meterType.maxSize) &&
                Objects.equals(maxFlow, meterType.maxFlow) &&
                Objects.equals(maxPressure, meterType.maxPressure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(meterTypeId, meterTypeName, maxSize, maxFlow, maxPressure);
    }

    @Override
    public String toString() {
        return "MeterType{" +
                "meterTypeId=" + meterTypeId +
                ", meterTypeName='" + meterTypeName + '\'' +
                ", maxSize=" + maxSize +
                ", maxFlow=" + maxFlow +
                ", maxPressure=" + maxPressure +
                '}';
    }
}
