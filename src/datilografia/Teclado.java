//Quantidade de teclas 14+14+13+12+4 = 57
package datilografia;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.util.ArrayList;

public class Teclado {
    //Primeiramente precisamos de Jframe. Depois vamos precisar de um container e depois o FlowLayout.
    ArrayList<JButton> botoes = new ArrayList<>();
    
    
    public void criarTeclado(JFrame jframe){
        jframe = new JFrame();
        jframe.setLayout(new FlowLayout());
        
        String textoBotao;
        
        for (int indice = 'a'; indice <= 'z'; indice++) {
            textoBotao = Integer.toString(indice);
            botoes.add(new JButton(textoBotao));
        }
        
        for (JButton botao : botoes){
            jframe.add(botao);
        }
        
    }

    public ArrayList<JButton> getBotoes() {
        return botoes;
    }
    
}
