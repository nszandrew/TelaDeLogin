/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.login.view;

import br.com.login.controller.LoginController;
import java.awt.Toolkit;

/**
 *
 * @author 824148029
 */
public class ProfileView extends javax.swing.JFrame {


    public void setJTextFieldEmail(String email) {
    jTextFieldEmail.setText(email);
        System.out.println(email);
}
    
    
    
    
    public ProfileView() {
        initComponents();
        setIcon();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonLogOut = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Perfil");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonLogOut.setBorder(null);
        jButtonLogOut.setContentAreaFilled(false);
        jButtonLogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogOutActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 500, 180, 30));

        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 180, 30));

        jTextFieldEmail.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldEmail.setBorder(null);
        jTextFieldEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 230, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resoucer/Screenshot 2024-05-08 000457.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    private void jButtonLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogOutActionPerformed
        this.setVisible(false);
        MenuView menuView = new MenuView();
        menuView.setVisible(false);
        LoginView loginView = new LoginView();
        loginView.setVisible(true);
    }//GEN-LAST:event_jButtonLogOutActionPerformed

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
           //LoginController loginCon = new LoginController();
           //String email = loginCon.buscarId(1);
           //setJTextFieldEmail(email);

          
            
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
           LoginController loginCon = new LoginController();
           String email = loginCon.buscarId(1);
           setJTextFieldEmail(email);        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ProfileView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfileView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfileView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfileView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfileView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonLogOut;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JTextField jTextFieldEmail;
    // End of variables declaration//GEN-END:variables
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("src/resoucer/Icon.png"));
    }
}
