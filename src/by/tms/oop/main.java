package by.tms.oop;

import by.tms.oop.closedFigure.ClosedFigure;
import by.tms.oop.closedFigure.circle.Circle;
import by.tms.oop.closedFigure.rectangle.Rectangle;
import by.tms.oop.closedFigure.square.Square;
import by.tms.oop.closedFigure.trapezoid.Trapezoid;
import by.tms.oop.closedFigure.triangle.Triangle;
import by.tms.oop.notAClosedFigure.brokenLine.BrokenLine;
import by.tms.oop.notAClosedFigure.line.Line;
import by.tms.oop.util.ShapeUtils;

public class main {

    public static void main(String[] args){

        Point ac = new Point(0,0);
        Point bc = new Point(0,20);

        Point ar = new Point(20,20);
        Point br = new Point(30,40);

        Point as = new Point(10,10);
        Point bs = new Point(30,30);

        Point az = new Point(10,10);
        Point bz = new Point(60,10);
        Point cz = new Point(20,40);
        Point dz = new Point(50,40);

        Point at = new Point(10,10);
        Point bt = new Point(50,10);
        Point ct = new Point(30,40);

        Point al = new Point(10,10);
        Point bl = new Point(30,20);

        Point ab = new Point(10,10);
        Point bb = new Point(30,30);
        Point cb = new Point(35,20);
        Point db = new Point(50,40);

        ClosedFigure circle1 = new Circle(ac ,bc);
        ClosedFigure rectangle1 = new Rectangle(ar, br);
        ClosedFigure square1 = new Square(as, bs);
        ClosedFigure trapezoid1 = new Trapezoid(az, bz, cz, dz);
        ClosedFigure triangle1 = new Triangle(at, bt, ct);

        Figure line = new Line(al, bl);
        Figure brokenLine = new BrokenLine(ab, bb, cb, db);

        Circle circle = new Circle(ac, bc);
        Rectangle rectangle = new Rectangle(ar, br);
        Square square = new Square(as, bs);
        Trapezoid trapezoid = new Trapezoid(az, bz, cz, dz);
        Triangle triangle = new Triangle(at, bt, ct);


        System.out.println("square circle = " + circle1.calculateSpace());
        System.out.println("square rectangle = " + rectangle1.calculateSpace());
        System.out.println("square square = " + square1.calculateSpace());
        System.out.println("trapezoid square = " + trapezoid1.calculateSpace());
        System.out.println("triangle square = " + triangle1.calculateSpace());

        System.out.println("perimeter line = " + line.calculatePerimeter());
        System.out.println("perimeter BrokenLine = " + brokenLine.calculatePerimeter());

        System.out.println("radius circle = " + circle.calculateRadius());
        System.out.println("diagonal rectangle = " + rectangle.calculateDiagonal());
        System.out.println("diagonal square = " + square.calculateDiagonalSquare());
        System.out.println("height trapezoid = " + trapezoid.calculateHeight());
        System.out.println("height triangle = " + triangle.calculateHeightTriangle());

        System.out.println("perimeter circle = " + circle.calculatePerimeter());
        System.out.println("perimeter rectangle = " + rectangle.calculatePerimeter());
        System.out.println("perimeter square = " + square.calculatePerimeter());
        System.out.println("perimeter trapezoid = " + trapezoid.calculatePerimeter());
        System.out.println("perimeter triangle = " + triangle.calculatePerimeter());

        System.out.println("circle isRectangle: " + ShapeUtils.isRectangle(circle));
        System.out.println("rectangle isRectangle: " + ShapeUtils.isRectangle(rectangle));
        System.out.println("triangle isRectangle: " + ShapeUtils.isRectangle(triangle));
        System.out.println("square isRectangle: " + ShapeUtils.isRectangle(square));
        System.out.println("trapezoid isRectangle: " + ShapeUtils.isRectangle(trapezoid));
        System.out.println("triangle isTriangle: " + ShapeUtils.isRectangle(triangle));
        System.out.println("circle isTriangle: " + ShapeUtils.isRectangle(circle));
        System.out.println("trapezoid isTriangle: " + ShapeUtils.isRectangle(trapezoid));
        System.out.println("rectangle isTriangle: " + ShapeUtils.isRectangle(rectangle));
        System.out.println("square isTriangle: " + ShapeUtils.isRectangle(square));

        //Если значение 1 значит площадь больше, если -1 то меньше, если 0 то площади равны.
        System.out.println("compare triangle and rectangle: " + triangle.compareSpace(rectangle));
        System.out.println("compare circle and trapezoid: " + circle.compareSpace(trapezoid));
        System.out.println("compare square and circle: " + square.compareSpace(circle));
        System.out.println("compare trapezoid and square: " + trapezoid.compareSpace(square));
        System.out.println("compare rectangle and circle: " + rectangle.compareSpace(circle));
    }
}
