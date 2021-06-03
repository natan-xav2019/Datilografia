package datilografia;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class QuadroNegro {

    private final JPanel painel = new JPanel();
    private final JTextArea quadro = new JTextArea();
    private final JScrollPane area = new JScrollPane(quadro);

    public QuadroNegro() { //Contrutor do QuadroNegro

        quadro.setLineWrap(true); //Faz a quebra de linha 
        quadro.setFont(new Font("Ariel",Font.PLAIN,16));
        
        painel.setLayout(new BorderLayout());
        painel.add(area);
        
    }
    
    public JPanel getQuadroNegro() {

        return painel;
    }

    public JTextArea getJTextArea() { //Aqui retornamos o Objeto JTextArea
        return quadro;
    }
}
