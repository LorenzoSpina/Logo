package it.cs.unicam.pa2022.logo.app;

//public class ConcreteCursor implements Cursor<Point<Double>, Direction<Integer>>{
//non dovrei definire doubl4 su point e integer su direction poiche la classe astratta è ancora un qualcosa di troppo generico
//public abstract class ConcreteCursor<C extends Point<? extends Number>,D extends Direction<? extends Number>> implements Cursor<C,D>{
public abstract class ConcreteCursor<D extends Direction<? extends Number>> implements Cursor<Point,D>{

    private  Plane<C> plane;
    private Point position;
    private D direction;
    private RGB lineColour;
    private RGB areaColour;
    private double size;
    private boolean plot; //indica se la penna durante lo spostamento la penna ha tracciato un segno
    private boolean pen; //indica se la penna attualmente sta attaccata al piano o meno


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

    public ConcreteCursor(C startingPosition, D startingDirection,
                          RGB startingLineColour, RGB startingAreaColour,double penSize, boolean plot, boolean pen){
        this.position=startingPosition;
        this.direction=startingDirection;
        this.lineColour=startingLineColour;
        this.areaColour=startingAreaColour;
        this.plot=plot;
        this.pen=pen;
    }

    @Override
    public Plane<C> getPlane() {
        return this.plane;
    }

    @Override
    public C getPosition() {
        return position;
    }

    @Override
    public void setPosition(C position) {
        this.position=position;
    }

    @Override
    public D getDirection() {
        return direction;
    }

   @Override
   public void setDirection(D direction){
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

    //metodo che crea una linea ed eventualmente un area chiusa
    public void drawALine(Line<Point<Double>> line){

    }
    private boolean checkIfLineMakesArea(Line<Point<Double>> line){
        /*this.plane.getPlaneLines()
                .stream()
                .filter(x->x.getEndingLinePoint().equals(line.getOriginLinePoint()));

         */
       // this.plane.getPlaneLines().stream().filter(x->x.getEndingLinePoint().equals(line.getOriginLinePoint())).;


        for(Line<Point> l : plane.getPlaneLines()){
            if(l.getOriginLinePoint().equals(line.getEndingLinePoint())){
                return true;
            }
            return false;
        }

       return true;
    }
    //controlla se la linea in questione non sia gia stata usata per generare un altra area
   // private checkIfLineIsAlreadyUsed(Line<Point<Double>> line)
}
