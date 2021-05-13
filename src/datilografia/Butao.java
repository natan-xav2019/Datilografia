package datilografia;

import javax.swing.*;

public class Butao {
    
    private int alturaButao;
    private int larguraButao;
    private String textoButao;
    private final JButton botaoInterface = new JButton();
    
    public Butao(String letra) {
        setAlturaButao(50);
        setLarguraButao(50);
        setLetraButao(letra);
        
        botaoInterface.setBounds(200,400,getAlturaButao(),getLarguraButao());
        
    }
    
    private int getAlturaButao(){
        return alturaButao;
    }
    
    private void setAlturaButao(int altura){
        this.alturaButao = altura;
    }
    
    private int getLarguraButao(){
        return larguraButao;
    }
    
    private void setLarguraButao(int largura){
        this.larguraButao = largura;
    }
    
    private String getTextoButao(){
        return textoButao;
    }
    
    private void setLetraButao(String letra){
        this.textoButao = letra;
        botaoInterface.setText(getTextoButao());
    }
    
    public JButton getButao(){
        return botaoInterface;
    }
    
    
}
