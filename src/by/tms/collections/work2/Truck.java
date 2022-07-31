package by.tms.collections.work2;

import java.util.Objects;

public class Truck extends Car {

private int loadCapacity;

    public Truck(String brand, String model, int yearOfIssue, String enginesType, String color, int loadCapacity) {
        super(brand, model, yearOfIssue, enginesType, color);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return loadCapacity == truck.loadCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), loadCapacity);
    }

    @Override
    public String toString() {
        return  "\n" +
                "Truck{" +
                "loadCapacity=" + loadCapacity +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", yearOfIssue=" + getYearOfIssue() +
                ", enginesType='" + getEnginesType() + '\'' +
                ", color='" + getColor() + '\'' +
                '}';
    }
}
