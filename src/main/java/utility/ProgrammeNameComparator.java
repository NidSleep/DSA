/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utility;

import java.util.Comparator;
/**
 *
 * @author user
 */

import entity.Programme;
public class ProgrammeNameComparator implements Comparator{
    
    @Override
    public int compare(Object o1, Object o2) {
        Programme p1 = (Programme) o1;
        Programme p2 = (Programme) o2;
        
        return p1.getProgrammeName().compareTo(p2.getProgrammeName());
    }
   
    
}