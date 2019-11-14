package com.hubert.neubauer.screen.controllers.deprecated;
/**
 * TODO: make a layout composed of other xml layouts and their respective controllers
 */

import com.hubert.neubauer.misc.AboutProgramBox;

import java.io.IOException;

public class MainScreenControllerOld{

    public void aboutProgram() throws IOException{
        AboutProgramBox aboutProgramBox = new AboutProgramBox();
        aboutProgramBox.showAndWait();
    }
}
