package uk.co.crowderconsult;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Meter {
    private Integer id;
    private String name;
    private MeterType meteTypeId;
    private Date installDate;
    private Boolean active;
    private MeasurementDataType measurementDataType;
    private List<Area> areaList = new ArrayList<>();

    public Meter() {
    }

    public Meter(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MeterType getMeteTypeId() {
        return meteTypeId;
    }

    public void setMeteTypeId(MeterType meteTypeId) {
        this.meteTypeId = meteTypeId;
    }

    public Date getInstallDate() {
        return installDate;
    }

    public void setInstallDate(Date installDate) {
        this.installDate = installDate;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public MeasurementDataType getMeasurementDataType() {
        return measurementDataType;
    }

    public void setMeasurementDataType(MeasurementDataType measurementDataType) {
        this.measurementDataType = measurementDataType;
    }

    public List<Area> getAreaList() {
        return areaList;
    }

    public void setAreaList(List<Area> areaList) {
        this.areaList = areaList;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Meter meter = (Meter) o;
        return Objects.equals(id, meter.id) &&
                Objects.equals(name, meter.name) &&
                Objects.equals(meteTypeId, meter.meteTypeId) &&
                Objects.equals(installDate, meter.installDate) &&
                Objects.equals(active, meter.active) &&
                measurementDataType == meter.measurementDataType &&
                Objects.equals(areaList, meter.areaList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, meteTypeId, installDate, active, measurementDataType, areaList);
    }

    @Override
    public String toString() {
        return "Meter{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", meteTypeId=" + meteTypeId +
                ", installDate=" + installDate +
                ", active=" + active +
                ", measurementDataType=" + measurementDataType +
                ", areaList=" + areaList +
                '}';
    }
}
