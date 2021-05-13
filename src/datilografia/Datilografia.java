/*
Alunos: Natan Xavier de Siqueira, Daniel ...
Materia: 2019200079
*/ 
package datilografia;

import javax.swing.*;


public class Datilografia {

    public static void main(String[] args) {
        
        JFrame janela = new JFrame("Datilografia");
        
        Butao b = new Butao("a");
        
        janela.add(b.getButao());
        
        janela.setSize(1100, 800);
        janela.setLayout(null);
        janela.setLocationRelativeTo(null);  
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
    
}
