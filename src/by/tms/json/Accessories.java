package by.tms.json;

import java.util.List;
import java.util.Objects;

public class Accessories {

    private List<Device> devices;

    public Accessories(){}

    public Accessories(List<Device> devices) {
        this.devices = devices;
    }

    public List<Device> getDevices() {
        return devices;
    }

    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Accessories that = (Accessories) o;
        return Objects.equals(devices, that.devices);
    }

    @Override
    public int hashCode() {
        return Objects.hash(devices);
    }

    @Override
    public String toString() {
        return "Accessories{" +
                "devices=" + devices +
                '}';
    }
}
