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
}
