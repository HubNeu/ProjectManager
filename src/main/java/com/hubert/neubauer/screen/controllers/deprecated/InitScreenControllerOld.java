package com.hubert.neubauer.screen.controllers.deprecated;
/**
 * TODO: add exception throwing catchers or sth and
 */

import com.hubert.neubauer.data.tools.DataStorage;
import com.hubert.neubauer.data.tools.User;
import com.hubert.neubauer.misc.AboutProgramBox;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class InitScreenControllerOld{
    @FXML
    private TextField textUsername;
    @FXML
    private PasswordField userPassword;
    @FXML
    private Label labelError;
    @FXML
    private Button buttonLogin;

    private String msgLoggingIn = "Logging in...";
    private String msgError = "Login credentials incorrect or not found!";
    private User currentUser;
    private String enteredPassword = "";
    private String enteredLogin = "";
    private DataStorage dataStore;

    public void getInput(ActionEvent ae) throws Exception{
        //Function fired when you press the login button on initScreen
        currentUser = processUser(textUsername.getText(), userPassword.getText());
        textUsername.getScene().getWindow().hide();
    }

    private User processUser(String argLogin, String argPassword) throws Exception{
        User tmp = dataStore.findByUsername(argLogin);
        System.out.println("done finding the user");
        if (tmp.getPassword().equals(argPassword)) {
            System.out.println("done assigning");
            return tmp;
        } else {
            throw new Exception("Incorrect credentials!");
        }
    }

    public void about() throws IOException{
        System.out.println("Pressed AboutProgram element");
        AboutProgramBox aboutProgramBox = new AboutProgramBox();
        aboutProgramBox.showAndWait();
    }

    public User getUser(){
        return this.currentUser;
    }

    public void copyDataStorage(DataStorage dataStorage){
        this.dataStore = dataStorage;
        System.out.println("DataStore has been copied to InitScreenController");
    }
}
