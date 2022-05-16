package it.cs.unicam.pa2022.logo.app;

public class ConcreteDirection implements Direction<Integer>{

    private Integer angle;

    public ConcreteDirection(Integer angle){
        checkIfAngleIsValid(angle);
        this.angle=angle;
    }

    @Override
    public  Integer getDirection() {
        return this.angle;
    }

    @Override
    public void setDirection(Integer angle) {
        checkIfAngleIsValid(angle);
        this.angle=angle;

    }

    private void checkIfAngleIsValid(Integer angle){
        if(angle<0 || angle>360){
            throw new IllegalArgumentException("The angle is out of range!");
        }
    }
}
