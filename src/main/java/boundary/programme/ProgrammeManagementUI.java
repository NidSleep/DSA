/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boundary.programme;

import entity.Programme;
import entity.TutorialGroup;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class ProgrammeManagementUI {

    Scanner scanner = new Scanner(System.in);
//    Add a new programme
//    Remove a programme
//    Find programme
//    Amend programme details
//    List all programmes
//    Add a tutorial group to a programme
//    Remove a tutorial group from a programme
//    List all tutorial groups for a programme
//    Generate relevant reports.

    public int getProgrameManagementChoice() {
        System.out.println("\nProgramme Management System");
        System.out.println("1. Add new programme");
        System.out.println("2. Remove a programme");
        System.out.println("3. Find a programme");
        System.out.println("4. Amend programme details");
        System.out.println("5. List all programme");
        System.out.println("6. Add a tutorial group to a programme");
        System.out.println("7. Remove a tutorial group from a programme");
        System.out.println("8. List all tutorial group for a programme");
        System.out.println("9. Generate report");
        System.out.println("0. Quit");
        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        System.out.println();
        return choice;
    }

    public void listAllProgramme(String outputStr) {
        System.out.println("\nList of Programme:\n" + outputStr);
    }

    public void listTutorialGroup(String whichProgramme,String outputStr) {
        //String whichProgramme = inputProgrammeID();
        System.out.println("\nList of Tutorial Group for " + whichProgramme + ":\n" + outputStr);
    }

    public void printProgrammeDetails(Programme programme) {
        System.out.println("Programme Details");
        System.out.println("Enter Tutorial Group ID: " + programme.getProgrammeCode());
        System.out.println("Programme name: " + programme.getProgrammeName());
        System.out.println("Programme Description: " + programme.getProgrammeDescription());
        //printTutorialGroupDetails(programme.getTutorialGroups());    
    }

//    public void printTutorialGroupDetails(TutorialGroup tutorialGroup) {
//        System.out.println("Tutorial Group Details");
//        System.out.println("Tutorial Group ID: " + tutorialGroup.getGroupID());
//        System.out.println("Group Average Grade: " + tutorialGroup.getGroupAverageGrade());
//        System.out.println("Group Average Attendace: " + tutorialGroup.getGroupAverageAttendace());
//    }
    public int invalidChoiceInput() {
        int choice;
        System.out.println("Invalid input. Please enter a valid integer choice.");
        choice = scanner.nextInt();
        scanner.nextLine(); // Clear the input buffer
        return choice;
    }

    public String inputProgrammeID() {
        System.out.print("Enter programme code: ");
        String code = scanner.nextLine();
        return code;
    }

    public String inputProgrammeName() {
        System.out.print("Enter programme name: ");
        String name = scanner.nextLine();
        return name;
    }

    public String inputTutorialGroupID() {
        System.out.print("Enter Tutorial Group ID: ");
        String groupID = scanner.nextLine();
        return groupID;
    }

    public double inputGroupAverageGrade() {
        System.out.print("Enter Group Average Grade: ");
        double groupAverageGrade = scanner.nextDouble();
        return groupAverageGrade;
    }

    public String inputNewProgrammeName() {
        System.out.print("Enter new programme name: ");
        String name = scanner.nextLine();
        return name;
    }

    public double inputGroupAverageAttendace() {
        System.out.print("Enter Group Average Attendace: ");
        double groupAverageAttendace = scanner.nextDouble();
        return groupAverageAttendace;
    }

    public String inputDescription() {
        System.out.print("Enter description: ");
        String des = scanner.nextLine();
        return des;
    }

    public String inputNewDescription() {
        System.out.print("Enter new description: ");
        String des = scanner.nextLine();
        return des;
    }

    public Programme inputProgrammeDetails() {
        String programmeCode = inputProgrammeID();
        String programmeName = inputProgrammeName();
        String programmeDescription = inputDescription();
        System.out.println();
        // only save a group already exists in the system 

        return new Programme(programmeCode, programmeName, programmeDescription);
    }

    public TutorialGroup inputTutorialGroupDetails() {
        String groupID = inputTutorialGroupID();
        double groupAverageGrade = inputGroupAverageGrade();
        double groupAverageAttendace = inputGroupAverageAttendace();
        System.out.println();
        return new TutorialGroup(groupID, groupAverageGrade, groupAverageAttendace);
    }

    public String deleteConfirmation() {
        String response;
        do {
            System.out.print("Are you sure you want to delete? (Y/N): ");
            response = scanner.nextLine().trim().toLowerCase();
        } while (!response.equals("y") && !response.equals("n"));

        return response;
    }

    public String addTutorialGroupConfirmation() {
        String response;
        do {
            System.out.print("Are you sure you want to add? (Y/N): ");
            response = scanner.nextLine().trim().toLowerCase();
        } while (!response.equals("y") && !response.equals("n"));

        return response;
    }

    public String removeTutorialGroupConfirmation() {
        String response;
        do {
            System.out.print("Are you sure you want to remove? (Y/N): ");
            response = scanner.nextLine().trim().toLowerCase();
        } while (!response.equals("y") && !response.equals("n"));

        return response;
    }

    public String InputSelectTutorialGroup() {
        String chooseTutorialGroup;

            System.out.print("Choose a tutorial group to remove: ");
            chooseTutorialGroup = scanner.nextLine();
                    //.trim().toLowerCase();


        return chooseTutorialGroup;
    }

}
