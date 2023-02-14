/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.login.controller;

import br.com.DAO.ConexaoDAO;
import br.com.DAO.LoginDAO;
import br.com.VIEW.CadastroView;
import br.com.VIEW.LoginView;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Wendell
 */
public class LoginController {
    
    public void cadastrarUsuario(CadastroView view) throws SQLException{
        Connection conexao = new ConexaoDAO().getConncection();
        LoginDAO cadastro = new LoginDAO();
        cadastro.cadastrarUsuario(view.getjTextNome().getText(), view.getjTextEmail().getText(), view.getjPasswordField1Senha().getText());
        
    }
    
    public void loginUsuario(LoginView view) throws SQLException{
        Connection conexao = new ConexaoDAO().getConncection();
        LoginDAO login = new LoginDAO();
        login.login(view.getjTextFieldLogin().getText(), view.getjPasswordFieldSenha().getText());
        
    }
    
}
