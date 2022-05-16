package it.cs.unicam.pa2022.logo.app;



public class CartesianLine implements Line<Point<Double>> {

    Point<Double> originLinePoint;
    Point<Double> endingLinePoint;
    RGB colour;
    double size;



    public CartesianLine(Point<Double>originLinePoint, Point<Double> endingLinePoint, RGB colour, double size){
        this.originLinePoint = originLinePoint;
        this.endingLinePoint = endingLinePoint;
        this.colour = colour;
        this.size = size;
    }
    @Override
    public Point<Double> getOriginLinePoint() {
        return this.originLinePoint;
    }

    @Override
    public Point<Double> getEndingLinePoint() {
        return endingLinePoint;
    }

    @Override
    public RGB getColour() {
        return this.colour;
    }

    @Override
    public double getSize() {
        return this.size;
    }
}
