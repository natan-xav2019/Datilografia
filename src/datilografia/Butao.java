package datilografia;

import javax.swing.*;

public class Butao {
    
    private int alturaButao;
    private int larguraButao;
    private int posisaoEixoX;
    private int posisaoEixoY;
    private String textoButao;
    private final JButton botaoInterface = new JButton();
    
    public Butao(int posisaoEixoX,int posisaoEixoY,int larguraButao,int alturaButao,String letra) {
        
        setPosisaoEixoX(posisaoEixoX);
        setPosisaoEixoY(posisaoEixoY);
        setLarguraButao(larguraButao);
        setAlturaButao(alturaButao);
        setLetraButao(letra);
        
        botaoInterface.setBounds(getPosisaoEixoX(), getPosisaoEixoY(), getLarguraButao(), getAlturaButao());
        
    }
    
    private int getAlturaButao(){
        return this.alturaButao;
    }
    
    private void setAlturaButao(int altura){
        this.alturaButao = altura;
    }
    
    private int getLarguraButao(){
        return this.larguraButao;
    }
    
    private void setLarguraButao(int largura){
        this.larguraButao = largura;
    }
    
    private String getTextoButao(){
        return this.textoButao;
    }
    
    private void setLetraButao(String letra){
        this.textoButao = letra;
        botaoInterface.setText(getTextoButao());
    }
    
    private int getPosisaoEixoX() {
        return this.posisaoEixoX; 
    }
    
    private void setPosisaoEixoX(int posisaoX) {
         this.posisaoEixoX = posisaoX;
    }
    
    private int getPosisaoEixoY() {
        return this.posisaoEixoY; 
    }
    
    private void setPosisaoEixoY(int posisaoY) {
         this.posisaoEixoY = posisaoY;
    }
    
    public JButton getButao(){
        return botaoInterface;
    }
    
    
}
