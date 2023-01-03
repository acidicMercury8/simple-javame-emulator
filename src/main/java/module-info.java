module ru.imesense.javameemulator {
    requires javafx.controls;
    requires javafx.fxml;

    opens ru.imesense.javameemulator to javafx.fxml;
    exports ru.imesense.javameemulator;
}
