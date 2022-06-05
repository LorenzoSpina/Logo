package it.cs.unicam.pa2022.logo.app;



//public class CartesianLine implements Line<Point<Double>> {
//public abstract class CartesianLine <C extends Point<? extends Number>> implements Line <C>{
public abstract class CartesianLine<C extends Point> implements Line<Point>{


    private final C originLinePoint;
    private final C endingLinePoint;
    private final RGB colour;
    private final double size;

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
