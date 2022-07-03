package by.tms.oop.closedFigure;

import by.tms.oop.Figure;

public abstract class ClosedFigure implements Figure {

    public abstract double calculateSpace();
    public int compareSpace(ClosedFigure figure) {
        double space = this.calculateSpace();
        double otherSpace = figure.calculateSpace();
        if(space == otherSpace){
            return 0;
        }
        else if(space < otherSpace) {
            return -1;
        }
        else {
            return 1;
        }

    }
}
