package VIEW;

import DAO.FuncionarioDAO;
import DAO.UsuarioDAO;
import DTO.FuncionarioDTO;
import DTO.UsuarioDTO;

import javax.swing.*;

import com.mysql.cj.jdbc.result.ResultSetFactory;
import com.mysql.cj.protocol.a.ResultsetFactory;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class telaRegistro {
    JFrame telaRegistro = new JFrame("Registro");
    JPanel jpnRegistro = new JPanel();

    /**
     * 
     */
    public telaRegistro() {

        telaRegistro.setBounds(500, 500, 800, 550);
        telaRegistro.setUndecorated(true);

        telaRegistro.setLocationRelativeTo(null);
        telaRegistro.setDefaultCloseOperation(3);
        telaRegistro.setResizable(false);
        telaRegistro.setLayout(null);

        JLabel labelRegistroUsuario = new JLabel();
        labelRegistroUsuario.setText("Usuario: ");
        labelRegistroUsuario.setFont(new Font("Verdana", Font.BOLD, 25));
        labelRegistroUsuario.setBounds(35, 50, 250, 40);

        JTextField textRegistroUsuario = new JTextField();
        textRegistroUsuario.setBounds(60, 115, 400, 40);
        textRegistroUsuario.setEnabled(true);

        JLabel labelRegistroSenha = new JLabel();
        labelRegistroSenha.setText("Senha: ");
        labelRegistroSenha.setFont(new Font("Verdana", Font.BOLD, 25));

        labelRegistroSenha.setBounds(35, 210, 250, 40);

        JTextField textRegistroSenha = new JTextField();
        textRegistroSenha.setBounds(60, 285, 400, 40);
        textRegistroSenha.setEnabled(true);

        JButton botaoRegistro = new JButton("Registrar");
        botaoRegistro.setBounds(150, 355, 150, 60);

        JCheckBox checkBoxFuncionario = new JCheckBox("Funcionario?");
        checkBoxFuncionario.setBounds(170, 455, 100, 50);


        jpnRegistro.setBackground(new Color(94,100,165));
        jpnRegistro.setBounds(400, 0, 400, 550);

        telaRegistro.add(checkBoxFuncionario);
        telaRegistro.add(jpnRegistro);
        telaRegistro.add(botaoRegistro);
        telaRegistro.add(labelRegistroUsuario);
        telaRegistro.add(labelRegistroSenha);
        telaRegistro.add(textRegistroUsuario);
        telaRegistro.add(textRegistroSenha);

        telaRegistro.setVisible(true);



        botaoRegistro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (checkBoxFuncionario.isSelected()) {
                    try {
                        String nome_funcionario, senha_funcionario;

                        nome_funcionario = textRegistroUsuario.getText();
                        senha_funcionario = textRegistroSenha.getText();

                        FuncionarioDTO objNovoFuncionarioDTO = new FuncionarioDTO();

                        objNovoFuncionarioDTO.setNomeRegistro_funcionario(nome_funcionario);
                        objNovoFuncionarioDTO.setSenhaRegistro_funcionario(senha_funcionario);

                        FuncionarioDAO objNovoFuncionarioDAO = new FuncionarioDAO();
                        objNovoFuncionarioDAO.RegistrarFuncionario(objNovoFuncionarioDTO);
                    } catch (Exception er) {
                        JOptionPane.showMessageDialog(null, "TOP");

                    }
                } else {
                    try {
                        String nome_usuario, senha_usuario;

                        nome_usuario = textRegistroUsuario.getText();
                        senha_usuario = textRegistroSenha.getText();

                        UsuarioDTO objNovoUsuarioDTO = new UsuarioDTO();

                        objNovoUsuarioDTO.setNomeRegistro_usuario(nome_usuario);
                        objNovoUsuarioDTO.setSenhaRegistro_usuario(senha_usuario);

                        UsuarioDAO objusuarioDAO = new UsuarioDAO();
                        objusuarioDAO.RegistrarUsuario(objNovoUsuarioDTO);

                        if (objusuarioDAO.RegistrarUsuario(objNovoUsuarioDTO) == true) {
                            JOptionPane.showMessageDialog(null, "REGISTROU");
                            Interface telaInicial = new Interface();

                            // chamar tela q eu quero abrir
                        } else {
                            JOptionPane.showMessageDialog(null, "Usuario ou senha incorretos");
                            // enviar mensagem dizendo incorreto
                        }

                    }catch (Exception er){
                      JOptionPane.showMessageDialog(null , "errado");
                    }finally {
                        System.out.println("FINALLY");
                    }
                }
             }





        });
    }

}

