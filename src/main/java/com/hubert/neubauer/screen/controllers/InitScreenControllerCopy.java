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

public class InitScreenControllerCopy{
    @FXML
    private TextField textUsername;
    @FXML
    private PasswordField userPassword;
    @FXML
    private Label labelError;
    @FXML
    private Button buttonLogin;

    private String msgLoggingIn = "Logging in...";
    private String msgError ="Login credentials incorrect or not found!";
    public void getInput(){
        //Figure out a way to build a database of passwords
        //or don't that's not the objective of this project, at least not rn.
        if (userPassword.getText().equals("1234")){
            //if prviosly entered incorrect data
            labelError.setText(msgLoggingIn);
            userPassword.clear();
            textUsername.clear();
            Stage stage = (Stage) buttonLogin.getScene().getWindow();
            stage.close();
            login();
        }else{
            labelError.setText(msgError);
            userPassword.clear();
        }
    }
    public void login(){
        try{
            Parent fxmlLayout = FXMLLoader.load(getClass().getResource("/fxml/SecondScreen.fxml"));
            Stage aboutStage = new Stage();
            aboutStage.setTitle("Project Manager");
            aboutStage.setScene(new Scene(fxmlLayout));
            aboutStage.show();
        }catch (Exception e){
            System.out.println("Message: "+"\n"+e.getMessage());
            System.out.println("Stack Trace: "+"\n"+e.getStackTrace());
        }
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
