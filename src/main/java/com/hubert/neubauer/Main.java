package com.hubert.neubauer;

/**
Problems:
-none,perfect,flawless

 To do:
 -implement fxml controller that will change scenes and get on with finally building it //29.08.2019
 */
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/sample.fxml"));
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.setTitle("Hello World");
        primaryStage.show();
        System.out.println(System.getProperty("user.dir"));
    }


    public static void main(String[] args) {
        launch(args);
    }
}
