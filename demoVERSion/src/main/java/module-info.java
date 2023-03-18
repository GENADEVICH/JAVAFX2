module com.example.demoversion {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demoversion to javafx.fxml;
    exports com.example.demoversion;
}