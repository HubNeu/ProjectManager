package com.hubert.neubauer;

import com.hubert.neubauer.screen.controllers.AboutScreenController;
import com.hubert.neubauer.screen.controllers.InitScreenController;
import com.hubert.neubauer.screen.controllers.MainScreenController;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.stage.Stage;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * New idea: pass data between controllers, or store them here. Make sure all the data of everything (controllers,
 * scenes, adresses are here and pass shit from here)
 *
 *
 * How it's gonna work: after passing the data to the controllers it will update automatically (if the arguments are passed as a ref to memory not as a copy)
 * and then it's just to make sure that the controller is updating the data in this controller without calling any additional functions. if it's not,
 * call additional functions
 */

public class AppController implements Initializable{
    private Stage window = new Stage();
    private String initScreen = "/fxml/InitScreen.fxml";
    private String aboutScreen = "/fxml/aboutScreen.fxml";
    private String secondScreen = "/fxml/secondScreen.fxml";
    private DataStore data;

    public void begin(DataStore data){
        //load the data passed from main, set up all controllers and fxml files, and display the first window
        //load the data:
        loadData(data);

        //set up controllers for the whole app:
        FXMLLoader loader = new FXMLLoader(getClass().getResource(initScreen));
        InitScreenController initScreenController = loader.getController();
        loader = new FXMLLoader(getClass().getResource(aboutScreen));
        AboutScreenController aboutScreenController = loader.getController();
        loader = new FXMLLoader(getClass().getResource(secondScreen));
        MainScreenController mainScreenController = loader.getController();


    }
    public void loadNewScene(Stage stage, String adress){

    }
    public void loadNewStage(String adress){

    }
    public void loadData(DataStore dataStore){
        //this will prepare the data for modification
    }

    @Override
    public void initialize(URL location, ResourceBundle resources){

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