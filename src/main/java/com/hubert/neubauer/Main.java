package com.hubert.neubauer;

/**
Problems:
-none,perfect,flawless

 To do:
 -implement fxml controller that will change scenes and get on with finally building it //29.08.2019
 */
import com.hubert.neubauer.sceneController.SceneController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    SceneController sceneController = new SceneController();
    @Override
    public void start(Stage primaryStage) throws Exception{


        Parent root = FXMLLoader.load(getClass().getResource("/fxml/initScreen.fxml"));
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.setTitle("Hello World");
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
