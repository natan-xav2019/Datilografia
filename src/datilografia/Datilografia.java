/*
Alunos: Natan Xavier de Siqueira, Daniel ...
Materia: 2019200079
*/ 
package datilografia;

import javax.swing.*;


public class Datilografia {

    public static void main(String[] args) {
        
        JFrame janela = new JFrame("Datilografia");
        
        Butao b = new Butao(200,400,50,50,"a");//sintaquise do butao(posição na tela x,posição na tela y, tamanho do butao x,tamanho do butao y, conteudo do botao );
        
        QuadroNegro t1 = new QuadroNegro();
        janela.add(t1.getQuadroNegro());

        janela.add(b.getButao());
                
        janela.setSize(1100, 800);
        janela.setLayout(null);
        janela.setLocationRelativeTo(null);  
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
    
}
