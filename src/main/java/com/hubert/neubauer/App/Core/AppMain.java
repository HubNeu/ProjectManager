package com.hubert.neubauer.App.Core;

import com.hubert.neubauer.data.tools.DataStorage;
import com.hubert.neubauer.data.tools.User;
import com.hubert.neubauer.screen.controllers.MainScreenController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 *TODO:
 * -properly set up data passed here, make sure it's using it by reference
 * -make the layout in scene builder
 * -embed "subcontrollers" (example form the tutorial, main scene consists of multiple small screens and controllers)
 */

public class AppMain {
    private Stage mainWindow = new Stage();
    private String secondScreen = "/fxml/secondScreen.fxml";
    private DataStorage data;
    private MainScreenController mainScreenController;
    private User currentUser;

    public AppMain(DataStorage argData, User argUser) throws IOException {
        this.data = argData;
        this.currentUser=argUser;
        FXMLLoader loader = new FXMLLoader(getClass().getResource(secondScreen));
        Parent root = loader.load();
        mainWindow.setScene(new Scene(root));
        mainWindow.show();// or showAndWait(); not sure yet how to process all of this and which it will require
    }
}