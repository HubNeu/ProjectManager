package com.hubert.neubauer.screen.controllers;

import com.hubert.neubauer.misc.AboutProgramBox;
import java.io.IOException;

public class MainScreenController{

    public void aboutProgram() {
        try {
            AboutProgramBox aboutProgramBox = new AboutProgramBox();
            aboutProgramBox.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
