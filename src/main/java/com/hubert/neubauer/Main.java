package com.hubert.neubauer;

/**
Problems:
-SceneController/that idea in the bookmarks seems promisig, take a look at it if not finished

 To do:
 -implement fxml controller that will change scenes and get on with finally building it //29.08.2019
 */
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    //Declarations:
    private Stage window = new Stage();
    private SceneController sceneController = new SceneController();
    private String firstScreen = "/fxml/InitScreen.fxml";
    private String secondScreen = "/fxml/SecondScreen.fxml";
    //declarations//

    @Override
    public void start(Stage primaryStage) throws Exception{
        this.window=primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource(firstScreen));
        window.setScene(new Scene(root,600,400));
        window.setTitle("First Window");
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
