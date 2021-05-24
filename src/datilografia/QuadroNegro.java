
package datilografia;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class QuadroNegro {
    
    JPanel painel = new JPanel();
    
    private final JTextArea quadro = new JTextArea();
    
    public QuadroNegro() { //Contrutor do QuadroNegro
        quadro.setPreferredSize(new Dimension(500,300));
        
        painel.setLayout(new BorderLayout());
        painel.add(quadro);
    }

    public JPanel getQuadroNegro() { //Aqui retornamos o Objeto JTextArea Tela
        return painel;
    }
}
