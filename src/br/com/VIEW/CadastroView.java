/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.VIEW;

import br.com.login.controller.LoginController;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Wendell
 */
public class CadastroView extends javax.swing.JFrame {

    /**
     * Creates new form CadastroView
     */
    public CadastroView() {
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

        txtTelaCadastroSenhaInicial = new javax.swing.JPasswordField();
        txtTelaCadastroInicialEmail = new javax.swing.JTextField();
        txtTelaCadastroInicialNome = new javax.swing.JTextField();
        buttonContinueTelaCadastrarInicial = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTelaCadastroSenhaInicial.setText("jPasswordField1");
        txtTelaCadastroSenhaInicial.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtTelaCadastroSenhaInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 462, 320, 40));

        txtTelaCadastroInicialEmail.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtTelaCadastroInicialEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, 320, 40));

        txtTelaCadastroInicialNome.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtTelaCadastroInicialNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelaCadastroInicialNomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtTelaCadastroInicialNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, 320, 40));

        buttonContinueTelaCadastrarInicial.setContentAreaFilled(false);
        buttonContinueTelaCadastrarInicial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonContinueTelaCadastrarInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonContinueTelaCadastrarInicialActionPerformed(evt);
            }
        });
        getContentPane().add(buttonContinueTelaCadastrarInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 320, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/CADASTRO SIMPLES 2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 760));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonContinueTelaCadastrarInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonContinueTelaCadastrarInicialActionPerformed
       
        if(txtTelaCadastroInicialNome.getText().matches("") || txtTelaCadastroInicialEmail.getText().matches("") || txtTelaCadastroSenhaInicial.getText().matches("") ){
            JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos!");
        } else{
            try{
            LoginController cadastro = new LoginController();
            cadastro.cadastrarUsuario(this);
       } catch (SQLException sql){
       
       }
        
       JOptionPane.showMessageDialog(rootPane, "Cadastro efetuado com sucesso!");
        
       this.setVisible(false);
    }    
               
        
    }//GEN-LAST:event_buttonContinueTelaCadastrarInicialActionPerformed

    private void txtTelaCadastroInicialNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelaCadastroInicialNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelaCadastroInicialNomeActionPerformed

    public JPasswordField getjPasswordField1Senha() {
        return txtTelaCadastroSenhaInicial;
    }

    public void setjPasswordField1Senha(JPasswordField jPasswordField1Senha) {
        this.txtTelaCadastroSenhaInicial = jPasswordField1Senha;
    }

    public JTextField getjTextEmail() {
        return txtTelaCadastroInicialEmail;
    }

    public void setjTextEmail(JTextField jTextEmail) {
        this.txtTelaCadastroInicialEmail = jTextEmail;
    }

    public JTextField getjTextNome() {
        return txtTelaCadastroInicialNome;
    }

    public void setjTextNome(JTextField jTextNome) {
        this.txtTelaCadastroInicialNome = jTextNome;
    }

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
            java.util.logging.Logger.getLogger(CadastroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CadastroView().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonContinueTelaCadastrarInicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtTelaCadastroInicialEmail;
    private javax.swing.JTextField txtTelaCadastroInicialNome;
    private javax.swing.JPasswordField txtTelaCadastroSenhaInicial;
    // End of variables declaration//GEN-END:variables
}
