package ahn.boardblitz.utils;

import ahn.boardblitz.models.BoardModel;
import ahn.boardblitz.models.Brush;
import ahn.boardblitz.views.BoardView;

import java.util.Stack;

public class BoardInvoker {
    private BoardModel boardModel;
    private BoardView boardView;

    Stack<Command> undoStack = new Stack<>();
    Stack<Command> redoStack = new Stack<>();
}
