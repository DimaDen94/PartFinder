package com.denejkodlj.partfinder.data;

import java.util.List;

/**
 * Created by Dmitry on 28.07.2017.
 */

public class User {
    private String fName;
    private String lName;
    private String phoneNumber;
    private String about;

    private List<Part> created;
    private List<Part> completed;

    private Part inProcess;

    public User(String fName, String lName, String phoneNumber, String about) {
        this.fName = fName;
        this.lName = lName;
        this.phoneNumber = phoneNumber;
        this.about = about;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public List<Part> getCreated() {
        return created;
    }

    public void setCreated(List<Part> created) {
        this.created = created;
    }

    public List<Part> getCompleted() {
        return completed;
    }

    public void setCompleted(List<Part> completed) {
        this.completed = completed;
    }

    public Part getInProcess() {
        return inProcess;
    }

    public void setInProcess(Part inProcess) {
        this.inProcess = inProcess;
    }
}
