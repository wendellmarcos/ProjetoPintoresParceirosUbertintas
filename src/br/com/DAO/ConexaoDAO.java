/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoDAO {
    
    public Connection conectaDB() {
       // Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ubertintas", "root","280113");
        //return conn;
        
        Connection conn = null;
        
        try {
            String url = "jdbc:mysql://localhost:3306/ubertintas?user=root&password=280113";
            conn = DriverManager.getConnection(url);
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ConexaoDAO "+ erro.getMessage());
        }
        
        return conn;
    }

    public Connection getConncection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
