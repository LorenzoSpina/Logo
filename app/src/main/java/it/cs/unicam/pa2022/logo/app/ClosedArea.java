package it.cs.unicam.pa2022.logo.app;

import java.util.Deque;

public interface ClosedArea <L extends Line<Point<Double>>> {

    RGB getAreaColour();

    Deque<Line<Point<Double>>> getAreaLines();









}
