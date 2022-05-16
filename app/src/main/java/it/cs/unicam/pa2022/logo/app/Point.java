package it.cs.unicam.pa2022.logo.app;

/**
 * Interface that represents a generic point in the plane
 * @param <N> the type of the point
 */
public interface Point<N extends Number> {

    /**
     * Method that gives the x in the plane
     * @return the x in the plane
     */
    N getX();

    /**
     * Method that gives the y in the plane
     * @return the y in the plane
     */

    N getY();



}
