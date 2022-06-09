package it.cs.unicam.pa2022.logo.app;

import org.w3c.dom.css.RGBColor;

import java.util.*;
import java.util.stream.Collectors;

public abstract class CartesianPlane implements Plane<Point>{

    private final double height;
    private final double length;
    private final Point home;
    private final Point origin;
    private RGB planeColour;
    private final Map<Point,Boolean> pointsMap;
    private final List<Line<Point>> planesLines;
    private final List<ClosedArea<Line<Point>>> planesClosedArea;



    public CartesianPlane(double height,double length){
        if(height < 1) {throw new IllegalArgumentException("Insert a bigger height!");}
        this.height=height;

        if(length < 1) {throw new IllegalArgumentException("Insert a bigger length!");}
        this.length=length;

        this.home = new CartesianPoint(this.getLength()/2,this.height/2);

        this.origin= new CartesianPoint(0,0);

        this.planeColour=new RGB(255,255,255);

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
        if(point==null){
            throw new NullPointerException("Point does not exist!");
        }

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
        //TODO correctPoint
        return new CartesianPoint(correctX,correctY);
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
        //TODO CANCELLARE
        //definito il concetto, pero è  come se disegnassi una linea
       // Line<Point> line = new LogoLine(point,point,this.getLineColour(),this.getSize());

       // this.getPlaneLines().add(line);
    }

    @Override
    public void addLine(Line<Point> line) {
        if(line==null){
            throw new NullPointerException("Line does not exist!");
        }
        this.planesLines.add(line);

    }

    @Override
    public void addClosedArea(ClosedArea<Line<Point>> area){
        this.planesClosedArea.add(area);

    }

    @Override
    public void checkIfLineIsNotOutOfBorder(Line<Point> line) {
        this.checkIfPointIsNotOutOfBorders(line.getOriginLinePoint());
        this.checkIfPointIsNotOutOfBorders(line.getEndingLinePoint());
    }


}
