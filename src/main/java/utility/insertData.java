/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utility;

import adt.AdtInterface;
import adt.ArrayList;
import entity.Tutor;

/**
 *
 * @author kenne
 */
public class insertData {

    public static AdtInterface<Tutor> tutorList = new ArrayList<>();
    
    public insertData()
    {
         insertTutor();
    }

    
    public void insertTutor()
    {
       tutorList.add(new Tutor("T1","kenneth",1200,"kl","LECTURER"));
       tutorList.add(new Tutor("T2","wei jie",1500,"selangor","TUTOR"));
       tutorList.add(new Tutor("T3","kenneth",2200,"indonesia","TUTOR"));
             
    }
    
    
    
    
    
}
