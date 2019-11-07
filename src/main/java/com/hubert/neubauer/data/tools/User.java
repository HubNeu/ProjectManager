package com.hubert.neubauer.data.tools;

import java.time.LocalDate;

public class User extends Person{

    /**
     * Extension of the class User, will be used to do many things
     *
     * -TODO:
     * -Figure out the form used to add users on the go, rn you have to add a person
     * instance first, then use it to make an instance of User.
     * --option 1: code it so that it makes a Person instance first, then it makes a User instance using that.
     * --option superior: make a caller to first add user bc it doesn't matter and is simpler on the code
     * -add unit tests to make sure everything used is initiated at all times and spits out what it should
     *
     * -add a var to store employee ID to use in searches
     */

    private Person person;
    private String username;
    private String companyEmail;
    private LocalDate dateOfEmployment;
    private double salary;
    private PositionLevel positionLevel;

    //Constructors
    public User(String name, String surname, String socialSecurityNumber, LocalDate dateOfBirth, MaritalStatus status, Occupation previousOccupation, Person person, String username, String companyEmail, LocalDate dateOfEmployment, double salary, PositionLevel positionLevel) {
        super(name, surname, socialSecurityNumber, dateOfBirth, status, previousOccupation);
        this.person = person;
        this.username = username;
        this.companyEmail = companyEmail;
        this.dateOfEmployment = dateOfEmployment;
        this.salary = salary;
        this.positionLevel = positionLevel;
    }

    public User(Person argPerson, LocalDate argDateOfEmployment, double argSalary, PositionLevel argPositionLevel) {
        super(argPerson.getName(), argPerson.getSurname(), argPerson.getSocialSecurityNumber(), argPerson.getDateOfBirth(), argPerson.getStatus(), argPerson.getPreviousOccupation());
        this.person = argPerson;
        this.username = setUpUsername(argPerson);
        this.companyEmail = setCompanyEmail(argPerson);
        this.dateOfEmployment = argDateOfEmployment;
        this.salary = argSalary;
        this.positionLevel = argPositionLevel;
    }

    /* Deprecated constructors from older version of this class
    public User() {
        this.person=new Person();
        this.companyEmail ="";
        this.dateOfEmployment=LocalDate.now();
        this.salary=0;
        this.positionLevel=PositionLevel.UNDEFINED;
    }

    public User(Person person, LocalDate dateOfEmployment, double salary, PositionLevel positionLevel) {
        this.person = person;
        this.companyEmail = setCompanyEmail(this.person);
        this.dateOfEmployment = dateOfEmployment;
        this.salary = salary;
        this.positionLevel = positionLevel;
    }

    public User(Person person) {
        this.person = person;
        this.companyEmail =setCompanyEmail(this.person);
    }
    */

    //Stetters and getters
    public String getUsername() {
        return username;
    }

    public String setUpUsername(Person person) {
        return person.getName()+person.getSurname();
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Person getPerson(){
        return person;
    }

    public void setPerson(Person person){
        this.person = person;
    }

    public String getCompanyEmail(){
        return companyEmail;
    }

    public String setCompanyEmail(Person person) {
        return person.getName()+"."+person.getSurname()+"@company.com";
    }

    public LocalDate getDateOfEmployment(){
        return dateOfEmployment;
    }

    public void setDateOfEmployment(LocalDate dateOfEmployment){
        this.dateOfEmployment = dateOfEmployment;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public PositionLevel getPositionLevel(){
        return positionLevel;
    }

    public void setPositionLevel(PositionLevel positionLevel){
        this.positionLevel = positionLevel;
    }

    //Additional methods:
    public String UserToString(){
        //I should have used a String array for it
        String output ="";
        output+="Name: "+this.getName()+"\n";
        output+="Surname: "+this.getSurname()+"\n";
        output+="Age: "+String.valueOf(this.getAge())+"\n";
        output+="SSN: "+this.getSocialSecurityNumber()+"\n";
        output+="DOB: "+this.getDateOfBirth().toString()+"\n";
        output+="Marital status: "+this.getStatus().toString()+"\n";
        output+="DOB [YYYY-MM-DD]: "+this.getDateOfBirth().toString()+"\n";
        output+="Previous occupation: "+this.getPreviousOccupation().toString()+"\n";
        output+="Salary: "+String.valueOf(this.getSalary())+"\n";
        output+="Salary: "+this.getCompanyEmail()+"\n";
        output+="DOE: "+this.getDateOfEmployment().toString()+"\n";
        output+="Position level: "+this.getPositionLevel().toString()+"\n";
        return output;
    }
}
