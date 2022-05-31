package it.cs.unicam.pa2022.logo.app;

import java.util.*;

import java.util.stream.Collectors;

public class CartesianPlane implements Plane<Point<Double>>{

    private final double height;
    private final double length;
    private final Point<Double> home;
    private final Point<Double> origin;
    private RGB planeColour;
    private Map<Point<Double>,Boolean> pointsMap;
    private List<Line<Point<Double>>> planesLines;
    private List<Line<Point<Double>>> planesClosedArea; //TODO CLOSED AREA



    public CartesianPlane(double height,double length,Point<Double> home,Point<Double> origin,RGB startingPlaneColour){
        if(height < 1) {throw new IllegalArgumentException("Insert a bigger height!");}
        this.height=height;

        if(length < 1) {throw new IllegalArgumentException("Insert a bigger length!");}
        this.length=length;

        if (home == null) {throw new NullPointerException("Home does not exist!");}
        this.home = home;

        if(origin == null){throw new NullPointerException("Origin does not exist!");}
        this.origin= origin;

        this.planeColour=startingPlaneColour;

       this.pointsMap = new HashMap<>();
       this.planesLines=new ArrayList<>();
       this.planesClosedArea=new ArrayList<>();
    }



    @Override
    public double getHeight() {

        return this.height;
    }

    @Override
    public double getLength(){
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
    public RGB getPlaneColour() {
        return this.planeColour;
    }

    @Override
    public void setPlaneColour(RGB colour) {
        this.planeColour=colour;
    }

    @Override
    public boolean checkIfPointIsNotOutOfBorders(Point<Double> point) {
        /*if((point.getX()>this.getLength())||point.getX()<this.getLength())||(point.getY()>this.getHeight()||point.getY()<this.getHeight())){
            return false;
        }
        return true;
         */
        Double correctX = point.getX();
        Double correctY = point.getY();


        if(point.getX()>this.getLength()){
            correctX=this.length;
        }
        if(point.getX()<this.getLength()){
            correctX=0.0;
        }
        if(point.getX()>this.getLength()){
            correctY=this.height;
        }
        if(point.getX()<this.getLength()){
            correctY=0.0;
        }
        return false;
    }

    @Override
    public Optional<Point<Double>> checkIfPointisOnThePlane(Point<Double> point) {
        if (!point.getPointStatus()){
            return Optional.empty();
        }
        return Optional.of(point);
    }

    @Override //probabilmente inutile anche questo
    public Map<Point<Double>, Boolean> getAllPlanePoints() {
        return this.pointsMap;
    }

    @Override //probabilmente abbastanza inutile
    public List<Point<Double>> getPlaneWrittenPoints() {
       return this.pointsMap.keySet().stream().filter(Point::getPointStatus).collect(Collectors.toList());
    }

    @Override
    public List<Line<Point<Double>>> getPlaneLines() {
        return this.planesLines;
    }

    @Override
    public List<ClosedArea> getClosedAreas() {
        return this.planesClosedArea;
    }

    @Override
    public void cleanAll() {
        this.planesLines.clear();
        this.planesClosedArea.clear();

    }

    @Override
    public void addPoint(Point<Double> point) {

        //this.pointsMap.put(point,true);
        this.checkIfPointIsNotOutOfBorders(point);

        if(!point.getPointStatus()){
            point.setPointStatus(true);
            this.getAllPlanePoints().put(point,point.getPointStatus());
        }
        //definito il concetto, pero è  come se disegnassi una linea
        Line<C> line = new LogoLine(point,point,this.getLineColour(),this.getSize());

        this.plane.getPlaneLines().add(line);
    }

    @Override
    public void addLine(Line<Point<Double>> line) {
        this.planesLines.add(line);

    }

    @Override
    public void addClosedArea(ClosedArea area){
        this.planesClosedArea.add(area);

    }



}
