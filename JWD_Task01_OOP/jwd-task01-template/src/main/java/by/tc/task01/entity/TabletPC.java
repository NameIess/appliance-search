package by.tc.task01.entity;

import java.io.Serializable;
import java.util.Map;

public class TabletPC extends Appliance implements Serializable {
    private double batteryCapacity;
    private double displayInches;
    private double memoryRom;
    private double flashMemoryCapacity;
    private String color;

    public TabletPC() {}

    public TabletPC(double batteryCapacity, double displayInches, double memoryRom, double flashMemoryCapacity, String color) {
        this.batteryCapacity = batteryCapacity;
        this.displayInches = displayInches;
        this.memoryRom = memoryRom;
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.color = color;
    }

    public TabletPC(Map<String, String> map) {
        this.batteryCapacity = Double.parseDouble(map.get("BATTERY_CAPACITY"));
        this.displayInches = Double.parseDouble(map.get("DISPLAY_INCHES"));
        this.memoryRom = Double.parseDouble(map.get("MEMORY_ROM"));
        this.flashMemoryCapacity = Double.parseDouble(map.get("FLASH_MEMORY_CAPACITY"));
        this.color = map.get("COLOR");
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public double getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(double displayInches) {
        this.displayInches = displayInches;
    }

    public double getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(double memoryRom) {
        this.memoryRom = memoryRom;
    }

    public double getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public void setFlashMemoryCapacity(double flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TabletPC)) return false;

        TabletPC tabletPC = (TabletPC) o;

        if (Double.compare(tabletPC.getBatteryCapacity(), getBatteryCapacity()) != 0) return false;
        if (Double.compare(tabletPC.getDisplayInches(), getDisplayInches()) != 0) return false;
        if (Double.compare(tabletPC.getMemoryRom(), getMemoryRom()) != 0) return false;
        if (Double.compare(tabletPC.getFlashMemoryCapacity(), getFlashMemoryCapacity()) != 0) return false;
        return getColor().equals(tabletPC.getColor());
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(getBatteryCapacity());
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getDisplayInches());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getMemoryRom());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getFlashMemoryCapacity());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + getColor().hashCode();
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TabletPC{");
        sb.append("batteryCapacity=").append(batteryCapacity);
        sb.append(", displayInches=").append(displayInches);
        sb.append(", memoryRom=").append(memoryRom);
        sb.append(", flashMemoryCapacity=").append(flashMemoryCapacity);
        sb.append(", color='").append(color).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
