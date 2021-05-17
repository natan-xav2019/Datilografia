/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datilografia;

import javax.swing.JTextArea;
import java.awt.event.*;

/**
 *
 * @author natan
 */
public class QuadroNegro {
    
    private final JTextArea tela = new JTextArea();
    
    public QuadroNegro() { //Contrutor do QuadroNegro
        tela.setBounds(40,80,1000,200);
    }
    
    public JTextArea getQuadroNegro() { //Aqui retornamos o tamanho do quadro
        return tela;
    }
    
}
