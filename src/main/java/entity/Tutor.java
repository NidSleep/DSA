/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

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
    private String IC;
    private String courseID;
    private String programmeID;
    private double salary;
    private String address;

    public Tutor() {

    }

    public Tutor(String tutorID, String name, String IC) {
        this.tutorID = tutorID;
        this.name = name;
        this.IC = IC;
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

    public String getIC() {
        return IC;
    }

    public void setIC(String IC) {
        this.IC = IC;
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

    public void setAddress(String address) {
        this.address = address;
    }
    
    

}
