//Quantidade de teclas 14+14+13+12+4 = 57
package datilografia;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.util.ArrayList;
import javax.swing.JPanel;


public class Teclado {

    private ArrayList<JButton> botoes = new ArrayList<>();
    private JPanel painel = new JPanel();

    private char alfabeto = 'A';

    public Teclado() {

        painel.setLayout(new FlowLayout());//layout flexivel
        painel.setPreferredSize(new Dimension(500,500));//dimensao do painel
        
        for (int indice = 0; indice < 26; indice++) {//for coloca as letras do alfabeto
            botoes.add(new JButton(Character.toString(this.alfabeto++)));// as letras do alfabeto
            botoes.get(indice).setPreferredSize(new Dimension(50,40));//Dimensação do botao
        }

        for (JButton botao : botoes) { //adiciona os botoes no painel
            painel.add(botao);
        }

    }

    public JPanel getPainel() {//pegar painel
        return painel;
    }
}
