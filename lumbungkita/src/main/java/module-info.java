module com.lumbungkita {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.lumbungkita to javafx.fxml;
    exports com.lumbungkita;
}
