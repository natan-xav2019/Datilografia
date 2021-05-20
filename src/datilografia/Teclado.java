//Quantidade de teclas 14+14+13+12+4 = 57
package datilografia;

import java.awt.FlowLayout;
import javax.swing.JButton;
import java.util.ArrayList;
<<<<<<< HEAD
import javax.swing.JFrame;
=======
import javax.swing.JPanel;
>>>>>>> janela

public class Teclado {

    private ArrayList<JButton> botoes = new ArrayList<>();
    private JPanel painel = new JPanel();

    private char alfabeto = 'A';

    public void criarTeclado() {

        painel.setLayout(new FlowLayout());

        for (int indice = 0; indice < 26; indice++) {
            botoes.add(new JButton(Character.toString(this.alfabeto++)));
        }

        for (JButton botao : botoes) {
            painel.add(botao);
        }

    }

    public JPanel getPainel() {
        return painel;
    }
}
