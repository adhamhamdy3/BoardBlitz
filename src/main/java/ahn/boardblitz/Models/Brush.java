package ahn.boardblitz.Models;

import javafx.scene.paint.Color;

public class Brush {
    private double radius = 2.0;
    private Color color = Color.BLACK;
    private boolean eraserMode = false;

    // getters & setters
    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }

    public Color getColor() { return color; }
    public void setColor(Color color) { this.color = color; }

    public boolean isEraserMode() { return eraserMode; }
    public void setEraserMode(boolean eraserMode) { this.eraserMode = eraserMode; }
}
