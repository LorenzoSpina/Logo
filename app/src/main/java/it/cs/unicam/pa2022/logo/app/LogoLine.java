package it.cs.unicam.pa2022.logo.app;

public class LogoLine extends CartesianLine<Point<Double>>{
    public LogoLine(Point<Double> originLinePoint, Point<Double> endingLinePoint, RGB colour, double size) {
        super(originLinePoint, endingLinePoint, colour, size);
    }
}
