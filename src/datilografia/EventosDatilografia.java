package datilografia;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JFrame;

public class EventosDatilografia implements KeyListener { // Classe que controla os eventos

    private final Teclado teclado;
    private final QuadroNegro quadroNegro;
    private final Pangrama pangrama;
    private final ArrayList<String> frases = new ArrayList<String>();
    private String letra;
    private boolean podeIrParaProximaQuestao = false;
    private int indice = 0;
    private int contatorfrase = 1;

    public EventosDatilografia(Teclado teclado, QuadroNegro quadroNegro, Pangrama pangrama) {
        this.teclado = teclado;
        this.quadroNegro = quadroNegro;
        this.pangrama = pangrama;
    }

    public void pegarLetra(KeyEvent e) {
        this.letra = String.valueOf(e.getKeyChar());
        this.letra = this.letra.toUpperCase();
    }

    public void Resultado() {

    }

    @Override
    public void keyTyped(KeyEvent e) {

        trocaDeCorComPressao(this.teclado, this.letra);

    }

    @Override
    public void keyPressed(KeyEvent e) {

        pegarLetra(e);
        trocaDeCorSemPressao(this.teclado, this.letra);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        pegarLetra(e);
        trocaDeCorSemPressao(this.teclado, this.letra);

        if (e.getKeyChar() == KeyEvent.VK_ENTER) {

            if (podeIrParaProximaQuestao == false) { // Serve para mostrar para controlar e mostrar o erro ou acerto do usuário
                String Texto = "\tFrase " + contatorfrase++ + "\n\n";

                String[] palavraUsuario = quadroNegro.getJTextArea().getText().split(" ");
                String[] palavraSistema = pangrama.getFrase().get(indice).split(" ");
                frases.add(quadroNegro.getJTextArea().getText());

                if (pangrama.getFrase().get(indice).equals(frases.get(indice))) {
                    Texto += "São Iguais, Confira a baixo as palavras que você acertou aperte enter para continuar quando acabar a consulta...\n\n";
                } else {
                    Texto += "São Diferentes, Confira a baixo as palavras que você errou aperte enter para continuar quando acabar a consulta...\n\n";
                }

                for (int i = 0; i < palavraUsuario.length; i++) {
                    if (palavraUsuario[i].equals(palavraSistema[i])) {
                        Texto += "ACERTOU: " + palavraUsuario[i] + "\n";
                    } else {
                        Texto += "ERROU: o que vc escreveu " + palavraUsuario[i] + "o que devia ter escrito " + palavraSistema[i] + "\n";
                    }
                }

                quadroNegro.getJTextArea().setText(Texto);

                podeIrParaProximaQuestao = true;
            } else {
                indice++;
                if (indice < pangrama.getFrase().size()) {
                    podeIrParaProximaQuestao = false;
                    pangrama.proximaPergunta(indice);
                } else {
                    pangrama.getPergunta().setText("Fim do Programa se quiser ir novamente digite: \"sim\"");
                    if ("sim\n".equals(quadroNegro.getJTextArea().getText())) {
                        indice = 0;
                        podeIrParaProximaQuestao = false;
                        pangrama.proximaPergunta(indice);
                    }

                }
                quadroNegro.getJTextArea().setText("");
            }
        }
    }

    public void trocaDeCorComPressao(Teclado t, String l) {
        switch (l) {
            case "Q" ->
                t.adicionarCorBotaoPreção(0);
            case "W" ->
                t.adicionarCorBotaoPreção(1);
            case "E" ->
                t.adicionarCorBotaoPreção(2);
            case "R" ->
                t.adicionarCorBotaoPreção(3);
            case "T" ->
                t.adicionarCorBotaoPreção(4);
            case "Y" ->
                t.adicionarCorBotaoPreção(5);
            case "U" ->
                t.adicionarCorBotaoPreção(6);
            case "I" ->
                t.adicionarCorBotaoPreção(7);
            case "O" ->
                t.adicionarCorBotaoPreção(8);
            case "P" ->
                t.adicionarCorBotaoPreção(9);
            case "A" ->
                t.adicionarCorBotaoPreção(10);
            case "S" ->
                t.adicionarCorBotaoPreção(11);
            case "D" ->
                t.adicionarCorBotaoPreção(12);
            case "F" ->
                t.adicionarCorBotaoPreção(13);
            case "G" ->
                t.adicionarCorBotaoPreção(14);
            case "H" ->
                t.adicionarCorBotaoPreção(15);
            case "J" ->
                t.adicionarCorBotaoPreção(16);
            case "K" ->
                t.adicionarCorBotaoPreção(17);
            case "L" ->
                t.adicionarCorBotaoPreção(18);
            case "Z" ->
                t.adicionarCorBotaoPreção(19);
            case "X" ->
                t.adicionarCorBotaoPreção(20);
            case "C" ->
                t.adicionarCorBotaoPreção(21);
            case "V" ->
                t.adicionarCorBotaoPreção(22);
            case "B" ->
                t.adicionarCorBotaoPreção(23);
            case "N" ->
                t.adicionarCorBotaoPreção(24);
            case "M" ->
                t.adicionarCorBotaoPreção(25);
            case " " ->
                t.adicionarCorBotaoPreção(26);
            case "\n" ->
                t.adicionarCorBotaoPreção(27);
        }
    }

    public void trocaDeCorSemPressao(Teclado teclado, String l) {

        switch (l) {
            case "Q" ->
                teclado.adicionarCorBotao(0);
            case "W" ->
                teclado.adicionarCorBotao(1);
            case "E" ->
                teclado.adicionarCorBotao(2);
            case "R" ->
                teclado.adicionarCorBotao(3);
            case "T" ->
                teclado.adicionarCorBotao(4);
            case "Y" ->
                teclado.adicionarCorBotao(5);
            case "U" ->
                teclado.adicionarCorBotao(6);
            case "I" ->
                teclado.adicionarCorBotao(7);
            case "O" ->
                teclado.adicionarCorBotao(8);
            case "P" ->
                teclado.adicionarCorBotao(9);
            case "A" ->
                teclado.adicionarCorBotao(10);
            case "S" ->
                teclado.adicionarCorBotao(11);
            case "D" ->
                teclado.adicionarCorBotao(12);
            case "F" ->
                teclado.adicionarCorBotao(13);
            case "G" ->
                teclado.adicionarCorBotao(14);
            case "H" ->
                teclado.adicionarCorBotao(15);
            case "J" ->
                teclado.adicionarCorBotao(16);
            case "K" ->
                teclado.adicionarCorBotao(17);
            case "L" ->
                teclado.adicionarCorBotao(18);
            case "Z" ->
                teclado.adicionarCorBotao(19);
            case "X" ->
                teclado.adicionarCorBotao(20);
            case "C" ->
                teclado.adicionarCorBotao(21);
            case "V" ->
                teclado.adicionarCorBotao(22);
            case "B" ->
                teclado.adicionarCorBotao(23);
            case "N" ->
                teclado.adicionarCorBotao(24);
            case "M" ->
                teclado.adicionarCorBotao(25);
            case " " ->
                teclado.adicionarCorBotao(26);
            case "\n" ->
                teclado.adicionarCorBotao(27);
        }
    }

}
