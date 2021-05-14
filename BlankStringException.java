//Nome: Rafael Cruz - RA: 2266261

import javax.swing.JOptionPane;


public class BlankStringException extends Exception {
    
    public void impBlank(){
        JOptionPane.showMessageDialog(null, "O campo nao pode estar vazio", "Erro", JOptionPane.ERROR_MESSAGE);
    }
}