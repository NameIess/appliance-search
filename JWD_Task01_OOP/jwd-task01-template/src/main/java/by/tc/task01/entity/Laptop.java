package by.tc.task01.entity;

import java.io.Serializable;
import java.util.Map;

public class Laptop extends Appliance implements Serializable {
    private double batteryCapacity;
    private String os;
    private double memoryRom;
    private double systemMemory;
    private double cpu;
    private double displayInches;

    public Laptop() {}

    public Laptop(double batteryCapacity, String os, double memoryRom, double systemMemory, double cpu, double displayInches) {
        this.batteryCapacity = batteryCapacity;
        this.os = os;
        this.memoryRom = memoryRom;
        this.systemMemory = systemMemory;
        this.cpu = cpu;
        this.displayInches = displayInches;
    }

    public Laptop(Map<String, String> map) {
        this.batteryCapacity = Double.parseDouble(map.get("BATTERY_CAPACITY"));
        this.os = map.get("OS");
        this.memoryRom = Double.parseDouble(map.get("MEMORY_ROM"));
        this.systemMemory = Double.parseDouble(map.get("SYSTEM_MEMORY"));
        this.cpu = Double.parseDouble(map.get("CPU"));
        this.displayInches = Double.parseDouble(map.get("DISPLAY_INCHS"));
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public double getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(double memoryRom) {
        this.memoryRom = memoryRom;
    }

    public double getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(double systemMemory) {
        this.systemMemory = systemMemory;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public double getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(double displayInches) {
        this.displayInches = displayInches;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Laptop)) return false;

        Laptop laptop = (Laptop) o;

        if (Double.compare(laptop.getBatteryCapacity(), getBatteryCapacity()) != 0) return false;
        if (Double.compare(laptop.getMemoryRom(), getMemoryRom()) != 0) return false;
        if (Double.compare(laptop.getSystemMemory(), getSystemMemory()) != 0) return false;
        if (Double.compare(laptop.getCpu(), getCpu()) != 0) return false;
        if (Double.compare(laptop.getDisplayInches(), getDisplayInches()) != 0) return false;
        return getOs().equals(laptop.getOs());
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(getBatteryCapacity());
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + getOs().hashCode();
        temp = Double.doubleToLongBits(getMemoryRom());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getSystemMemory());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getCpu());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getDisplayInches());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Laptop{");
        sb.append("batteryCapacity=").append(batteryCapacity);
        sb.append(", os='").append(os).append('\'');
        sb.append(", memoryRom=").append(memoryRom);
        sb.append(", systemMemory=").append(systemMemory);
        sb.append(", cpu=").append(cpu);
        sb.append(", displayInches=").append(displayInches);
        sb.append('}');
        return sb.toString();
    }
}
