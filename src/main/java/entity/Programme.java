/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import adt.ArrayList;
import java.io.Serializable;
import utility.*;

/**
 *
 * @author: Er Qing Yap
 */
public class Programme implements Serializable, Comparable<Programme> {

    // There are many programme
    // A programme consists of many tutorial group 
    private String programmeCode;
    private String programmeName;
    private String programmeDescription;
    public ArrayList<TutorialGroup> tutorialGroups = new ArrayList<>();
    public static ArrayList<Programme> programmeList = new ArrayList<>();
    public TutorialGroup tutorialGroup;
    private final ProgrammeComparators groupID = new ProgrammeComparators();

    public Programme() {
    }

    @Override
    public int compareTo(Programme o) {
        return programmeCode.compareTo(o.programmeCode);
    }

    public Programme(String programmeCode, String programmeName, String programmeDescription) {
        //public Programme(String programmeCode, String programmeName, String programmeDescription,TutorialGroup tutorialGroups) {
        this.programmeCode = programmeCode;
        this.programmeName = programmeName;
        this.programmeDescription = programmeDescription;
        this.tutorialGroups = new ArrayList<>();
    }

    public void addTutorialGroup(TutorialGroup tutorialGroup) {
        tutorialGroups.add(tutorialGroup);
    }

    public void removeTutorialGroup(int i) {
        tutorialGroups.remove(i);
    }

    public String getProgrammeCode() {
        return programmeCode;
    }

    public void setProgrammeCode(String programmeCode) {
        this.programmeCode = programmeCode;
    }

    public String getProgrammeName() {
        return programmeName;
    }

    public void setProgrammeName(String programmeName) {
        this.programmeName = programmeName;
    }

    public String getProgrammeDescription() {
        return programmeDescription;
    }

    public void setProgrammeDescription(String programmeDescription) {
        this.programmeDescription = programmeDescription;
    }

    public ArrayList<TutorialGroup> getTutorialGroups() {
        return tutorialGroups;
    }

    public TutorialGroup getTutorialGroup() {
        return tutorialGroup;
    }

    public void sortTutorialGroupsByGroupID() {
        // Sort the tutorialGroups within this programme by groupID
        ArrayList.insertionSort(tutorialGroups, new Comparator<TutorialGroup>() {
            @Override
            public int compare(TutorialGroup group1, TutorialGroup group2 {
                return group1.getGroupID().compareTo(group2.getGroupID());
            }
        }
        );
    }

    public boolean programmeExists(String inputID) {
        boolean found = false;
        System.out.println(programmeList);
        for (int index = 1; index <= programmeList.getNumberOfEntries(); index++) {
            System.out.println("checkpoint");
            Programme checkExists = programmeList.getEntry(index);
            if (inputID.equals(checkExists.getProgrammeCode())) {
                found = true;
            }
        }
        return found;
    }

    public static ArrayList<Programme> getProgrammeList() {
        return programmeList;
    }

    public static void setProgrammeList(ArrayList<Programme> programmeList) {
        Programme.programmeList = programmeList;
    }

    @Override
    public String toString() {
        return "Programme Code: " + programmeCode + "\n" + "Programme Name: " + programmeName + "\n" + "Programme Description: " + programmeDescription + "\n";
//        return programmeCode + " ";
    }

    public String getTutorialGroupString() {
        return "Programme Group List: " + "\n" + tutorialGroups + "\n";
//        return programmeCode + " ";
    }

    public String getProgrammeAndTutorialGroup() {
        return "Programme Code: " + programmeCode + "\n" + "Programme Name: " + programmeName + "\n" + "Programme Description: " + programmeDescription + "\n" + "Programme Group List: " + "\n" + tutorialGroups + "\n";
//        return programmeCode + " ";
    }
    
    public String getTutorialString(){
        ArrayList.insertionSort(programmeList, groupID);
        return "Programme Group List: " + "\n" + tutorialGroups + "\n";
//       
    }

//public String getSortedProgrammeAndTutorialGroup() {
//    // Sort tutorialGroups based on groupID using bubble sort
//    boolean swapped;
//    do {
//        swapped = false;
//        for (int i = 0; i < tutorialGroups.getNumberOfEntries()- 1; i++) {
//            TutorialGroup group1 = tutorialGroups.getEntry(i);
//            TutorialGroup group2 = tutorialGroups.getEntry(i + 1);
//
//            // Compare based on groupID (you can customize the comparison logic)
//            if (group1.getGroupID().compareTo(group2.getGroupID()) > 0) {
//                // Swap the groups
//                tutorialGroups.set(i, group2);
//                tutorialGroups.set(i + 1, group1);
//                swapped = true;
//            }
//        }
//    } while (swapped);
//
//    // Now, tutorialGroups is sorted by groupID
//
//    // Build the sorted string
//    StringBuilder sb = new StringBuilder();
//    sb.append("Tutorial Groups:\n");
//    for (TutorialGroup group : tutorialGroups) {
//        sb.append(group.toString()).append("\n");
//    }
//    return sb.toString();
//}
//
//
//    public int size() {
//        int count = 0;
//        for (Programme programme : this) {
//            count++;
//        }
//        return count;
//    }
//    
//public void resize(int newSize) {
//    if (newSize < 0) {
//        throw new IllegalArgumentException("New size cannot be negative");
//    }
//
//    // Create a new array or data structure of the desired size
//    TutorialGroup[] newGroups = new TutorialGroup[newSize];
//
//    // Transfer elements from the old array to the new one
//    for (int i = 0; i < Math.min(newSize, tutorialGroups.size()); i++) {
//        newGroups[i] = tutorialGroups.get(i);
//    }
//
//    // Update the internal reference to the new array or data structure
//    tutorialGroups = newGroups;
//}
//
//  public void set(int index, TutorialGroup group) {
//    if (index < 0 || index >= tutorialGroups.size()) {
//        throw new IndexOutOfBoundsException("Index is out of bounds");
//    }
//
//    // Update the element at the specified index
//    tutorialGroups.set(index, group);
//}
}
