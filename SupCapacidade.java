//Aluno: Rafael Cruz - RA: 2266261

import javax.swing.JOptionPane;

public class SupCapacidade extends Exception{
    
    public void impSCP(){
        JOptionPane.showMessageDialog(null, "Mantimentos alem do limite permitido", "Erro", JOptionPane.ERROR_MESSAGE);
    }

    public void impJscp(){
        JOptionPane.showMessageDialog(null, "Capacidade de combustivel acima do limite", "Erro", JOptionPane.ERROR_MESSAGE);
    }
}