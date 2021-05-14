//Aluno: Rafael Cruz - RA: 2266261

import javax.swing.JOptionPane;


public class NumNegatException extends Exception {
    
    public void impNNE(){
        JOptionPane.showMessageDialog(null, "Escreva um numero positivo", "Erro", JOptionPane.ERROR_MESSAGE);
    }  
}
