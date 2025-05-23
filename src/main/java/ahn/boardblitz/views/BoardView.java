package ahn.boardblitz.views;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;

public class BoardView {
    // menu bar buttons
    public MenuItem newBoardMenuItem;
    public MenuItem openBoardMenuItem;
    public MenuItem saveMenuItem;
    public MenuItem saveAsMenuItem;
    public MenuItem exportAsMenuItem;
    public MenuItem exitMenuItem;
    public MenuItem undoMenuItem;
    public MenuItem redoMenuItem;
    public MenuItem clearMenuItem;
    public MenuItem readmeMenuItem;

    // board controls
    public ColorPicker brushColorPicker;
    public ColorPicker boardColorPicker;
    public Slider brushSizeSlider;
    public Label brushSizeLabel;
    public Slider zoomSlider;
    public Label zoomLabel;
    public Button undoButton;
    public Button redoButton;
    public Button eraserButton;
    public Button clearButton;
    public Pane boardPane;

    @FXML
    public void initialize() {}

    public Button getUndoButton() { return undoButton; }
}
