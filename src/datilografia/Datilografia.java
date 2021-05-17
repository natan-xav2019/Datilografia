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
        Botao b = new Botao(200, 400, 50, 50, "a");//sintaxe do butao(posição na tela x,posição na tela y, tamanho do butao x,tamanho do butao y, conteudo do botao );

        QuadroNegro t1 = new QuadroNegro();
        janela.add(t1.getQuadroNegro());

        janela.add(b.getButao());

        janela.setSize(1100, 800);
        janela.setLayout(null);
        janela.setLocationRelativeTo(null);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);

        /*
        Teste meio falho, mas da para usar o FlowLayout para alinhar as coisas
        
        Container painel = janela.getContentPane();
        painel.setLayout(new FlowLayout());

        JButton a = new JButton("a");
        painel.add(a);
        a = new JButton("b");
        painel.add(a);
        a = new JButton("c");
        painel.add(a);
        a = new JButton("d");
        painel.add(a);
        */
    }

}
