/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datilografia;

import javax.swing.*;

public class Janela {

    private final JFrame tela = new JFrame();

    public Janela(String nome) {// Costrutor Janeça
        tela.setTitle(nome);// alterando o nome do cabeçario 
    }

    public JFrame getJanela() { // retorna o Jframe tela
        return tela;
    }

    public void painel() {
        tela.setSize(1025, 700); // define o tamanho da tela, tava pensando em sei la, achar um método para colocar do tamanho legal para cada tela
        tela.setResizable(false);//nao deixa a pessoa almentar a dimensão da tela.
        tela.setLocationRelativeTo(null);//deixa a janela no meio da tela
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// finaliza a execução do programa no X
        tela.setVisible(true); // visibilidade disponivel
    }
}
