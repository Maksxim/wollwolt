package by.tms.oop.closedFigure.circle;

import by.tms.oop.Point;
import by.tms.oop.closedFigure.ClosedFigure;
import by.tms.oop.closedFigure.square.Square;

import java.util.Objects;

public class Circle extends ClosedFigure {

    private Point ac;
    private Point bc;
    public Circle(Point ac, Point bc){
        this.ac = ac;
        this.bc = bc;
    }
    @Override
    public double calculateSpace() {
        double r = calculateRadius();
        return 3.1416 * r * r;
    }

    @Override
    public double calculatePerimeter() {
        double r = calculateRadius();
        return 3.1416 * 2 * r;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return ac.equals(circle.ac) && bc.equals(circle.bc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ac, bc);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "ac=" + ac +
                ", bc=" + bc +
                '}';
    }

    public double calculateRadius(){
         return Math.sqrt((ac.getX() - bc.getX()) * (ac.getX() - bc.getX()) +
                (ac.getY() - bc.getY()) * (ac.getY() - bc.getY()));

    }

}
