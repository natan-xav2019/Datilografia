/*
Alunos: Natan Xavier de Siqueira, Daniel da Silva Henrique
Materia: 2019200079, 2019200296
 */
package datilografia;

//import javax.swing.*;
public class Datilografia {

    public static void main(String[] args) {

        Janela janela = new Janela("Datilografia");

        Teclado teclado = new Teclado();

        QuadroNegro t1 = new QuadroNegro();

        janela.getJanela().add(t1.getQuadroNegro());

        teclado.criarTeclado();

        janela.getJanela().getContentPane().add(teclado.getPainel());

        janela.painel();
    }

}
