/**
 * TODO:
 * -properly set up data passed here, make sure it's using it by reference
 * -make the layout in scene builder
 * -embed "subcontrollers" (example form the tutorial, main scene consists of multiple small screens and controllers)
 */

package com.hubert.neubauer.app.core;

import com.hubert.neubauer.data.tools.DataStorage;
import com.hubert.neubauer.data.tools.User;
import com.hubert.neubauer.screen.controllers.MainScreenController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AppMain{
    private Stage mainWindow = new Stage();
    private String mainScreenPath = "/fxml/MainScreen.fxml";
    private DataStorage originalData, changedData; //changed data to save changes in, original to... do something, I'll figure it out or delete later
    private MainScreenController mainScreenController;
    private User currentUser;

    public AppMain(DataStorage argData, User argUser) throws IOException{
        this.originalData = argData;
        //do NOT change the following
        changedData = originalData;
        //end of do NOT change
        this.currentUser = argUser;
        FXMLLoader loader = new FXMLLoader(getClass().getResource(mainScreenPath));
        Parent root = loader.load();
        mainScreenController = loader.getController();
        mainWindow.setScene(new Scene(root));
        mainWindow.show();// or showAndWait(); not sure yet how to process all of this and which it will require
    }

}