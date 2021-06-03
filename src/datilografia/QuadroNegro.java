package datilografia;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class QuadroNegro{

    private final JPanel painel = new JPanel();
    private final JTextArea quadro = new JTextArea();
    private final JScrollPane area = new JScrollPane(quadro);
    

    public QuadroNegro() { //Contrutor do QuadroNegro
        quadro.setLineWrap(true); //Faz a quebra de linha 
              
        //System.out.println(quadro.getText());  //Teste de como pegar o texto que esta escrito na tela
        painel.setLayout(new BorderLayout());
        painel.add(area);
        
        //não esta aceitando funções publicas
    }
    
    public JPanel getQuadroNegro() { //Aqui retornamos o Objeto JTextArea Tela
        return painel;
    }
    
    public JTextArea getJTextArea() { //Aqui retornamos o Objeto JTextArea Tela
        return quadro;
    }
    
    
}
