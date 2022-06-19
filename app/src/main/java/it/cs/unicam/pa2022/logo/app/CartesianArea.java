package it.cs.unicam.pa2022.logo.app;

import java.util.List;
import java.util.Objects;

public abstract class CartesianArea implements ClosedArea<Line<Point>>{
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

    private int getNumberOfComposingLinea(){
       return this.getAreaLines().size();
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CartesianArea that = (CartesianArea) o;
        return Objects.equals(areaColour, that.areaColour) && Objects.equals(composingLines, that.composingLines);
    }

    @Override
    public int hashCode() {
        return Objects.hash(areaColour, composingLines);
    }

    @Override
    public String toString() {
        return "CartesianArea{" +
                "number of Lines=" + this.getNumberOfComposingLinea() +
                "areaColour=" + areaColour.getR() + areaColour.getG() + areaColour.getB() +
                ", composingLines=" + composingLines +
                '}';
    }
}
