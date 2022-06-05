package it.cs.unicam.pa2022.logo.app;
//TODO COMMENTI


//public interface Cursor<C extends Point<? extends Number>,D extends Direction<? extends Number>>{
public interface Cursor<C extends Point,D extends Direction>{
    /**
     * method that gives back the plane of the cursor associated
     * @return the plane
     */
    Plane<C> getPlane();

    /**
     * method that gives back the coordinates of the cursor
     * @return the coordinates of the cursor
     */
    C getPosition();

    /**
     * method that sets a new position for the cursor
     * @param position the new postion
     */
    void setPosition(C position);

    /**
     * method that gives back the direction of a cursor
     * @return the actual direction
     */
    D getDirection();

    /**
     * method that sets  a new direction for the cursor
     * @param direction the new direction
     */
    void setDirection(D direction);

    /**
     * method that gives back tha actual colour of last line written
     * @return the colour
     */
    RGB getLineColour();

    /**
     * method that sets the new colour of the line
     * @param colour the new colour
     */
    void setLineColour(RGB colour);

    /**
     * method that returns the colour of a closed area
     * @return the colour of the area
     */
    RGB getAreaColour();

    /**
     * method that sets a new colour for an area
     */
    void setAreaColour(RGB colour);

    /**
     * method that returns the actual size of the cursor
     * @return the size
     */
    double getSize();

    /**
     * method that sets the new size of the cursor
     * @param size the new size
     */
    void setSize(double size);

    /**
     * method that permits the cursor to write
     */
    void penDown();

    /**
     * method that permits the cursor not to write
     */
    void penUp();

    /**
     * method that returns true if the cursor has written a line, false in the other way
     * @return true if the cursor has written a line, false in the other way
     */
    boolean getPlot();

    /**
     * method that sets the plot of the cursor
     * @param plot the new plot
     */
    void setPlot(boolean plot);

    /**
     * method that tells if the pen is attached on plane or no
     * @return true if yes, false if no
     */
    boolean pen();

    /**
     * method that moves the cursor on the plane drawing or not a line
     * @param line the line that must be drawn or that just be used for moving without drawing
     */
    public void moveCursor(Line<C>line);

    /**
     * method that draw a line on the plane
     * @param line the line that must be drawn on the plane
     */
    public void drawALine(Line<C> line);












}
