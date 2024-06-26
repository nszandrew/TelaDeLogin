/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.login.view;

import java.awt.Toolkit;

/**
 *
 * @author Andrew
 */
public class UsarView extends javax.swing.JFrame {

    /**
     * Creates new form UsarView
     */
    public UsarView() {
        initComponents();
        setIcon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonMenu1 = new javax.swing.JButton();
        jButtonMenu = new javax.swing.JButton();
        jButtonContato = new javax.swing.JButton();
        jButtonUsarStay = new javax.swing.JButton();
        jButtonProjeto = new javax.swing.JButton();
        jButtonMenu2 = new javax.swing.JButton();
        jButtonProjetosView = new javax.swing.JButton();
        jButtonLogOut = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Como usar");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonMenu1.setBorder(null);
        jButtonMenu1.setContentAreaFilled(false);
        jButtonMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenu1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 80, 10));

        jButtonMenu.setBorder(null);
        jButtonMenu.setContentAreaFilled(false);
        jButtonMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 30, 50, 20));

        jButtonContato.setBorder(null);
        jButtonContato.setContentAreaFilled(false);
        jButtonContato.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonContatoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonContato, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 30, 70, 20));

        jButtonUsarStay.setBorder(null);
        jButtonUsarStay.setContentAreaFilled(false);
        jButtonUsarStay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jButtonUsarStay, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 30, 110, 20));

        jButtonProjeto.setBorder(null);
        jButtonProjeto.setContentAreaFilled(false);
        jButtonProjeto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProjetoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonProjeto, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 30, 60, 20));

        jButtonMenu2.setBorder(null);
        jButtonMenu2.setContentAreaFilled(false);
        jButtonMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenu2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMenu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 20, 40));

        jButtonProjetosView.setBorder(null);
        jButtonProjetosView.setContentAreaFilled(false);
        jButtonProjetosView.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonProjetosView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProjetosViewActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonProjetosView, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 260, 80, 20));

        jButtonLogOut.setBorder(null);
        jButtonLogOut.setContentAreaFilled(false);
        jButtonLogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogOutActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 20, 30, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resoucer/UsarView.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenu1ActionPerformed
        MenuView menuView = new MenuView();
        this.setVisible(false);
        menuView.setVisible(true);
    }//GEN-LAST:event_jButtonMenu1ActionPerformed

    private void jButtonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuActionPerformed
        MenuView menuView = new MenuView();
        menuView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonMenuActionPerformed

    private void jButtonContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonContatoActionPerformed
        Contato contato = new Contato();
        this.setVisible(false);
        contato.setVisible(true);
    }//GEN-LAST:event_jButtonContatoActionPerformed

    private void jButtonProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProjetoActionPerformed
       ProjetoView projetoView = new ProjetoView();
       this.setVisible(false);
       projetoView.setVisible(true);
    }//GEN-LAST:event_jButtonProjetoActionPerformed

    private void jButtonMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenu2ActionPerformed
        MenuView menuView = new MenuView();
        this.setVisible(false);
        menuView.setVisible(true);
    }//GEN-LAST:event_jButtonMenu2ActionPerformed

    private void jButtonProjetosViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProjetosViewActionPerformed
        ProjetoView projetoView = new ProjetoView();
        this.setVisible(false);
        projetoView.setVisible(true);
    }//GEN-LAST:event_jButtonProjetosViewActionPerformed

    private void jButtonLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogOutActionPerformed
       this.setVisible(false);
       LoginView view = new LoginView();
       view.setVisible(true);
    }//GEN-LAST:event_jButtonLogOutActionPerformed

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
            java.util.logging.Logger.getLogger(UsarView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsarView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsarView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsarView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsarView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonContato;
    private javax.swing.JButton jButtonLogOut;
    private javax.swing.JButton jButtonMenu;
    private javax.swing.JButton jButtonMenu1;
    private javax.swing.JButton jButtonMenu2;
    private javax.swing.JButton jButtonProjeto;
    private javax.swing.JButton jButtonProjetosView;
    private javax.swing.JButton jButtonUsarStay;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
        private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("src/resoucer/Icon.png"));
    }

}
