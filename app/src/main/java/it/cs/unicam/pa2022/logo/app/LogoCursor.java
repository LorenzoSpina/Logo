package it.cs.unicam.pa2022.logo.app;

public class LogoCursor extends ConcreteCursor <Point<Double>,Direction<Integer>>{
    public LogoCursor(Point<Double> startingPosition, Direction<Integer> startingDirection, RGB startingLineColour, RGB startingAreaColour, double penSize, boolean plot, boolean pen) {
        super(startingPosition, startingDirection, startingLineColour, startingAreaColour, penSize, plot, pen);
    }

}
