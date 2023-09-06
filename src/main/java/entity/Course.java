/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import adt.ArrayList;

/**
 *
 * @author Ru Poh
 */
public class Course {

    /*
    Course Management Subsystem
Add a new course
Remove a course
Find course
Amend course details
List all courses
Add programme to a course
Remove a programme from a course
Generate relevant reports

     */
    private String courseID;
    private String name;
    private Double courseFees;
    private Double courseCreditHours;
    private ArrayList<Programme> programs;
    private ArrayList<Tutor> tutors; 

    public Course() {
    }

    public Course(String courseID, String name, Double courseFees, Double courseCreditHours) {
        this.courseID = courseID;
        this.name = name;
        this.courseFees = courseFees;
        this.courseCreditHours = courseCreditHours;
        this.programs = new ArrayList<>();
        this.tutors = new ArrayList<>();
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCourseFees() {
        return courseFees;
    }

    public void setCourseFees(Double courseFees) {
        this.courseFees = courseFees;
    }

    public Double getCourseCreditHours() {
        return courseCreditHours;
    }

    public void setCourseCreditHours(Double courseCreditHours) {
        this.courseCreditHours = courseCreditHours;
    }

    public ArrayList<Programme> getPrograms() {
        return programs;
    }

    public void setPrograms(ArrayList<Programme> programs) {
        this.programs = programs;
    }

    public void addProgram(Programme program) {
        programs.add(program);
    }
    
    public void addTutor(Tutor tutor) {
        tutors.add(tutor);
    }
    
    public boolean hasTutor(Tutor tutor) {
        return tutors.contains(tutor);
    }
}
