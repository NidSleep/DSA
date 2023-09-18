/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utility;

import entity.Tutor;
import java.util.Comparator;


/**
 *
 * @author kenne
 */
public class TutorSalaryComparator implements Comparator {
    
    public int compare(Object o1, Object o2) {
        Tutor p1 = (Tutor) o1;
        Tutor p2 = (Tutor) o2;
        
        return (""+p1.getSalary()).compareTo(""+p2.getSalary());
    }
}
