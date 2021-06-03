package datilografia;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class QuadroNegro {

    private final JPanel painel = new JPanel();
    private final JTextArea quadro = new JTextArea();
    private final JScrollPane area = new JScrollPane(quadro);

    public QuadroNegro() { //Contrutor do QuadroNegro
        quadro.setLineWrap(true); //Faz a quebra de linha

        painel.setLayout(new BorderLayout());
        painel.add(area);
    }

    public JPanel getQuadroNegro() { //Aqui retornamos o Objeto JTextArea
        return painel;
    }

    public JTextArea getJTextArea() { //Aqui retornamos o Objeto JTextArea
        return quadro;
    }
}
