/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package boundary.course;

import adt.AdtInterface;
import entity.Course;
import utility.insertData;

/**
 *
 * @author Tan Ru Poh
 */
public class courseRemove extends javax.swing.JFrame {

    public static AdtInterface<Course> courseList = insertData.courseList;

    public courseRemove() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        jtfCourseName = new javax.swing.JTextField();
        label1 = new javax.swing.JLabel();
        jtfCourseID = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        errorMsg = new javax.swing.JLabel();
        msg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1500, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleLabel.setBackground(new java.awt.Color(255, 255, 255));
        titleLabel.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        titleLabel.setText("COURSE - REMOVE");
        jPanel1.add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));

        label2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        label2.setText("COURSE NAME :");
        jPanel1.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, -1, -1));

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
        jPanel1.add(jtfCourseName, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 340, 40));

        label1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        label1.setText("ENTER COURSE ID : ");
        jPanel1.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, -1, -1));

        jtfCourseID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jtfCourseID.setToolTipText("");
        jtfCourseID.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jtfCourseID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCourseIDActionPerformed(evt);
            }
        });
        jPanel1.add(jtfCourseID, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 340, 40));

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
        jPanel1.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 670, 140, 40));

        removeButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        removeButton.setText("REMOVE");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });
        jPanel1.add(removeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 670, 140, 40));
        jPanel1.add(errorMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 340, 20));

        msg.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(msg, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 720, 270, 30));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfCourseNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCourseNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCourseNameActionPerformed

    private void jtfCourseIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCourseIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCourseIDActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        String id = jtfCourseID.getText().trim().toUpperCase();
        if (!id.isEmpty()) {
            errorMsg.setText("");
            boolean found = false;
            for (int i = 0; i < courseList.getNumberOfEntries(); i++) {
                if (id.equals(courseList.getEntry(i + 1).getCourseID())) 
                {
                  jtfCourseName.setText(courseList.getEntry(i + 1).getName());
                  errorMsg.setText("");
                  found = true;
                  break;
                }
            }
            if (!found) {
                jtfCourseName.setText("");
                errorMsg.setText("No such Course");
            }
        } else {
            errorMsg.setText("Please enter a course ID");
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        setVisible(false);
        CourseManagement t = new CourseManagement();
        t.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        String id = jtfCourseID.getText().trim().toUpperCase();

        if (!id.isEmpty()) {
            boolean removed = false;
            for (int i = 0; i < courseList.getNumberOfEntries(); i++) {
                if (id.equals(courseList.getEntry(i + 1).getCourseID())) 
                {
                    courseList.remove(i + 1);
                    removed = true;
                    errorMsg.setText("");
                    msg.setText("Removed successfully");
                    break;
                }
            }
            if (!removed) {
                jtfCourseName.setText("");
                errorMsg.setText("Invalid course ID");
            }
        } else {
            errorMsg.setText("Please enter a course ID");
        }
        jtfCourseID.setText("");
        jtfCourseName.setText("");

    }//GEN-LAST:event_removeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(courseRemove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(courseRemove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(courseRemove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(courseRemove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new courseRemove().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel errorMsg;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jtfCourseID;
    private javax.swing.JTextField jtfCourseName;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel msg;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
