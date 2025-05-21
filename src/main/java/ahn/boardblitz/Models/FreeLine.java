package ahn.boardblitz.Models;

import javafx.scene.paint.Color;

import java.util.List;

public class FreeLine {
    private List<Point> points;
    private double thickness;
    private Color color;
    private StateType stateType = StateType.DRAW;

    public enum StateType {
        DRAW,
        ERASE
    }

    public FreeLine(double thickness, Color color, StateType stateType) {
        this.thickness = thickness;
        this.color = color;
        this.stateType = stateType;
    }

    // getters & setters
    public List<Point> getPoints() { return points; }
    public double getThickness() { return thickness; }
    public Color getColor() { return color; }
    public StateType getStateType() { return stateType; }

    public void setPoints(List<Point> points) { this.points = points; }
    public void setThickness(double thickness) { this.thickness = thickness; }
    public void setColor(Color color) { this.color = color; }
    public void setStateType(StateType stateType) { this.stateType = stateType; }
}
