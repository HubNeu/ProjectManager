package com.hubert.neubauer.screen.controllers;
/**
 * TODO: nothing for now, it's done
 */

import com.hubert.neubauer.data.tools.user.DataStorage;
import com.hubert.neubauer.data.tools.user.User;
import com.hubert.neubauer.misc.AboutProgramBox;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

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

    public void checkForEnter(KeyEvent keyEvent){
        if (keyEvent.getCode()== KeyCode.ENTER){
            //System.out.println("Pressed enter");
            //getInput(new ActionEvent());    //This works. Why?
            getInput(null); //since I'm not actually using ActionEvents here
        }
    }
}
