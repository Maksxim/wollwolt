package by.tms.oop.closedFigure.square;

import by.tms.oop.Point;
import by.tms.oop.closedFigure.ClosedFigure;

import java.util.Objects;

public class Square extends ClosedFigure {

    private Point as;
    private Point bs;

    public Square (Point as, Point bs){
        this.as = as;
        this.bs = bs;
    }

    @Override
    public double calculateSpace() {
        return Math.abs(as.getX() - bs.getX()) * Math.abs(as.getY() - bs.getY());

    }

    @Override
    public double calculatePerimeter() {
        return Math.abs(as.getY() - bs.getY()) * 4;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return as.equals(square.as) && bs.equals(square.bs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(as, bs);
    }

    @Override
    public String toString() {
        return "Square{" +
                "as=" + as +
                ", bs=" + bs +
                '}';
    }

    public double calculateDiagonalSquare(){
        return Math.sqrt((as.getX() - bs.getX()) * (as.getX() - bs.getX()) +
                (as.getY() - bs.getY()) * (as.getY() - bs.getY()));
    }
}
