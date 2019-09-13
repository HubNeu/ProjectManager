package com.hubert.neubauer.data.tools;

import java.time.LocalDate;

public class Person{
    /**
     * Just a class to store data connected with a person, used for tracking, in User class and login (perhaps).
     */
    private String name;
    private String surname;
    private String socialSecurityNumber;
    private int age;
    private LocalDate dateOfBirth;
    private MaritalStatus status;
    private Occupation previousOccupation;
    //functions
    public int autofillAge(LocalDate birthDate){
        LocalDate now =LocalDate.now();
        int difference=now.getYear()-dateOfBirth.getYear();
        return difference;
    }
    //Getters and setters:
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSurname(){
        return surname;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getSocialSecurityNumber(){
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber){
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public MaritalStatus getStatus(){
        return status;
    }

    public void setStatus(MaritalStatus status){
        this.status = status;
    }

    public Occupation getPreviousOccupation(){
        return previousOccupation;
    }

    public void setPreviousOccupation(Occupation previousOccupation){
        this.previousOccupation = previousOccupation;
    }

    public LocalDate getDateOfBirth(){
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

}
