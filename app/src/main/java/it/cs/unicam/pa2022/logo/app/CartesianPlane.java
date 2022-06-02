package it.cs.unicam.pa2022.logo.app;

import java.util.*;

import java.util.stream.Collectors;

public class CartesianPlane implements Plane<Point>{

    private final double height;
    private final double length;
    private final Point home;
    private final Point origin;
    private RGB planeColour;
    private Map<Point,Boolean> pointsMap;
    private List<Line<Point>> planesLines;
    private List<ClosedArea<Line<Point>>> planesClosedArea; //TODO CLOSED AREA
    private Point cursor;


    public CartesianPlane(double height,double length,Point home,Point origin,RGB startingPlaneColour){
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
    public Point getHome() {
        return this.home;
    }

    @Override
    public Point getOrigin() {
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
    public Point checkIfPointIsNotOutOfBorders(Point point) {
        /*if((point.getX()>this.getLength())||point.getX()<this.getLength())||(point.getY()>this.getHeight()||point.getY()<this.getHeight())){
            return false;
        }
        return true;
         */
        double correctX = point.getX();
        double correctY=point.getY();


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
        Point correctPoint =new CartesianPoint(correctX,correctY);
        return correctPoint;
    }

    @Override
    public Optional<Point> checkIfPointisOnThePlane(Point point) {
        if (!point.getPointStatus()){
            return Optional.empty();
        }
        return Optional.of(point);
    }

    @Override //probabilmente inutile anche questo
    public Map<Point, Boolean> getAllPlanePoints() {
        return this.pointsMap;
    }

    @Override //probabilmente abbastanza inutile
    public List<Point> getPlaneWrittenPoints() {
       return this.pointsMap.keySet().stream().filter(Point::getPointStatus).collect(Collectors.toList());
    }

    @Override
    public List<Line<Point>> getPlaneLines() {
        return this.planesLines;
    }

    @Override
    public List<ClosedArea<Line<Point>>> getClosedAreas() {
        return this.planesClosedArea;
    }

    @Override
    public void cleanAll() {
        this.planesLines.clear();
        this.planesClosedArea.clear();

    }

    @Override
    public void addPoint(Point point) {

        //this.pointsMap.put(point,true);
        this.checkIfPointIsNotOutOfBorders(point);

        if(!point.getPointStatus()){
            point.setPointStatus(true);
            this.getAllPlanePoints().put(point,point.getPointStatus());
        }
        //definito il concetto, pero è  come se disegnassi una linea
        Line<Point> line = new LogoLine(point,point,this.getLineColour(),this.getSize());

        this.getPlaneLines().add(line);
    }

    @Override
    public void addLine(Line<Point> line) {
        this.planesLines.add(line);

    }

    @Override
    public void addClosedArea(ClosedArea area){
        this.planesClosedArea.add(area);

    }



}
