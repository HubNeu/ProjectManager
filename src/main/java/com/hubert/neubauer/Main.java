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
    User user1 = new User();
    user1.setName("Adam");
    user1.setSurname("Smith");
    user1.setSocialSecurityNumber("00000");
    user1.setAge(30);
    user1.setStatus(MaritalStatus.MARRIED);
    user1.setPreviousOccupation(Occupation.EMPLOYED);
    user1.setDateOfBirth(LocalDate.of(1998,10,8));

     */
    }

    public static void main(String[] args) {
        launch(args);
    }
}
