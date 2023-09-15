/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utility;

/**
 *
 * @author user
 */
import entity.Programme;
import java.util.Comparator;

public class ProgrammeComparators implements Comparator{
    
    @Override
    public int compare(Object o1, Object o2) {
        Programme p1 = (Programme) o1;
        Programme p2 = (Programme) o2;
        
        return p1.getProgrammeCode().compareTo(p2.getProgrammeCode());
    }
}
