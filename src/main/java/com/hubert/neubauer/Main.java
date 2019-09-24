package com.hubert.neubauer;

/**
Problems:
-Not sure if data from FXML controllers is updaed or not, figure it out

 To do:
 -the skeleton of the app
 */
import com.hubert.neubauer.data.tools.DataStore;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.Window;

public class Main extends Application {
    //Declarations:
    private AppController appController = new AppController();
    DataStore appData = new DataStore();
    //End of declarations

    @Override
    public void start(Stage primaryStage) throws Exception{
        System.out.println("Starting...");
        appController.begin(appData);
        System.out.println("Started...");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
