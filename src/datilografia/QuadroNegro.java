package datilografia;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.*;


public class QuadroNegro implements KeyListener{

    private final JPanel painel = new JPanel();
    private final JTextArea quadro = new JTextArea();
    private final JScrollPane area = new JScrollPane(quadro);

    public QuadroNegro() { //Contrutor do QuadroNegro
        quadro.setLineWrap(true); //Faz a quebra de linha 
        quadro.addKeyListener(this);
        
        //quadro.setText(pangrama.get(0)); //Teste de como funcionaria os pangramas na tela
        painel.setLayout(new BorderLayout());
        painel.add(area);
    }

    public JPanel getQuadroNegro() { //Aqui retornamos o Objeto JTextArea Tela
        return painel;
    }

    public void submeterUmaFrase(KeyEvent e){
        if(e.getKeyCode() == KeyEvent.VK_ENTER){
            //Aqui tem que fazer com que a frase seja submetida
            //acho que vou precisar fazer uma string e nela guardar a informação
            
           
            //Outro modo é usar propriedades de documento
            // Outro modo para tentar resolver é usando text field
            // Outro modo ainda é tentando percorrer toda string e pegar onde tem o "\n"
        }   
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        submeterUmaFrase(e);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        submeterUmaFrase(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        submeterUmaFrase(e);
    }
}
