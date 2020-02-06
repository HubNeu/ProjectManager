/**
 * THIS CODE IS SHIT, DON'T LOOK AT IT
 *
 * TODO:
 * -next: complete project structure and add it as an example
 * -event logger and to file saves so you can trace what happened when by which user
 * -continue with the NEW data structure
 * -add an icon and generally fix the appearance, but that's low priority
 * -Add a resource bundle with gui strings
 * -add write some tests
 * -fix the catching of exceptions
 * TO FINISH:
 * -finish classes: update,task, project, milestone
 * -Add main application will look like the advanced template from scene builder, 3 panels side by side, left if structure, middle is the map, right is the Details that show after clicking on a component.
 */
package com.hubert.neubauer;

import com.hubert.neubauer.data.tools.user.*;
import com.hubert.neubauer.misc.ErrorBox;
import com.hubert.neubauer.screen.controllers.InitScreenController;
import com.hubert.neubauer.screen.controllers.MainScreenController;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class Main extends Application{
    private DataStorage dataStorage = new DataStorage();
    private FXMLLoader loader;
    private Parent root;
    private Stage window;
    private InitScreenController initScreenController;
    private String initScreenControllerPath="/fxml/InitScreen.fxml";
    private MainScreenController mainScreenController;
    private String mainScreenControllerPath="/fxml/MainScreen.fxml";

    @Override
    public void start(Stage primaryStage) throws Exception{
        //System.out.println("Starting...");
        //Initalize data
        dataInit();

        //Prepare a window
        loader = new FXMLLoader(getClass().getResource(initScreenControllerPath));
        root = loader.load();
        window = new Stage();
        window.setTitle("Project Manager | login");
        window.setScene(new Scene(root));

        //get the controller and set it up
        InitScreenController initScreenController = loader.<InitScreenController>getController();
        initScreenController.copyDataStorage(dataStorage);
        window.setResizable(false);

        //show the window and wait until it's filled out
        window.showAndWait();

        //get data from the filled controller
        User user = initScreenController.getUser();

        //Figure something better to log in
        if (user != null) {
            //AppMain appMain = new AppMain(dataStorage, user); //I don't know why it works but it does, A local variable that is not deleted by the garbage collector after exiting a function
            //System.out.println("Logged in and started...");

            //Ditched a whole class for this function as it's not needed
            appMain(dataStorage, user);
        } else {
            //System.out.println("Didn't log in, user is NULL, exiting");
            System.exit(1);
        }
    }

    private void dataInit(){
    /*
        Hardcoded in place instead of sql databases, use Hibernate or sth after completing the demo app
     */
        Person person1 = new Person("Adam", "Smith", "00001", LocalDate.of(1990, 12, 02), MaritalStatus.SINGLE, Occupation.STUDENT);
        Person person2 = new Person("Maciej", "Kowalski", "00002", LocalDate.of(1978, 2, 21), MaritalStatus.MARRIED, Occupation.EMPLOYED);
        Person person3 = new Person("Olga", "Nowak", "00003", LocalDate.of(1985, 11, 02), MaritalStatus.SINGLE, Occupation.EMPLOYED);
        Person person4 = new Person("Wojciech", "Nowakowski", "00004", LocalDate.of(1995, 06, 13), MaritalStatus.SINGLE, Occupation.STUDENT);
        Person person5 = new Person("Kamila", "Drozd", "00005", LocalDate.of(1971, 04, 29), MaritalStatus.MARRIED, Occupation.UNEMPLOYED);
        Person person6 = new Person("Stefan", "Malecki", "00006", LocalDate.of(1980, 10, 9), MaritalStatus.SINGLE, Occupation.EMPLOYED);
        User user1 = new User(person1, "qwe", LocalDate.of(2018, 03, 03), 5678.65, PositionLevel.JUNIOR);
        User user2 = new User(person2, "qwe", LocalDate.of(2010, 7, 03), 12000.65, PositionLevel.SENIOR);
        User user3 = new User(person3, "qwe", LocalDate.of(2016, 10, 03), 4500.65, PositionLevel.MID);
        User user4 = new User(person4, "qwe", LocalDate.of(2018, 06, 30), 3000.00, PositionLevel.INTERN);
        User user5 = new User(person5, "qwe", LocalDate.of(2008, 02, 16), 45000.65, PositionLevel.EXECUTIVE);
        User user6 = new User(person6, "qwe", LocalDate.of(2016, 10, 03), 4500.65, PositionLevel.SUPERVISOR);
        dataStorage.addUser(user1);
        dataStorage.addUser(user2);
        dataStorage.addUser(user3);
        dataStorage.addUser(user4);
        dataStorage.addUser(user5);
        dataStorage.addUser(user6);
        dataStorage.extractPersonsFromUsers();

    }

    public static void main(String[] args){
        try{
            launch(args);
        }catch (Exception e){
            ErrorBox eb = new ErrorBox(e);
            eb.showAndWait();
            Platform.exit();
            System.exit(-1);
        }
    }

    public void appMain(DataStorage argData, User argUser) throws IOException{
        loader = new FXMLLoader(getClass().getResource(mainScreenControllerPath));
        root = loader.load();
        mainScreenController = loader.getController();
        mainScreenController.initialize(argData,argUser);
        window.setScene(new Scene(root));
        window.setMaximized(true);
        window.show();
    }
}

/*
Bugs fixed and tasks completed:
 * -RESTRUCTURE THE WHOLE PROJECT BECAUSE WHY LEARN AND DO SOMETHING RIGHT IN THE FIRST PLACE, WHEN YOU CAN DO SOMETHING BADLY AND THEN LEARN AND FIX IT, RIGHT?
 * -fix exception handling and login so that it works prim and proper and so that it can be forgotten about
 * -when calling one method that throws exception make sure to include it in the handle of the method
 * that way it will never go through with the method and stop halfway softlocking the program;
 * -fixing showing and hiding
 * -proper handling of incorrect data (wrong credentials, no user) so that it doesn't exit but wait for new data
 * -it logs in a user after closing the window with it's button despite not inputing anything
 * -many iterations of little bugs, i.e. wrong path, null pointer exceptions when changing scenes, etc.
 * -add an action listener to the password box so that after hitting enter you can log in
 * -clogger?-declined
 */