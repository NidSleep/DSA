/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import adt.ArrayList;
import java.io.Serializable;

/**
 *
 * @author kenne
 */
public class Teaching implements Serializable{
    private String tutorID;
    private String tutorialID;
    private String courseID;
    public ArrayList<TutorialGroup> tutorialGroups = new ArrayList<>();
    public ArrayList<Course> courses = new ArrayList<>();
    public ArrayList<Tutor> tutors = new ArrayList<>();
    public static ArrayList<Teaching> teachingList = new ArrayList<>();
    
     public Teaching()
    {
        tutorialGroups = new ArrayList<>();
        courses = new ArrayList<>();
        tutors = new ArrayList<>();
    }
    
    public Teaching(String tutorID,String tutorialID, String courseID)
    {
       this.tutorID = tutorID;
       this.tutorialID = tutorialID;
       this.courseID = courseID;   
       tutorialGroups = new ArrayList<>();
       courses = new ArrayList<>();
       tutors = new ArrayList<>();
       
    }
    
    public String getTutorID() {
        return tutorID;
    }

    public void setTutorID(String tutorID) {
        this.tutorID = tutorID;
    }

    public String getTutorialID() {
        return tutorialID;
    }

    public void setTutorialID(String tutorialID) {
        this.tutorialID = tutorialID;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

  
    public void addTutorToCourse(Tutor tutor, Course course) {
        //Assign tutor to course
        course.addTutor(tutor);
    }
    
    //Assign a tutor to a tutorial group
    public void addTutorToTutorial(Tutor tutors, TutorialGroup tutorialgroup){
        tutorialgroup.addTutorialGroup(tutors);
    }
}

    /*
    Teaching Assignment Subsystem
    
    Assign tutorial groups to tutor
Search courses under a tutor
Search tutors for a course
List all tutors for a course
List courses under a tutor
Filter tutors based on criteria
Generate relevant reports

     */