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
import entity.Course;
import javax.swing.*;
import java.awt.*;
import java.awt.print.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.swing.table.DefaultTableModel;
import utility.insertData;

public class report1 extends javax.swing.JFrame {

    public static AdtInterface<Course> courseList = insertData.courseList;
    private int[] ranking;

    public report1() {
        initComponents();
        sortCourseList();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        Object rowData[] = new Object[4];
       for (int i = 0; i < 3; i++) {
        rowData[0] = courseList.getEntry(ranking[i]).getCourseID();
        rowData[1] = courseList.getEntry(ranking[i]).getName();
        rowData[2] = "" + courseList.getEntry(ranking[i]).getCourseCreditHours();
        rowData[3] = "RM " + courseList.getEntry(ranking[i]).getCourseFees();
        model.addRow(rowData);
       }
        // Set the preferred scrollable viewport size to match the preferred size
        table.setPreferredScrollableViewportSize(table.getPreferredSize());
        table.getTableHeader().setFont(new Font("SansSerif", 
                Font.BOLD, 14));
    }

    private void sortCourseList() {
        double[] courseFee = new double[courseList.getNumberOfEntries()];

        for (int z = 0; z < courseList.getNumberOfEntries(); z++) {
            courseFee[z] = courseList.getEntry(z + 1).getCourseFees();
        }
        Map<Double, Integer> rankingMap = new HashMap<>();

        Integer[] indices = new Integer[courseFee.length];
        for (int i = 0; i < indices.length; i++) {
            indices[i] = i;
        }
        Arrays.sort(indices, (a, b) -> Double.compare(courseFee[b],
                courseFee[a]));

        ranking = new int[courseFee.length];
        for (int i = 0; i < indices.length; i++) {
            ranking[i] = indices[i] + 1;
        }
        System.out.print("Ranking: ");
        for (int rank : ranking) {
            System.out.print(rank + " ");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        printButton = new javax.swing.JButton();
        seperatorLine = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(827, 1169));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backButton.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 750, 70, -1));

        printButton.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        printButton.setText("Print");
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });
        jPanel1.add(printButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 750, 70, -1));

        seperatorLine.setBackground(new java.awt.Color(255, 255, 255));
        seperatorLine.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        seperatorLine.setText("_____________________________________________________");
        jPanel1.add(seperatorLine, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

        title.setBackground(new java.awt.Color(255, 255, 255));
        title.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        title.setText("Top 3 Highest Course Fees");
        jPanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, -1, -1));

        table.setAutoCreateRowSorter(true);
        table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        table.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "Credit Hours", "Fees"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        table.setRowHeight(35);
        table.setRowMargin(5);
        table.setShowHorizontalLines(true);
        table.setShowVerticalLines(true);
        jScrollPane1.setViewportView(table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 510, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 659, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(18, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 816, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 793, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(17, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        setVisible(false);
        courseReport t = new courseReport();
        t.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
        printFrameContent();
    }//GEN-LAST:event_printButtonActionPerformed

    private void printFrameContent() {
        backButton.setVisible(false);
        printButton.setVisible(false);

        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPrintable(new Printable() {
            public int print(Graphics g, PageFormat pf, int page) {
                if (page > 0) {
                    return Printable.NO_SUCH_PAGE;
                }
                jPanel1.print(g);
                return Printable.PAGE_EXISTS;
            }
        });
        if (job.printDialog()) {
            try {
                job.print();
            } catch (PrinterException e) {
                JOptionPane.showMessageDialog(this, "Printing failed: " 
                        + e.getMessage(), "Error", 
                        JOptionPane.ERROR_MESSAGE);
            }
        }
        // Show the buttons again after printing
        backButton.setVisible(true);
        printButton.setVisible(true);
    }

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
            java.util.logging.Logger.getLogger(report1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(report1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(report1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(report1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new report1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton printButton;
    private javax.swing.JLabel seperatorLine;
    private javax.swing.JTable table;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
