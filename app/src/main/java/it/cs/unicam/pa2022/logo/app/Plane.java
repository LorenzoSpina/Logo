package it.cs.unicam.pa2022.logo.app;

import java.util.List;

/**
 * Interface that represents a generic plane
 * @param <C> represents the parametric type for the planes' coordinates
 */

public interface Plane<C> {
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
     * @param cursor
     * @return
     */
    C getCursorPosition(Cursor cursor);

    /**
     * method that returns the plane's colour
     * @return
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

    //Map<> getPlanePoints();

    List<Line> getPlaneLines();

    List<ClosedArea> getClosedAreas();

    /**
     * method that clears the plane
     */
    void cleanAll();

    void addPoint(C point);

    void addLine(Line line);














}
