module com.shaker.musicui {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.desktop;


    opens com.shaker.musicui to javafx.fxml;
    exports com.shaker.musicui;
}