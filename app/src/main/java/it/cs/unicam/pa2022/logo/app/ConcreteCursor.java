package it.cs.unicam.pa2022.logo.app;


import java.util.List;


//public class ConcreteCursor implements Cursor<Point<Double>, Direction<Integer>>{
//non dovrei definire doubl4 su point e integer su direction poiche la classe astratta è ancora un qualcosa di troppo generico

public abstract class ConcreteCursor implements Cursor<Point,Direction>{

    private  Plane<Point> plane;
    private Point position;
    private Direction direction;
    private RGB lineColour;
    private RGB areaColour;
    private double size;
    private boolean plot; //indica se la penna durante lo spostamento la penna ha tracciato un segno
    private boolean pen; //indica se la penna attualmente sta attaccata al piano o meno
    private List<Line<Point>> buildingArea;


   /*
   public ConcreteCursor(Plane plane){
        this.plane=plane;
        this.position = new CartesianPoint<Double>(plane.getLength()/2,plane.getHeight()/2);
        this.direction = new ConcreteDirection(0);
        this.lineColour = new RGB(0,0,0);
        this.areaColour = new RGB(255,255,255);
        this.size = 1;
        this.plot = true;
        this.pen = true;
    }

    */

    /*public ConcreteCursor(Plane<Point<Double>> plane){
        if(plane==null){
            throw new IllegalArgumentException("The plane does not exist!");
        }
        this.plane = plane;
        if(plane.getPlaneCursor()==null){
            throw new NullPointerException("The plane cursor does not exist!");
        }
        this.position=plane.getPlaneCursor().getPosition();
        this.direction=plane.getPlaneCursor().getDirection();
        this.lineColour=plane.getPlaneCursor().getLineColour();
        this.areaColour=plane.getPlaneCursor().getAreaColour();
        this.size=plane.getPlaneCursor().getSize();
        this.plot=plane.getPlaneCursor().getPlot();
        this.pen=plane.getPlaneCursor().pen(); }

     */

    public ConcreteCursor(Plane<Point>plane){
        this.position= new CartesianPoint(plane.getLength()/2,plane.getHeight()/2);
        this.direction= new ConcreteDirection(0);
        this.lineColour= new RGB(0,0,0);
        this.areaColour= new RGB(255,255,255);
        this.plot= true;
        this.pen= true;
    }

    @Override
    public Plane<Point> getPlane() {
        return this.plane;
    }

    @Override
    public Point getPosition() {
        return position;
    }

    @Override
    public void setPosition(Point position) {
        this.position=position;
    }

    @Override
    public Direction getDirection() {
        return direction;
    }

   @Override
   public void setDirection(Direction direction){
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
    public void setPlot(boolean plot) {this.plot=plot;}

    @Override
    public boolean pen() {
        return this.pen=true;
    }

    @Override
    public void moveCursor(Line<Point>line){
        if(pen){
            this.drawALine(line);
            this.setPosition(line.getEndingLinePoint());
            this.setPlot(true);
        }
        this.plane.checkIfLineIsNotOutOfBorder(line);
        this.setPosition(line.getEndingLinePoint());
        this.setPlot(false);

    }


    //TODO METTERE IN INTERFACCIA E FARE CONTROLLI, Probabile che non serva
    //metodo che disegna un punto
    public void draw(Point p){
        this.plane.checkIfPointIsNotOutOfBorders(p);

        if(!p.getPointStatus()){
            p.setPointStatus(true);
            this.plane.getAllPlanePoints().put(p,p.getPointStatus());
        }
        //definito il concetto, pero è  come se disegnassi una linea
        Line<Point> line = new LogoLine(p, p, this.getLineColour(), this.getSize()) {
        };

        this.plane.getPlaneLines().add(line);
    }
    //TODO METTERE IN INTERFACCIA E FARE CONTROLLI

    @Override
    public void drawALine(Line<Point> line){
        this.plane.checkIfLineIsNotOutOfBorder(line);

        if(checkIfLineMakesArea(line)){
            if(!this.checkIfLineIsAlreadyUsed(line)){
                this.plane.addLine(line);
                this.buildingArea.add(line);
                ClosedArea<Line<Point>> area= new LogoArea(this.getAreaColour(),this.buildingArea);
                this.plane.addClosedArea(area);
                this.buildingArea.clear();
            }
        }
        this.plane.addLine(line);
        this.buildingArea.add(line);
    }

    private boolean checkIfLineMakesArea(Line<Point> line){

        return this.plane.getPlaneLines()
                .stream()
                .anyMatch(x->x.getOriginLinePoint().equals(line.getEndingLinePoint()));
    }

    private boolean checkIfLineIsAlreadyUsed(Line<Point> line){
         return this.plane.getClosedAreas()
                 .stream()
                 .anyMatch(x->x.getAreaLines().contains(line));
         }


}
