package ahn.boardblitz.views;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class BoardView {
    // menu bar buttons
    @FXML public MenuItem newBoardMenuItem;
    @FXML public MenuItem openBoardMenuItem;
    @FXML public MenuItem saveMenuItem;
    @FXML public MenuItem saveAsMenuItem;
    @FXML public MenuItem exportAsMenuItem;
    @FXML public MenuItem exitMenuItem;
    @FXML public MenuItem undoMenuItem;
    @FXML public MenuItem redoMenuItem;
    @FXML public MenuItem clearMenuItem;
    @FXML public MenuItem readmeMenuItem;

    // board controls
    @FXML public ColorPicker brushColorPicker;
    @FXML public ColorPicker boardColorPicker;
    @FXML public Slider brushSizeSlider;
    @FXML public Label brushSizeLabel;
    @FXML public Slider zoomSlider;
    @FXML public Label zoomLabel;
    @FXML public Button undoButton;
    @FXML public Button redoButton;
    @FXML public Button eraserButton;
    @FXML public Button clearButton;
    @FXML public Pane boardPane;

    private Canvas canvas;
    private Color currentBackgroundColor = Color.WHITE;

    @FXML
    public void initialize() {
        // create and setup canvas
        canvas = new Canvas();
        canvas.widthProperty().bind(boardPane.widthProperty());
        canvas.heightProperty().bind(boardPane.heightProperty());
        boardPane.getChildren().add(canvas);

        // add listener for size changes
        canvas.widthProperty().addListener((obs, oldVal, newVal) -> redrawBackground());
        canvas.heightProperty().addListener((obs, oldVal, newVal) -> redrawBackground());

        // initialize with white background
        redrawBackground();

        undoButton.setDisable(true);
        undoMenuItem.setDisable(true);

        redoButton.setDisable(true);
        redoMenuItem.setDisable(true);

        clearButton.setDisable(true);
        clearMenuItem.setDisable(true);
    }

    private void redrawBackground() {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(currentBackgroundColor);
        gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
    }

    public Button getUndoButton() { return undoButton; }

    public ColorPicker getBoardColorPicker() { return boardColorPicker; }

    public void updateBoardColor(Color color) {
        currentBackgroundColor = color;
        redrawBackground();
    }
}
