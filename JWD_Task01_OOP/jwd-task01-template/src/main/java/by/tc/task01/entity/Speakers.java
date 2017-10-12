package by.tc.task01.entity;

import java.io.Serializable;
import java.util.Map;

public class Speakers extends Appliance implements Serializable {
    private double powerConsumption;
    private double numberOfSpeakers;
    private String frequencyRange;
    private double cordLength;

    public Speakers() {}

    public Speakers(double powerConsumption, double numberOfSpeakers, String frequencyRange, double cordLength) {
        this.powerConsumption = powerConsumption;
        this.numberOfSpeakers = numberOfSpeakers;
        this.frequencyRange = frequencyRange;
        this.cordLength = cordLength;
    }

    public Speakers(Map<String, String> map) {
        this.powerConsumption = Double.parseDouble(map.get("POWER_CONSUMPTION"));
        this.numberOfSpeakers = Double.parseDouble(map.get("NUMBER_OF_SPEAKERS"));
        this.frequencyRange = map.get("FREQUENCY_RANGE");
        this.cordLength = Double.parseDouble(map.get("CORD_LENGTH"));
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public double getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(double numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public String getFrequencyRange() {
        return frequencyRange;
    }

    public void setFrequencyRange(String frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    public double getCordLength() {
        return cordLength;
    }

    public void setCordLength(double cordLength) {
        this.cordLength = cordLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Speakers)) return false;

        Speakers speakers = (Speakers) o;

        if (Double.compare(speakers.getPowerConsumption(), getPowerConsumption()) != 0) return false;
        if (Double.compare(speakers.getNumberOfSpeakers(), getNumberOfSpeakers()) != 0) return false;
        if (Double.compare(speakers.getCordLength(), getCordLength()) != 0) return false;
        return getFrequencyRange().equals(speakers.getFrequencyRange());
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(getPowerConsumption());
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getNumberOfSpeakers());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + getFrequencyRange().hashCode();
        temp = Double.doubleToLongBits(getCordLength());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Speakers{");
        sb.append("powerConsumption=").append(powerConsumption);
        sb.append(", numberOfSpeakers=").append(numberOfSpeakers);
        sb.append(", frequencyRange='").append(frequencyRange).append('\'');
        sb.append(", cordLength=").append(cordLength);
        sb.append('}');
        return sb.toString();
    }
}
