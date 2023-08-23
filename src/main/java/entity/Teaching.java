/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.io.Serializable;

/**
 *
 * @author kenne
 */
public class Teaching implements Serializable{
    private String tutorID;
    private String tutorialID;
    private String courseID;
    
     public Teaching()
    {
        
    }
    
    public Teaching(String tutorID,String tutorialID, String courseID)
    {
       this.tutorID = tutorID;
       this.tutorialID = tutorialID;
       this.courseID = courseID;   
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

  
    public void assignTutorToCourse(Tutor tutor, Course course) {
        //Assign tutor to course
        //course.assignTutor(tutor);
    }
    
    //Assign a tutor to a tutorial group
    public void assignTutorToTutorial(Tutor tutor, TutorialGroup tutorialgroup){
        //tutor.assignTutor(tutorialgroup);
    }
}

    /*
    Teaching Assignment Subsystem
    
    Assign tutorial groups to tutor
Assign a tutor to a tutorial group
Search courses under a tutor
Search tutors for a course
List all tutors for a course
List courses under a tutor
Filter tutors based on criteria
Generate relevant reports

     */