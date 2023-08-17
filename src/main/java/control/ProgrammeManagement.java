/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import adt.AdtInterface;
import adt.ArrayList;
import boundary.ProgrammeManagementUI;
import entity.Programme;
import utility.MessageUI;

/**
 *
 * @author user
 */
public class ProgrammeManagement {

    public static AdtInterface<Programme> programmeList = new ArrayList<>();
    //private ProductDAO productDAO = new ProductDAO();
    private ProgrammeManagementUI programmeUI = new ProgrammeManagementUI();

    public void runProgrammeManagement() {
        int choice = 0;
        do {
            choice = programmeUI.getProgrameManagementChoice();
            switch (choice) {
                case 0:
                    MessageUI.displayExitMessage();
                    break;
                case 1:
                    addProgram();
                    programmeUI.listAllProgramme(getAllProgramme());
                    break;
                case 2:
                    removeProgram();

                    break;

                case 3:
                    findProgram();
                    break;

                case 4:
                    editProgram();
                    programmeUI.listAllProgramme(getAllProgramme());
                    break;

                case 5:
                    programmeUI.listAllProgramme(getAllProgramme());
                    break;

                case 6:
                    programmeUI.listAllProgramme(getAllProgramme());
                    break;

                case 7:
                    programmeUI.listAllProgramme(getAllProgramme());
                    break;

                case 8:
                    programmeUI.listAllProgramme(getAllProgramme());
                    break;

                case 9:
                    programmeUI.listAllProgramme(getAllProgramme());
                    break;
                default:
                    MessageUI.displayInvalidChoiceMessage();
            }
        } while (choice != 0);
    }
//    Add a new programme

    public void addProgram() {
        //do{
        //String code = 

        //}while()
        // check input programme exists or no in the current list
        // if duplicate then return false
        Programme newProgramme = programmeUI.inputProgrammeDetails();
        programmeList.add(newProgramme);

    }

//    Remove a programme
    public void removeProgram() {
        String code = programmeUI.inputProgrammeID();
        boolean found = false;
        if (code == null) {
            MessageUI.displayInvalidInputMessage(); // Handle invalid input if necessary
        }
        for (int j = 1; j <= programmeList.getNumberOfEntries(); j++) {
            Programme userfind = programmeList.getEntry(j);
            if (userfind != null && userfind.getProgrammeCode().equals(code)) {
                System.out.println("## Program Found");
                System.out.println(userfind);
                found = true;
            }
        }
        if (found) {
            String userResponse = programmeUI.deleteConfirmation();

            if (userResponse.equals("y")) {
                System.out.println("Deleting...");
                for (int i = 1; i <= programmeList.getNumberOfEntries(); i++) {
                    Programme userDelete = programmeList.getEntry(i);
                    if (userDelete.getProgrammeCode().equals(code)) {
                        programmeList.remove(i); // Delete the program from the list
                    }
                }
                programmeUI.listAllProgramme(getAllProgramme());
            } else {
                System.out.println("Operation canceled.");
            }
        } else {
            System.out.println("Program with ID " + code + " was not found."); // Program with the given ID was not found
        }

    }

    //    Find programme
    public void findProgram() {
        String code = programmeUI.inputProgrammeID();
        boolean found = false;
        if (code == null) {
            MessageUI.displayInvalidInputMessage(); // Handle invalid input if necessary
        }
        for (int j = 1; j <= programmeList.getNumberOfEntries(); j++) {
            Programme userfind = programmeList.getEntry(j);
            if (userfind != null && userfind.getProgrammeCode().equals(code)) {
                System.out.println("## Program Found");
                System.out.println(userfind);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Program with ID " + code + " was not found."); // Program with the given ID was not found
        }

    }

    //    Amend programme details
 public boolean editProgram() {
     String programCode = programmeUI.inputProgrammeID();
    // Find the program with the given program code
    Programme programToUpdate = null;
    for (int i = 1; i <= programmeList.getNumberOfEntries(); i++) {
        Programme userEdit = programmeList.getEntry(i);
        if (userEdit.getProgrammeCode().equals(programCode)) {
            programToUpdate = programmeList.getEntry(i);
            break;
        }
    }

    if (programToUpdate != null) {
        // Display the current details of the program to the user
        System.out.println("Current Program Details:");
        System.out.println("Programme Code: " + programToUpdate.getProgrammeCode());
        System.out.println("Programme Name: " + programToUpdate.getProgrammeName());
        System.out.println("Programme Description: " + programToUpdate.getProgrammeDescription());

        // Prompt the user for new details
        String newName = programmeUI.inputNewProgrammeName();
        String newDescription = programmeUI.inputNewDescription();

        // Update the program details
        programToUpdate.setProgrammeName(newName);
        programToUpdate.setProgrammeDescription(newDescription);

        System.out.println("Program details updated successfully.");
        return true;
    } else {
        System.out.println("Program with code " + programCode + " not found.");
        return false;
    }
}


    //    List all programmes
    public String getAllProgramme() {
        String outputStr = "";
        for (int i = 1; i <= programmeList.getNumberOfEntries(); i++) {
            //outputStr += "Programme" + programmeList.getEntry(i). + "\n";
            outputStr += programmeList.getEntry(i) + "\n";

        }
        return outputStr;
    }

    //    Add a tutorial group to a programme
    //    Remove a tutorial group from a programme
    //    List all tutorial groups for a programme
    //    Generate relevant reports.
    public static void main(String[] args) {
        ProgrammeManagement test1 = new ProgrammeManagement();

        // Add the initial data with useful descriptions
        programmeList.add(new Programme("BACS2063", "Data Structure", "Data structures are fundamental concepts in computer science that deal with organizing and storing data efficiently. This course covers various data structures such as arrays, linked lists, stacks, and queues, along with their algorithms and applications."));

        programmeList.add(new Programme("BMDS2113", "DATA VISUALISATION", "Data visualization is the process of representing data in a visual format to help in understanding patterns, trends, and insights. This course explores techniques to create informative and visually appealing charts, graphs, and dashboards for effective data analysis."));

        programmeList.add(new Programme("BACS3074", "Artificial Intelligence", "Artificial Intelligence (AI) focuses on creating intelligent machines that can simulate human-like behaviors and decision-making. This course delves into AI algorithms, machine learning, natural language processing, and robotics, paving the way for advanced applications."));

        programmeList.add(new Programme("BMMS2074", "Statistics of Data Science", "Statistics is a fundamental tool in data science that involves collecting, analyzing, and interpreting data to make informed decisions. This course covers concepts like probability, hypothesis testing, regression analysis, and statistical inference used in data-driven insights."));

        test1.runProgrammeManagement();
    }
}
