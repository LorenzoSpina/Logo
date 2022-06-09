package it.cs.unicam.pa2022.logo.app;

import java.util.Objects;

public class ConcreteDirection implements Direction{

    private int angle;

    public ConcreteDirection(int angle){
        checkIfAngleIsValid(angle);
        this.angle=angle;
    }

    @Override
    public int getDirection() {
        return this.angle;
    }

    @Override
    public void setDirection(int angle) {
        checkIfAngleIsValid(angle);
        this.angle=angle;

    }

    private void checkIfAngleIsValid(int angle){
        if(angle<0 || angle>360){
            throw new IllegalArgumentException("The angle is out of range!");
        }

    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConcreteDirection that = (ConcreteDirection) o;
        return angle == that.angle;
    }

    @Override
    public int hashCode() {
        return Objects.hash(angle);
    }
}
