/*
Alunos: Natan Xavier de Siqueira, Daniel da Silva Henrique
Materia: 2019200079, 2019200296
 */
package datilografia;

import javax.swing.*;

public class Datilografia {

    public static void main(String[] args) {

        
        // Como está escrito no documento, to pensando transformar tudo isso em uma classe
        // Para que possamos gerenciar isso melhor sem deixar o main bagunçado
        JFrame janela = new JFrame("Datilografia");
        JFrame b = new JFrame("a");//sintaxe do butao(posição na tela x,posição na tela y, tamanho do butao x,tamanho do butao y, conteudo do botao );
        
        QuadroNegro t1 = new QuadroNegro();
        janela.add(t1.getQuadroNegro());

        janela.add(b);

        janela.setSize(1100, 800);
        janela.setLayout(null);
        janela.setLocationRelativeTo(null);//Com a possição relativa sendo null nao precisamos colotar posição relativa nos elementos 
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }

}
