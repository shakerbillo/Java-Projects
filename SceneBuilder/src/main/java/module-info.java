module com.shaker.scenebuilder {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.shaker.scenebuilder to javafx.fxml;
    exports com.shaker.scenebuilder;
}