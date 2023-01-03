package ru.imesense.javameemulator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;

import java.io.File;

public class HelloController {
    @FXML
    private VBox vbox;

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onOpenMenuItemClick() {
        var fileChooser = new FileChooser();
        fileChooser.setTitle("Open Java ME application");
        fileChooser.setInitialDirectory(new File(System.getProperty("user.home")));
        fileChooser.getExtensionFilters().addAll(
            new FileChooser.ExtensionFilter("All files", "*.*"),
            new FileChooser.ExtensionFilter("JAR files", "*.jar")
        );

        var file = fileChooser.showOpenDialog(vbox.getScene().getWindow());
    }
}
