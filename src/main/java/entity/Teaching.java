/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author kenne
 */
public class Teaching {

     public Teaching()
    {
        
    }
    
    public Teaching(String tutorID,String name, String IC)
    {
        this.tutorID= tutorID;
        this.name=name;
        
    }
    /*
    Teaching Assignment Subsystem
Assign tutor to course
Assign tutorial groups to tutor
Assign a tutor to a tutorial group
Search courses under a tutor
Search tutors for a course
List all tutors for a course
List courses under a tutor
Filter tutors based on criteria
Generate relevant reports

     */
    private String tutorID;
    private String name;
    private String tutorialID;
    
    
    
    
}
