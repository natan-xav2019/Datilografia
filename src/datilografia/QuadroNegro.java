package datilografia;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class QuadroNegro {

    private final JPanel painel = new JPanel();
    private final JTextArea quadro = new JTextArea();

    public QuadroNegro() { //Contrutor do QuadroNegro
        //quadro.setPreferredSize(new Dimension(500, 300));
        quadro.setLineWrap(true); //Faz a quebra de linha 
        //quadro.setWrapStyleWord(true); AINDA NÃO SEI O QUE FAZ DIREITO, MAS VAMOS TESTANDO

        //Ha Função de definir linhas e colunas, o que acha de botarmos ela?
        
        painel.setLayout(new BorderLayout());
        painel.add(quadro);
    }

    public JPanel getQuadroNegro() { //Aqui retornamos o Objeto JTextArea Tela
        return painel;
    }
}
