package by.tms.collections.work2;

import java.util.Objects;

public abstract class Car {

    private String brand;
    private String model;
    private int yearOfIssue;
    private String enginesType;
    private String color;

    public Car(String brand, String model, int yearOfIssue, String enginesType, String color) {
        this.brand = brand;
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.enginesType = enginesType;
        this.color = color;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return yearOfIssue == car.yearOfIssue && Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && Objects.equals(enginesType, car.enginesType) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, yearOfIssue, enginesType, color);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                ", enginesType='" + enginesType + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public String getEnginesType() {
        return enginesType;
    }

    public void setEnginesType(String enginesType) {
        this.enginesType = enginesType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
