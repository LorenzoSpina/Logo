package it.cs.unicam.pa2022.logo.app;

import java.util.List;

public class LogoArea extends CartesianArea<Line<Point>>{
    public LogoArea(RGB areaColour, List<Line<Point>> composingLines) {
        super(areaColour, composingLines);
    }
}
