/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import adt.ArrayList;
import utility.insertData;


/**
 *
 * @author user
 */
public class TutorialGroup {
    
    private String groupID;
    private double groupAverageGrade;
    private double groupAverageAttendace;
    private ArrayList<Tutor> tutors; 

    public TutorialGroup() {
    }

    public TutorialGroup(String groupID, double groupAverageGrade, double groupAverageAttendace) {
        this.groupID = groupID;
        this.groupAverageGrade = groupAverageGrade;
        this.groupAverageAttendace = groupAverageAttendace;
        this.tutors = new ArrayList<>();
    }

    public String getGroupID() {
        return groupID;
    }

    public void setGroupID(String groupID) {
        this.groupID = groupID;
    }

    public double getGroupAverageGrade() {
        return groupAverageGrade;
    }

    public void setGroupAverageGrade(double groupAverageGrade) {
        this.groupAverageGrade = groupAverageGrade;
    }

    public double getGroupAverageAttendace() {
        return groupAverageAttendace;
    }

    public void setGroupAverageAttendace(double groupAverageAttendace) {
        this.groupAverageAttendace = groupAverageAttendace;
    }

    @Override
    public String toString() {
        return "Group ID: " + groupID + "\n" + "Group Average Grade: " + groupAverageGrade + "\n" + "Group Average Attendace: " + groupAverageAttendace + "\n";
    }
    
    public void addTutorialGroup(Tutor tutor) {
        tutors.add(tutor);
    }
    
    
}
