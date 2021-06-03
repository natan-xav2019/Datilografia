
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
        
        if( "Q".equals(this.letra)){
            System.out.println("foi");
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        trocaDeCorSemPreçao(this.t,this.letra);
    }
    
    public void trocaDeCorPreçao(Teclado t,String l) {
        
        switch(l){
            case "Q" : t.adicionarCorBotaoPreção(0);
                break;
            /*case:
                break;
            case:
                break;
            case:
                break;
            case:
                break;
            case:
                break;
            case:
                break;
            case:
                break;
            case:
                break;
            case:
                break;
            case:
                break;
            case:
                break;
            case:
                break;
            case:
                break;
            case:
                break;*/
        }
    }
    
    public void trocaDeCorSemPreçao(Teclado t,String l) {
        
        switch(l){
            case "Q" : t.adicionarCorBotao(0);
                break;
            /*case:
                break;
            case:
                break;
            case:
                break;
            case:
                break;
            case:
                break;
            case:
                break;
            case:
                break;
            case:
                break;
            case:
                break;
            case:
                break;
            case:
                break;
            case:
                break;
            case:
                break;
            case:
                break;*/
        }
    }
    
}
