
package datilografia;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class EventosDatilografia implements KeyListener{
    
    private Teclado t;
    private QuadroNegro q;
    private Pangrama p;
    private String letra = null;
    private final ArrayList<String> frases = new ArrayList<String>();
    private int indice = 0;
    private int 
   
    public EventosDatilografia(Teclado t,QuadroNegro q, Pangrama p){
       this.t = t;
       this.q = q;
       this.p = p;
    }
        
    @Override
    public void keyTyped(KeyEvent e) {
            System.out.println("letra presionada: " + this.letra);
            
            this.letra = this.letra.toUpperCase();
            trocaDeCorPreçao(t,this.letra);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        this.letra = String.valueOf(e.getKeyChar());
        
        trocaDeCorSemPreçao(t,this.letra.toUpperCase());
        if(e.getKeyChar() == KeyEvent.VK_BACK_SPACE){
                System.out.println("apagou"); //Apagou
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        this.letra = String.valueOf(e.getKeyChar());
        
        trocaDeCorSemPreçao(t,this.letra.toUpperCase());
        if(e.getKeyChar() == KeyEvent.VK_ENTER){
                
                frases.add(q.getJTextArea().getText());
                
                q.getJTextArea().setText("");
                
                if(p.getFrase().get(indice).equals(frases.get(indice))){
                    System.out.println("são iguais!!!");
                }
                else {
                    System.out.println("são Diferentes!!!");
                }
                p.proximaPergunta();
                indice++;
        }
    }
    
    public void trocaDeCorPreçao(Teclado t,String l) {
        
        switch(l){
            case "Q" -> t.adicionarCorBotaoPreção(0);
            case "W" -> t.adicionarCorBotaoPreção(1);
            case "E" -> t.adicionarCorBotaoPreção(2);
            case "R" -> t.adicionarCorBotaoPreção(3);
            case "T" -> t.adicionarCorBotaoPreção(4);
            case "Y" -> t.adicionarCorBotaoPreção(5);
            case "U" -> t.adicionarCorBotaoPreção(6);
            case "I" -> t.adicionarCorBotaoPreção(7);
            case "O" -> t.adicionarCorBotaoPreção(8);
            case "P" -> t.adicionarCorBotaoPreção(9);
            case "A" -> t.adicionarCorBotaoPreção(10);
            case "S" -> t.adicionarCorBotaoPreção(11);
            case "D" -> t.adicionarCorBotaoPreção(12);
            case "F" -> t.adicionarCorBotaoPreção(13);
            case "G" -> t.adicionarCorBotaoPreção(14);
            case "H" -> t.adicionarCorBotaoPreção(15);
            case "J" -> t.adicionarCorBotaoPreção(16);
            case "K" -> t.adicionarCorBotaoPreção(17);
            case "L" -> t.adicionarCorBotaoPreção(18);
            case "Z" -> t.adicionarCorBotaoPreção(19);
            case "X" -> t.adicionarCorBotaoPreção(20);
            case "C" -> t.adicionarCorBotaoPreção(21);
            case "V" -> t.adicionarCorBotaoPreção(22);
            case "B" -> t.adicionarCorBotaoPreção(23);
            case "N" -> t.adicionarCorBotaoPreção(24);
            case "M" -> t.adicionarCorBotaoPreção(25);
            case " " -> t.adicionarCorBotaoPreção(26);
            case "\n" -> t.adicionarCorBotaoPreção(27);
        }
    }
    
    public void trocaDeCorSemPreçao(Teclado t,String l) {
        
        switch(l){
            case "Q" -> t.adicionarCorBotao(0);
            case "W" -> t.adicionarCorBotao(1);
            case "E" -> t.adicionarCorBotao(2);
            case "R" -> t.adicionarCorBotao(3);
            case "T" -> t.adicionarCorBotao(4);
            case "Y" -> t.adicionarCorBotao(5);
            case "U" -> t.adicionarCorBotao(6);
            case "I" -> t.adicionarCorBotao(7);
            case "O" -> t.adicionarCorBotao(8);
            case "P" -> t.adicionarCorBotao(9);
            case "A" -> t.adicionarCorBotao(10);
            case "S" -> t.adicionarCorBotao(11);
            case "D" -> t.adicionarCorBotao(12);
            case "F" -> t.adicionarCorBotao(13);
            case "G" -> t.adicionarCorBotao(14);
            case "H" -> t.adicionarCorBotao(15);
            case "J" -> t.adicionarCorBotao(16);
            case "K" -> t.adicionarCorBotao(17);
            case "L" -> t.adicionarCorBotao(18);
            case "Z" -> t.adicionarCorBotao(19);
            case "X" -> t.adicionarCorBotao(20);
            case "C" -> t.adicionarCorBotao(21);
            case "V" -> t.adicionarCorBotao(22);
            case "B" -> t.adicionarCorBotao(23);
            case "N" -> t.adicionarCorBotao(24);
            case "M" -> t.adicionarCorBotao(25);
            case " " -> t.adicionarCorBotao(26);
            case "\n" -> t.adicionarCorBotao(27);
        }
    }
    
}
