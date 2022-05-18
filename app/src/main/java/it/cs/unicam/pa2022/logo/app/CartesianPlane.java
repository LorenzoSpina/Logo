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
        this.home= new CartesianPoint(length/2,height/2)
        this.origin=new CartesianPoint(0.0,0.0);
        this.cursor=cursor;
        this.planeColour=new RGB(255,255,255);


    }



    @Override
    public double getHeight() {
        return this.height;
    }

    @Override
    public double getLength() {
        return this.length;
    }

    @Override
    public Point<Double> getHome() {
        return this.home;
    }

    @Override
    public Point<Double> getOrigin() {
        return this.origin;
    }

    @Override
    public Cursor getPlaneCursor() {
        return this.cursor;}


    @Override
    public RGB getPlaneColour() {
        return this.planeColour;
    }

    @Override
    public void setPlaneColour(RGB colour) {
        this.planeColour=colour;
    }

    @Override
    public boolean checkIfPointisOnThePlane(Point<Double> point) {
        return  ;
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
