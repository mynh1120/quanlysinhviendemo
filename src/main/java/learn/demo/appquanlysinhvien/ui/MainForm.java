package learn.demo.appquanlysinhvien.ui;

import javax.swing.JFrame;

/**
 *
 * @author Ngô Duy Minh
 */
public class MainForm extends javax.swing.JFrame {
    private StudentManagementPanel mStudentPanel;
    private MarkManagementPanel mMarkPanel;

    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
        
        setLocationRelativeTo(null);
        
        setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH); // Phóng to mainform
        
        LoginDialog dialog = new LoginDialog(this, true); //Hiển thị logindialog
            
        dialog.setVisible(true);
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {                                  
            LoginDialog dialog = new LoginDialog(this, true); //Hiển thị logindialog
            
            dialog.setVisible(true);
    }                                 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnAboutUs = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnStudent = new javax.swing.JButton();
        btnMark = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnLogout = new javax.swing.JButton();
        jtpMainBoard = new javax.swing.JTabbedPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuLogOut = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mnuClose = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuManageStudent = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        mnuManageMark = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnuAboutUs = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);
        jToolBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnAboutUs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/learn/demo/appquanlysinhvien/icons/Actions-help-about-icon-32.png"))); // NOI18N
        btnAboutUs.setText("Giới Thiệu");
        btnAboutUs.setFocusable(false);
        btnAboutUs.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAboutUs.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAboutUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutUsActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAboutUs);
        jToolBar1.add(jSeparator1);

        btnStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/learn/demo/appquanlysinhvien/icons/10207-man-student-light-skin-tone-icon-32.png"))); // NOI18N
        btnStudent.setText("Quản Lý Sinh Viên");
        btnStudent.setFocusable(false);
        btnStudent.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnStudent.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentActionPerformed(evt);
            }
        });
        jToolBar1.add(btnStudent);

        btnMark.setIcon(new javax.swing.ImageIcon(getClass().getResource("/learn/demo/appquanlysinhvien/icons/gpa-icon-32.png"))); // NOI18N
        btnMark.setText("Quản Lý Điểm");
        btnMark.setFocusable(false);
        btnMark.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMark.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarkActionPerformed(evt);
            }
        });
        jToolBar1.add(btnMark);
        jToolBar1.add(jSeparator2);

        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/learn/demo/appquanlysinhvien/icons/logout-icon-32.png"))); // NOI18N
        btnLogout.setText("Đăng Xuất");
        btnLogout.setFocusable(false);
        btnLogout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jToolBar1.add(btnLogout);

        jMenu1.setText("Hệ Thống");

        mnuLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/learn/demo/appquanlysinhvien/icons/logout-icon-16.png"))); // NOI18N
        mnuLogOut.setText("Đăng xuất");
        mnuLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuLogOutActionPerformed(evt);
            }
        });
        jMenu1.add(mnuLogOut);
        jMenu1.add(jSeparator3);

        mnuClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/learn/demo/appquanlysinhvien/icons/Button-Close-icon-16.png"))); // NOI18N
        mnuClose.setText("Thoát");
        mnuClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCloseActionPerformed(evt);
            }
        });
        jMenu1.add(mnuClose);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Quản Lý");

        mnuManageStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/learn/demo/appquanlysinhvien/icons/10207-man-student-light-skin-tone-icon-16.png"))); // NOI18N
        mnuManageStudent.setText("Quản Lý Sinh Viên");
        mnuManageStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuManageStudentActionPerformed(evt);
            }
        });
        jMenu2.add(mnuManageStudent);
        jMenu2.add(jSeparator4);

        mnuManageMark.setIcon(new javax.swing.ImageIcon(getClass().getResource("/learn/demo/appquanlysinhvien/icons/gpa-icon.png"))); // NOI18N
        mnuManageMark.setText("Quản Lý Điểm");
        mnuManageMark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuManageMarkActionPerformed(evt);
            }
        });
        jMenu2.add(mnuManageMark);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Trợ Giúp");

        mnuAboutUs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/learn/demo/appquanlysinhvien/icons/Actions-help-about-icon-16.png"))); // NOI18N
        mnuAboutUs.setText("Giới Thiệu");
        mnuAboutUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAboutUsActionPerformed(evt);
            }
        });
        jMenu3.add(mnuAboutUs);
        jMenu3.add(jSeparator5);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/learn/demo/appquanlysinhvien/icons/Help-icon-16.png"))); // NOI18N
        jMenuItem6.setText("Trợ Giúp");
        jMenu3.add(jMenuItem6);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addComponent(jtpMainBoard))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtpMainBoard, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuLogOutActionPerformed
        LoginDialog loginDialog = new LoginDialog(this, true);
        
        loginDialog.setVisible(true);
    }//GEN-LAST:event_mnuLogOutActionPerformed

    private void mnuCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCloseActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuCloseActionPerformed

    private void mnuManageStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuManageStudentActionPerformed
           if (mStudentPanel == null);                 // Hiển thị JtablePanel
                mStudentPanel = new StudentManagementPanel();
           //ImageIcon icon = new ImageIcon(getClass()
           //         .getResource("/learn/demo/studentmanagementapp/icons/10207-man-student-light-skin-tone-icon-16.png"));
                jtpMainBoard.addTab("Student Management", mStudentPanel);
            
                jtpMainBoard.setSelectedComponent(mStudentPanel);
    }//GEN-LAST:event_mnuManageStudentActionPerformed

    private void mnuManageMarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuManageMarkActionPerformed
            if (mMarkPanel == null);                 // Hiển thị JtablePanel
                mMarkPanel = new MarkManagementPanel();
           //ImageIcon icon = new ImageIcon(getClass()
           //         .getResource("/learn/demo/studentmanagementapp/icons/10207-man-student-light-skin-tone-icon-16.png"));
                jtpMainBoard.addTab("Mark Management", mMarkPanel);
            
                jtpMainBoard.setSelectedComponent(mMarkPanel);
    }//GEN-LAST:event_mnuManageMarkActionPerformed

    private void btnAboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutUsActionPerformed
        AboutUsDialog aboutDialog = new AboutUsDialog(this, true);
        
        aboutDialog.setVisible(true);
    }//GEN-LAST:event_btnAboutUsActionPerformed

    private void mnuAboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAboutUsActionPerformed
        btnAboutUsActionPerformed(evt);
    }//GEN-LAST:event_mnuAboutUsActionPerformed

    private void btnStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentActionPerformed
        mnuManageStudentActionPerformed(evt);
    }//GEN-LAST:event_btnStudentActionPerformed

    private void btnMarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarkActionPerformed
        mnuManageMarkActionPerformed(evt);
    }//GEN-LAST:event_btnMarkActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        mnuLogOutActionPerformed(evt);
    }//GEN-LAST:event_btnLogoutActionPerformed
 
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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAboutUs;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMark;
    private javax.swing.JButton btnStudent;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTabbedPane jtpMainBoard;
    private javax.swing.JMenuItem mnuAboutUs;
    private javax.swing.JMenuItem mnuClose;
    private javax.swing.JMenuItem mnuLogOut;
    private javax.swing.JMenuItem mnuManageMark;
    private javax.swing.JMenuItem mnuManageStudent;
    // End of variables declaration//GEN-END:variables
}
