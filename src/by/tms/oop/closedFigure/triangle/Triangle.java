package by.tms.oop.closedFigure.triangle;

import by.tms.oop.Point;
import by.tms.oop.closedFigure.ClosedFigure;

import java.util.Objects;

public class Triangle extends ClosedFigure {

    private Point at;
    private Point bt;
    private Point ct;

    public Triangle(Point at, Point bt, Point ct){
        this.at = at;
        this.bt = bt;
        this.ct = ct;
    }

    @Override
    public double calculateSpace() {
        double h = calculateHeightTriangle();
        return Math.sqrt((at.getX() - bt.getX()) * (at.getX() - bt.getX()) +
                (at.getY() - bt.getY()) * (at.getY() - bt.getY())) * h * 0.5;

    }

    @Override
    public double calculatePerimeter() {
        return Math.sqrt((at.getX() - bt.getX()) * (at.getX() - bt.getX()) +
                (at.getY() - bt.getY()) * (at.getY() - bt.getY())) +
                Math.sqrt((bt.getX() - ct.getX()) * (bt.getX() - ct.getX()) +
                (bt.getY() - ct.getY()) * (bt.getY() - ct.getY())) +
                Math.sqrt((ct.getX() - at.getX()) * (ct.getX() - at.getX()) +
                (ct.getY() - at.getY()) * (ct.getY() - at.getY()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return at.equals(triangle.at) && bt.equals(triangle.bt) && ct.equals(triangle.ct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(at, bt, ct);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "at=" + at +
                ", bt=" + bt +
                ", ct=" + ct +
                '}';
    }

    public double calculateHeightTriangle(){
        return (Math.abs(at.getY() - ct.getY()) + Math.abs(bt.getY() - ct.getY()))/2;

    }
}
