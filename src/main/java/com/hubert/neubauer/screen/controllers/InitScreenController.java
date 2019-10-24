package com.hubert.neubauer.screen.controllers;

import com.hubert.neubauer.Main;
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
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
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


    public void getInput(ActionEvent ae){
        //Process input and identify current userso it can be retruned when logging in
        System.out.println("login button pressed");
        enteredPassword=userPassword.getText();
        enteredLogin=textUsername.getText();
        System.out.println("login pulled successfully");
        processUser(textUsername.getText(),userPassword.getText());
    }

    private void processUser(String argLogin, String argPassword) {
        try{
            Method m = Main.class.getDeclaredMethod("getCurrentDatabase");
            m.setAccessible(true);
            //TODO: this shit
            DataStorage userList = m.invoke(com.hubert.neubauer.Main);
            currentUser= userList.findUserByName(argLogin);
        } catch (NoSuchMethodException e){
            System.out.println(Arrays.toString(e.getStackTrace()));
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void about() throws IOException {
        System.out.println("Pressed AboutProgram element");
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/aboutScreen.fxml"));
        //ADD A THING TO MAKE ANY CLICK CLOSE THE APPLICATION
        Stage miniWindow = new Stage();
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
