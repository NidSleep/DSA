/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utility;
import entity.*;
import java.util.Comparator;

/**
 *
 * @author user
 */
public class GroupIDComparator implements Comparator<Programme> {
    @Override
    public int compare(Programme p1, Programme p2) {
        // First, compare by programmeCode
        int codeComparison = p1.getProgrammeCode().compareTo(p2.getProgrammeCode());

        // If the programmeCodes are the same, compare by groupID
        if (codeComparison == 0) {
            String groupID1 = p1.getTutorialGroups().isEmpty() ? "" : p1.getTutorialGroups().getEntry(0).getGroupID();
            String groupID2 = p2.getTutorialGroups().isEmpty() ? "" : p2.getTutorialGroups().getEntry(0).getGroupID();
            return groupID1.compareTo(groupID2);
        }

        return codeComparison;
    }

}

