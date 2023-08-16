/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.io.Serializable;

/**
 *
 * @author user
 */
public class Programme implements Serializable {

    // There are many programme
    // A programme consists of many tutorial group 
    private String programmeId;
    private String programmeName;
    private String programmeDescription;
    //List<TutorialGroup> tutorialGroups;

    public Programme() {
    }

    //public Programme(int programmeId, String programmeName, String programmeDescription, List<TutorialGroup> tutorialGroups) {
    public Programme(String programmeId, String programmeName, String programmeDescription) {
        this.programmeId = programmeId;
        this.programmeName = programmeName;
        this.programmeDescription = programmeDescription;
        //this.tutorialGroups = tutorialGroups;
    }

    public String getProgrammeId() {
        return programmeId;
    }

    public void setProgrammeId(String programmeId) {
        this.programmeId = programmeId;
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

    @Override
    public String toString() {
        return "Programme{" + "programmeId=" + programmeId + ", programmeName=" + programmeName + ", programmeDescription=" + programmeDescription + '}';
    }
    
    
}
