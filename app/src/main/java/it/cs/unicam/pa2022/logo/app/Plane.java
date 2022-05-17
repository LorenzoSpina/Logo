package it.cs.unicam.pa2022.logo.app;


import java.util.Map;
import java.util.Queue;


/**
 * Interface that represents a generic plane
 * @param <C> represents the parametric type for the planes' coordinates
 */

public interface Plane<C extends Point<? extends Number>,S> {
    /**
     * Method that gives back the height of the plane
     * @return the height of the plane
     */
    double getHeight();

    /**
     * Method that gives back the length of the plane
     * @return the length of the plane
     */
    double getLength();

    /**
     * Method that gives back the coordinates of the Home(b/2)(h/2)
     * @return the Home's coordinates
     */
    C getHome();

    /**
     * Method that gives back the coordinates of Origin(0,0)
     * @return the Origin's coordinates
     */
    C getOrigin();

    /**
     * Method that gives back the coordinates of the cursor on the plane
     * @return
     */
    Cursor getCursorPosition();

    /**
     * method that returns the plane's colour
     * @return the colour of the plane
     */
    RGB getPlaneColour();

    /**
     * method that sets the new colour for a plane
     * @param colour the new colour
     */
    void setPlaneColour(RGB colour);

    /**
     * method that check if a point is on a plane
     * @param point the point that we want to check if is on plane
     * @return true if present, false if not
     */
    boolean checkIfPointisOnThePlane(C point);

    /**
     * method that returns all the points of the plane
     * @return the points of the plane
     */
    Map<C,S> getAllPlanePoints();

    /**
     * method that returns all the written points
     * @return the written points
     */
    Map<C,S> getPlaneWrittenPoints();


    Queue<Line<C>> getPlaneLines();
//TODO TIPO DI CLOSED AREA
    Queue<ClosedArea> getClosedAreas();

    /**
     * method that clears the plane
     */
    void cleanAll();

    /**
     * method that add a point on the plane
     * @param point the point that must be added on the plane
     */
    void addPoint(C point);

    /**
     * method that add a line on the plane
     * @param line the line that must be added on the plane
     */
    void addLine(Line line);














}
