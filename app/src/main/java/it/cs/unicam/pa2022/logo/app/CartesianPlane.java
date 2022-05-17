package it.cs.unicam.pa2022.logo.app;

import java.util.Map;
import java.util.Queue;

public class CartesianPlane <S> implements Plane<Point<Double>,S>{

    private final double height;
    private final double length;
    private final Point<Double> home;
    private final Point<Double> origin;
    private final Cursor<Point<Double>,Direction<Integer>> cursor;
    private RGB planeColour;
    private Map<Point<Double>,S> pointsMap;
    private Queue<Line<Point<Double>>> planesLines;
    private Queue<Line<Point<Double>>> planesClosedArea;



    public CartesianPlane(double height,double length,Point home,Point origin, Cursor cursor){
        this.height=height;
        this.length=length;
        this.home=this.getHome();
        this.origin=this.getOrigin();
        this.cursor=this.getCursorPosition();
        this.planeColour=new RGB(255,255,255);

    }



    @Override
    public double getHeight() {
        return 0;
    }

    @Override
    public double getLength() {
        return 0;
    }

    @Override
    public Point<Double> getHome() {
        return null;
    }

    @Override
    public Point<Double> getOrigin() {
        return null;
    }

    @Override
    public Cursor getCursorPosition() {
        return null;
    }


    @Override
    public RGB getPlaneColour() {
        return null;
    }

    @Override
    public void setPlaneColour(RGB colour) {

    }

    @Override
    public boolean checkIfPointisOnThePlane(Point<Double> point) {
        return false;
    }

    @Override
    public Map<Point<Double>, S> getAllPlanePoints() {
        return null;
    }

    @Override
    public Map<Point<Double>, S> getPlaneWrittenPoints() {
        return null;
    }

    @Override
    public Queue<Line<Point<Double>>> getPlaneLines() {
        return null;
    }

    @Override
    public Queue<ClosedArea> getClosedAreas() {
        return null;
    }

    @Override
    public void cleanAll() {

    }

    @Override
    public void addPoint(Point<Double> point) {

    }

    @Override
    public void addLine(Line line) {

    }
}
