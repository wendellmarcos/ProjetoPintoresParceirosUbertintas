/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.login.controller;

import br.com.login.dao.Conexao;
import br.com.login.dao.LoginDAO;
import br.com.login.view.CadastroView;
import br.com.login.view.LoginView;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Wendell
 */
public class LoginController {
    
    public void cadastrarUsuario(CadastroView view) throws SQLException{
        Connection conexao = new Conexao().getConncection();
        LoginDAO cadastro = new LoginDAO();
        cadastro.cadastrarUsuario(view.getjTextNome().getText(), view.getjTextEmail().getText(), view.getjPasswordField1Senha().getText());
        
    }
    
    public void loginUsuario(LoginView view) throws SQLException{
        Connection conexao = new Conexao().getConncection();
        LoginDAO login = new LoginDAO();
        login.login(view.getjTextFieldLogin().getText(), view.getjPasswordFieldSenha().getText());
        
    }
    
}
