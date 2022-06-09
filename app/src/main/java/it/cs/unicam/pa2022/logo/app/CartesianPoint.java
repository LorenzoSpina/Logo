package it.cs.unicam.pa2022.logo.app;


import java.util.Objects;

/**
 *Class that implements a Point using floating numbers
 */
//TODO point è abstract?
//public class CartesianPoint <D extends Number> implements Point<D>{
public class CartesianPoint implements Point{

    private final double XPoint;
    private final double YPoint;

    public CartesianPoint(double XPoint, double YPoint) {
        this.XPoint = XPoint;
        this.YPoint = YPoint;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CartesianPoint that = (CartesianPoint) o;
        return Double.compare(that.XPoint, XPoint) == 0 && Double.compare(that.YPoint, YPoint) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(XPoint, YPoint);
    }
}
