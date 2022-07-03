package by.tms.oop.notAClosedFigure.line;

import by.tms.oop.Figure;
import by.tms.oop.Point;

import java.util.Objects;

public class Line implements Figure {

    private Point al;
    private Point bl;

    public Line (Point al, Point bl) {
     this.al = al;
     this.bl = bl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return al.equals(line.al) && bl.equals(line.bl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(al, bl);
    }

    @Override
    public String toString() {
        return "Line{" +
                "al=" + al +
                ", bl=" + bl +
                '}';
    }

    @Override
    public double calculatePerimeter() {
        return Math.sqrt((al.getX() - bl.getX()) * (al.getX() - bl.getX()) +
                (al.getY() - bl.getY()) * (al.getY() - bl.getY()));

    }
}
