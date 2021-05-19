//Quantidade de teclas 14+14+13+12+4 = 57
package datilografia;

import javax.swing.JButton;
import java.util.ArrayList;

public class Teclado {
    //Primeiramente precisamos de Jframe. Depois vamos precisar de um container e depois o FlowLayout.
    ArrayList<JButton> botoes = new ArrayList<>();
    
    public void criarTeclado(){
       
        for (int indice = 0, alfabeto ='a' ; indice < 26; indice++) {
            
            botoes.add(new JButton( Character.toString(alfabeto++) ) );
        } 
        
    }

    public ArrayList<JButton> getBotoes() {
        return botoes;
    }
    
}
