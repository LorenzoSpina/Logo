package it.cs.unicam.pa2022.logo.app;

/**
 * Intrface that represents a line
 * @param <C> the parametric type of the coordinates
 */

public interface Line<C extends Point> {
    /**
     * Method that gives back the origin point of a line
     * @return the origin point of line
     */
    C getOriginLinePoint();

    /**
     * Method that gives back the ending point of a line
     * @return the ending point of a line
     */
    C getEndingLinePoint();

    /**
     * Method that gives back the line's colour
     * @return
     */
    RGB getColour();

    /**
     * Method that gives back the line's size
     * @return
     */
    double getSize();

}
