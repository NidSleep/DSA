/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import adt.ArrayList;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author 
 */
public class Programme implements Serializable {

    // There are many programme
    // A programme consists of many tutorial group 
    private String programmeCode;
    private String programmeName;
    private String programmeDescription;
    private ArrayList<Course> courses;
    //List<TutorialGroup> tutorialGroups;

    public Programme() {
    }

    //public Programme(int programmeId, String programmeName, String programmeDescription, List<TutorialGroup> tutorialGroups) {
    public Programme(String programmeCode, String programmeName, String programmeDescription) {
        this.programmeCode = programmeCode;
        this.programmeName = programmeName;
        this.programmeDescription = programmeDescription;
        //this.tutorialGroups = tutorialGroups;
    }

    public String getProgrammeCode() {
        return programmeCode;
    }

    public void setProgrammeCode(String programmeCode) {
        this.programmeCode = programmeCode;
    }

    public String getProgrammeName() {
        return programmeName;
    }

    public void setProgrammeName(String programmeName) {
        this.programmeName = programmeName;
    }

    public String getProgrammeDescription() {
        return programmeDescription;
    }

    public void setProgrammeDescription(String programmeDescription) {
        this.programmeDescription = programmeDescription;
    }

    // no wonder u need or not just leave it
    public void addCourse(Course course) {
        courses.add(course);
    }
    
    @Override
    public String toString() {
        return "Programme Code: " + programmeCode + "\n" + "Programme Name: " + programmeName + "\n" + "Programme Description: " + programmeDescription + "\n";
    }

}
