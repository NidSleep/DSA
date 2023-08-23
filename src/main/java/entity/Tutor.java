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
    
    public Tutor()
    {
        
    }
    
    public Tutor(String tutorID,String name, String IC)
    {
        this.tutorID= tutorID;
        this.name=name;
        this.IC=IC;
    }
    
    // Getter and Setter methods for tutorID
    public String getTutorID() {
        return tutorID;
    }

    public void setTutorID(String tutorID) {
        this.tutorID = tutorID;
    }

    // Getter and Setter methods for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter methods for IC
    public String getIC() {
        return IC;
    }

    public void setIC(String IC) {
        this.IC = IC;
    }
}
