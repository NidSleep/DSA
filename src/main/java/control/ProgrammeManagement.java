/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import adt.AdtInterface;
import adt.ArrayList;
import boundary.ProgrammeManagementUI;
import entity.Programme;

/**
 *
 * @author user
 */
public class ProgrammeManagement {

    private AdtInterface<Programme> programmeList = new ArrayList<>();
    //private ProductDAO productDAO = new ProductDAO();
    private ProgrammeManagementUI programmeUI = new ProgrammeManagementUI();
//    Add a new programme
boolean addProgram(Programme programmeObject){
    //do{
    String code = programmeUI.inputProgrammeID();
    //}while()
    // check input programme exists or no in the current list
    // if duplicate then return false
    programmeUI.inputProgrammeName();
    programmeUI.inputDescription();
    programmeUI.inputProgrammeDetails();
    
} 
//    Remove a programme
    //    Find programme
    //    Amend programme details
    //    List all programmes
    //    Add a tutorial group to a programme
    //    Remove a tutorial group from a programme
    //    List all tutorial groups for a programme
    //    Generate relevant reports.

}
