/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datilografia;

import javax.swing.*;

public class Janela{
    
    private final JFrame tela = new JFrame();
    
    public Janela(){
        tela.setSize(1100, 800);
        tela.setLayout(null);
        tela.setLocationRelativeTo(null);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setVisible(true);
    }

    
    
    public void inserirTitulo(JButton botao){
        
    }
    
    public void inserirTexto(JTextArea texto){
        tela.add(texto);
    }
}
