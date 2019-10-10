/**
 Problems:
 -Not sure if data from FXML controllers is updaed or not, figure it out

 To do:
 -everything
 -fix that damn data structure
 */
package com.hubert.neubauer;
import com.hubert.neubauer.data.tools.*;
import javafx.application.Application;
import javafx.stage.Stage;

import java.time.LocalDate;

public class Main extends Application {
    //Declarations:
    private AppController appController = new AppController();
    DataStore appData = new DataStore();
    //End of declarations

    @Override
    public void start(Stage primaryStage) throws Exception{
        System.out.println("Starting...");
        appdataInit();
        appController.begin(appData);
        System.out.println("Started...");
    }

    private void appdataInit(){
    /*
        Hardcoded in place insted of sql databases, use Hibernate after completing the demo app
     */
        User user1 = new User();
        //Person class setters
        user1.setName("Adam");
        user1.setSurname("Smith");
        user1.setSocialSecurityNumber("00001");
        user1.setStatus(MaritalStatus.SINGLE);
        user1.setPreviousOccupation(Occupation.EMPLOYED);
        user1.setDateOfBirth(LocalDate.of(1998,10,8));
        //user1.autofillAge(user1.getDateOfBirth());
        //User class setterss
        user1.setCompanyEmail(user1.getPerson());
        user1.setDateOfEmployment(LocalDate.of(2005,11,2));
        user1.setSalary(8976.56);
        user1.setPositionLevel(PositionLevel.SENIOR);
        //User2
        User user2 = new User();
        //Person class setters
        user1.setName("Maciej");
        user1.setSurname("Kowalski");
        user1.setSocialSecurityNumber("00002");
        user1.setStatus(MaritalStatus.MARRIED);
        user1.setPreviousOccupation(Occupation.UNEMPLOYED);
        user1.setDateOfBirth(LocalDate.of(19,10,8));
        //User class setters
        user1.setCompanyEmail(user1.getPerson());
        user1.setDateOfEmployment(LocalDate.of(2018,1,1));
        user1.setSalary(6500.00);
        user1.setPositionLevel(PositionLevel.MID);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
