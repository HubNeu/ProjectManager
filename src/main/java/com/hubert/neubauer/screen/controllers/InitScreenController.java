package com.hubert.neubauer.screen.controllers;

import com.hubert.neubauer.data.tools.DataStorage;
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

import javax.xml.crypto.Data;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.SQLOutput;
import java.util.Arrays;

public class InitScreenController{
    @FXML private TextField textUsername;
    @FXML private PasswordField userPassword;
    @FXML private Label labelError;
    @FXML private Button buttonLogin;

    private String msgLoggingIn = "Logging in...";
    private String msgError ="Login credentials incorrect or not found!";
    private User currentUser;
    private String enteredPassword="";
    private String enteredLogin="";
    private DataStorage dataStore;

    public void getInput(ActionEvent ae){
        System.out.println("login button pressed");
        System.out.println("login pulled successfully, credentials: "+textUsername.getText()+"/"+userPassword.getText());
        currentUser=processUser(textUsername.getText(),userPassword.getText());
        //System.out.println(currentUser.UserToString());
        textUsername.getScene().getWindow().hide();
    }

    private User processUser(String argLogin, String argPassword) {
        try{
            User tmp = dataStore.findUserByName(argLogin);
            System.out.println("done finding");
            //DO NOT USE == TO COMPARE STRINGS UNLESS YOU WANNA HAVE A BAD TIME
            if (tmp.getPassword().equals(argPassword)){
                System.out.println("done assigning");
                return tmp;
            }else{
                throw new Exception("Incorrect credentials!");
            }
        } catch (Exception e){
            e.getMessage();
        }
        return null;
    }

    public void about() throws IOException {
        System.out.println("Pressed AboutProgram element");
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/aboutScreen.fxml"));
        //ADD A THING TO MAKE ANY CLICK CLOSE THE APPLICATION
        //I can't be bothered to do it just use the x dummy, you've got a mouse right?
        Stage miniWindow = new Stage();
        miniWindow.initModality(Modality.APPLICATION_MODAL);
        miniWindow.setAlwaysOnTop(true);
        miniWindow.setResizable(false);
        Parent root = loader.load();
        miniWindow.setScene(new Scene(root));
        //AboutScreenController aboutScreenController = loader.getController();
        miniWindow.showAndWait();
        //extract any values if needed
    }

    public User getUser() {
        return this.currentUser;
    }

    public void copyDataStorage(DataStorage dataStorage) {
        this.dataStore=dataStorage;
        System.out.println("DataStore has been copied to InitScreenController");
    }
}
