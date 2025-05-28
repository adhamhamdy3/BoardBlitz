package ahn.boardblitz.controllers;

import ahn.boardblitz.models.BoardModel;
import ahn.boardblitz.views.BoardView;

public class BoardController {
    private BoardModel boardModel;
    private BoardView boardView;

    public BoardController(BoardModel boardModel, BoardView boardView) {
        this.boardModel = boardModel;
        this.boardView = boardView;

        boardView.getUndoButton().setOnAction(e -> {
            updateView();
        });

        boardView.getBoardColorPicker().setOnAction(e -> {
           boardModel.setBoardColor(boardView.getBoardColorPicker().getValue());
           updateBoardColor();
        });
    }

    public void updateView() {
        System.out.println("Undo button clicked");
    }

    public void updateBoardColor() {
        boardView.updateBoardColor(boardModel.getBoardColor());
    }

}
