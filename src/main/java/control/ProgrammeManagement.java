/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import adt.AdtInterface;
import adt.ArrayList;
import boundary.ProgrammeManagementUI;
import entity.Programme;
import entity.TutorialGroup;
import java.util.InputMismatchException;
import java.util.Scanner;
import utility.MessageUI;
import utility.ValidationException;
import utility.insertData;

/**
 *
 * @author user
 */
public class ProgrammeManagement {

    public static AdtInterface<Programme> programmeList = insertData.programmeList;
    public static AdtInterface<TutorialGroup> tutorialGroupList = new ArrayList<>();
    //private ProductDAO productDAO = new ProductDAO();
    private ProgrammeManagementUI programmeUI = new ProgrammeManagementUI();
    public Programme programme = new Programme();
    private Scanner scanner = new Scanner(System.in);

    public void runProgrammeManagement() {

        int choice = 0;
        do {
            choice = programmeUI.getProgrameManagementChoice();
            try {
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
                        addTutorialGroup();
                        break;

                    case 7:
                        removeTutorialGroup();
                        break;

                    case 8:
                        getAllTutorialGroup();
                        break;

                    case 9:
                        programmeUI.listAllProgramme(getAllProgramme());
                        break;
                    default:
                        MessageUI.displayInvalidChoiceMessage();
                }
            } catch (InputMismatchException e) {
                scanner.nextLine(); // Clear the input buffer
                choice = programmeUI.invalidChoiceInput();
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
        //programmeList.sort();
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
            System.out.println("Programme with ID " + code + " was not found."); // Program with the given ID was not found
        }

    }

