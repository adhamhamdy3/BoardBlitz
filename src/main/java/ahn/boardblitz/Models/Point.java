package ahn.boardblitz.Models;

import javafx.scene.paint.Color;

public class Point {
    private double x;
    private double y;
    private Color color;

    public Point(double x, double y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    // getters & setters
    public double getX() { return x; }
    public double getY() { return y; }
    public Color getColor() { return color; }

    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }
    public void setColor(Color color) { this.color = color; }
}
