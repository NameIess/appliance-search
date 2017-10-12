package by.tc.task01.entity;

import java.io.Serializable;
import java.util.Map;

public class VacuumCleaner extends Appliance implements Serializable {
    private double powerConsumption;
    private String filterType;
    private String bagType;
    private String wandType;
    private double motorSpeedRegulation;
    private double cleaningWidth;

    public VacuumCleaner() {}

    public VacuumCleaner(double powerConsumption, String filterType, String bagType, String wandType, double motorSpeedRegulation, double cleaningWidth) {
        this.powerConsumption = powerConsumption;
        this.filterType = filterType;
        this.bagType = bagType;
        this.wandType = wandType;
        this.motorSpeedRegulation = motorSpeedRegulation;
        this.cleaningWidth = cleaningWidth;
    }

    public VacuumCleaner(Map<String, String> map) {
        this.powerConsumption = Double.parseDouble(map.get("POWER_CONSUMPTION"));
        this.filterType = map.get("FILTER_TYPE");
        this.bagType = map.get("BAG_TYPE");
        this.wandType = map.get("WAND_TYPE");
        this.motorSpeedRegulation = Double.parseDouble(map.get("MOTOR_SPEED_REGULATION"));
        this.cleaningWidth = Double.parseDouble(map.get("CLEANING_WIDTH"));
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    public double getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public void setMotorSpeedRegulation(double motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    public double getCleaningWidth() {
        return cleaningWidth;
    }

    public void setCleaningWidth(double cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VacuumCleaner)) return false;

        VacuumCleaner that = (VacuumCleaner) o;

        if (Double.compare(that.getPowerConsumption(), getPowerConsumption()) != 0) return false;
        if (Double.compare(that.getMotorSpeedRegulation(), getMotorSpeedRegulation()) != 0) return false;
        if (Double.compare(that.getCleaningWidth(), getCleaningWidth()) != 0) return false;
        if (!getFilterType().equals(that.getFilterType())) return false;
        if (!getBagType().equals(that.getBagType())) return false;
        return getWandType().equals(that.getWandType());
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(getPowerConsumption());
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + getFilterType().hashCode();
        result = 31 * result + getBagType().hashCode();
        result = 31 * result + getWandType().hashCode();
        temp = Double.doubleToLongBits(getMotorSpeedRegulation());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getCleaningWidth());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("VacuumCleaner{");
        sb.append("powerConsumption=").append(powerConsumption);
        sb.append(", filterType='").append(filterType).append('\'');
        sb.append(", bagType='").append(bagType).append('\'');
        sb.append(", wandType='").append(wandType).append('\'');
        sb.append(", motorSpeedRegulation=").append(motorSpeedRegulation);
        sb.append(", cleaningWidth=").append(cleaningWidth);
        sb.append('}');
        return sb.toString();
    }
}
