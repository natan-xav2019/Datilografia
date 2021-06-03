/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datilografia;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author Administrador
 */
public class Pangrama {
    
    private final JPanel painel = new JPanel();
    private final JLabel pergunta = new JLabel(); //Será que essa é a melhor maneira?
    private final JLabel Instrusao = new JLabel("Instrução de como funciona");
    private final ArrayList<String> pangrama = new ArrayList<String>();
    
    private int indise = 0;
    
    public Pangrama(){
        painel.setLayout(new BorderLayout());
        
        
        pangrama.add("Gazeta publica hoje breve anúncio de faxina na quermesse");
        pangrama.add("The quick brown fox jumps over de lazy dog");
        pangrama.add("Quick wafting zephyrs vex bold Jim");
        
        painel.add(Instrusao);
        painel.add(getPergunta());

    }
    
    //Aqui a gente pode fazer um método para colocar os pangramas nesse arraylist
    
    //Também podemos fazer aqui um método para comparar se está certo ou não 

    private JLabel getPergunta() {
        //pode se colocar sempre na mesma ordem assim a nossa organização fica mais facil para a correção das mesmas frazes pois os idices seram os mesmo
        pergunta.setText(pangrama.get(indise));
        
        //a cada chamada o index pode somar 1 botei numa função que se quiser incrementar algo e so mudar ela
        proximaPergunta();
        
        return pergunta;
    }
    
    public JPanel getPangrama(){
        return painel;
    }
    
    public void proximaPergunta(){
        indise++;
    }

}
