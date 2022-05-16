package it.cs.unicam.pa2022.logo.app;

public class ConcreteCursor implements Cursor<Point<Double>, ConcreteDirection>{

    Point<Double> position;
    ConcreteDirection direction;
    RGB lineColour;
    RGB areaColour;
    double size;
    boolean plot; //indica se la penna durante lo spostamento la penna ha tracciato un segno
    boolean pen; //indica se la penna attualmente sta attaccata al piano o meno

    @Override
    public Plane getPlane() {
        return null;
    }

    @Override
    public Point<Double> getPosition() {
        return position;
    }

    @Override
    public void setPosition(Point<Double> position) {
        this.position=position;

    }

    @Override
    public ConcreteDirection getDirection() {
        return direction;
    }

    @Override
    public void setDirection(ConcreteDirection direction) {
        this.direction=direction;

    }

    @Override
    public RGB getLineColour() {
        return this.lineColour;
    }

    @Override
    public void setLineColour(RGB colour) {
        this.lineColour=colour;
    }

    @Override
    public RGB getAreaColour() {
        return this.areaColour;
    }

    @Override
    public void setAreaColour(RGB colour) {
        this.areaColour=colour;
    }

    @Override
    public double getSize() {
        return this.size;
    }

    @Override
    public void setSize(double size) {
        this.size=size;
    }

    @Override
    public void penDown() {
        this.pen=true;

    }

    @Override
    public void penUp() {
        this.pen=false;
    }

    @Override
    public boolean getPlot() {
        return this.plot;
    }

    @Override
    public void setPlot(boolean plot) {
        this.plot=plot;

    }

    @Override
    public boolean pen() {
        return this.pen=true;
    }
}
