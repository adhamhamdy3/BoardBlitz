package ahn.boardblitz.models;

import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public class BoardModel {
    private List<FreeLine> freeLines = new ArrayList<>();
    private Brush brush = new Brush();
    private Color color = Color.WHITE;

    // getters & setters
    public void setBoardColor(Color color) {
        this.color = color;
    }

    public Color getBoardColor() {
        return color;
    }
}
