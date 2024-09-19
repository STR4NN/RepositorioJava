package VIEW;

import javax.swing.*;

public class BemVindo {

    JFrame telaSejaBemVindo = new JFrame("Restaurante ROMOLO");
         Interface ikinterface = new Interface();
    public BemVindo(){
        telaSejaBemVindo.setBounds(500, 500, 800, 550);
        telaSejaBemVindo.setUndecorated(true);
        telaSejaBemVindo.setLayout(null);
        telaSejaBemVindo.setDefaultCloseOperation(3);
        telaSejaBemVindo.setResizable(false);
        telaSejaBemVindo.setLocationRelativeTo(null);

        telaSejaBemVindo.setVisible(true);
    }
}
