package by.tms.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.util.Objects;

@JsonTypeInfo(use=JsonTypeInfo.Id.CLASS, property = "type1")

public class Device {

    private String id;
    private String name;
    private String origin;
    private int price;
    private String type;
    private String critical;

    public Device(
            @JsonProperty("id") String id,
            @JsonProperty("name") String name,
            @JsonProperty("origin") String origin,
            @JsonProperty("price") int price,
            @JsonProperty("type") String type,
            @JsonProperty("critical")String critical) {
        this.id = id;
        this.name = name;
        this.origin = origin;
        this.price = price;
        this.type = type;
        this.critical = critical;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCritical() {
        return critical;
    }

    public void setCritical(String critical) {
        this.critical = critical;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Device device = (Device) o;
        return price == device.price && Objects.equals(id, device.id) && Objects.equals(name, device.name) && Objects.equals(origin, device.origin) && Objects.equals(type, device.type) && Objects.equals(critical, device.critical);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, origin, price, type, critical);
    }

    @Override
    public String toString() {
        return "Device{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", origin='" + origin + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", critical='" + critical + '\'' +
                '}';
    }
}
