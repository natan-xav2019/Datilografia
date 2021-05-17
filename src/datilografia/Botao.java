package datilografia;

import javax.swing.*;
import java.awt.Color;

public class Botao {
    
    private int alturaBotao;
    private int larguraBotao;
    private int posisaoEixoX;
    private int posisaoEixoY;
    
    private String textoBotao;
    
    private final Color botaoCor = new Color(228,250,250);
    private final Color botaoCorPrecionado = new Color(150,250,250);
    private final JButton botaoInterface = new JButton();
    
    public Botao(int posisaoEixoX,int posisaoEixoY,int larguraButao,int alturaButao,String letra) {
        
        setPosisaoEixoX(posisaoEixoX);
        setPosisaoEixoY(posisaoEixoY);
        setLarguraButao(larguraButao);
        setAlturaButao(alturaButao);
        setLetraButao(letra);
        
        botaoInterface.setBounds(getPosisaoEixoX(), getPosisaoEixoY(), getLarguraButao(), getAlturaButao());
        botaoInterface.setBackground(botaoCor);
    }
    
    private int getAlturaButao(){
        return this.alturaBotao;
    }
    
    private void setAlturaButao(int altura){
        this.alturaBotao = altura;
    }
    
    private int getLarguraButao(){
        return this.larguraBotao;
    }
    
    private void setLarguraButao(int largura){
        this.larguraBotao = largura;
    }
    
    private String getTextoButao(){
        return this.textoBotao;
    }
    
    private void setLetraButao(String letra){
        this.textoBotao = letra;
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
