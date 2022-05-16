package it.cs.unicam.pa2022.logo.app;

/**
 *
 *
 */
public interface Direction<D extends Number>{
    /**
     * Method that gives back the direction of the object
     * @return the object's direction
     */
    D getDirection();

    /**
     * Method that set a direction of an object
     * @param angle the direction to set
     */
    void setDirection(D angle);
}
