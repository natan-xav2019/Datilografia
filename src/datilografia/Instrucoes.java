/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datilografia;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author Administrador
 */
public class Instrucoes {

    JFrame instrucoes = new JFrame("Introdução");
    JTextArea texto = new JTextArea();

    public Instrucoes() {
        instrucoes.add(texto);

        texto.setLineWrap(true);
        texto.setWrapStyleWord(true);
        texto.setFont(new Font("Arial", Font.PLAIN, 16));
        texto.setText("Bem vindo(a)," + "\n"
                + "\tPara Jogar esse jogo é bastante simples:"
                + "\n" + "\t -> Em cima da parte do 'Quadro de escrever' terão frases"
                + "\n" + "\t -> E você vai ter que digitá-las sem olhar para seu teclado físico, apenas para o teclado virtual da tela"
                + "\n" + "Se divirta e bom jogo"
        );
    }

    public void janelaInstroducao() {
        instrucoes.setSize(600, 300); // define o tamanho da tela, tava pensando em sei la, achar um método para colocar do tamanho legal para cada tela
        instrucoes.setVisible(true);
        instrucoes.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//achado no https://stackoverflow.com/questions/14918395/kill-an-open-jframe
    }
}
