/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datilografia;

//import java.awt.FlowLayout;
import javax.swing.*;

public class Janela {

    private final JFrame tela = new JFrame();

    public Janela(String nome) {//Nao consegui passar o JFrame
        tela.setTitle(nome);
    }

    public JFrame getJanela() {
        return tela;
    }

    public void painel() {
        tela.setSize(1100, 800);
        //tela.setLayout(new FlowLayout());
        tela.setLocationRelativeTo(null);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setVisible(true);
    }
}
