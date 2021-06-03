package datilografia;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.util.ArrayList;
import javax.swing.JPanel;

public class Teclado {

    private final ArrayList<JButton> botoes = new ArrayList<>(); //Agora fiquei em dúvida, pode ser que a gente tenha que usar uma classe botão mesmo
    private final JPanel painel = new JPanel();
    private final Color cor = new Color(228,250,250);
    private final Color corPresionado = new Color(150,250,250);

    private int indice = 0;

    public Teclado() {

        painel.setLayout(new FlowLayout());//layout flexivel
        painel.setPreferredSize(new Dimension(500, 500));//dimensao do painel

        declararTeclas();
        
        configuraTamanhoBotao();
        
        adicionarBotaoTeclado();
        
        AdicionarCorBotaoTodos();
        
        
    }

    public JPanel getTeclado() {//pegar painel
        return painel;
    }
    
    public ArrayList getBotoes() {//pegar painel
        return botoes;
    }
    
    private void declararTeclas(){
        botoes.add(new JButton("Q"));
        botoes.add(new JButton("W"));
        botoes.add(new JButton("E"));
        botoes.add(new JButton("R"));
        botoes.add(new JButton("T"));
        botoes.add(new JButton("Y"));
        botoes.add(new JButton("U"));
        botoes.add(new JButton("I"));
        botoes.add(new JButton("O"));
        botoes.add(new JButton("P"));
        botoes.add(new JButton("A"));
        botoes.add(new JButton("S"));
        botoes.add(new JButton("D"));
        botoes.add(new JButton("F"));
        botoes.add(new JButton("G"));
        botoes.add(new JButton("H"));
        botoes.add(new JButton("J"));
        botoes.add(new JButton("K"));
        botoes.add(new JButton("L"));
        botoes.add(new JButton("Z"));
        botoes.add(new JButton("X"));
        botoes.add(new JButton("C"));
        botoes.add(new JButton("V"));
        botoes.add(new JButton("B"));
        botoes.add(new JButton("N"));
        botoes.add(new JButton("M"));
        botoes.add(new JButton("espaço"));
        botoes.add(new JButton("Enter"));
    }

    private void configuraTamanhoBotao(){    
        for(indice = 0; indice < 26; indice++){
            botoes.get(indice).setPreferredSize(new Dimension(50, 40));
        }
        botoes.get(26).setPreferredSize(new Dimension(250, 40));
        botoes.get(27).setPreferredSize(new Dimension(150, 70));
    }
    
    private void AdicionarCorBotaoTodos(){
        for (JButton botao : botoes) { //adicionando cor
            botao.setBackground(cor);
        }
    }
    
    public void adicionarCorBotao(int index) {
        botoes.get(index).setBackground(cor);
    }
    
    public void adicionarCorBotaoPreção(int index) {
        botoes.get(index).setBackground(corPresionado);
    }
    
    private void adicionarBotaoTeclado(){
        for (JButton botao : botoes) { //adiciona os botoes no painel
            painel.add(botao);
        }
    }
    
    
}

