/*
Alunos: Natan Xavier de Siqueira, Daniel da Silva Henrique
Materia: 2019200079, 2019200296
 */
package datilografia;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Datilografia {

    public static void main(String[] args) {

        Janela janela = new Janela("Datilografia");
        JPanel painel = new JPanel();
        JLabel texto = new JLabel();  //Vai querer usar esse aqui para as perguntas ? Se sim, teremos que criar uma classe
        Teclado teclado = new Teclado();
        QuadroNegro t1 = new QuadroNegro();

        texto.setText("Ola mundo!!");//texto para ver como o Jlabel iria se comportar
        
        painel.setLayout(new BorderLayout());
        painel.add(texto, BorderLayout.PAGE_START);
        painel.add(t1.getQuadroNegro(), BorderLayout.CENTER);
        painel.add(teclado.getPainel(), BorderLayout.PAGE_END);

        janela.getJanela().add(painel);

        janela.painel();
    }

}
