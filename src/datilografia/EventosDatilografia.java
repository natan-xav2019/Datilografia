
package datilografia;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class EventosDatilografia implements KeyListener{
    
    private Teclado t;
    private String letra; 
   
    public EventosDatilografia(Teclado t){
       this.t = t;
    }
        
    @Override
    public void keyTyped(KeyEvent e) {
        this.letra = String.valueOf(e.getKeyChar()).toUpperCase();   
        System.out.println(this.letra);
        trocaDeCorPreçao(t,this.letra);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        trocaDeCorSemPreçao(this.t,this.letra);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        trocaDeCorSemPreçao(this.t,this.letra);
    }
    
    public void trocaDeCorPreçao(Teclado t,String l) {
        
        switch(l){
            case "Q" : t.adicionarCorBotaoPreção(0);
                break;
            case "W" : t.adicionarCorBotaoPreção(1);
                break;
            case "E" : t.adicionarCorBotaoPreção(2);
                break;
            case "R" : t.adicionarCorBotaoPreção(3);
                break;
            case "T" : t.adicionarCorBotaoPreção(4);
                break;
            case "Y" : t.adicionarCorBotaoPreção(5);
                break;
            case "U" : t.adicionarCorBotaoPreção(6);
                break;
            case "I" : t.adicionarCorBotaoPreção(7);
                break;
            case "O" : t.adicionarCorBotaoPreção(8);
                break;
            case "P" : t.adicionarCorBotaoPreção(9);
                break;
            case "A" : t.adicionarCorBotaoPreção(10);
                break;
            case "S" : t.adicionarCorBotaoPreção(11);
                break;
            case "D" : t.adicionarCorBotaoPreção(12);
                break;
            case "F" : t.adicionarCorBotaoPreção(13);
                break;
            case "G" : t.adicionarCorBotaoPreção(14);
                break;
            case "H" : t.adicionarCorBotaoPreção(15);
                break;
            case "J" : t.adicionarCorBotaoPreção(16);
                break;
            case "K" : t.adicionarCorBotaoPreção(17);
                break;
            case "L" : t.adicionarCorBotaoPreção(18);
                break;
            case "Z" : t.adicionarCorBotaoPreção(19);
                break;
            case "X" : t.adicionarCorBotaoPreção(20);
                break;
            case "C" : t.adicionarCorBotaoPreção(21);
                break;
            case "V" : t.adicionarCorBotaoPreção(22);
                break;
            case "B" : t.adicionarCorBotaoPreção(23);
                break;
            case "N" : t.adicionarCorBotaoPreção(24);
                break;
            case "M" : t.adicionarCorBotaoPreção(25);
                break;
        }
    }
    
    public void trocaDeCorSemPreçao(Teclado t,String l) {
        
        switch(l){
            case "Q" : t.adicionarCorBotao(0);
                break;
            case "W" : t.adicionarCorBotao(1);
                break;
            case "E" : t.adicionarCorBotao(2);
                break;
            case "R" : t.adicionarCorBotao(3);
                break;
            case "T" : t.adicionarCorBotao(4);
                break;
            case "Y" : t.adicionarCorBotao(5);
                break;
            case "U" : t.adicionarCorBotao(6);
                break;
            case "I" : t.adicionarCorBotao(7);
                break;
            case "O" : t.adicionarCorBotao(8);
                break;
            case "P" : t.adicionarCorBotao(9);
                break;
            case "A" : t.adicionarCorBotao(10);
                break;
            case "S" : t.adicionarCorBotao(11);
                break;
            case "D" : t.adicionarCorBotao(12);
                break;
            case "F" : t.adicionarCorBotao(13);
                break;
            case "G" : t.adicionarCorBotao(14);
                break;
            case "H" : t.adicionarCorBotao(15);
                break;
            case "J" : t.adicionarCorBotao(16);
                break;
            case "K" : t.adicionarCorBotao(17);
                break;
            case "L" : t.adicionarCorBotao(18);
                break;
            case "Z" : t.adicionarCorBotao(19);
                break;
            case "X" : t.adicionarCorBotao(20);
                break;
            case "C" : t.adicionarCorBotao(21);
                break;
            case "V" : t.adicionarCorBotao(22);
                break;
            case "B" : t.adicionarCorBotao(23);
                break;
            case "N" : t.adicionarCorBotao(24);
                break;
            case "M" : t.adicionarCorBotao(25);
                break;
        }
    }
    
}
