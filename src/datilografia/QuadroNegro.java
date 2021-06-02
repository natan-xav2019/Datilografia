package datilografia;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.BadLocationException;
import javax.swing.text.Element;

public class QuadroNegro implements KeyListener {

    private final JPanel painel = new JPanel();
    private final JTextArea quadro = new JTextArea();
    private final JScrollPane area = new JScrollPane(quadro);
    private int numeroDaLinha = 0;
    private String frase;
    
    public QuadroNegro() { //Contrutor do QuadroNegro
        quadro.setLineWrap(true); //Faz a quebra de linha 
        quadro.addKeyListener(this);

        painel.setLayout(new BorderLayout());
        painel.add(area);
    }

    public JPanel getQuadroNegro() { //Aqui retornamos o Objeto JTextArea Tela
        return painel;
    }

    public String getFrase() {
        return frase;
    }
    
    public void submeterUmaFrase(KeyEvent e) throws BadLocationException {
        Element referenciaDocumentoQuadro = quadro.getDocument().getDefaultRootElement();
        Element linha = referenciaDocumentoQuadro.getElement(numeroDaLinha);
        int incioDaFrase = linha.getStartOffset();
        int finalDaFrase = linha.getEndOffset();
        String pangramaASerSubmetido = null;
        
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            pangramaASerSubmetido = quadro.getText(incioDaFrase, finalDaFrase - incioDaFrase);
            this.frase = pangramaASerSubmetido;
            this.numeroDaLinha++;
            System.out.println(this.frase);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        try {
            submeterUmaFrase(e);
        } catch (BadLocationException ex) {
            Logger.getLogger(QuadroNegro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        try {
            submeterUmaFrase(e);
        } catch (BadLocationException ex) {
            Logger.getLogger(QuadroNegro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
