//Quantidade de teclas 14+14+13+12+4 = 57
package datilografia;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.util.ArrayList;

public class Teclado {
    //Primeiramente precisamos de Jframe. Depois vamos precisar de um container e depois o FlowLayout.
    ArrayList<JButton> botoes = new ArrayList<JButton>();
    
    public Teclado() {
        
    }
    
    public void criarTeclado(){
        JFrame tela = new JFrame();
        Container caixa = tela.getContentPane();
        
        caixa.setLayout(new FlowLayout());
        
        for (int indice = 0; indice < 10; indice++) {
            botoes.add(new JButton());
            caixa.add(botoes.get(indice));
        }
        
       
    }
}
