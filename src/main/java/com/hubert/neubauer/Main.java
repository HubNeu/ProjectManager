/**
 Problems:
 -Not sure if data from FXML controllers is updaed or not, figure it out

 To do:
 -everything
 -fix that damn data structure
 */
package com.hubert.neubauer;
import com.hubert.neubauer.data.tools.*;
import com.hubert.neubauer.screen.controllers.InitScreenController;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.time.LocalDate;

public class Main extends Application {
    //Declarations:
    private AppController appController = new AppController();
    //private InitScreenController initScreenController = new InitScreenController();
    private DataStore appData = new DataStore();
    private Stage window = new Stage();
    //End of declarations

    @Override
    public void start(Stage primaryStage) throws Exception{
        System.out.println("Starting...");
        //Initalize data
        appdataInit();
        //Prepare a window
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/InitScreen.fxml"));
        Parent root = loader.load();
        window.setScene(new Scene(root));
        InitScreenController initScreenController = loader.<InitScreenController>getController();
        window.showAndWait();
        User currentUser = initScreenController.getUser();
        //login(user);
        System.out.println("Started...");
    }

    private void appdataInit(){
    /*
        Hardcoded in place insted of sql databases, use Hibernate or sth after completing the demo app
     */
        Person person1 = new Person("Adam","Smith","00001",LocalDate.of(1990,12,02),MaritalStatus.SINGLE,Occupation.STUDENT);
        User user1 = new User(person1,LocalDate.of(2018,03,03),5678.65,PositionLevel.JUNIOR);
        Person person2 = new Person("Maciej","Kowalski","00002",LocalDate.of(1978,2,21),MaritalStatus.MARRIED,Occupation.EMPLOYED);
        User user2 = new User(person2,LocalDate.of(2010,7,03),12000.65,PositionLevel.SENIOR);
        Person person3 = new Person("Olga","Nowak","00003",LocalDate.of(1985,11,02),MaritalStatus.SINGLE,Occupation.EMPLOYED);
        User user3 = new User(person3,LocalDate.of(2016,10,03),4500.65,PositionLevel.MID);
        Person person4 = new Person("Wojciech","Nowakowski","00004",LocalDate.of(1995,06,13),MaritalStatus.SINGLE,Occupation.STUDENT);
        User user4 = new User(person4,LocalDate.of(2018,06,30),3000.00,PositionLevel.INTERN);
        Person person5 = new Person("Kamila","Drozd","00005",LocalDate.of(1971,04,29),MaritalStatus.MARRIED,Occupation.EMPLOYED);
        User user5 = new User(person5,LocalDate.of(2008,02,16),45000.65,PositionLevel.EXECUTIVE);
        Person person6 = new Person("Stefan","Malecki","00006",LocalDate.of(1980,10,9),MaritalStatus.SINGLE,Occupation.EMPLOYED);
        User user6 = new User(person6,LocalDate.of(2016,10,03),4500.65,PositionLevel.SUPERVISOR);
        appData.addUser(user1);
        appData.addUser(user2);
        appData.addUser(user3);
        appData.addUser(user4);
        appData.addUser(user5);
        appData.addUser(user6);
    }

    public static void main(String[] args) {
        launch(args);
        //Exitcode holds te code set when exiting the app at the end of the work. If it's not 0 then it spews out the login screen again.
        Integer exitCode = 0;
        if (exitCode.equals(0)){
            System.exit(exitCode);
        }
        else {
            //start(new Stage()); circumvent static vs non static co nontext error
        }
    }
}
