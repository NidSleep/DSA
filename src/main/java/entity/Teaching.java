/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import adt.ArrayList;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author kenne
 */
public class Teaching implements Serializable{
    private String tutorID;
    private String name;
    private String groupID;
    private String courseID;
    public ArrayList<TutorialGroup> tutorialGroups = new ArrayList<>();
    public ArrayList<Course> courses = new ArrayList<>();
    public ArrayList<Tutor> tutors = new ArrayList<>();
    
     public Teaching()
    {
       
    }
    
    public Teaching(String tutorID, String name,String groupID, String courseID)
    {
       this.tutorID = tutorID;
       this.name = name;
       this.groupID = groupID;
       this.courseID = courseID;   
       tutorialGroups = new ArrayList<>();
       courses = new ArrayList<>();
       tutors = new ArrayList<>();
       
    }
    
    public String getTutorID() {
        return tutorID;
    }

    public String getGroupID() {
        return groupID;
    }

    public String getCourseID() {
        return courseID;
    }
  
    public void addTutorToCourse(Tutor tutor, Course course) {
        //Assign tutor to course
        course.addTutor(tutor);
    }
    
    //Assign a tutor to a tutorial group
    public void addTutorToTutorial(Tutor tutors, TutorialGroup tutorialgroup){
        tutorialgroup.addTutors(tutors);
    }   
    
    //Assign tutorial groups to tutor
    public void addTutorialToTutor(Tutor tutors, TutorialGroup groups){
       tutors.addTutorialGroups(groups);
    }   
    
    // Method to search for courses under a specific tutor
    public ArrayList<Course> searchCoursesUnderTutor(Tutor tutor) {
        ArrayList<Course> coursesUnderTutor = new ArrayList<>();
        // Iterate through the courses to find those associated with the tutor
        for(Course course : courses) {
            if (course.hasTutor(tutor)) {
                coursesUnderTutor.add(course);
            }
       
    }
         return coursesUnderTutor;
    }
    
    //Search tutors for a course
    public ArrayList<Tutor> searchTutorsForCourse(Course course) {
        ArrayList<Tutor> tutorsForCourse = new ArrayList<>();

        // Iterate through the tutors to find those associated with the course
        for (Tutor tutor : tutors) { 
            if (tutor.hasCourse(course)) { //  check whether a specific tutor is assigned to a particular course
                tutorsForCourse.add(tutor);
            }
        }

        return tutorsForCourse;
    }
    
    //List all tutors for a course
     public ArrayList<Tutor> listTutorsForCourse(Course course) {
        ArrayList<Tutor> tutorsForCourse = new ArrayList<>();

        // Iterate through the tutors to find those associated with the course
        for (Tutor tutor : tutors) { 
            if (tutor.hasCourse(course)) { //check whether that tutor got or not /is assigned to a partipular course
                tutorsForCourse.add(tutor);
            }
        }

        return tutorsForCourse;
    }
     
     //List courses under a tutor
     public ArrayList<Course> listCoursesUnderTutor(Tutor tutor) {
        ArrayList<Course> coursesUnderTutor = new ArrayList<>();

        // Iterate through the courses to find those associated with the tutor
        for (Course course : courses) { // Assuming you have a courses ArrayList
            if (course.hasTutor(tutor)) { // Assuming you have a hasTutor method in the Course class
                coursesUnderTutor.add(course);
            }
        }

        return coursesUnderTutor;
    }
     
    //Filter tutors based on criteria
     public ArrayList<Tutor> filterTutorsByCriteria(String criteria) {
        ArrayList<Tutor> filteredTutors = new ArrayList<>();

        // Iterate through the tutors and apply the filter criteria
        for (Tutor tutor : tutors) { 
            //Filter by tutor's name:
            if (tutor.getName().contains(criteria)) {
                filteredTutors.add(tutor);
            }
            //Filter by Tutor ID;
            if(tutor.getTutorID().equals(criteria))
                filteredTutors.add(tutor);
        }

        return filteredTutors;
    }
     
 
}
