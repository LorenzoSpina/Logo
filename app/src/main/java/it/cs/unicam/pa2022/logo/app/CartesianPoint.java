package it.cs.unicam.pa2022.logo.app;


/**
 *Class that implements a Point using floating numbers
 */
public class CartesianPoint<S> implements Point<Double>{

    private final Double XPoint;
    private final Double YPoint;

    public CartesianPoint(Double XPoint, Double YPoint) {
        this.XPoint = XPoint;
        this.YPoint = YPoint;
    }

    @Override
    /**
     * Method that gives the x in the plane
     * @return the x in the plane
     */
    public Double getX() {
        return this.XPoint;
    }

    @Override
    /**
     * Method that gives the y in the plane
     * @return the y in the plane
     */
    public Double getY() {
        return this.YPoint;
    }
}
