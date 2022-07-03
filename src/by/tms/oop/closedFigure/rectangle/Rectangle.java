package by.tms.oop.closedFigure.rectangle;

import by.tms.oop.Point;
import by.tms.oop.closedFigure.ClosedFigure;

import java.util.Objects;

public class Rectangle extends ClosedFigure {

    private Point ar;
    private Point br;

    public Rectangle(Point ar, Point br){
        this.ar = ar;
        this.br = br;
    }
    public Rectangle(){}

    @Override
    public double calculateSpace() {
        return Math.abs(ar.getX() - br.getX()) * Math.abs(ar.getY() - br.getY());

    }

    @Override
    public double calculatePerimeter() {
        return (Math.abs(ar.getX() - br.getX()) + Math.abs(ar.getY() - br.getY())) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "ar=" + ar +
                ", br=" + br +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return ar.equals(rectangle.ar) && br.equals(rectangle.br);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ar, br);
    }

    public double calculateDiagonal(){
         return Math.sqrt((ar.getX() - br.getX()) * (ar.getX() - br.getX()) +
                (ar.getY() - br.getY()) * (ar.getY() - br.getY()));

    }
}
