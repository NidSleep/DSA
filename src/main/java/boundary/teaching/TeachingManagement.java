/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package boundary.teaching;

import boundary.course.*;
import adt.ArrayList;
import adt.AdtInterface;
import entity.Teaching;
import java.io.*;
import javax.swing.JOptionPane;
import boundary.mainPage;


/**
 *
 * @author
 */
public class TeachingManagement extends javax.swing.JFrame {

    private AdtInterface<Teaching> teachingList = new ArrayList<>();

    public TeachingManagement() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        DisplayAllTutorForCourse = new javax.swing.JButton();
        DisplayTutorCourse = new javax.swing.JButton();
        reportCourseButton = new javax.swing.JButton();
        SearchCourseUnderTutor = new javax.swing.JButton();
        addTeachingButton1 = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        AddTutorialGroupToTutor1 = new javax.swing.JButton();

        label1.setText("label1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1500, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel1.setText("Teaching");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));

        DisplayAllTutorForCourse.setBackground(new java.awt.Color(204, 204, 204));
        DisplayAllTutorForCourse.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        DisplayAllTutorForCourse.setText("Search All Tutor For Course");
        DisplayAllTutorForCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayAllTutorForCourseActionPerformed(evt);
            }
        });
        jPanel1.add(DisplayAllTutorForCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 170, 370, 150));

        DisplayTutorCourse.setBackground(new java.awt.Color(204, 204, 204));
        DisplayTutorCourse.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        DisplayTutorCourse.setText("Display Tutor For Course");
        DisplayTutorCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayTutorCourseActionPerformed(evt);
            }
        });
        jPanel1.add(DisplayTutorCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 370, 330, 150));

        reportCourseButton.setBackground(new java.awt.Color(204, 204, 204));
        reportCourseButton.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        reportCourseButton.setText("REPORT");
        jPanel1.add(reportCourseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 360, 330, 150));

        SearchCourseUnderTutor.setBackground(new java.awt.Color(204, 204, 204));
        SearchCourseUnderTutor.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        SearchCourseUnderTutor.setText("Search Course Under Tutor");
        SearchCourseUnderTutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchCourseUnderTutorActionPerformed(evt);
            }
        });
        jPanel1.add(SearchCourseUnderTutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 370, 150));

        addTeachingButton1.setBackground(new java.awt.Color(204, 204, 204));
        addTeachingButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        addTeachingButton1.setText("ADD Tutor To Course");
        addTeachingButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTeachingButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(addTeachingButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 320, 170));

        backButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 730, -1, -1));

        AddTutorialGroupToTutor1.setBackground(new java.awt.Color(204, 204, 204));
        AddTutorialGroupToTutor1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        AddTutorialGroupToTutor1.setText("Add TutorialGroup To Tutor");
        AddTutorialGroupToTutor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddTutorialGroupToTutor1ActionPerformed(evt);
            }
        });
        jPanel1.add(AddTutorialGroupToTutor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, 370, 150));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addTeachingButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTeachingButton1ActionPerformed
        setVisible(false);
        TeachingAddTutorToCourse t = new TeachingAddTutorToCourse();
        t.setVisible(true);

    }//GEN-LAST:event_addTeachingButton1ActionPerformed

    private void DisplayTutorCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayTutorCourseActionPerformed
        setVisible(false);
        TeachingDisplayTutorCourse t = new TeachingDisplayTutorCourse();
        t.setVisible(true);
    }//GEN-LAST:event_DisplayTutorCourseActionPerformed

    private void SearchCourseUnderTutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchCourseUnderTutorActionPerformed
        setVisible(false);
        TeachingSearchCoursesUnderTutor t = new TeachingSearchCoursesUnderTutor();
        t.setVisible(true);
    }//GEN-LAST:event_SearchCourseUnderTutorActionPerformed

    private void DisplayAllTutorForCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayAllTutorForCourseActionPerformed
        setVisible(false);
        TeachingDisplayAllTutorForCourse t = new TeachingDisplayAllTutorForCourse();
        t.setVisible(true);    }//GEN-LAST:event_DisplayAllTutorForCourseActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        setVisible(false);
        mainPage t = new mainPage();
        t.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void AddTutorialGroupToTutor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddTutorialGroupToTutor1ActionPerformed
        setVisible(false);
        TeachingAddTutorToTutorialGroup t = new TeachingAddTutorToTutorialGroup();
        t.setVisible(true);
    }//GEN-LAST:event_AddTutorialGroupToTutor1ActionPerformed

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
            java.util.logging.Logger.getLogger(TeachingManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeachingManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeachingManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeachingManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeachingManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddTutorialGroupToTutor1;
    private javax.swing.JButton DisplayAllTutorForCourse;
    private javax.swing.JButton DisplayTutorCourse;
    private javax.swing.JButton SearchCourseUnderTutor;
    private javax.swing.JButton addTeachingButton1;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private java.awt.Label label1;
    private javax.swing.JButton reportCourseButton;
    // End of variables declaration//GEN-END:variables
}
