package it.cs.unicam.pa2022.logo.app;



//public class CartesianLine implements Line<Point<Double>> {
public abstract class CartesianLine <C extends Point<? extends Number>> implements Line <C>{

    /*Point<Double> originLinePoint;
    Point<Double> endingLinePoint;
    RGB colour;
    double size;
     */

    private C originLinePoint;
    private C endingLinePoint;
    private RGB colour;
    private double size;

    public CartesianLine(C originLinePoint, C endingLinePoint, RGB colour, double size){
        this.originLinePoint = originLinePoint;
        this.endingLinePoint = endingLinePoint;
        this.colour = colour;
        this.size = size;
    }



    @Override
    public C getOriginLinePoint() {
        return this.originLinePoint;
    }

    @Override
    public C getEndingLinePoint() {
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
