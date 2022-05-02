module com.shaker.mycontacts {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;

    opens datamodel;
    opens com.shaker.mycontacts to javafx.fxml;
    exports com.shaker.mycontacts;
}