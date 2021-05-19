/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datilografia;

import javax.swing.JTextArea;

/**
 *
 * @author natan
 */
public class QuadroNegro {

    private final JTextArea tela = new JTextArea();

    public QuadroNegro() { //Contrutor do QuadroNegro
        tela.setBounds(40, 80, 1000, 200);
    }

    public JTextArea getQuadroNegro() { //Aqui retornamos o Objeto tela
        return tela;
    }
    
    //Possivelmente podemos usar aqui um método para mostrar os pangramas
    
    //Possivelmente podemos usar aqui um método para controlar a escrita do usuário
    //Se está correta ou errada
    
    //Podemos ainda adicionar o nível de precisão da escrita dele

}
