/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boundary;

import entity.Programme;

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

    public void printProgrammeDetails(Programme programme) {
        System.out.println("Programme Details");
        System.out.println("Programme code:" + programme.getProgrammeCode());
        System.out.println("Programme name: " + programme.getProgrammeName());
        System.out.println("Programme Description: " + programme.getProgrammeDescription());
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

    public String inputDescription() {
        System.out.print("Enter description: ");
        String des = scanner.nextLine();
        scanner.nextLine();
        return des;
    }

    public Programme inputProgrammeDetails() {
        String programmeCode = inputProgrammeID();
        String programmeName = inputProgrammeName();
        String programmeDescription = inputDescription();
        System.out.println();
        return new Programme(programmeCode,programmeName,programmeDescription);
    }
}
