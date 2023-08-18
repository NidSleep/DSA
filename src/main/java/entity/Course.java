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

    private String courseID;
    private String name;
    private ArrayList<Programme> programs;

    public Course() {
    }

    public Course(String courseID, String name) {
        this.courseID = courseID;
        this.name = name;
        this.programs = new ArrayList<>();
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

    public void addProgram(Programme program) {
        programs.add(program);
    }
    // Example codes: 
//    Program program1 = new Program(1, "Computer Science");
//    Program program2 = new Program(2, "Engineering");
//
//    Course mathCourse = new Course(101, "Mathematics");
//    mathCourse.addProgram (program1);
//    mathCourse.addProgram (program2);

}
