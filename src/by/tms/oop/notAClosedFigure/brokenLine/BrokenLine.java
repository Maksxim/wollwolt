package by.tms.oop.notAClosedFigure.brokenLine;

import by.tms.oop.Figure;
import by.tms.oop.Point;

import java.util.Objects;

public class BrokenLine implements Figure {

    private Point ab;
    private Point bb;
    private Point cb;
    private Point db;

    public BrokenLine (Point ab, Point bb, Point cb, Point db){
        this.ab = ab;
        this.bb = bb;
        this.cb = cb;
        this.db = db;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BrokenLine that = (BrokenLine) o;
        return Objects.equals(ab, that.ab) && Objects.equals(bb, that.bb) && Objects.equals(cb, that.cb) && Objects.equals(db, that.db);
    }

    @Override
    public String toString() {
        return "BrokenLine{" +
                "ab=" + ab +
                ", bb=" + bb +
                ", cb=" + cb +
                ", db=" + db +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(ab, bb, cb, db);
    }

    @Override
    public double calculatePerimeter() {
        return Math.sqrt((ab.getX() - bb.getX()) * (ab.getX() - bb.getX()) +
                (ab.getY() - bb.getY()) * (ab.getY() - bb.getY())) +
                Math.sqrt((bb.getX() - cb.getX()) * (bb.getX() - cb.getX()) +
                        (bb.getY() - cb.getY()) * (bb.getY() - cb.getY())) +
                Math.sqrt((cb.getX() - db.getX()) * (cb.getX() - db.getX()) +
                        (cb.getY() - db.getY()) * (cb.getY() - db.getY()));
    }
}
