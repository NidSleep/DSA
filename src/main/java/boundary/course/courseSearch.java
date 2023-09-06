/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package boundary.course;

import adt.AdtInterface;
import adt.ArrayList;
import entity.Course;
import entity.Programme;
import utility.insertData;

public class courseSearch extends javax.swing.JFrame {

    public static AdtInterface<Course> courseList = insertData.courseList;

    public courseSearch() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        jtfCourseID = new javax.swing.JTextField();
        jtfCourseName = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        label4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        programList = new javax.swing.JList<>();
        errorMsg = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfCourseFees = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtfCourseCreditHours = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1500, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel3.setText("COURSE - SEARCH Course ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));

        label2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        label2.setText("ENTER COURSE ID : ");
        jPanel1.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, -1, -1));

        label3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        label3.setText("COURSE NAME :");
        jPanel1.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, -1, -1));

        jtfCourseID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jtfCourseID.setToolTipText("");
        jtfCourseID.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jtfCourseID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCourseIDActionPerformed(evt);
            }
        });
        jPanel1.add(jtfCourseID, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 340, 40));

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

        label4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        label4.setText("PROGRAMMES : ");
        jPanel1.add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, -1, -1));

        programList.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        programList.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(programList);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 640, 110));
        jPanel1.add(errorMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 340, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("COURSE FEES : ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("RM ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 460, -1, -1));

        jtfCourseFees.setEditable(false);
        jtfCourseFees.setBackground(new java.awt.Color(255, 255, 255));
        jtfCourseFees.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jtfCourseFees.setToolTipText("");
        jtfCourseFees.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(jtfCourseFees, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, 290, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText("CREDIT HOURS : ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 520, -1, -1));

        jtfCourseCreditHours.setEditable(false);
        jtfCourseCreditHours.setBackground(new java.awt.Color(255, 255, 255));
        jtfCourseCreditHours.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jtfCourseCreditHours.setToolTipText("");
        jtfCourseCreditHours.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(jtfCourseCreditHours, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 520, 340, 40));

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

    private void jtfCourseIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCourseIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCourseIDActionPerformed

    private void jtfCourseNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCourseNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCourseNameActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed

        String id = jtfCourseID.getText().trim();

        if (!id.isEmpty()) {
            errorMsg.setText(""); // Clear any previous error messages
            boolean found = false; // Flag to indicate if a matching course is found

            for (int i = 0; i < courseList.getNumberOfEntries(); i++) {
                if (id.equals(courseList.getEntry(i + 1).getCourseID())) {
                    jtfCourseName.setText(courseList.getEntry(i + 1).getName());
                    jtfCourseFees.setText("" + courseList.getEntry(i+1).getCourseFees());
                    jtfCourseCreditHours.setText("" + courseList.getEntry(i+1).getCourseCreditHours());
                    
                    errorMsg.setText(""); // Clear error message if found
                    found = true;

                    ArrayList<Programme> programs = courseList.getEntry(i + 1).getPrograms();
                    if (programs != null && !programs.isEmpty()) {
                        String[] programNames = new String[programs.getNumberOfEntries()];
                        for (int j = 0; j < programs.getNumberOfEntries(); j++) {
                            programNames[j] = programs.getEntry(j + 1).getProgrammeName();
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
                jtfCourseFees.setText("");
                jtfCourseCreditHours.setText("");
                errorMsg.setText("No such Course");
                programList.setListData(new String[0]); // Clear program list
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
            java.util.logging.Logger.getLogger(courseSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(courseSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(courseSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(courseSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new courseSearch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel errorMsg;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtfCourseCreditHours;
    private javax.swing.JTextField jtfCourseFees;
    private javax.swing.JTextField jtfCourseID;
    private javax.swing.JTextField jtfCourseName;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JList<String> programList;
    private javax.swing.JButton searchButton;
    // End of variables declaration//GEN-END:variables
}
