package it.cs.unicam.pa2022.logo.app;

public class ConcreteDirection implements Direction{

    private int angle;

    public ConcreteDirection(Integer angle){
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
}
