/**
 *TODO:
 * -when calling one method that throws exception make sure to include it in the handle of the method
 * that way it will never go through with the method and stop halfway softlocking the program;
 * -fixing showing and hiding
 * -event logger and to file saves so you can trace what happened when by which user
 * -proper handling of incorrect data (wrong credentials, no user) so that it doesn't exit but wait for new data
 */
package com.hubert.neubauer;
import com.hubert.neubauer.App.Core.AppMain;
import com.hubert.neubauer.data.tools.*;
import com.hubert.neubauer.screen.controllers.InitScreenController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.util.List;

public class Main extends Application {
    private AppMain appMain;
    private DataStorage dataStorage = new DataStorage();
    private Stage window = new Stage();
    @Override
    public void start(Stage primaryStage) throws Exception{
        System.out.println("Starting...");
        //Initalize data
        appDataInit();
        //Prepare a window
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/InitScreen.fxml"));
        Parent root = loader.load();
        window.setScene(new Scene(root));
        //get the controller and set it up
        InitScreenController initScreenController = loader.<InitScreenController>getController();
        initScreenController.copyDataStorage(dataStorage);
        //show the window and wait until it's filled out
        window.showAndWait();
        //get data from the filled controller
        User user = initScreenController.getUser();
        //sth is wrong here
        if (user!=null) {
            appMain = new AppMain(dataStorage, user);
            System.out.println("Logged in and started...");
        }else{
            System.out.println("Didn't log in, user is NULL, exiting");
            System.exit(1234);
        }
    }
    private void appDataInit(){
    /*
        Hardcoded in place instead of sql databases, use Hibernate or sth after completing the demo app
     */
        Person person1 = new Person("Adam","Smith","00001",LocalDate.of(1990,12,02),MaritalStatus.SINGLE,Occupation.STUDENT);
        Person person2 = new Person("Maciej","Kowalski","00002",LocalDate.of(1978,2,21),MaritalStatus.MARRIED,Occupation.EMPLOYED);
        Person person3 = new Person("Olga","Nowak","00003",LocalDate.of(1985,11,02),MaritalStatus.SINGLE,Occupation.EMPLOYED);
        Person person4 = new Person("Wojciech","Nowakowski","00004",LocalDate.of(1995,06,13),MaritalStatus.SINGLE,Occupation.STUDENT);
        Person person5 = new Person("Kamila","Drozd","00005",LocalDate.of(1971,04,29),MaritalStatus.MARRIED,Occupation.UNEMPLOYED);
        Person person6 = new Person("Stefan","Malecki","00006",LocalDate.of(1980,10,9),MaritalStatus.SINGLE,Occupation.EMPLOYED);
        /*dataStorage.addPerson(person1);
        dataStorage.addPerson(person2);
        dataStorage.addPerson(person3);
        dataStorage.addPerson(person4);
        dataStorage.addPerson(person5);
        dataStorage.addPerson(person6);*/
        User user1 = new User(person1,"qwe",LocalDate.of(2018,03,03),5678.65,PositionLevel.JUNIOR);
        User user2 = new User(person2,"qwe",LocalDate.of(2010,7,03),12000.65,PositionLevel.SENIOR);
        User user3 = new User(person3,"qwe",LocalDate.of(2016,10,03),4500.65,PositionLevel.MID);
        User user4 = new User(person4,"qwe",LocalDate.of(2018,06,30),3000.00,PositionLevel.INTERN);
        User user5 = new User(person5,"qwe",LocalDate.of(2008,02,16),45000.65,PositionLevel.EXECUTIVE);
        User user6 = new User(person6,"qwe",LocalDate.of(2016,10,03),4500.65,PositionLevel.SUPERVISOR);
        dataStorage.addUser(user1);
        dataStorage.addUser(user2);
        dataStorage.addUser(user3);
        dataStorage.addUser(user4);
        dataStorage.addUser(user5);
        dataStorage.addUser(user6);
        dataStorage.extractAllPersons();
    }
    public static void main(String[] args) {
        launch(args);
        //Exitcode holds te code set when exiting the app at the end of the work. If it's not 0 then it spews out the login screen again.
        Integer exitCode = 0;
        if (exitCode.equals(0)){
            System.exit(exitCode);
        }
        else {
            //start(new Stage()); circumvent static vs non static conontext error
        }
    }
}
