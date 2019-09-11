package com.hubert.neubauer;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneController{
    private Stage window;
    /**
     * My idea: a class that will be called once globally in main and will have methods such as load,loadNewWindow etc.
     * However, all the controllers and FXML files will be controlled by it and whenever you press one it's this class that
     * gets the call and changes shit to fit the call. It will load everything needed (faster program with worse load times)
     * and then display it accordingly, i.e. Scene scene 1 =...; Scene scene 2 =...; display(scene1); display(scene2);... etc.
     */
    public SceneController(Stage stage){
        this.window=stage;
    }
    public void load(String adress){
        try {
            Parent root = FXMLLoader.load(getClass().getResource(adress));
            window.setScene(new Scene(root));
            window.setTitle("Project Manager");
            window.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void loadNewWindow(String adress){

    }
}
/*
    NOWY POMYSL:CONTROLLERY WSZYSTKO OBSŁUGUJA I MAJA METODE GETDATA() KTORA JEST WYKONYWANA KIEDY KONTROLER OBSLUZYL FORMULARZ I DOSTAL DANE
 */
