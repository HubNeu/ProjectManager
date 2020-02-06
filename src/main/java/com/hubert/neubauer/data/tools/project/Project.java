package com.hubert.neubauer.data.tools.project;

import com.hubert.neubauer.data.tools.user.User;

import java.time.LocalDate;
import java.util.List;

    /*
    //Proposed structure:
    Project:
        -Milestone1:
            --Tasks1:
                ---UpdateOnTask1;
                ---...
        -Task2:
            --Update1OnTask2;
            --Update2OnTask2;
     //Task doesn't have to be a part of milestone but a milestone has to be composed of tasks.
     */

public class Project {
    private User projectManager;                //the overseer
    private List<User> listOfWorkers;           //users allowed to work on the project
    private LocalDate dateOfStart;              //date on which the project started
    private LocalDate dateOfEnd;                //proposed date of finish
    private String description;                 //short description including the purpose, avaliable resources and so on
    private Boolean isFinished;                 //flag for if it's finished\
    private String projectName;
    private String projectDescription;
//I think it would be good to use map class to have a map of all tasks, updates and milestones that have been achieved

    public Project(User projectManager, List<User> listOfWorkers, LocalDate dateOfStart, LocalDate dateOfEnd, String description) {
        this.projectManager = projectManager;
        this.listOfWorkers = listOfWorkers;
        this.dateOfStart = dateOfStart;
        this.dateOfEnd = dateOfEnd;
        this.description = description;
    }

    public User getProjectManager() {
        return projectManager;
    }

    public void setProjectManager(User projectManager) {
        this.projectManager = projectManager;
    }

    public List<User> getListOfWorkers() {
        return listOfWorkers;
    }

    public void setListOfWorkers(List<User> listOfWorkers) {
        this.listOfWorkers = listOfWorkers;
    }

    public LocalDate getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(LocalDate dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    public void setDateOfStart() {
        dateOfStart = LocalDate.now();
    }

    public LocalDate getDateOfEnd() {
        return dateOfEnd;
    }

    public void setDateOfEnd(LocalDate dateOfEnd) {
        this.dateOfEnd = dateOfEnd;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getFinished() {
        return isFinished;
    }

    public void setFinished(Boolean finished) {
        isFinished = finished;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }
}
