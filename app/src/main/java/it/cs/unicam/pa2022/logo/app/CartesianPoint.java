package it.cs.unicam.pa2022.logo.app;


/**
 *Class that implements a Point using floating numbers
 */
//TODO point è abstract?
//public class CartesianPoint <D extends Number> implements Point<D>{
public class CartesianPoint implements Point{

    private final double XPoint;
    private final double YPoint;
    private boolean pointStatus;

    public CartesianPoint(double XPoint, double YPoint) {
        this.XPoint = XPoint;
        this.YPoint = YPoint;
        this.pointStatus=false;
    }

    @Override
    /**
     * Method that gives the x in the plane
     * @return the x in the plane
     */
    public double getX() {
        return this.XPoint;
    }

    @Override
    /**
     * Method that gives the y in the plane
     * @return the y in the plane
     */
    public double getY() {
        return this.YPoint;
    }

    @Override
    public boolean getPointStatus() {
        return this.pointStatus;
    }

    @Override
    public void setPointStatus(boolean pointStatus) {
        this.pointStatus=pointStatus;


    }
}
