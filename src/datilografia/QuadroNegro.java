package datilografia;

import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class QuadroNegro {

    private final JPanel painel = new JPanel();
    private final JTextArea quadro = new JTextArea();
    private final ArrayList<String> pangrama = new ArrayList<>();

    public QuadroNegro() { //Contrutor do QuadroNegro
        //quadro.setPreferredSize(new Dimension(500, 300));
        quadro.setLineWrap(true); //Faz a quebra de linha 
        //quadro.setWrapStyleWord(true); AINDA NÃO SEI O QUE FAZ DIREITO, MAS VAMOS TESTANDO

        //Ha Função de definir linhas e colunas, o que acha de botarmos ela?
        pangrama.add("Marta foi à cozinha pois queria ver belo jogo de xícaras\n");
        
        quadro.setText(pangrama.get(0)); //Teste de como funcionaria os pangramas na tela
        painel.setLayout(new BorderLayout());
        painel.add(quadro);
    }

    public JPanel getQuadroNegro() { //Aqui retornamos o Objeto JTextArea Tela
        return painel;
    }
}
