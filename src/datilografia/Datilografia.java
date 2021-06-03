/*
Alunos: Natan Xavier de Siqueira, Daniel da Silva Henrique
Materia: 2019200079, 2019200296
 */
package datilografia;

import java.awt.BorderLayout;
import javax.swing.JPanel;

public class Datilografia {
    
    public static void main(String[] args) {

        Janela janela = new Janela("Datilografia");
        JPanel painel = new JPanel();
        Pangrama pangrama = new Pangrama();
        Teclado teclado = new Teclado();
        QuadroNegro quadroNegro = new QuadroNegro();
        
        EventosDatilografia Evento = new EventosDatilografia(teclado,quadroNegro,pangrama);
        
        quadroNegro.getJTextArea().addKeyListener( Evento );
            
        painel.setLayout(new BorderLayout());
        
        painel.add(pangrama.getPangrama(), BorderLayout.PAGE_START);
        painel.add(quadroNegro.getQuadroNegro(), BorderLayout.CENTER);
        painel.add(teclado.getTeclado(), BorderLayout.PAGE_END);

        janela.getJanela().add(painel);
        
        
        
        javax.swing.SwingUtilities.invokeLater(() -> {
            janela.painel();
        });

    }

}
