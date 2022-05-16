package it.cs.unicam.pa2022.logo.app;

public class ConcreteCursor implements Cursor<Point<Double>, Direction<Integer>>{
    Plane<Double> plane;
    Point<Double> position;
    Direction<Integer>direction;
    RGB lineColour;
    RGB areaColour;
    double size;
    boolean plot; //indica se la penna durante lo spostamento la penna ha tracciato un segno
    boolean pen; //indica se la penna attualmente sta attaccata al piano o meno


    public ConcreteCursor(){
        this.position = new CartesianPoint(0.0,0.0);
        this.direction = new ConcreteDirection(0);
        this.lineColour = new RGB(0,0,0);
        this.areaColour = new RGB(255,255,255);
        this.size = 1;
        this.plot = true;
        this.pen = true;
    }
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
    public Direction<Integer> getDirection() {
        return direction;
    }

    @Override
    public void setDirection(Direction<Integer> direction) {
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
