package it.cs.unicam.pa2022.logo.app;

import java.util.List;

public class CartesianArea<L extends Line<Point>> implements ClosedArea<Line<Point>>{
    //public abstract class CartesianArea<C extends Point> implements ClosedArea<Point>{

    private final RGB areaColour;
    private final List<Line<Point>>composingLines;

    public CartesianArea(RGB areaColour, List<Line<Point>> composingLines){
        this.areaColour=areaColour;
        this.composingLines=composingLines;
    }
    @Override
    public RGB getAreaColour() {
        return this.areaColour;
    }

    @Override
    public List<Line<Point>> getAreaLines() {
        return this.composingLines;
    }
}
