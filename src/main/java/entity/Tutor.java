/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import adt.ArrayList;

/**
 *
 * @author dfsdfds fddsfd
 */
public class Tutor {

    /*
    Tutor Management Subsystem
Add a new tutor
Remove a tutor
Find tutor
Amend tutor details
List all tutors
Filter tutors based on criteria
Generate relevant reports

     */
    private String tutorID;
    private String name;
    private double salary;
    private String address;
    private String position;

    private String courseID;
    private String programmeID;
    public ArrayList<TutorialGroup> tutorialGroups = new ArrayList<>();
    public TutorialGroup tutorialGroup;
     private ArrayList<Course> courses;

    public Tutor() {

    }

    public Tutor(String tutorID, String name, double salary, String address, String position, String programmeID) {
        this.tutorID = tutorID;
        this.name = name;
        this.salary = salary;
        this.address = address;
        this.position = position;
        this.programmeID = programmeID;
    }

    public Tutor(String name, double salary, String address, String position) {
        this.name = name;
        this.salary = salary;
        this.address = address;
        this.position = position;

    }

    public String getTutorID() {
        return tutorID;
    }

    public void setTutorID(String tutorID) {
        this.tutorID = tutorID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getProgrammeID() {
        return programmeID;
    }

    public void setProgrammeID(String programmeID) {
        this.programmeID = programmeID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public void printTutorInfo() {
        System.out.println("Tutor ID: " + tutorID);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Address: " + address);
        System.out.println("Position: " + position);
    }

    public void addTutorialGroups(TutorialGroup group) {
        tutorialGroups.add(group);
    }
    
    public boolean hasCourse(Course course) {
    // Check if the tutor is assigned to the specified course
    return course.hasTutor(this);
    }
    
    public ArrayList<Course> getCourses() {
        return courses;
    }
}
