module com.shaker.layouts {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.shaker.layouts to javafx.fxml;
    exports com.shaker.layouts;
}