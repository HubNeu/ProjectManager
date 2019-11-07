package com.hubert.neubauer.data.tools;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DataStorage {
    /**
     * Class that will contain all the necessary data to initialize and run the app. Placed here in place of data base as
     * I need to first build the app then worry about data storage. (Then I can just use Hibernate and this class to store
     * data from Hib to this class and nothing will have to change in the rest of app).
     *
     * For now it will contain some hardcoded data to just develop the app with
     */

    /**
     * TODO:
     * -build this by implementing all of the written data classes
     * -later swap it for sql with hibernate
     * -alertxboxes for when it throws errors
     */

    //Declarations
    private List<User> users = new ArrayList<>();
    private List<Person> persons = new ArrayList<>();
    //End of declarations

    public DataStorage(){
    }

    public List<User> getUsers(){
        return Collections.unmodifiableList(users);
    }
    public User findUserByName (String arg) throws Exception{
        //Did I mention I'm not a software dev student?
        for (int i=0;i<users.size();i++){
            if (users.get(i).getName().equals(arg)){
                return users.get(i);
            }
        }
        throw new Exception();
    }
    public void addUser(User arg){
        users.add(arg);
    }
    public void deleteUserByUser(User arg){
        users.remove(arg);
    }
    public void deleteUserByIndex(User arg) throws Exception{users.remove(users.indexOf(arg));}
    public User getUserByIndex(int arg){
        return users.get(arg);
    }
    public void getUserByID(int arg) {
        //ToDo: Add UserID, notes in User class
    }
    public void addPerson(Person arg) {persons.add(arg);}

    public void extractAllPersons() {
        for (int i=0;i<users.size();i++){
            this.persons.add(users.get(i).getPerson());
        }
    }
}
