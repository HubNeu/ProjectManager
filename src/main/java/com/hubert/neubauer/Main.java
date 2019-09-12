package com.hubert.neubauer;

/**
Problems:
-Not sure if data from FXML controllers is updaed or not, figure it out

 To do:
 -the skeleton of the app
 */
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    //Declarations:
    private AppController appController = new AppController();
    DataStore appData = new DataStore();
    //End of declarations

    @Override
    public void start(Stage primaryStage) throws Exception{
        appController.begin(appData);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
