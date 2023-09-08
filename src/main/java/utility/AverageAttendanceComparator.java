/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utility;

import entity.TutorialGroup;
import java.util.Comparator;

/**
 *
 * @author user
 */
public class AverageAttendanceComparator implements Comparator<TutorialGroup>{
       @Override
    public int compare(TutorialGroup group1, TutorialGroup group2) {
        // Compare based on average attendance
        double attendance1 = group1.getGroupAverageAttendance();
        double attendance2 = group2.getGroupAverageAttendance();

        // Use Double.compare to handle NaN values correctly
        return Double.compare(attendance1, attendance2);
    }
}
