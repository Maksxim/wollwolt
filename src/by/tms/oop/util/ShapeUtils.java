package by.tms.oop.util;

import by.tms.oop.Figure;
import by.tms.oop.closedFigure.rectangle.Rectangle;
import by.tms.oop.closedFigure.triangle.Triangle;

public final class ShapeUtils {

    private ShapeUtils(){}

    public static boolean isRectangle(Figure figure){
         return figure instanceof Rectangle;

    }
    public static boolean isTriangle(Figure figure) {
         return figure instanceof Triangle;
    }
}
