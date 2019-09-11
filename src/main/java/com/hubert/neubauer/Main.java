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
    private SceneController sceneController = new SceneController(window);
    private String initScreen = "/fxml/InitScreen.fxml";
    private String aboutScreen = "/fxml/AboutScreen.fxml";
    //declarations//

    @Override
    public void start(Stage primaryStage) throws Exception{
        /*this.window=primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource(initScreen));
        window.setScene(new Scene(root));
        window.setTitle("Project Manager");
        window.show();*/
        sceneController.load(initScreen);//make it so that's enough,maybe more arguments if needed
    }

    public static void main(String[] args) {
        launch(args);
    }
}
