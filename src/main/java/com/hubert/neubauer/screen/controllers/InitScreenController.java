package com.hubert.neubauer.screen.controllers;
/**
 * TODO: nothing for now, it's done
 */

import com.hubert.neubauer.data.tools.users.DataStorage;
import com.hubert.neubauer.data.tools.users.User;
import com.hubert.neubauer.misc.AboutProgramBox;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class InitScreenController{
    @FXML    private TextField textUsername;
    @FXML    private PasswordField userPassword;
    @FXML    private Label labelError;
    @FXML    private Button buttonLogin;

    private String msgLoggingIn = "Logging in...";
    private String msgError = "Login credentials incorrect or not found!";
    private User currentUser;
    private DataStorage dataStore;

    public void getInput(ActionEvent ae) {
        //Function fired when you press the login button on initScreen
        //The critical part of exception handling is the bit in this function
        try {
            currentUser = processUser(textUsername.getText(), userPassword.getText());
            labelError.setText(msgLoggingIn);
            textUsername.getScene().getWindow().hide();
        } catch (Exception e) {
            labelError.setText(msgError);
        }

    }

    private User processUser(String argLogin, String argPassword) throws Exception{
        User tmp = dataStore.findByUsername(argLogin);
        //System.out.println("done finding the user");
        if (tmp.getPassword().equals(argPassword)) {
            //System.out.println("done assigning");
            return tmp;
        } else {
            throw new Exception("Incorrect credentials!");
        }
    }

    public void about() throws IOException{
        //System.out.println("Pressed AboutProgram element");
        AboutProgramBox aboutProgramBox = new AboutProgramBox();
        aboutProgramBox.showAndWait();
    }

    public User getUser(){
        return this.currentUser;
    }

    public void copyDataStorage(DataStorage dataStorage){
        this.dataStore = dataStorage;
        //System.out.println("DataStore has been copied to InitScreenController");
    }
}
