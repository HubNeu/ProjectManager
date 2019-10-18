package com.hubert.neubauer.screen.controllers;

import com.hubert.neubauer.data.tools.User;
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
import javafx.stage.StageStyle;

import java.io.IOException;

public class InitScreenController{
    @FXML private TextField textUsername;
    @FXML private PasswordField userPassword;
    @FXML private Label labelError;
    @FXML private Button buttonLogin;

    private String msgLoggingIn = "Logging in...";
    private String msgError ="Login credentials incorrect or not found!";
    private User currentUser;

    public void getInput(ActionEvent ae){
        //Process input and identify current userso it can be retruned when logging in
        System.out.println("button pressed");
    }


    public void about() throws IOException {
        System.out.println("Pressed AboutProgram element");
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/aboutScreen.fxml"));
        //ADD A THING TO MAKE ANY CLICK CLOSE THE APPLICATION
        Stage miniWindow = new Stage(StageStyle.UNDECORATED);
        miniWindow.initModality(Modality.APPLICATION_MODAL);
        miniWindow.setAlwaysOnTop(true);
        miniWindow.setResizable(false);
        Parent root = loader.load();
        miniWindow.setScene(new Scene(root));
        AboutScreenController aboutScreenController = loader.getController();
        miniWindow.showAndWait();
        //extract any values if needed
    }

    public User getUser() {
        return this.currentUser;
    }
}
