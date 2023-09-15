/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utility;

/**
 *
 * @author TRP
 */
import java.util.Comparator;
import entity.*;

public class CourseFeeComparators implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Course p1 = (Course) o1;
        Course p2 = (Course) o2;

        return p1.getCourseFees().compareTo(p2.getCourseFees());
    }
}
