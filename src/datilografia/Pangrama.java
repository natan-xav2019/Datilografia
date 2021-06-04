package datilografia;

import java.awt.BorderLayout;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.*;

public class Pangrama {

    private final JPanel painel = new JPanel();

    private final JLabel pergunta = new JLabel();
    private final ArrayList<String> pangrama = new ArrayList<String>();

    public Pangrama() {
        painel.setLayout(new BorderLayout());

        pergunta.setFont(new Font("Ariel", Font.PLAIN, 30));
        
        pangrama.add("Gazeta publica hoje breve anúncio de faxina na quermesse\n");
        pangrama.add("The quick brown fox jumps over de lazy dog\n");
        pangrama.add("Quick wafting zephyrs vex bold Jim\n");

        painel.add(getPergunta());

    }

    private JLabel getPergunta() {

        pergunta.setText(pangrama.get(0));

        return pergunta;
    }

    public JPanel getPangrama() {
        return painel;
    }

    public ArrayList<String> getFrase() {
        return pangrama;
    }

    public void proximaPergunta(int indice) {
        pergunta.setText(pangrama.get(indice));

    }
}
