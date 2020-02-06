package com.hubert.neubauer.screen.controllers;
/**
 * TODO:
 * -prepare a method to make the root of a treeview, store it and then in main call treeview.setRoot(root) or pass root to the constructor of treeview
 */

import com.hubert.neubauer.data.tools.user.DataStorage;
import com.hubert.neubauer.data.tools.user.User;
import com.hubert.neubauer.misc.AboutProgramBox;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

import java.io.IOException;

public class MainScreenController {

    //FXML declarations:
    @FXML
    private MenuItem menuItemAbout;
    @FXML
    private TreeView treeViewPane;

    //user related declarations:
    private DataStorage dataStorage;
    private User currentUser;

    //Other declarations:
    private TopButtonsController topButtonsController;
    private TreeItem<String> root,subroot1,subroot2;
    private TreeView<String> tree;
    public void initialize(DataStorage argData, User argUser){
        this.dataStorage=argData;
        this.currentUser=argUser;
    }

    private TreeItem<String> makeBranch(String argTitle, TreeItem<String> argParent){
        TreeItem<String> item = new TreeItem<>(argTitle);
        item.setExpanded(true);
        argParent.getChildren().add(item);
        return item;
    }

    public void about() throws IOException{
        AboutProgramBox aboutProgramBox = new AboutProgramBox();
        aboutProgramBox.showAndWait();
    }

}
