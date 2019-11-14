package com.hubert.neubauer.screen.controllers;
/**
 * TODO: make a layout composed of other xml layouts and their respective controllers
 */

import com.hubert.neubauer.misc.AboutProgramBox;

import java.io.IOException;

public class MainScreenController{

    public void aboutProgram() throws IOException{
        AboutProgramBox aboutProgramBox = new AboutProgramBox();
        aboutProgramBox.showAndWait();
    }
}
