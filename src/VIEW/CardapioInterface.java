package VIEW;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CardapioInterface {

    public CardapioInterface(){

        JFrame interfaceMenu = new JFrame("Cardapio");

        interfaceMenu.setBounds(500, 500, 800, 550);
        interfaceMenu.setUndecorated(true);
        interfaceMenu.setLayout(null);
        interfaceMenu.setDefaultCloseOperation(3);
        interfaceMenu.setResizable(false);
        interfaceMenu.setLocationRelativeTo(null);

        JLabel textCardapio = new JLabel("Cardapio");
        textCardapio.setBounds(340, 4, 250,100);
        textCardapio.setFont(new Font("Arial", Font.BOLD, 30));

        JButton botaoAdicionarCardapio = new JButton();

        botaoAdicionarCardapio.setBounds(300, 400, 150,100);
        botaoAdicionarCardapio.setText("Adicionar");
        botaoAdicionarCardapio.setEnabled(true);


        JPanel produtosDoCardapio = new JPanel();
        produtosDoCardapio.setBounds(30, 100, 130,130);
        // produtosDoCardapio.setBackground(Color.BLACK);
        produtosDoCardapio.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));



        Icon icone = new ImageIcon("./IconeUser.png");
        JLabel labelImagem  =new JLabel();
        labelImagem.setSize(100, 100);
        labelImagem.setIcon(icone);



        JLabel nomeDoProduto = new JLabel("Nome");
        nomeDoProduto.setBounds(20, 30, 50,50);
        nomeDoProduto.setBackground(Color.magenta);

        ArrayList<JPanel> produtos = new ArrayList<>();

        produtosDoCardapio.add(labelImagem);
        produtosDoCardapio.add(nomeDoProduto);


        interfaceMenu.add(produtosDoCardapio);
        interfaceMenu.add(textCardapio);
        interfaceMenu.add(botaoAdicionarCardapio);
        interfaceMenu.setVisible(true);


        botaoAdicionarCardapio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Produto produto1 = new Produto();

                produtos.add(produto1.novoProduto);


                int count = 185;

                for (int i = 0; i < produtos.size(); i++) {
                    GridLayout grid = new GridLayout(1,1, 100,10);


                /*    // LEMBRAR DE TENTAR FAZER COM GRID PANE ( talvez fique mais facil )
                    JPanel painelWhereProduct = new JPanel();
                    painelWhereProduct.setBounds(10, 25 ,800,460);
                    painelWhereProduct.setLayout(grid);
                    interfaceMenu.add(painelWhereProduct);


                    painelWhereProduct.add(produtos.get(i));
                    System.out.println(produtos.get(i));
                    produto1. novoProduto.setBounds((30 + (i * count) ), 100, 130,130);
                    painelWhereProduct.add(produto1.novoProduto);
                    painelWhereProduct.setVisible(true);
*/

                  interfaceMenu.add(produtos.get(i));
                   System.out.println(produtos.get(i));
                    produto1. novoProduto.setBounds((30 + (i * count) ), 100, 130,130);
                    interfaceMenu.add(produto1.novoProduto);
                    interfaceMenu.setVisible(true);















                }



            }

        });
    }

}
