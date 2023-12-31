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
import adt.ArrayList;
import entity.*;
import java.util.List;
import javax.swing.DefaultListModel;
import utility.*;

public class courseRemoveProgFromCourse extends javax.swing.JFrame {

    public static AdtInterface<Course> courseList = insertData.courseList;
    public static AdtInterface<Programme> programmeList = 
            insertData.programmeList;
    private DefaultListModel<String> programListModel;

    public courseRemoveProgFromCourse() {
        initComponents();
        programListModel = new DefaultListModel<>();
        programList.setModel(programListModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        removeButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jtfCourseID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfProgIndex = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        errorMsg = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        programList = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        jtfCourseName = new javax.swing.JTextField();
        errorMsg2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1500, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setBackground(new java.awt.Color(255, 255, 255));
        Title.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        Title.setText("COURSE ");
        jPanel1.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));

        removeButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        removeButton.setText("REMOVE");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });
        jPanel1.add(removeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 700, 150, -1));

        backButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 700, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("COURSE CODE :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, -1, -1));

        jtfCourseID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jtfCourseID.setToolTipText("");
        jtfCourseID.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jtfCourseID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCourseIDActionPerformed(evt);
            }
        });
        jPanel1.add(jtfCourseID, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 340, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("COURSE NAME :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, -1, -1));

        jtfProgIndex.setBackground(new java.awt.Color(255, 255, 255));
        jtfProgIndex.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jtfProgIndex.setToolTipText("");
        jtfProgIndex.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jtfProgIndex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfProgIndexActionPerformed(evt);
            }
        });
        jPanel1.add(jtfProgIndex, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 450, 340, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("PROGRAMME :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, -1, 40));
        jPanel1.add(errorMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 340, 20));

        searchButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        searchButton.setText("SEARCH");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        jPanel1.add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 180, 100, 40));

        programList.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        programList.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(programList);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 640, 110));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("INDEX OF PROGRAMME TO BE REMOVED :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, -1, 40));

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
        jPanel1.add(errorMsg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 490, 340, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        
        String id = jtfCourseID.getText().toUpperCase();
        boolean found = false;
        if (!id.isEmpty()) {
            try {
                for (int i = 1; i <= courseList.getNumberOfEntries(); i++) {
                    if (id.equals(courseList.getEntry(i).
                            getCourseID())) {
                        found = true;
                        break;
                    }
                }
                if (found) {
                    int ind = Integer.parseInt(jtfProgIndex.getText());
                    if (ind > 0) {
                        for (int i = 0; i < courseList.getNumberOfEntries();i++) 
                        {
                            if (id.equals(courseList.getEntry(i + 1)
                                    .getCourseID())) {
                                ArrayList<Programme> programs = 
                                       courseList.getEntry(i + 1).getPrograms();

                                if (ind < programs.getNumberOfEntries() + 1) {
                                    programs.remove(ind);
                                    // RELOAD THE PROGRAMS FIELD 
                                    if (programs != null && !programs.isEmpty()) 
                                    {
                                        String[] programNames = 
                                                new String[programs.
                                                        getNumberOfEntries()];

                                        for (int j = 0; 
                                              j < programs.getNumberOfEntries(); 
                                              j++) {
                                            programNames[j] = (j + 1) + ") " + 
                                                    programs.getEntry(j + 1)
                                                            .getProgrammeName();
                                        }
                                   programList.setListData(programNames);
                                    } else {
                                        programList.setListData(new 
                                                String[]{"No Programs"});
                                    }
                                    // END OF RELOAD
                                    jtfProgIndex.setText("");
                                    errorMsg2.setText("Removed sucessfully");
                                } else {
                                    jtfProgIndex.setText("");
                                    errorMsg2.setText("Invalid Program Index");
                                }
                            }
                        }
                    } else {
                        // Handle an invalid index (less than 1)
                        jtfProgIndex.setText("");
                        errorMsg2.setText("Invalid Program Index");
                    }
                } else {
                    errorMsg.setText("Invalid courseID");
                }
            } catch (NumberFormatException e) {
                errorMsg2.setText("Numerical value only");
            }
        } else {
            errorMsg.setText("Please enter a course ID");
        }
    }//GEN-LAST:event_removeButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        setVisible(false);
        CourseManagement t = new CourseManagement();
        t.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void jtfCourseIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCourseIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCourseIDActionPerformed

    private void jtfProgIndexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfProgIndexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfProgIndexActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed

        String id = jtfCourseID.getText().trim().toUpperCase();

        if (!id.isEmpty()) {
            errorMsg.setText(""); // Clear any previous error messages
            boolean found = false; 

            for (int i = 0; i < courseList.getNumberOfEntries(); i++) {
                if (id.equals(courseList.getEntry(i + 1).getCourseID())) 
                {
                  jtfCourseName.setText(courseList.getEntry(i + 1).getName());
                  errorMsg.setText(""); // Clear error message if found
                  found = true;

                  ArrayList<Programme> programs = courseList.getEntry(i + 1)
                          .getPrograms();
                  if (programs != null && !programs.isEmpty()) {
                      String[] programNames = new String[programs
                              .getNumberOfEntries()];
                      for (int j = 0; j < programs.getNumberOfEntries(); j++) {
                          programNames[j] = (j + 1) + ") " + 
                                  programs.getEntry(j + 1).getProgrammeName();
                        }
                        programList.setListData(programNames);
                    } else {
                        programList.setListData(new String[]{"No Programs"});
                    }
                    break; // Exit the loop since a match is found
                }
            }
            if (!found) {
                jtfCourseName.setText("");
                errorMsg.setText("No such Course");
                programList.setListData(new String[0]); // Clear program list
            }
        } else {
            errorMsg.setText("Please enter a course ID");
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void jtfCourseNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCourseNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCourseNameActionPerformed

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
            java.util.logging.Logger.getLogger(courseRemoveProgFromCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(courseRemoveProgFromCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(courseRemoveProgFromCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(courseRemoveProgFromCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new courseRemoveProgFromCourse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel errorMsg;
    private javax.swing.JLabel errorMsg2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtfCourseID;
    private javax.swing.JTextField jtfCourseName;
    private javax.swing.JTextField jtfProgIndex;
    private javax.swing.JList<String> programList;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton searchButton;
    // End of variables declaration//GEN-END:variables
}
