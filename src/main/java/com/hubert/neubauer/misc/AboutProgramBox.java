package com.hubert.neubauer.misc;
/**
 * TODO: make it into static class so it can be called using AlertBox.show()
 * edit: shit sucks, cannot call getClass.getResource from a static context as it's non-static
 */

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * A class to simplify showing Help->about window;
 */
public class AboutProgramBox{
    public void show() throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/aboutScreen.fxml"));
        //ADD A THING TO MAKE ANY CLICK CLOSE THE APPLICATION
        //I can't be bothered to do it just use the x dummy, you've got a mouse right?
        Stage miniWindow = new Stage();
        miniWindow.initModality(Modality.APPLICATION_MODAL);
        miniWindow.setAlwaysOnTop(true);
        miniWindow.setResizable(false);
        Parent root = loader.load();
        miniWindow.setScene(new Scene(root));
        //AboutScreenController aboutScreenController = loader.getController();
        miniWindow.show();
        //extract any values if needed
    }

    public void showAndWait() throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/aboutScreen.fxml"));
        //ADD A THING TO MAKE ANY CLICK CLOSE THE APPLICATION
        //I can't be bothered to do it just use the x dummy, you've got a mouse right?
        Stage miniWindow = new Stage();
        miniWindow.initModality(Modality.APPLICATION_MODAL);
        miniWindow.setAlwaysOnTop(true);
        miniWindow.setResizable(false);
        Parent root = loader.load();
        miniWindow.setScene(new Scene(root));
        //AboutScreenController aboutScreenController = loader.getController();
        miniWindow.showAndWait();
        //extract any values if needed
    }
}
