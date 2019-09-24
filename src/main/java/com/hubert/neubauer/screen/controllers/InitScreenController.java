package com.hubert.neubauer.screen.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class InitScreenController{
    @FXML private TextField textUsername;
    @FXML private PasswordField userPassword;
    @FXML private Label labelError;
    @FXML private Button buttonLogin;

    private String msgLoggingIn = "Logging in...";
    private String msgError ="Login credentials incorrect or not found!";

    public void getInput(ActionEvent ae){
        System.out.println("button pressed");
    }

    public void login(){

    }

    public void about(){

    }
}
