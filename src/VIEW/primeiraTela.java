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
public class primeiraTela {

    JFrame telaInicial1 = new JFrame("TelaInicial");
        
        public primeiraTela(){
            telaInicial1.setBounds(500, 500, 800, 550);
           
            telaInicial1.setLayout(null);
            telaInicial1.setDefaultCloseOperation(3);
            telaInicial1.setResizable(false);
            telaInicial1.setLocationRelativeTo(null);

            JLabel textoInicial = new JLabel();
            textoInicial.setText("O QUE VOCÊ DESEJA ?");
       
            textoInicial.setFont(new Font("Verdana", Font.BOLD, 35));
            textoInicial.setBounds(175, 50, 450, 40);

            JButton botaoRegistroCliente = new JButton("Registrar Cliente");
            botaoRegistroCliente.setBounds(250, 355, 150, 60);
    

            JButton botaoRegistroFuncionario = new JButton("Registrar Funcionario");
            botaoRegistroFuncionario.setBounds(250, 255, 150, 60);

            JButton botaoLoginliente = new JButton("Logar Cliente");
            botaoLoginliente.setBounds(450, 355, 150, 60);

            JButton botaoLoginCFuncionario = new JButton("Logar Funcionario");
            botaoLoginCFuncionario.setBounds(450, 255, 150, 60);

            telaInicial1.add(botaoLoginCFuncionario);
            telaInicial1.add(botaoLoginliente);
            telaInicial1.add(botaoRegistroCliente);
            telaInicial1.add(botaoRegistroFuncionario);

            telaInicial1.add(textoInicial);

            telaInicial1.setVisible(true);
        }


      
   

   
}

