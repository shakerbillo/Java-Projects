module com.shaker.controls {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.shaker.controls to javafx.fxml;
    exports com.shaker.controls;
}