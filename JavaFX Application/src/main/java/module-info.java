module com.shaker.javafxapplication {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.shaker.javafxapplication to javafx.fxml;
    exports com.shaker.javafxapplication;
}