/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package boundary.course;
import adt.AdtInterface;
import entity.*;
import utility.*;
/**
 *
 * @author Tan Ru Poh
 */
public class courseAdd extends javax.swing.JFrame {
    public static AdtInterface<Course> courseList = insertData.courseList;
    
    public courseAdd() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TitleLabel = new javax.swing.JLabel();
        jtfCourseName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfCourseCode = new javax.swing.JTextField();
        ConformButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jtfCourseFees = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfCourseCreditHours = new javax.swing.JTextField();
        msg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1500, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TitleLabel.setBackground(new java.awt.Color(255, 255, 255));
        TitleLabel.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        TitleLabel.setText("Course - ADD new Course");
        jPanel1.add(TitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));

        jtfCourseName.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jtfCourseName.setToolTipText("");
        jtfCourseName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(jtfCourseName, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 340, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("COURSE NAME :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("COURSE CODE :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, -1, -1));

        jtfCourseCode.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jtfCourseCode.setToolTipText("");
        jtfCourseCode.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(jtfCourseCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 340, 40));

        ConformButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ConformButton.setText("Confirm");
        ConformButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConformButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ConformButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 700, 150, -1));

        backButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 700, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("COURSE FEES : ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, -1, -1));

        jtfCourseFees.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jtfCourseFees.setToolTipText("");
        jtfCourseFees.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(jtfCourseFees, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 290, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("RM ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("CREDIT HOURS : ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, -1, -1));

        jtfCourseCreditHours.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jtfCourseCreditHours.setToolTipText("");
        jtfCourseCreditHours.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(jtfCourseCreditHours, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 340, 40));

        msg.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(msg, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 740, 270, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        setVisible(false);
        CourseManagement t = new CourseManagement();
        t.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void ConformButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConformButtonActionPerformed
        String name = jtfCourseName.getText();
        String code = jtfCourseCode.getText();
        String feesStr = jtfCourseFees.getText();
        String creditHoursStr = jtfCourseCreditHours.getText();
        boolean hasDuplicate = false;
        for (int i = 1; i <= courseList.getNumberOfEntries(); i++) {
            if (code.toUpperCase().equals(courseList.
                    getEntry(i).getCourseID())) {
                hasDuplicate = true;
                break; 
            }
        }
        if (hasDuplicate) {
            msg.setText("Duplicated ID found");
        } else if (name.isEmpty() || code.isEmpty() || feesStr.isEmpty() || 
                creditHoursStr.isEmpty()) {
            msg.setText("All Fields are required");
        } else {
            msg.setText(""); 

            try {
                double fees = Double.parseDouble(feesStr);
                double creditHours = Double.parseDouble(creditHoursStr);
                courseList.add(new Course(code.toUpperCase(), name, 
                        fees, creditHours));
                msg.setText("Added successfully");
            } catch (NumberFormatException e) {
                msg.setText("Invalid number values");
            }
        }
        // Checking - Print all entries in the courseList 
        System.out.println("List of Courses:");
        for (int i = 1; i <= courseList.getNumberOfEntries(); i++) {
            Course course = courseList.getEntry(i);
            System.out.println("ID: " + course.getCourseID() + "\nName: " + 
                    course.getName() + "\nFees: " + course.getCourseFees() + 
                    "\nCredit Hours: " + course.getCourseCreditHours());
            System.out.println("---------------");
        }
        jtfCourseName.setText("");
        jtfCourseCode.setText("");
        jtfCourseFees.setText("");
        jtfCourseCreditHours.setText("");
    }//GEN-LAST:event_ConformButtonActionPerformed

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
            java.util.logging.Logger.getLogger(courseAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(courseAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(courseAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(courseAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new courseAdd().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConformButton;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jtfCourseCode;
    private javax.swing.JTextField jtfCourseCreditHours;
    private javax.swing.JTextField jtfCourseFees;
    private javax.swing.JTextField jtfCourseName;
    private javax.swing.JLabel msg;
    // End of variables declaration//GEN-END:variables
}
