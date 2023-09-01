/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import adt.ArrayList;
import java.io.Serializable;

/**
 *
 * @author userfvjvadjksfvkajsvfkv
 */
public class Programme implements Serializable {

    // There are many programme
    // A programme consists of many tutorial group 
    private String programmeCode;
    private String programmeName;
    private String programmeDescription;
    public ArrayList<TutorialGroup> tutorialGroups = new ArrayList<>();
    public static ArrayList<Programme> programmeList = new ArrayList<>();
    public TutorialGroup tutorialGroup;

    public Programme() {
    }

    public Programme(String programmeCode, String programmeName, String programmeDescription) {
        //public Programme(String programmeCode, String programmeName, String programmeDescription,TutorialGroup tutorialGroups) {
        this.programmeCode = programmeCode;
        this.programmeName = programmeName;
        this.programmeDescription = programmeDescription;
        this.tutorialGroups = new ArrayList<>();
    }

    public void addTutorialGroup(TutorialGroup tutorialGroup) {
        tutorialGroups.add(tutorialGroup);
    }

    public void removeTutorialGroup(int i) {
        tutorialGroups.remove(i);
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

    public ArrayList<TutorialGroup> getTutorialGroups() {
        return tutorialGroups;
    }

    public TutorialGroup getTutorialGroup() {
        return tutorialGroup;
    }

    public boolean programmeExists(String inputID) {
        boolean found = false;
        System.out.println(programmeList);
        for (int index = 1; index <= programmeList.getNumberOfEntries(); index++) {
            System.out.println("checkpoint");
            Programme checkExists = programmeList.getEntry(index);
            if (inputID.equals(checkExists.getProgrammeCode())) {
                found = true;
            }
        }
        return found;
    }

    public static ArrayList<Programme> getProgrammeList() {
        return programmeList;
    }

    public static void setProgrammeList(ArrayList<Programme> programmeList) {
        Programme.programmeList = programmeList;
    }

    @Override
    public String toString() {
        return "Programme Code: " + programmeCode + "\n" + "Programme Name: " + programmeName + "\n" + "Programme Description: " + programmeDescription + "\n" + "Programme Group List: " + "\n" + tutorialGroups + "\n";
//        return programmeCode + " ";
    }

}
