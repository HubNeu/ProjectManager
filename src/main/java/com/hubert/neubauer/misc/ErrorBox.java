package com.hubert.neubauer.misc;

import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;

public class ErrorBox{
    private Alert alert;
    private Label label;
    private TextArea textArea;

    public ErrorBox(Throwable e){
        alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Critical exception");
        alert.setHeaderText("Program has encountered a problem that cannot be fixed.");
        alert.setContentText("Reinstall program or revert any changes made to it manually.\nIf this problem persists, contact support.");
        label = new Label("The stacktrace is:");
        textArea = new TextArea(e.getStackTrace().toString());
        textArea.setMaxWidth(Double.MAX_VALUE);
        textArea.setMaxHeight(Double.MAX_VALUE);
        GridPane.setVgrow(textArea, Priority.ALWAYS);
        GridPane.setHgrow(textArea,Priority.ALWAYS);
        GridPane exeptionContext = new GridPane();
        exeptionContext.setMaxWidth(Double.MAX_VALUE);
        exeptionContext.add(label,0,0);
        exeptionContext.add(textArea,0,1);
        alert.getDialogPane().setExpandableContent(exeptionContext);
    }
    public void showAndWait(){
        this.showAndWait();
    }
}
