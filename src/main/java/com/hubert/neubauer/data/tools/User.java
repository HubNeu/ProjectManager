package com.hubert.neubauer.data.tools;

import java.time.LocalDate;

public class User{
    /**
     * Extension of the class User, will be used to track changes.
     */

    private Person person;
    private String comapnyEmail;
    private LocalDate dateOfEmployment;
    private double salary;
    private PositionLevel positionLevel;

    public Person getPerson(){
        return person;
    }

    public void setPerson(Person person){
        this.person = person;
    }

    public String getName(){
        return person.getName();
    }

    public void setName(String name){
        person.setName(name);
    }

    public String getSurname(){
        return person.getSurname();
    }

    public void setSurname(String surname){
        person.setSurname(surname);
    }

    public String getSocialSecurityNumber(){
        return person.getSocialSecurityNumber();
    }

    public void setSocialSecurityNumber(String socialSecurityNumber){
        person.setSocialSecurityNumber(socialSecurityNumber);
    }

    public int getAge(){
        return person.getAge();
    }

    public void setAge(int age){
        person.setAge(age);
    }

    public MaritalStatus getStatus(){
        return person.getStatus();
    }

    public void setStatus(MaritalStatus status){
        person.setStatus(status);
    }

    public Occupation getPreviousOccupation(){
        return person.getPreviousOccupation();
    }

    public void setPreviousOccupation(Occupation previousOccupation){
        person.setPreviousOccupation(previousOccupation);
    }

    public LocalDate getDateOfBirth(){
        return person.getDateOfBirth();
    }

    public void setDateOfBirth(LocalDate dateOfBirth){
        person.setDateOfBirth(dateOfBirth);
    }

    public void autofillAge(LocalDate dob){
        person.autofillAge(dob);
    }

    public String getComapnyEmail(){
        return comapnyEmail;
    }

    public void setComapnyEmail(String comapnyEmail){
        this.comapnyEmail = comapnyEmail;
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

}
