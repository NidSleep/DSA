/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package boundary.programme;

import control.ProgrammeManagement;
import entity.Programme;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author: Er Qing Yap
 */
public class programmeRemoveGUI extends javax.swing.JFrame {

    /**
     * Creates new form programmeRemoveGUI
     */
    public programmeRemoveGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TitleLabel = new javax.swing.JLabel();
        jtfProgrammeCode = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TitleLabel1 = new javax.swing.JLabel();
        searchButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jtfProgrammeName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ConfirmButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        successMessageLabel = new javax.swing.JLabel();

        TitleLabel.setBackground(new java.awt.Color(255, 255, 255));
        TitleLabel.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        TitleLabel.setText("Programme - UPDATE new Programme");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtfProgrammeCode.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jtfProgrammeCode.setToolTipText("");
        jtfProgrammeCode.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jtfProgrammeCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfProgrammeCodeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("PROGRAMME DESCRIPTION :");

        TitleLabel1.setBackground(new java.awt.Color(255, 255, 255));
        TitleLabel1.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        TitleLabel1.setText("Programme - REMOVE Programme");

        searchButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        searchButton1.setText("SEARCH");
        searchButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("PROGRAMME CODE :");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        jtfProgrammeName.setEditable(false);
        jtfProgrammeName.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jtfProgrammeName.setToolTipText("");
        jtfProgrammeName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("PROGRAMME NAME :");

        ConfirmButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ConfirmButton.setText("Remove");
        ConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmButtonActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        successMessageLabel.setForeground(new java.awt.Color(0, 204, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(searchButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(successMessageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(backButton))
                        .addGap(17, 17, 17))))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(TitleLabel1)
                .addGap(0, 60, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(628, 628, 628)
                    .addComponent(ConfirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(109, 109, 109))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(62, 62, 62)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jtfProgrammeCode)
                        .addComponent(jtfProgrammeName)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE))
                    .addGap(112, 112, 112)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitleLabel1)
                .addGap(40, 40, 40)
                .addComponent(searchButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 258, Short.MAX_VALUE)
                .addComponent(successMessageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backButton)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(110, 110, 110)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jtfProgrammeCode, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(27, 27, 27)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jtfProgrammeName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(36, 36, 36)
                    .addComponent(ConfirmButton)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfProgrammeCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfProgrammeCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfProgrammeCodeActionPerformed

    private void searchButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButton1ActionPerformed
        String id = jtfProgrammeCode.getText().trim();

        // Create an instance of ProgrammeManagement to search for the program
        ProgrammeManagement search = new ProgrammeManagement();

        // Call the searchProgram method to find the program
        Programme programMatched = search.searchProgram(id);

        if (programMatched != null) {
            // If the program is found, update the text fields with its details
            jtfProgrammeName.setText(programMatched.getProgrammeName());
            jTextArea1.setText(programMatched.getProgrammeDescription());
        } else {
            // If the program is not found, display an error message
            JOptionPane.showMessageDialog(
                null, "Program with ID " + id + " was not found.", "Program Not Found", JOptionPane.INFORMATION_MESSAGE
            );

            // Clear the text fields
            jtfProgrammeName.setText("");
            jTextArea1.setText("");
        }
    }//GEN-LAST:event_searchButton1ActionPerformed

    private void ConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmButtonActionPerformed
        String codeToRemove = jtfProgrammeCode.getText();

    // Create an instance of ProgrammeManagement to manage the programs
    ProgrammeManagement programManagement = new ProgrammeManagement();

    // Search for the program by code
    Programme programToRemove = programManagement.searchProgram(codeToRemove);

    if (programToRemove != null) {
        // If the program is found, prompt the user for confirmation
        int option = JOptionPane.showConfirmDialog(
            null,
            "Are you sure you want to delete this program?",
            "Confirm Deletion",
            JOptionPane.YES_NO_OPTION
        );

        if (option == JOptionPane.YES_OPTION) {
            // User confirmed deletion
            programManagement.removeInGUI(codeToRemove);

            // Clear the input fields
            jtfProgrammeName.setText("");
            jtfProgrammeCode.setText("");
            jTextArea1.setText("");

            // Display a success message
            successMessageLabel.setText("Programme removed successfully!");
            successMessageLabel.setForeground(Color.GREEN); // Set the message color
        } else {
            // User canceled deletion
            successMessageLabel.setText("Operation canceled.");
            successMessageLabel.setForeground(Color.RED); // Set the message color to indicate cancellation
        }
    } else {
        // If the program is not found, display an error message
        JOptionPane.showMessageDialog(
            null, "Program with Code " + codeToRemove + " was not found.", "Program Not Found", JOptionPane.ERROR_MESSAGE
        );
    }
    }//GEN-LAST:event_ConfirmButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        setVisible(false);
        ProgrammeManagementMenu t = new ProgrammeManagementMenu();
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
            java.util.logging.Logger.getLogger(programmeRemoveGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(programmeRemoveGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(programmeRemoveGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(programmeRemoveGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new programmeRemoveGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConfirmButton;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JLabel TitleLabel1;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jtfProgrammeCode;
    private javax.swing.JTextField jtfProgrammeName;
    private javax.swing.JButton searchButton1;
    private javax.swing.JLabel successMessageLabel;
    // End of variables declaration//GEN-END:variables
}
