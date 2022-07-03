package by.tms.oop.closedFigure.trapezoid;

import by.tms.oop.Point;
import by.tms.oop.closedFigure.ClosedFigure;

import java.util.Objects;

public class Trapezoid extends ClosedFigure {

    private Point az;
    private Point bz;
    private Point cz;
    private Point dz;

    public Trapezoid (Point az, Point bz, Point cz, Point dz){
        this.az = az;
        this.bz = bz;
        this.cz = cz;
        this.dz = dz;
    }

    @Override
    public double calculateSpace() {
        double h = calculateHeight();
        return ((Math.sqrt((az.getX() - bz.getX()) * (az.getX() - bz.getX()) +
                (az.getY() - bz.getY()) * (az.getY() - bz.getY())))
                + (Math.sqrt((cz.getX() - dz.getX()) * (cz.getX() - dz.getX()) +
                (cz.getY() - dz.getY()) * (cz.getY() - dz.getY()))))/2 * h;
    }

    @Override
    public double calculatePerimeter() {
        return Math.sqrt((az.getX() - bz.getX()) * (az.getX() - bz.getX()) +
                (az.getY() - bz.getY()) * (az.getY() - bz.getY())) +
                Math.sqrt((bz.getX() - dz.getX()) * (bz.getX() - dz.getX()) +
                (bz.getY() - dz.getY()) * (bz.getY() - dz.getY())) +
                Math.sqrt((dz.getX() - cz.getX()) * (dz.getX() - cz.getX()) +
                        (dz.getY() - cz.getY()) * (dz.getY() - cz.getY())) +
                Math.sqrt((cz.getX() - az.getX()) * (cz.getX() - az.getX()) +
                        (cz.getY() - az.getY()) * (cz.getY() - az.getY()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trapezoid trapezoid = (Trapezoid) o;
        return az.equals(trapezoid.az) && bz.equals(trapezoid.bz) && cz.equals(trapezoid.cz) && dz.equals(trapezoid.dz);
    }

    @Override
    public int hashCode() {
        return Objects.hash(az, bz, cz, dz);
    }

    @Override
    public String toString() {
        return "Trapezoid{" +
                "az=" + az +
                ", bz=" + bz +
                ", cz=" + cz +
                ", dz=" + dz +
                '}';
    }

    public double calculateHeight(){
        return (Math.abs(az.getY() - cz.getY()) + Math.abs(bz.getY() - dz.getY()))/2;

    }
}
