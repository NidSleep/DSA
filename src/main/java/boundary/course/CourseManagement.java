/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package boundary.course;

import adt.ArrayList;
import adt.AdtInterface;
import entity.Course;
import java.io.*;
import javax.swing.JOptionPane;
import boundary.mainPage;


/**
 *
 * @author
 */
public class CourseManagement extends javax.swing.JFrame {

    private AdtInterface<Course> courseList = new ArrayList<>();

    public CourseManagement() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        removeCourseButton = new javax.swing.JButton();
        updateCourseButton = new javax.swing.JButton();
        displayAllCourseButton = new javax.swing.JButton();
        reportCourseButton = new javax.swing.JButton();
        searchCourseButton = new javax.swing.JButton();
        addCourseButton1 = new javax.swing.JButton();
        addProgrammeToCourseButton1 = new javax.swing.JButton();
        removeProgFromCourseButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        label1.setText("label1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1500, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel1.setText("COURSE ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));

        removeCourseButton.setBackground(new java.awt.Color(204, 204, 204));
        removeCourseButton.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        removeCourseButton.setText("REMOVE");
        removeCourseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeCourseButtonActionPerformed(evt);
            }
        });
        jPanel1.add(removeCourseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 170, 330, 150));

        updateCourseButton.setBackground(new java.awt.Color(204, 204, 204));
        updateCourseButton.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        updateCourseButton.setText("UPDATE");
        updateCourseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateCourseButtonActionPerformed(evt);
            }
        });
        jPanel1.add(updateCourseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, 330, 150));

        displayAllCourseButton.setBackground(new java.awt.Color(204, 204, 204));
        displayAllCourseButton.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        displayAllCourseButton.setText("DISPLAY ALL");
        displayAllCourseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayAllCourseButtonActionPerformed(evt);
            }
        });
        jPanel1.add(displayAllCourseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 370, 330, 150));

        reportCourseButton.setBackground(new java.awt.Color(204, 204, 204));
        reportCourseButton.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        reportCourseButton.setText("REPORT");
        reportCourseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportCourseButtonActionPerformed(evt);
            }
        });
        jPanel1.add(reportCourseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 370, 330, 150));

        searchCourseButton.setBackground(new java.awt.Color(204, 204, 204));
        searchCourseButton.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        searchCourseButton.setText("SEARCH");
        searchCourseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchCourseButtonActionPerformed(evt);
            }
        });
        jPanel1.add(searchCourseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 330, 150));

        addCourseButton1.setBackground(new java.awt.Color(204, 204, 204));
        addCourseButton1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        addCourseButton1.setText("ADD Course");
        addCourseButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCourseButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(addCourseButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 330, 150));

        addProgrammeToCourseButton1.setBackground(new java.awt.Color(204, 204, 204));
        addProgrammeToCourseButton1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        addProgrammeToCourseButton1.setText("ADD Programme To Course");
        addProgrammeToCourseButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProgrammeToCourseButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(addProgrammeToCourseButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 570, 540, 150));

        removeProgFromCourseButton.setBackground(new java.awt.Color(204, 204, 204));
        removeProgFromCourseButton.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        removeProgFromCourseButton.setText("REMOVE Programme From Course");
        removeProgFromCourseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeProgFromCourseButtonActionPerformed(evt);
            }
        });
        jPanel1.add(removeProgFromCourseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 570, 620, 150));

        backButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 730, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addCourseButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCourseButton1ActionPerformed
        setVisible(false);
        courseAdd t = new courseAdd();
        t.setVisible(true);

    }//GEN-LAST:event_addCourseButton1ActionPerformed

    private void displayAllCourseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayAllCourseButtonActionPerformed
        setVisible(false);
        CourseDisplayAll t = new CourseDisplayAll();
        t.setVisible(true);
    }//GEN-LAST:event_displayAllCourseButtonActionPerformed

    private void removeCourseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeCourseButtonActionPerformed
        setVisible(false);
        courseRemove t = new courseRemove();
        t.setVisible(true);
    }//GEN-LAST:event_removeCourseButtonActionPerformed

    private void searchCourseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchCourseButtonActionPerformed
        setVisible(false);
        courseSearch t = new courseSearch();
        t.setVisible(true);
    }//GEN-LAST:event_searchCourseButtonActionPerformed

    private void addProgrammeToCourseButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProgrammeToCourseButton1ActionPerformed
        setVisible(false);
        courseAddProgToCourse t = new courseAddProgToCourse();
        t.setVisible(true);
    }//GEN-LAST:event_addProgrammeToCourseButton1ActionPerformed

    private void updateCourseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateCourseButtonActionPerformed
        setVisible(false);
        courseUpdate t = new courseUpdate();
        t.setVisible(true);    }//GEN-LAST:event_updateCourseButtonActionPerformed

    private void removeProgFromCourseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeProgFromCourseButtonActionPerformed
        setVisible(false);
        courseRemoveProgFromCourse t = new courseRemoveProgFromCourse();
        t.setVisible(true);
    }//GEN-LAST:event_removeProgFromCourseButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        setVisible(false);
        mainPage t = new mainPage();
        t.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void reportCourseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportCourseButtonActionPerformed
        setVisible(false);
        courseReport t = new courseReport();
        t.setVisible(true);
    }//GEN-LAST:event_reportCourseButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CourseManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CourseManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CourseManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CourseManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CourseManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCourseButton1;
    private javax.swing.JButton addProgrammeToCourseButton1;
    private javax.swing.JButton backButton;
    private javax.swing.JButton displayAllCourseButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private java.awt.Label label1;
    private javax.swing.JButton removeCourseButton;
    private javax.swing.JButton removeProgFromCourseButton;
    private javax.swing.JButton reportCourseButton;
    private javax.swing.JButton searchCourseButton;
    private javax.swing.JButton updateCourseButton;
    // End of variables declaration//GEN-END:variables
}
