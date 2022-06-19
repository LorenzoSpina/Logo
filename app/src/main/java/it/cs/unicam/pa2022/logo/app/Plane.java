package it.cs.unicam.pa2022.logo.app;


import java.util.List;
import java.util.Map;




/**
 * Interface that represents a generic plane
 * @param <C> represents the parametric type for the planes' coordinates
 */

public interface Plane<C extends Point>{
    /**
     * Method that gives back the height of the plane
     *
     * @return the height of the plane
     */
    double getHeight();

    /**
     * Method that gives back the length of the plane
     *
     * @return the length of the plane
     */
    double getLength();


    /**
     * Method that gives back the coordinates of the Home(b/2),(h/2)
     *
     * @return the Home's coordinates
     */
    C getHome();

    /**
     * Method that gives back the coordinates of Origin(0,0)
     *
     * @return the Origin's coordinates
     */
    C getOrigin();



    /**
     * method that returns the plane's colour
     *
     * @return the colour of the plane
     */
    RGB getPlaneColour();

    /**
     * method that sets the new colour for a plane
     *
     * @param colour the new colour
     */
    void setPlaneColour(RGB colour);

    /**
     * method that checks if a point is on a plane
     *
     * @param point the point that we want to check if is on plane
     * @return return the point if it is written
     */


    /**
     * method that checks if the point is not out of range og the borders
     * @param point we want to check
     * @return true if it is in range, in other way false
     */
    C checkIfPointIsNotOutOfBorders(C point);


    /**
     * method that returns all the points of the plane
     *
     * @return the points of the plane
     */


    /**
     * method that returns all the written points
     *
     * @return the written points
     */



    List<Line<C>> getPlaneLines();


    List<ClosedArea<Line<C>>> getClosedAreas();

    /**
     * method that clears the plane
     */
    void cleanAll();

    /**
     * method that add a point on the plane
     *
     * @param point the point that must be added on the plane
     */


    /**
     * method that add a line on the plane
     *
     * @param line the line that must be added on the plane
     */
    void addLine(Line<C> line);

    /**
     * method that add an area on the plane
     * @param area the are that must be added on the plane
     */
    void addClosedArea(ClosedArea<Line<C>> area);


    void checkIfLineIsNotOutOfBorder(Line<C>line);



}
