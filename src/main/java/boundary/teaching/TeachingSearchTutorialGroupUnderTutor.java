/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package boundary.teaching;

import adt.AdtInterface;
import adt.ArrayList;
import static boundary.teaching.TeachingAddTutorToCourse.teachingList;
import entity.Teaching;
import entity.Tutor;
import entity.TutorialGroup;
import utility.insertData;
import static utility.insertData.courseList;
import static utility.insertData.tutorialList;

public class TeachingSearchTutorialGroupUnderTutor extends javax.swing.JFrame {

    public static AdtInterface<Tutor> tutorList = insertData.tutorList;
    //public static AdtInterface<Course> courseList = insertData.courseList;

    public TeachingSearchTutorialGroupUnderTutor() {
        initComponents();
    }
    
//    private Course findCourseByID(String courseID) {
//        AdtInterface<Course> courseList = insertData.courseList;
//        for (int i = 1; i <= courseList.getNumberOfEntries(); i++) {
//            Course course = courseList.getEntry(i);
//            if (course.getCourseID().equals(courseID)) {
//                return course;
//            }
//        }
//        return null; // Course not found
//    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        jtfTutorID = new javax.swing.JTextField();
        jtfCourseName = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        label4 = new javax.swing.JLabel();
        errorMsg = new javax.swing.JLabel();
        jtfTutorName1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1500, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel3.setText("Teaching - Search Course Under Tutor");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));

        label2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        label2.setText("ENTER Tutor ID : ");
        jPanel1.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 220, 50));

        label3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        label3.setText("Tutor NAME :");
        jPanel1.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, -1, -1));

        jtfTutorID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jtfTutorID.setToolTipText("");
        jtfTutorID.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jtfTutorID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTutorIDActionPerformed(evt);
            }
        });
        jPanel1.add(jtfTutorID, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 340, 40));

        jtfCourseName.setEditable(false);
        jtfCourseName.setBackground(new java.awt.Color(255, 255, 255));
        jtfCourseName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jtfCourseName.setToolTipText("");
        jtfCourseName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jtfCourseName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCourseNameActionPerformed(evt);
            }
        });
        jPanel1.add(jtfCourseName, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 340, 40));

        searchButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        searchButton.setText("SEARCH");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        jPanel1.add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 180, 100, 40));

        backButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 670, 140, 40));

        label4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        label4.setText("TutorialGroup :");
        jPanel1.add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 280, 70));
        jPanel1.add(errorMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 340, 20));

        jtfTutorName1.setEditable(false);
        jtfTutorName1.setBackground(new java.awt.Color(255, 255, 255));
        jtfTutorName1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jtfTutorName1.setToolTipText("");
        jtfTutorName1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jtfTutorName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTutorName1ActionPerformed(evt);
            }
        });
        jPanel1.add(jtfTutorName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 340, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfTutorIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTutorIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTutorIDActionPerformed

    private void jtfCourseNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCourseNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCourseNameActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
       String Tutorid = jtfTutorID.getText().trim();
       
       System.out.println("selectedTutors : " + Tutorid);

        //Teaching t = new Teaching(selectedTutors, courseID, "");
        //teachingList.add(t);
        System.out.println("tutor id : " + teachingList.getEntry(1).getTutorID());
        System.out.println("Tutorial id : " + teachingList.getEntry(1).getGroupID());
        
        for (int i = 1; i <= teachingList.getNumberOfEntries(); i++) {
        Teaching teaching = teachingList.getEntry(i);

          // Use the TutorID to find the tutor's name in the tutorList
            if (Tutorid.equals(teaching.getTutorID())) {
                
                // Display the tutor's name in the jtfTutorName field
                Tutor tutor = tutorList.getEntry(i);
                jtfTutorName1.setText(tutor.getName());
                errorMsg.setText(""); // Clear error message if found
                //break; // Exit the loop once the tutor is found
                
               //coursesList_Text.setListData();
            }
            TutorialGroup tutorialGroup = tutorialList.getEntry(i);
            System.out.println("G:" +teaching.getGroupID());
           jtfCourseName.setText(teachingList.getEntry(i+1).getGroupID());
              
    
    }

//        if (!Tutorid.isEmpty()) {
//            errorMsg.setText(""); // Clear any previous error messages
//            boolean found = false; // Flag to indicate if a matching course is found
//
//            for (int i = 0; i < tutorList.getNumberOfEntries(); i++) {
//                if (Tutorid.equals(tutorList.getEntry(i + 1).getTutorID())) {
//
//                    jtfTutorName.setText(tutorList.getEntry(i + 1).getName());
//                    errorMsg.setText(""); // Clear error message if found
//                    found = true;
//
//                    
////                    ArrayList<Tutor> courses = courseList.getEntry(i + 1).getTutors();
//                    System.out.println("g:"+courses);
//                    if (courses != null && !courses.isEmpty()) {
//                        if (courses.equals(Tutorid)) {
//                            String[] courseID = new String[courses.getNumberOfEntries()];
//                            //                        String temp = programs.getNumberOfEntries();
//                            System.out.println("h:");
//                            for (int j = 0; j < courses.getNumberOfEntries(); j++) {
//                                courseID[j] = courses.getEntry(j + 1).getCourseID();
//                                System.out.println("hha:" + courseID[j]);
//                            }
//                            coursesList.setListData(courseID);
//                            //System.out.println("hhaha:" +courseID.getClass());
//                        }
//
//                    } else {
//                        coursesList.setListData(new String[]{"No Course"});
//                    }
//
//                    break; // Exit the loop since a match is found
//                }
//            }
//            if (!found) {
//                jtfTutorName.setText("");
//                errorMsg.setText("No such Tutor");
//                coursesList.setListData(new String[0]); // Clear program list
//            }
//        } else {
//            errorMsg.setText("Please enter a course ID");
//        }
    
    }//GEN-LAST:event_searchButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        setVisible(false);
        TeachingManagement t = new TeachingManagement();
        t.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void jtfTutorName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTutorName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTutorName1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TeachingSearchTutorialGroupUnderTutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeachingSearchTutorialGroupUnderTutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeachingSearchTutorialGroupUnderTutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeachingSearchTutorialGroupUnderTutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeachingSearchTutorialGroupUnderTutor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel errorMsg;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jtfCourseName;
    private javax.swing.JTextField jtfTutorID;
    private javax.swing.JTextField jtfTutorName1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JButton searchButton;
    // End of variables declaration//GEN-END:variables
}
