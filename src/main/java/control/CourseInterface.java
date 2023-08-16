/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package control;

/**
 *
 * @author Tan Ru Poh
 */
public interface CourseInterface<T> {

    boolean addNewCourse(T newCourse);
    boolean removeCourse(String courseName);
    T findCourse(String courseId);
    boolean editCourse(String courseId, T newEntry);
    void listAllCourse();
    boolean addProgToCourse(String courseId, String programmeId);
    boolean removeProgFromCourse(String courseId, String programmeId);
    void getCourseReport();
    
//    Extra 
    boolean add(int newPosition, T newCourse);
    boolean isEmpty();
    boolean isFull();
    void clear(); 
}
