package datilografia;

import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.*;

public class Pangrama {

    private final JPanel painel = new JPanel();

    private final JLabel pergunta = new JLabel(); //Será que essa é a melhor maneira?
    private final JLabel Instrusao = new JLabel("Instrução de como funciona");
    private final ArrayList<String> pangrama = new ArrayList<String>();

    private int indice = 0;

    public Pangrama() {
        painel.setLayout(new BorderLayout());

        pangrama.add("Gazeta publica hoje breve anúncio de faxina na quermesse\n");
        pangrama.add("The quick brown fox jumps over de lazy dog");
        pangrama.add("Quick wafting zephyrs vex bold Jim");

        painel.add(Instrusao);
        painel.add(getPergunta());

    }

    //Aqui a gente pode fazer um método para colocar os pangramas nesse arraylist
    //Também podemos fazer aqui um método para comparar se está certo ou não 
    private JLabel getPergunta() {
        //pode se colocar sempre na mesma ordem assim a nossa organização fica mais facil para a correção das mesmas frazes pois os idices seram os mesmo
        pergunta.setText(pangrama.get(indice));

        //a cada chamada o index pode somar 1 botei numa função que se quiser incrementar algo e so mudar ela
        proximaPergunta();

        return pergunta;
    }

    public JPanel getPangrama() {
        return painel;
    }

    public ArrayList<String> getFrase() {
        return pangrama;
    }

    public void proximaPergunta() {
        indice++;
    }
}
