package VIEW;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import DAO.UsuarioDAO;
import DTO.UsuarioDTO;

public class Interface {
    JLabel labelUsuario;
    JLabel labelSenha;
    JPanel jpnLogin = new JPanel();;

    public Interface() {
        JFrame tela = new JFrame("LOGIN");
        
        
      
        tela.setBounds(500, 500, 800, 550);
        tela.setUndecorated(true);
        tela.setLayout(null);
        tela.setDefaultCloseOperation(3);
        tela.setResizable(false);
        tela.setLocationRelativeTo(null);

        JLabel labelUsuario = new JLabel();
        labelUsuario.setText("Usuario: ");
        labelUsuario.setFont(new Font("Verdana", Font.BOLD, 25));

        labelUsuario.setBounds(35, 50, 250, 40);

        JTextField textUsuario = new JTextField();
        textUsuario.setBounds(60, 115, 400, 40);
        textUsuario.setEnabled(true);

        JLabel labelSenha = new JLabel();
        labelSenha.setText("Senha: ");
        labelSenha.setFont(new Font("Verdana", Font.BOLD, 25));

        labelSenha.setBounds(35, 190, 250, 40);

        JTextField textSenha = new JTextField();
        textSenha.setBounds(60, 265, 400, 40);
        textSenha.setEnabled(true);

        JButton botaoLogin = new JButton("LOGIN");
        botaoLogin.setBounds(150, 345, 150, 50);

        JButton botaoRegistro = new JButton("REGISTRO");
        botaoRegistro.setBounds(150, 405, 150, 50);

        jpnLogin.setBackground(new Color(94,100,165));
        jpnLogin.setBounds(400, 0, 400, 550);

        JLabel imagemLabel = new JLabel();
        ImageIcon imagemUser = new ImageIcon("\\src\\Imagens\\IconeUser.png");
        imagemUser.setImage(imagemUser.getImage().getScaledInstance(400, 400, 300));
    
       
        imagemLabel.setIcon(imagemUser);;
        imagemLabel.setBounds(1, 200, 400, 400);
        imagemLabel.setVisible(true);
        

        
      
        tela.add(botaoRegistro);
        tela.add(botaoLogin);
        tela.add(labelSenha);
        tela.add(textUsuario);
        tela.add(textSenha);
        tela.add(labelUsuario);
        tela.add(jpnLogin);
        tela.add(imagemLabel);
        tela.setVisible(true);

        botaoRegistro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
               telaRegistro telaDeRegistro = new telaRegistro();
               tela.setVisible(false);
               
     } });

        

        botaoLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    String nome_usuario, senha_usuario;

                    nome_usuario = textUsuario.getText();
                    senha_usuario = textSenha.getText();

                    UsuarioDTO objUsuarioDTO = new UsuarioDTO();

                    objUsuarioDTO.setNome_usuario(nome_usuario);
                    objUsuarioDTO.setSenha_usuario(senha_usuario);

                    UsuarioDAO objusuarioDAO = new UsuarioDAO();
                    ResultSet rsusuarioDAO = objusuarioDAO.autenticacaoUsuario(objUsuarioDTO);

                    if (rsusuarioDAO.next()) {
                        JOptionPane.showMessageDialog(null, "Entrou no APP");
                        // chamar tela q eu quero abrir
                    } else {
                        JOptionPane.showMessageDialog(null, "Usuario ou senha incorretos");
                        //enviar mensagem dizendo incorreto
                    }
                } catch (SQLException erro) {
                   JOptionPane.showMessageDialog( null,"Botao login viwe" + erro);
            }
        
        }
    }
    
        );
        
    }

    public static void main(String[] args) {

        Interface inter = new Interface();
        
    }

}
