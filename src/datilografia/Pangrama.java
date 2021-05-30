/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datilografia;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author Administrador
 */
public class Pangrama {
    
    private final JLabel pergunta = new JLabel(); //Será que essa é a melhor maneira?
    private final ArrayList<String> pangrama = new ArrayList<String>();
    
    
    public Pangrama(){
        pangrama.add("Gazeta publica hoje breve anúncio de faxina na quermesse");
        pangrama.add("The quick brown fox jumps over de lazy dog");
        pangrama.add("Quick wafting zephyrs vex bold Jim");
        
    }
    
    //Aqui a gente pode fazer um método para colocar os pangramas nesse arraylist
    
    //Também podemos fazer aqui um método para comparar se está certo ou não 

    public JLabel getPergunta() {
        //Teste, precisamos melhorar isso depois
        pergunta.setText(pangrama.get(0));
        
        //Podemos criar aqui uma variável para mudar os index da pergunta
        return pergunta;
    }
    

}
