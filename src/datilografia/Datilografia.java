/*
Alunos: Natan Xavier de Siqueira, Daniel da Silva Henrique
Materia: 2019200079, 2019200296
 */
package datilografia;

import java.awt.FlowLayout;
import javax.swing.*;

public class Datilografia {

    public static void main(String[] args) {

        // Como está escrito no documento, to pensando transformar tudo isso em uma classe
        // Para que possamos gerenciar isso melhor sem deixar o main bagunçado
        JFrame janela = new JFrame("Datilografia");
        Teclado teclado = new Teclado();

        QuadroNegro t1 = new QuadroNegro();
        janela.add(t1.getQuadroNegro());

        teclado.criarTeclado(janela);

        for (JButton botoes : teclado.getBotoes()) {
            janela.add(botoes);

        }

        janela.setSize(1100, 800);
        janela.setLayout(new FlowLayout());
        janela.setLocationRelativeTo(null);//Com a possição relativa sendo null nao precisamos colotar posição relativa nos elementos 
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }

}
