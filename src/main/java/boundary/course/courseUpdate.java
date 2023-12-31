/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package boundary.course;
/**
 *
 * @author Tan Ru Poh
 */
import adt.AdtInterface;
import entity.*;
import utility.*;

public class courseUpdate extends javax.swing.JFrame {
    public static AdtInterface<Course> courseList = insertData.courseList;
    public courseUpdate() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        jtfCourseCode = new javax.swing.JTextField();
        label1 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        updateButton = new javax.swing.JButton();
        jtfCourseID = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        label4 = new javax.swing.JLabel();
        errorMsg = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        jtfCourseName = new javax.swing.JTextField();
        msg = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfCourseFees = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtfCourseCreditHours = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1500, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setBackground(new java.awt.Color(255, 255, 255));
        title.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        title.setText("COURSE - UPDATE");
        jPanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));

        jtfCourseCode.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jtfCourseCode.setToolTipText("");
        jtfCourseCode.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(jtfCourseCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 340, 40));

        label1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        label1.setText("COURSE CODE : ");
        jPanel1.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        backButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 670, 140, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 720, -1, -1));

        updateButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        updateButton.setText("UPDATE");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        jPanel1.add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 670, 140, 40));

        jtfCourseID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jtfCourseID.setToolTipText("");
        jtfCourseID.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jtfCourseID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCourseIDActionPerformed(evt);
            }
        });
        jPanel1.add(jtfCourseID, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 80, 160, 40));

        searchButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        searchButton.setText("SEARCH");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        jPanel1.add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 80, 100, 40));

        label4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        label4.setText("ENTER COURSE ID : ");
        jPanel1.add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 80, -1, -1));
        jPanel1.add(errorMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 120, 290, 20));

        label2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        label2.setText("COURSE NAME : ");
        jPanel1.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));

        jtfCourseName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jtfCourseName.setToolTipText("");
        jtfCourseName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(jtfCourseName, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 340, 40));
        jPanel1.add(msg, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 720, 270, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("COURSE FEES : ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("RM ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, -1, -1));

        jtfCourseFees.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jtfCourseFees.setToolTipText("");
        jtfCourseFees.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(jtfCourseFees, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 290, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText("CREDIT HOURS : ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, -1, -1));

        jtfCourseCreditHours.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jtfCourseCreditHours.setToolTipText("");
        jtfCourseCreditHours.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(jtfCourseCreditHours, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, 340, 40));

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

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        setVisible(false);
        CourseManagement t = new CourseManagement();
        t.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed

        String id = jtfCourseID.getText().trim().toUpperCase();
        String name = jtfCourseName.getText().trim();
        String code = jtfCourseCode.getText().trim().toUpperCase();
        String feesStr = jtfCourseFees.getText().trim();
        String creditHoursStr = jtfCourseCreditHours.getText().trim();

        errorMsg.setText("");
        msg.setText("");
        if (id.isEmpty()) {
            errorMsg.setText("Invalid Course ID");
        } else if (name.isEmpty() || code.isEmpty() || feesStr.isEmpty() 
                || creditHoursStr.isEmpty()) {
            msg.setText("All field is required!");
        } else {
            double courseFees = Double.parseDouble(feesStr);
            double courseCreditHours = Double.parseDouble(creditHoursStr);

            boolean updated = false; 
            for (int i = 0; i < courseList.getNumberOfEntries(); i++) {
                if (id.equals(courseList.getEntry(i + 1).getCourseID())) {
                    courseList.getEntry(i + 1).setName(name);
                    courseList.getEntry(i + 1).setCourseID(code);
                    courseList.getEntry(i + 1).setCourseFees(courseFees);
                    courseList.getEntry(i + 1).setCourseCreditHours(courseCreditHours);
                    jtfCourseID.setText("");
                    jtfCourseName.setText("");
                    jtfCourseCode.setText("");
                    jtfCourseFees.setText("");
                    jtfCourseCreditHours.setText("");
                    msg.setText("Updated Successfully");
                    updated = true;
                    break; 
                }
            }
            if (!updated) {
                errorMsg.setText("No such Course");
                msg.setText("");
            }
        }

    }//GEN-LAST:event_updateButtonActionPerformed

    private void jtfCourseIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCourseIDActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jtfCourseIDActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed

        String id = jtfCourseID.getText().trim().toUpperCase();

        if (!id.isEmpty()) {
            errorMsg.setText(""); 
            boolean found = false; 

            for (int i = 0; i < courseList.getNumberOfEntries(); i++) {
                if (id.equals(courseList.getEntry(i + 1).getCourseID())) {
                    jtfCourseCode.setText(id);
                    jtfCourseName.setText(courseList.getEntry(i + 1).getName());
                    jtfCourseFees.setText(courseList.getEntry(i + 1)
                            .getCourseFees().toString());
                    jtfCourseCreditHours.setText(courseList.getEntry(i + 1)
                            .getCourseCreditHours().toString());
                    errorMsg.setText("");
                    found = true;
                    break; 
                }
            }
            if (!found) {
                jtfCourseCode.setText("");
                jtfCourseName.setText("");
                jtfCourseFees.setText("");
                jtfCourseCreditHours.setText("");
                errorMsg.setText("No such Course");
            }
        } else {
            errorMsg.setText("Please enter a course ID");

        }
    }//GEN-LAST:event_searchButtonActionPerformed

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
            java.util.logging.Logger.getLogger(courseUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(courseUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(courseUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(courseUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new courseUpdate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel errorMsg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jtfCourseCode;
    private javax.swing.JTextField jtfCourseCreditHours;
    private javax.swing.JTextField jtfCourseFees;
    private javax.swing.JTextField jtfCourseID;
    private javax.swing.JTextField jtfCourseName;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel msg;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel title;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
