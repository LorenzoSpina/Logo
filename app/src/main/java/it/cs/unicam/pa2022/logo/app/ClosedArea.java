package it.cs.unicam.pa2022.logo.app;


import java.util.List;

/**
 * Interface that represents a closed area
 * @param <L> the closed area is parametrized by a Line
 */
public interface ClosedArea <L> {
//public interface ClosedArea<C>
    /**
     * methode that returns the colour of an area
     * @return the area colour
     */
    RGB getAreaColour();

    /**
     * method that returns the lines that compose an area
     * @return the lines that compose the area
     */
    List<L> getAreaLines();









}