    public void removeInGUI(String codeToRemove) {
        String code = codeToRemove;
        for (int i = 1; i <= programmeList.getNumberOfEntries(); i++) {
            Programme userDelete = programmeList.getEntry(i);
            if (userDelete.getProgrammeCode().equals(code)) {
                programmeList.remove(i); // Delete the program from the list
            }
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

    public Programme searchProgram(String programmeID) {
        String code = programmeID;
        boolean found = false;
        if (code == null) {
            MessageUI.displayInvalidInputMessage(); // Handle invalid input if necessary
        }
        for (int j = 1; j <= programmeList.getNumberOfEntries(); j++) {
            Programme userfind = programmeList.getEntry(j);
            if (userfind != null && userfind.getProgrammeCode().equals(code)) {

                found = true;
                return userfind;
            }
        }
        if (!found) {
            System.out.println("Program with ID " + code + " was not found."); // Program with the given ID was not found
        }
        return null;
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

    //    List all programmes (Maybe add the group oso Tutorial Group : G1 G2 G3 G4)
    public static String getAllProgramme() {
        String outputStr = "";
        for (int i = 1; i <= programmeList.getNumberOfEntries(); i++) {
            //outputStr += "Programme" + programmeList.getEntry(i). + "\n";
            outputStr += programmeList.getEntry(i) + "\n";

        }
        return outputStr;
    }

    //    Add a tutorial group to a programme (user choose which tutorial group to add first then add)
    public void addTutorialGroup() {
        String inputID = programmeUI.inputProgrammeID();

        while (!inputID.equals("x")) {
            boolean programFound = false;

            for (int j = 0; j < programmeList.getNumberOfEntries(); j++) {
                Programme userfind = programmeList.getEntry(j);
                if (userfind != null && userfind.getProgrammeCode().equals(inputID)) {
                    System.out.println("## Program Found");
                    System.out.println(userfind);
                    String userResponse = programmeUI.addTutorialGroupConfirmation();

                    if (userResponse.equals("y")) {
                        TutorialGroup newTutorialGroup = programmeUI.inputTutorialGroupDetails();
                        userfind.addTutorialGroup(newTutorialGroup);
                        programmeList.add(j, userfind); // Update the program in the list
                        System.out.println("Operation successful.");
                        programFound = true;
                        break;
                    } else {
                        System.out.println("Operation canceled.");
                        programFound = true;
                        break;
                    }
                }
            }

            if (!programFound) {
                System.out.print("Programme Code does not exist. Enter Programme Code again or press 'x' to cancel: ");
                inputID = scanner.nextLine();
            } else {
                break; // This will break the outer loop and exit if a program is found
            }
        }

        System.out.println("Exiting program.");
    }

//    Remove a tutorial group from a programme
    public void removeTutorialGroup() {
        String inputID = programmeUI.inputProgrammeID();
        boolean foundProgramme = false, foundTutorialGroup = false;
        if (inputID == null) {
            MessageUI.displayInvalidInputMessage();
        }// Handle invalid input if necessary
        while (!inputID.equals("x")) {
            for (int j = 1; j < programmeList.getNumberOfEntries(); j++) {
                Programme userfind = programmeList.getEntry(j);
                if (userfind != null && userfind.getProgrammeCode().equals(inputID)) {
                    System.out.println("## Program Found");
                    System.out.println(userfind);
                    foundProgramme = true;
                    //found = true;
                    // let user choose a tutorial group in that programme.
                    String whichGroup = programmeUI.InputSelectTutorialGroup();
                    while (!whichGroup.equals("x")) {
                        for (int i = 1; i <= userfind.getTutorialGroups().getNumberOfEntries() + 1; i++) {
                            ArrayList<TutorialGroup> whichTutorialGroups = userfind.getTutorialGroups();
                            String findTutorialGroupID = whichTutorialGroups.getEntry(i).getGroupID();
                            System.out.println("CheckPoint:" + whichTutorialGroups.getEntry(i));
                            //System.out.println("Num:" + whichTutorialGroups.getNumberOfEntries());
                            if (findTutorialGroupID.equals(whichGroup)) {
                                TutorialGroup theTutorialGroup = whichTutorialGroups.getEntry(i);
                                System.out.println("## Tutorial Found");
                                System.out.println(theTutorialGroup);
                                String userResponse = programmeUI.removeTutorialGroupConfirmation();
                                if (userResponse.equals("y")) {
                                    userfind.getTutorialGroups().remove(i);
                                    System.out.println(userfind);
                                    //ArrayList<TutorialGroup> allGroupInAProgramme = programme.getTutorialGroups();
//                        System.out.println(allGroupInAProgramme);
//                        selectTutorialGroup(allGroupInAProgramme);
                                    System.out.println("Deleting...");
                                    System.out.println("Operation completed.");
                                    foundTutorialGroup = true;
                                } else if (userResponse.equals("n")) {
                                    System.out.println("Operation canceled.");
                                    foundTutorialGroup = true;
                                    whichGroup = "x";
                                    break;
                                }

                            }
                        }
                        if (!foundTutorialGroup) {
                            System.out.print("Tutorial Group does not exist. Enter Programme Code again or press 'x' to cancel: ");
                            whichGroup = scanner.nextLine();
                        } else {
                            break; // This will break the outer loop and exit if a program is found
                        }
                        //;

//                        whichTutorialGroup.
                        // if the groupid = which groupid then only ## Tutorial Group Found 
                        // let user confirm
                        // delete the tutorial Group 
                        //System.out.println("cheeck");
                    }
                    //programmeList.getEntry(j).getTutorialGroups();
                    break;

                }
            }

            if (!foundProgramme) {
                System.out.print("Programme Code does not exist. Enter Programme Code again or press 'x' to cancel: ");
                inputID = scanner.nextLine();
            } else {
                break; // This will break the outer loop and exit if a program is found
            }

        }

        System.out.println("Exiting program.");

    }

    public void selectTutorialGroup(ArrayList<TutorialGroup> tutorialList) {
        System.out.println("Available Tutorial Groups:");
        System.out.println(tutorialList);
        for (int i = 0; i < tutorialList.getNumberOfEntries(); i++) {
            System.out.println((i + 1) + ". " + tutorialList.getEntry(i).getGroupID());
        }

        int choice;
        do {
            System.out.print("Select a Tutorial Group (1-" + tutorialList.getNumberOfEntries() + "): ");
            choice = scanner.nextInt();
            String userResponse = programmeUI.removeTutorialGroupConfirmation();
            if (userResponse.equals("y")) {
                //String whichGroup = programmeUI.InputSelectTutorialGroup();
//                        ArrayList<TutorialGroup> allGroupInAProgramme = programme.getTutorialGroups();
//                        selectTutorialGroup(allGroupInAProgramme);
                programme.removeTutorialGroup(choice - 1);

            } else {
                System.out.println("Operation canceled.");
                break;
            }
        } while (choice < 1 || choice > tutorialList.getNumberOfEntries());

    }

    //    List all tutorial groups for a programme
    public void getAllTutorialGroup() {
        String outputStr = "";
        boolean found = false;
        String whichProgramme = programmeUI.inputProgrammeID();
        if (whichProgramme == null) {
            MessageUI.displayInvalidInputMessage();
        }// Handle invalid input if necessary
        while (!whichProgramme.equals("x")) {
            for (int j = 1; j < programmeList.getNumberOfEntries(); j++) {
                Programme userfind = programmeList.getEntry(j);
                if (userfind != null && userfind.getProgrammeCode().equals(whichProgramme)) {
                    found = true;
                    System.out.println("## Program Found");
                    for (int i = 1; i <= userfind.getTutorialGroups().getNumberOfEntries(); i++) {
                        //outputStr += "Programme" + programmeList.getEntry(i). + "\n";
                        outputStr += userfind.getTutorialGroups() + "\n";
                    }
                }
            }

            if (!found) {
                System.out.print("Programme Code does not exist. Enter Programme Code again or press 'x' to cancel: ");
                whichProgramme = scanner.nextLine();
            } else {
                break; // This will break the outer loop and exit if a program is found
            }
        }
        //return outputStr;
        System.out.println("\nList of Tutorial Group for " + whichProgramme + ":\n" + outputStr);
    }
    //    Generate relevant reports. 
    //    Attendance Report by Tutorial Group

    /*    Report to see what is a most similar programme to a programme
        public double calculateSimilarityScore(ItemSet otherSet) {
        Set<String> intersection = new HashSet<>(items);
        intersection.retainAll(otherSet.items);

        int commonElements = intersection.size();
        int totalUniqueElements = items.size() + otherSet.items.size() - commonElements;

        double similarityScore = (double) commonElements / totalUniqueElements;
        return similarityScore;
    }
     */
    public static void main(String[] args) {
        ProgrammeManagement test1 = new ProgrammeManagement();

//        Programme programme1 = new Programme("RDS", "Bachelor of Computer Science (Honours) in Data", "This programme is designed to train students in both computer science and data science");
//        TutorialGroup tutorialGroup = new TutorialGroup("G1", 3.7, 0.7);
//        programme1.addTutorialGroup(tutorialGroup);
//        TutorialGroup tutorialGroup2 = new TutorialGroup("G2", 3.7, 0.7);
//        programme1.addTutorialGroup(tutorialGroup2);
//        programmeList.add(programme1);
//        System.out.println(programme1);
//        
//        // Add the initial data with useful descriptions
//        //programmeList.add(new Programme("RDS", "Bachelor of Computer Science (Honours) in Data", "This programme is designed to train students in both computer science and data science"));
//        programmeList.add(new Programme("RSW", "Bachelor of Software Engineering (Honours)", "Data visualization is the process of representing data in a visual format to help in understanding patterns, trends, and insights. This course explores techniques to create informative and visually appealing charts, graphs, and dashboards for effective data analysis."));
//
//        programmeList.add(new Programme("RIS", "Bachelor of Information Technology (Honours)", "Artificial Intelligence (AI) focuses on creating intelligent machines that can simulate human-like behaviors and decision-making. This course delves into AI algorithms, machine learning, natural language processing, and robotics, paving the way for advanced applications."));
//
//        programmeList.add(new Programme("RMM", "Bachelor of Science (Honours) in Management Mathematics", "Statistics is a fundamental tool in data science that involves collecting, analyzing, and interpreting data to make informed decisions. This course covers concepts like probability, hypothesis testing, regression analysis, and statistical inference used in data-driven insights."));
        insertData dataInitializer = new insertData();

        // Call the initialize method to populate the data
        dataInitializer.initialize();
        //tutorialGroupList.add(new TutorialGroup("G7", 3.7, 0.7));
        test1.runProgrammeManagement();
    }
}
