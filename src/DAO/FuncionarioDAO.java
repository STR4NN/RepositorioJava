package DAO;

import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JOptionPane;

import DTO.UsuarioDTO;

public class FuncionarioDAO {
Connection conn;

    public ResultSet autenticacaoFuncionario(UsuarioDTO objUsuarioDTO) {
        // Chama a conexao com o banco de dados através do metodo "conectBD"
        conn = new ConexaoDAO().conectaBD();

        try {
            // Dentro dessa string esta o comando que sera enviado ao banco de dados 
            String sql = "select * from funcionario where nome_usuario = ? and senha_usuario = ?";
            PreparedStatement pspm = conn.prepareStatement(sql);

            // O prmeiro parametro refere se ao primeiro ponto de interrogação 
            // de dentro do comando SQL
            pspm.setString(1, objUsuarioDTO.getNomeRegistro_usuario());
            pspm.setString(2, objUsuarioDTO.getNomeRegistro_usuario());

            // Executa o comando 
            ResultSet rs = pspm.executeQuery();
            // Retorna o ResultSet (A função tem como "Tipo a classe ResultSet")
            return rs;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "usuario DAO : " + erro);
            return null;
        }
    }
}