package ahn.boardblitz;

import ahn.boardblitz.controllers.BoardController;
import ahn.boardblitz.models.BoardModel;
import ahn.boardblitz.views.BoardView;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        BoardModel boardModel = new BoardModel();
        
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("board-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        
        BoardView boardView = fxmlLoader.getController();
        BoardController boardController = new BoardController(boardModel, boardView);
        
        stage.setTitle("BoardBlitz");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}