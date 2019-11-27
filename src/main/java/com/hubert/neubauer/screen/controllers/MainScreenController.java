package com.hubert.neubauer.screen.controllers;

import com.hubert.neubauer.misc.AboutProgramBox;
import javafx.fxml.FXML;

import java.io.IOException;

public class MainScreenController{
    @FXML
    private TopButtonsController topButtonsController;
    @FXML
    public void initialize(){
        topButtonsController.setMainController(this);
    }
    public void aboutProgram() {
        try {
            AboutProgramBox aboutProgramBox = new AboutProgramBox();
            aboutProgramBox.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
