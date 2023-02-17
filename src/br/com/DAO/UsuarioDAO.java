package br.com.DAO;

import br.com.DTO.UsuarioDTO;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;




/**
 *
 * @author Wendell
 */
public class UsuarioDAO {

    Connection conn;

    public ResultSet autenticacaoUsuario(UsuarioDTO objUsuarioDTO) {
        conn = new ConexaoDAO().conectaDB();

        try {
            String sql = "select * from usuario where email = ? and senhaUsuario = ? ";

            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objUsuarioDTO.getEmail());
            pstm.setString(2, objUsuarioDTO.getSenhaUsuario());
            
            ResultSet rs = pstm.executeQuery();
            return rs;
            
            
        } catch (SQLException erro) {

            JOptionPane.showConfirmDialog(null, "UsuarioDAO" + erro);
        }
        return null;
    }
}
