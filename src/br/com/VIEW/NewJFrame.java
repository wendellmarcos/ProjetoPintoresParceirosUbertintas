/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.VIEW;

/**
 *
 * @author Wendell
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
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

        txtNomeCadastroCompleto = new javax.swing.JTextField();
        txtEmailCadastroCompleto = new javax.swing.JTextField();
        txtProfissaoCadastroCompleto = new javax.swing.JTextField();
        txtEnderecoCadastroCompleto = new javax.swing.JTextField();
        txtCelularCadastroCompleto = new javax.swing.JTextField();
        txtDataDeNascimentoCadastroCompleto = new javax.swing.JTextField();
        txtCidadeCadastroCompleto = new javax.swing.JTextField();
        txtVendedorFavoritoCadastro = new javax.swing.JTextField();
        txtBairroCadastroCompleto1 = new javax.swing.JTextField();
        txtLojaFavoritaCadastroCompleto1 = new javax.swing.JTextField();
        txtCepCadastroCompleto = new javax.swing.JTextField();
        txtEstadoCadastroCompleto = new javax.swing.JTextField();
        txtCpfCadastroCompleto = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButtonGravarCadastroCompleto = new javax.swing.JButton();
        jButtonAlterarCadastroCompleto = new javax.swing.JButton();
        jButtonExcluirCadastroCompleto = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtNomeCadastroCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 450, 30));
        getContentPane().add(txtEmailCadastroCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 440, 260, 30));
        getContentPane().add(txtProfissaoCadastroCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 290, 30));
        getContentPane().add(txtEnderecoCadastroCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 450, 30));

        txtCelularCadastroCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCelularCadastroCompletoActionPerformed(evt);
            }
        });
        getContentPane().add(txtCelularCadastroCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 520, 270, 30));
        getContentPane().add(txtDataDeNascimentoCadastroCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 290, 30));
        getContentPane().add(txtCidadeCadastroCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 440, 270, 30));
        getContentPane().add(txtVendedorFavoritoCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 290, 270, 30));
        getContentPane().add(txtBairroCadastroCompleto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 370, 270, 30));
        getContentPane().add(txtLojaFavoritaCadastroCompleto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 520, 260, 30));
        getContentPane().add(txtCepCadastroCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 130, 30));
        getContentPane().add(txtEstadoCadastroCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 130, 30));
        getContentPane().add(txtCpfCadastroCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 260, 30));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Castellar", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("INCLUIR");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 580, 150, 60));

        jButtonGravarCadastroCompleto.setBackground(new java.awt.Color(0, 0, 0));
        jButtonGravarCadastroCompleto.setFont(new java.awt.Font("Castellar", 1, 14)); // NOI18N
        jButtonGravarCadastroCompleto.setForeground(new java.awt.Color(255, 255, 255));
        jButtonGravarCadastroCompleto.setText("Gravar");
        jButtonGravarCadastroCompleto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jButtonGravarCadastroCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 580, 150, 60));

        jButtonAlterarCadastroCompleto.setBackground(new java.awt.Color(0, 0, 0));
        jButtonAlterarCadastroCompleto.setFont(new java.awt.Font("Castellar", 1, 14)); // NOI18N
        jButtonAlterarCadastroCompleto.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAlterarCadastroCompleto.setText("ALTERAR");
        jButtonAlterarCadastroCompleto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAlterarCadastroCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarCadastroCompletoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAlterarCadastroCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 580, 160, 60));

        jButtonExcluirCadastroCompleto.setBackground(new java.awt.Color(0, 0, 0));
        jButtonExcluirCadastroCompleto.setFont(new java.awt.Font("Castellar", 1, 14)); // NOI18N
        jButtonExcluirCadastroCompleto.setForeground(new java.awt.Color(255, 255, 255));
        jButtonExcluirCadastroCompleto.setText("EXCLUIR");
        jButtonExcluirCadastroCompleto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonExcluirCadastroCompleto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jButtonExcluirCadastroCompletoFocusLost(evt);
            }
        });
        getContentPane().add(jButtonExcluirCadastroCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 580, 160, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/CADASTRO COMPLETO 2.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1280, 820));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCelularCadastroCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCelularCadastroCompletoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCelularCadastroCompletoActionPerformed

    private void jButtonExcluirCadastroCompletoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButtonExcluirCadastroCompletoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonExcluirCadastroCompletoFocusLost

    private void jButtonAlterarCadastroCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarCadastroCompletoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAlterarCadastroCompletoActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonAlterarCadastroCompleto;
    private javax.swing.JButton jButtonExcluirCadastroCompleto;
    private javax.swing.JButton jButtonGravarCadastroCompleto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtBairroCadastroCompleto1;
    private javax.swing.JTextField txtCelularCadastroCompleto;
    private javax.swing.JTextField txtCepCadastroCompleto;
    private javax.swing.JTextField txtCidadeCadastroCompleto;
    private javax.swing.JTextField txtCpfCadastroCompleto;
    private javax.swing.JTextField txtDataDeNascimentoCadastroCompleto;
    private javax.swing.JTextField txtEmailCadastroCompleto;
    private javax.swing.JTextField txtEnderecoCadastroCompleto;
    private javax.swing.JTextField txtEstadoCadastroCompleto;
    private javax.swing.JTextField txtLojaFavoritaCadastroCompleto1;
    private javax.swing.JTextField txtNomeCadastroCompleto;
    private javax.swing.JTextField txtProfissaoCadastroCompleto;
    private javax.swing.JTextField txtVendedorFavoritoCadastro;
    // End of variables declaration//GEN-END:variables
}
