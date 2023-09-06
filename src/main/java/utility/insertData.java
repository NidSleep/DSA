/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utility;

import adt.AdtInterface;
import adt.ArrayList;
import entity.*;

/**
 *
 * @author kenne
 */
public class insertData {

    public static AdtInterface<Tutor> tutorList = new ArrayList<>();
    public static AdtInterface<Programme> programmeList = new ArrayList<>();
    public static AdtInterface<Course> courseList = new ArrayList<>();
    public static AdtInterface<Teaching> teachingList = new ArrayList<>();
    public static AdtInterface<TutorialGroup> tutorialList = new ArrayList<>();
 
    public insertData() {
        insertTutor();
        insertProgram();
        insertCourse();
        insertTeaching();
        insertTutorial();
    }

    public void insertTutor() {
        tutorList.add(new Tutor("T1", "kenneth", 1200, "kl", "LECTURER"));
        tutorList.add(new Tutor("T2", "wei jie", 1500, "selangor", "TUTOR"));
        tutorList.add(new Tutor("T3", "kenneth", 2200, "indonesia", "TUTOR"));
    }

    public void insertProgram() {
        programmeList.add(new Programme("RSW", "Bachelor of Software Engineering (Honours)", "Data visualization is the process of representing data in a visual format to help in understanding patterns, trends, and insights. This course explores techniques to create informative and visually appealing charts, graphs, and dashboards for effective data analysis."));
        programmeList.add(new Programme("RIS", "Bachelor of Information Technology (Honours)", "Artificial Intelligence (AI) focuses on creating intelligent machines that can simulate human-like behaviors and decision-making. This course delves into AI algorithms, machine learning, natural language processing, and robotics, paving the way for advanced applications."));
        programmeList.add(new Programme("RMM", "Bachelor of Science (Honours) in Management Mathematics", "Statistics is a fundamental tool in data science that involves collecting, analyzing, and interpreting data to make informed decisions. This course covers concepts like probability, hypothesis testing, regression analysis, and statistical inference used in data-driven insights."));
    }

    public void insertCourse() {
        courseList.add(new Course("BACS3074", "Artificial Intelligence", 873.00, 3.0));
        courseList.add(new Course("AAMS3184", "Discrete Mathematics", 582.00, 2.0));
        courseList.add(new Course("BACS3013", "Data Science", 692.00, 3.0));
    }

    private void insertTeaching() {
       teachingList.add(new Teaching("T1","G1" ,"BAC3074"));
       teachingList.add(new Teaching("T2","G2" ,"AAMS3184"));
       teachingList.add(new Teaching("T3","G3" ,"BACS3013"));
    }

    private void insertTutorial() {
        tutorialList.add(new TutorialGroup("G1", 3.7, 0.7));
        tutorialList.add(new TutorialGroup("G2", 3.7, 0.7));
    }

}
