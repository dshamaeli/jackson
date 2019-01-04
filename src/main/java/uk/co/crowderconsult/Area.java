package uk.co.crowderconsult;

import java.util.Objects;

public class Area {
    private Integer areaId;
    private String areaName;
    private Boolean isActive;

    public Area() {
    }

    public Area(Integer areaId, String areaName, Boolean isActive) {
        this.areaId = areaId;
        this.areaName = areaName;
        this.isActive = isActive;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Area area = (Area) o;
        return areaId.equals(area.areaId) &&
                Objects.equals(areaName, area.areaName) &&
                Objects.equals(isActive, area.isActive);
    }

    @Override
    public int hashCode() {
        return Objects.hash(areaId, areaName, isActive);
    }

    @Override
    public String toString() {
        return "Area{" +
                "areaId=" + areaId +
                ", areaName='" + areaName + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
