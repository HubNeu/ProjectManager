package com.hubert.neubauer.data.tools.projects;

import com.hubert.neubauer.data.tools.users.User;

import java.time.LocalDate;

public class Milestone {
    private Project parentProject;
    private String mileStoneName;
    private String milestoneDescription;
    private LocalDate dateOfStart;
    private LocalDate dateOfEnd;                    //Think about using a list to store all the changes, if someone wants the current dateOfEnd, they get the last position, if first then first element and you can get whole history of changes
    private User designatedUser;                    //this could also be a team so think about it

    public Milestone(Project parentProject, String mileStoneName, String milestoneDescription, LocalDate dateOfEnd, User designatedUser) {
        this.parentProject = parentProject;
        this.mileStoneName = mileStoneName;
        this.milestoneDescription = milestoneDescription;
        this.dateOfStart = LocalDate.now();
        this.dateOfEnd = dateOfEnd;
        this.designatedUser = designatedUser;
    }

    public Project getParentProject() {
        return parentProject;
    }

    public void setParentProject(Project parentProject) {
        this.parentProject = parentProject;
    }

    public String getMileStoneName() {
        return mileStoneName;
    }

    public void setMileStoneName(String mileStoneName) {
        this.mileStoneName = mileStoneName;
    }

    public String getMilestoneDescription() {
        return milestoneDescription;
    }

    public void setMilestoneDescription(String milestoneDescription) {
        this.milestoneDescription = milestoneDescription;
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

    public User getDesignatedUser() {
        return designatedUser;
    }

    public void setDesignatedUser(User designatedUser) {
        this.designatedUser = designatedUser;
    }
}
