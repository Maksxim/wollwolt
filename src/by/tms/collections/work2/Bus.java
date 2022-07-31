package by.tms.collections.work2;

import java.util.Objects;

public class Bus extends Car {

    private int numberOfSeats;

    public Bus(String brand, String model, int yearOfIssue, String enginesType, String color, int numberOfSeats) {
        super(brand, model, yearOfIssue, enginesType, color);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bus bus = (Bus) o;
        return numberOfSeats == bus.numberOfSeats;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfSeats);
    }

    @Override
    public String toString() {
        return  "\n" +
                "Bus{" +
                "numberOfSeats=" + numberOfSeats +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", yearOfIssue=" + getYearOfIssue() +
                ", enginesType='" + getEnginesType() + '\'' +
                ", color='" + getColor() + '\'' +
                '}';
    }
}
