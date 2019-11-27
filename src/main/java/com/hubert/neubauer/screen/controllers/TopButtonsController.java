package com.hubert.neubauer.screen.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class TopButtonsController{
    private MainScreenController mainScreenController;
    @FXML
    public void openFileMenu(ActionEvent actionEvent){

    }
    @FXML
    public void openEditMenu(ActionEvent actionEvent){

    }
    @FXML
    public void openRaportsMenu(ActionEvent actionEvent){

    }
    public void setMainController (MainScreenController msc){
        this.mainScreenController=msc;
    }
}
