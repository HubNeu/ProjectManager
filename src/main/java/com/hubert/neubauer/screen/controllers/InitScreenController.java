package com.hubert.neubauer.screen.controllers;

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

    public void getInput(){

    }

    public void login(){

    }

    public void about(){
        try{

            Parent fxmlLayout = FXMLLoader.load(getClass().getResource("/fxml/AboutScreen.fxml"));
            Stage aboutStage = new Stage();
            aboutStage.setTitle("About |Project Manager");
            aboutStage.initModality(Modality.APPLICATION_MODAL);
            aboutStage.setScene(new Scene(fxmlLayout));
            aboutStage.setTitle("Project Manager");
            aboutStage.setResizable(false);
            aboutStage.show();
        }catch (Exception e){
            System.out.println("Message: "+"\n"+e.getMessage());
            System.out.println("Stack Trace: "+"\n"+e.getStackTrace());
        }

    }
}
