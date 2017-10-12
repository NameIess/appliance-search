package by.tc.task01.entity;

import java.io.Serializable;
import java.util.Map;

public class Oven extends Appliance implements Serializable {
    private double powerConsumption;
    private double weight;
    private double capacity;
    private double depth;
    private double height;
    private double width;

    public Oven() {}

    public Oven(double powerConsumption, double weight, double capacity, double depth, double height, double width) {
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.capacity = capacity;
        this.depth = depth;
        this.height = height;
        this.width = width;
    }

    public Oven(Map<String, String> map) {
        this.powerConsumption = Integer.parseInt(map.get("POWER_CONSUMPTION"));
        this.weight = Double.parseDouble(map.get("WEIGHT"));
        this.capacity = Double.parseDouble(map.get("CAPACITY"));
        this.depth = Double.parseDouble(map.get("DEPTH"));
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

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
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
        if (!(o instanceof Oven)) return false;

        Oven oven = (Oven) o;

        if (Double.compare(oven.getPowerConsumption(), getPowerConsumption()) != 0) return false;
        if (Double.compare(oven.getWeight(), getWeight()) != 0) return false;
        if (Double.compare(oven.getCapacity(), getCapacity()) != 0) return false;
        if (Double.compare(oven.getDepth(), getDepth()) != 0) return false;
        if (Double.compare(oven.getHeight(), getHeight()) != 0) return false;
        return Double.compare(oven.getWidth(), getWidth()) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(getPowerConsumption());
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getWeight());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getCapacity());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getDepth());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getHeight());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getWidth());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Oven{");
        sb.append("powerConsumption=").append(powerConsumption);
        sb.append(", weight=").append(weight);
        sb.append(", capacity=").append(capacity);
        sb.append(", depth=").append(depth);
        sb.append(", height=").append(height);
        sb.append(", width=").append(width);
        sb.append('}');
        return sb.toString();
    }
}
