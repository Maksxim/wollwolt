package by.tms.collections.work2;

import java.util.Objects;

public class PassengerCar extends Car {

    private int maximumSpeed;

    public PassengerCar(String brand, String model, int yearOfIssue, String enginesType, String color, int maximumSpeed) {
        super(brand, model, yearOfIssue, enginesType, color);
        this.maximumSpeed = maximumSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PassengerCar that = (PassengerCar) o;
        return maximumSpeed == that.maximumSpeed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), maximumSpeed);
    }

    @Override
    public String toString() {
        return  "\n" +
                "PassengerCar{" +
                "maximumSpeed=" + maximumSpeed +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", yearOfIssue=" + getYearOfIssue() +
                ", enginesType='" + getEnginesType() + '\'' +
                ", color='" + getColor() + '\'' +
                '}';


    }
}
