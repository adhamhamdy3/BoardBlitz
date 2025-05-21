package ahn.boardblitz.Models;

import javafx.scene.paint.Color;

public class Brush {
    private double radius = 2.0;
    private Color color = Color.BLACK;
    private boolean eraserMode = false;

    // getters & setters
    double getRadius() { return radius; }
    void setRadius(double radius) { this.radius = radius; }

    Color getColor() { return color; }
    void setColor(Color color) { this.color = color; }

    boolean isEraserMode() { return eraserMode; }
    void setEraserMode(boolean eraserMode) { this.eraserMode = eraserMode; }
}
