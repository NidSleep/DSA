/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package boundary.tutor;
import boundary.mainPage;


/**
 *
 * @author kenne
 */
public class tutorUI extends javax.swing.JFrame {

    /**
     * Creates new form tutorUI
     */
    public tutorUI() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        add1 = new javax.swing.JButton();
        add2 = new javax.swing.JButton();
        add3 = new javax.swing.JButton();
        add4 = new javax.swing.JButton();
        add5 = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1500, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("TUTOR");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));

        add.setBackground(new java.awt.Color(204, 204, 204));
        add.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        add.setForeground(new java.awt.Color(0, 0, 0));
        add.setText("REMOVE");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 170, 330, 230));

        add1.setBackground(new java.awt.Color(204, 204, 204));
        add1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        add1.setForeground(new java.awt.Color(0, 0, 0));
        add1.setText("ADD");
        add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add1ActionPerformed(evt);
            }
        });
        jPanel1.add(add1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 330, 230));

        add2.setBackground(new java.awt.Color(204, 204, 204));
        add2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        add2.setForeground(new java.awt.Color(0, 0, 0));
        add2.setText("UPDATE");
        add2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add2ActionPerformed(evt);
            }
        });
        jPanel1.add(add2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, 330, 230));

        add3.setBackground(new java.awt.Color(204, 204, 204));
        add3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        add3.setForeground(new java.awt.Color(0, 0, 0));
        add3.setText("DISPALY ALL");
        add3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add3ActionPerformed(evt);
            }
        });
        jPanel1.add(add3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 450, 330, 230));

        add4.setBackground(new java.awt.Color(204, 204, 204));
        add4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        add4.setForeground(new java.awt.Color(0, 0, 0));
        add4.setText("REPORT");
        add4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add4ActionPerformed(evt);
            }
        });
        jPanel1.add(add4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 450, 330, 230));

        add5.setBackground(new java.awt.Color(204, 204, 204));
        add5.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        add5.setForeground(new java.awt.Color(0, 0, 0));
        add5.setText("SEARCH");
        add5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add5ActionPerformed(evt);
            }
        });
        jPanel1.add(add5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 330, 230));

        backButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 720, -1, -1));

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

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        tutorRemove t = new tutorRemove();
        t.setVisible(true);
    }//GEN-LAST:event_addActionPerformed

    private void add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        tutorAdd t = new tutorAdd();
        t.setVisible(true);
    }//GEN-LAST:event_add1ActionPerformed

    private void add2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        tutorUpdate t = new tutorUpdate();
        t.setVisible(true);

    }//GEN-LAST:event_add2ActionPerformed

    private void add3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        tutorDisplayAll t = new tutorDisplayAll();
        t.setVisible(true);
    }//GEN-LAST:event_add3ActionPerformed

    private void add4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add4ActionPerformed

    private void add5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add5ActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        setVisible(false);
        mainPage t = new mainPage();
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
            java.util.logging.Logger.getLogger(tutorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tutorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tutorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tutorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tutorUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton add1;
    private javax.swing.JButton add2;
    private javax.swing.JButton add3;
    private javax.swing.JButton add4;
    private javax.swing.JButton add5;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
