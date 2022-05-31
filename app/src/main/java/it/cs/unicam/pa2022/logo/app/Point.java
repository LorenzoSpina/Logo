package it.cs.unicam.pa2022.logo.app;
//TODO GETCOLOUR
/**
 * Interface that represents a generic point in the plane
 * @param <N> the type of the point
 */
//public interface Point<N extends Number> {
public interface Point{
    /**
     * Method that gives the x in the plane
     * @return the x in the plane
     */
    double getX();

    /**
     * Method that gives the y in the plane
     * @return the y in the plane
     */

    double getY();

    /**
     *Method that returns the status of a point
     * @return the status of a point
     */

    boolean getPointStatus();

    void setPointStatus(boolean pointStatus);




}
