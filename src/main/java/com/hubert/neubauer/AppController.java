package com.hubert.neubauer;

import com.hubert.neubauer.data.tools.DataStorage;
import com.hubert.neubauer.screen.controllers.InitScreenController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * New idea: pass data between controllers, or store them here. Make sure all the data of everything (controllers,
 * scenes, adresses are here and pass shit from here)
 *
 *
 * How it's gonna work: after passing the data to the controllers it will update automatically (if the arguments are passed as a ref to memory not as a copy)
 * and then it's just to make sure that the controller is updating the data in this controller without calling any additional functions. if it's not,
 * call additional functions
 */

public class AppController {
    private Stage window = new Stage();
    private String initScreen = "/fxml/InitScreen.fxml";
    private String aboutScreen = "/fxml/aboutScreen.fxml";
    private String secondScreen = "/fxml/secondScreen.fxml";
    private DataStorage data;
    public InitScreenController initScreenController;

    public void begin(DataStorage data) throws IOException{
        //load the data passed from main, set up all controllers and fxml files, and display the first window
        //load the data:
        loadData(data);
        loadWindow(initScreen);

    }
    public void loadData(DataStorage dataStorage){
        //this will prepare the data for modification
    }
    public Scene loadScene(String adr) throws IOException{
        Parent parent = FXMLLoader.load(getClass().getResource(adr));
        return new Scene(parent);
    }
    public void loadWindow(String adr) throws IOException{
        window.setScene(loadScene(adr));
        window.show();
    }
}
/*
    Parent root = FXMLLoader.load(getClass().getResource(adress));
    FXMLLoader loader = new FXMLLoader();
    loader.getController();
    window.setScene(new Scene(root));
    window.setTitle("Project Manager");
    window.show();
    System.out.print("Done showing the scene");
 */