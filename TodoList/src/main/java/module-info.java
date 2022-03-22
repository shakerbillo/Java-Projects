module com.example.todolist {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.shaker.todolist to javafx.fxml;
    exports com.shaker.todolist;
}