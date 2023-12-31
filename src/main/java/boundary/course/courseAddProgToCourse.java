/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package boundary.course;

import adt.AdtInterface;
import entity.*;
import javax.swing.DefaultComboBoxModel;
import utility.insertData;

/**
 *
 * @author Tan Ru Poh
 */
public class courseAddProgToCourse extends javax.swing.JFrame {

    public static AdtInterface<Programme> programmeList
            = insertData.programmeList;
    public static AdtInterface<Course> courseList = insertData.courseList;

    public courseAddProgToCourse() {
        initComponents();
        setupProgrammeComboBox(); // Call the method to set up the combobox
    }

    private void setupProgrammeComboBox() {
        DefaultComboBoxModel<String> comboBoxModel
                = new DefaultComboBoxModel<>();

        for (int i = 1; i <= programmeList.getNumberOfEntries(); i++) {
            Programme programme = programmeList.getEntry(i);
            comboBoxModel.addElement(programme.getProgrammeName());
        }
        Jcombo.setModel(comboBoxModel); // Set the model for the JComboBox

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TitleLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Jcombo = new javax.swing.JComboBox<>();
        backButton = new javax.swing.JButton();
        ConfirmButton = new javax.swing.JButton();
        jtfCourseID = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jtfCourseName = new javax.swing.JTextField();
        errorMsg = new javax.swing.JLabel();
        errorMsg1 = new javax.swing.JLabel();
        msg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1500, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TitleLabel.setBackground(new java.awt.Color(255, 255, 255));
        TitleLabel.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        TitleLabel.setText("Course - ADD Program to Course");
        jPanel1.add(TitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("COURSE CODE :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("COURSE NAME :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("ADD PROGRAMME :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, -1, 40));

        Jcombo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Jcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Jcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JcomboActionPerformed(evt);
            }
        });
        jPanel1.add(Jcombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 720, 40));

        backButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 700, -1, -1));

        ConfirmButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ConfirmButton.setText("Confirm");
        ConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ConfirmButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 700, 150, -1));

        jtfCourseID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jtfCourseID.setToolTipText("");
        jtfCourseID.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jtfCourseID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCourseIDActionPerformed(evt);
            }
        });
        jPanel1.add(jtfCourseID, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 340, 40));

        searchButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        searchButton.setText("SEARCH");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        jPanel1.add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 180, 100, 40));

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
        jPanel1.add(jtfCourseName, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 340, 40));
        jPanel1.add(errorMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 340, 20));
        jPanel1.add(errorMsg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 340, 20));
        jPanel1.add(msg, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 740, 270, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        setVisible(false);
        CourseManagement t = new CourseManagement();
        t.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void ConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmButtonActionPerformed
        String selectedProgram = Jcombo.getSelectedItem().toString();
        boolean found = false;

        if (!selectedProgram.isEmpty()) {
            String courseID = jtfCourseID.getText().trim();
            if (!courseID.isEmpty()) {
                errorMsg.setText(""); // Clear any previous error messages

                for (int i = 1; i <= courseList.getNumberOfEntries(); i++) {
                    if (courseID.toUpperCase().equals(courseList.
                            getEntry(i).getCourseID())) {
                        found = true;
                        break;
                    }
                }
                if (found) {
                    for (int i = 0; i < courseList.getNumberOfEntries(); i++) {
                        if (courseID.toUpperCase().equals(courseList.
                                getEntry(i + 1).getCourseID())) {
                            //Find the course and add the selected program to it
                            Programme selectedProgramme = null;
                            for (int j = 1; j
                                    <= programmeList.getNumberOfEntries(); j++){
                                Programme programme
                                        = programmeList.getEntry(j);
                                if (selectedProgram.equals(programme.
                                        getProgrammeName())) {
                                    selectedProgramme = programme;
                                    System.out.println("selectedProgramme: "
                                            + selectedProgramme);
                                    break;
                                }
                            }

                            if (selectedProgramme != null) {
                                courseList.getEntry(i + 1)
                                        .addProgram(selectedProgramme);
                                msg.setText("Program added to the course successfully.");
                            }
                            break; // Exit the loop since the course is found
                        }
                    }
                } else {
                    errorMsg.setText("Invalid Course ID");
                }
            } else {
                errorMsg.setText("Please enter a course ID");
            }
        } else {
            errorMsg.setText("Please select a program");
        }
    }//GEN-LAST:event_ConfirmButtonActionPerformed

    private void jtfCourseIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCourseIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCourseIDActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        String id = jtfCourseID.getText().trim();

        if (!id.isEmpty()) {
            errorMsg.setText("");
            boolean found = false;

            for (int i = 0; i < courseList.getNumberOfEntries(); i++) {
                if (id.toUpperCase().equals(courseList.
                        getEntry(i + 1).getCourseID())) {
                    jtfCourseName.setText(courseList
                            .getEntry(i + 1)
                            .getName());
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

    private void jtfCourseNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCourseNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCourseNameActionPerformed

    private void JcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JcomboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JcomboActionPerformed

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
            java.util.logging.Logger.getLogger(courseAddProgToCourse.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(courseAddProgToCourse.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(courseAddProgToCourse.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(courseAddProgToCourse.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new courseAddProgToCourse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConfirmButton;
    private javax.swing.JComboBox<String> Jcombo;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel errorMsg;
    private javax.swing.JLabel errorMsg1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jtfCourseID;
    private javax.swing.JTextField jtfCourseName;
    private javax.swing.JLabel msg;
    private javax.swing.JButton searchButton;
    // End of variables declaration//GEN-END:variables
}
