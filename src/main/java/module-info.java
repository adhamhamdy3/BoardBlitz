module ahn.boardblitz {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens ahn.boardblitz to javafx.fxml;
    opens ahn.boardblitz.Controllers to javafx.fxml;
    exports ahn.boardblitz;
}