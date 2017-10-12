package by.tc.task01.entity;

import java.io.Serializable;
import java.util.Map;

public class Refrigerator extends Appliance implements Serializable {
    private double powerConsumption;
    private double weight;
    private double freezerCapacity;
    private double overallCapacity;
    private double height;
    private double width;

    public Refrigerator() {}

    public Refrigerator(double powerConsumption, double weight, double freezerCapacity, double overallCapacity, double height, double width) {
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
        this.height = height;
        this.width = width;
    }

    public Refrigerator(Map<String, String> map) {
        this.powerConsumption = Double.parseDouble(map.get("POWER_CONSUMPTION"));
        this.weight = Double.parseDouble(map.get("WEIGHT"));
        this.freezerCapacity = Double.parseDouble(map.get("FREEZER_CAPACITY"));
        this.overallCapacity = Double.parseDouble(map.get("OVERALL_CAPACITY"));
        this.height = Double.parseDouble(map.get("HEIGHT"));
        this.width = Double.parseDouble(map.get("WIDTH"));
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(double freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public double getOverallCapacity() {
        return overallCapacity;
    }

    public void setOverallCapacity(double overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Refrigerator)) return false;

        Refrigerator that = (Refrigerator) o;

        if (Double.compare(that.getPowerConsumption(), getPowerConsumption()) != 0) return false;
        if (Double.compare(that.getWeight(), getWeight()) != 0) return false;
        if (Double.compare(that.getFreezerCapacity(), getFreezerCapacity()) != 0) return false;
        if (Double.compare(that.getOverallCapacity(), getOverallCapacity()) != 0) return false;
        if (Double.compare(that.getHeight(), getHeight()) != 0) return false;
        return Double.compare(that.getWidth(), getWidth()) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(getPowerConsumption());
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getWeight());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getFreezerCapacity());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getOverallCapacity());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getHeight());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getWidth());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Refrigerator{");
        sb.append("powerConsumption=").append(powerConsumption);
        sb.append(", weight=").append(weight);
        sb.append(", freezerCapacity=").append(freezerCapacity);
        sb.append(", overallCapacity=").append(overallCapacity);
        sb.append(", height=").append(height);
        sb.append(", width=").append(width);
        sb.append('}');
        return sb.toString();
    }
}
