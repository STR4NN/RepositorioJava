package VIEW;

import java.awt.*;
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
public class primeiraTela {

    JFrame telaInicial1 = new JFrame("TelaInicial");



        public primeiraTela() {
            telaInicial1.setBounds(500, 500, 800, 550);

            telaInicial1.setLayout(null);
            telaInicial1.setDefaultCloseOperation(3);
            telaInicial1.setResizable(false);
            telaInicial1.setLocationRelativeTo(null);

            JLabel textoInicial = new JLabel();
            textoInicial.setText("O QUE VOCÊ DESEJA ?");

            textoInicial.setFont(new Font("Verdana", Font.BOLD, 35));
            textoInicial.setBounds(175, 50, 450, 40);

            JButton btRegistro = new JButton("REGISTRO");
            btRegistro.setBounds(220, 255, 150, 60);


            JButton btCardapio = new JButton("CARDAPIO");
            btCardapio.setBounds(220, 355, 350, 60);


            JButton btLogin = new JButton("LOGIN");
            btLogin.setBounds(420, 255, 150, 60);

            btLogin.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Interface telaLogin = new Interface();
                }
            });


            btRegistro.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    telaRegistro telaDoRegistro = new telaRegistro();
                }
            });
            telaInicial1.add(btLogin);
            telaInicial1.add(btCardapio);
            telaInicial1.add(btRegistro);
            telaInicial1.add(textoInicial);
            telaInicial1.setVisible(true);




        }



}

