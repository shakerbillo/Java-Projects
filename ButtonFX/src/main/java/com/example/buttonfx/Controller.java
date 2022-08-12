package com.example.buttonfx;



import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {

    @FXML
    private Button clickMeButton;

    public void intialize(){
        clickMeButton.setOnAction(event -> System.out.println("You clicked me!"));
    }

    }
