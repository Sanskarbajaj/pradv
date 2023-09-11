module com.example.printer {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires java.desktop;

    opens com.example.printer to javafx.fxml;
    exports com.example.printer;

}