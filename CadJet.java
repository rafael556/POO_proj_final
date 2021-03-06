//Aluno: Rafael Cruz - RA: 2266261

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class CadJet extends javax.swing.JFrame {

    JetSki jetski = new JetSki();
    GerEmb ger = new GerEmb();
    /**
     * Creates new form CadEmb
     */
    public CadJet() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btSair = new javax.swing.JButton();
        rotJetSki = new javax.swing.JLabel();
        rotJetCod = new javax.swing.JLabel();
        cxJetCod = new javax.swing.JTextField();
        rotJetNome = new javax.swing.JLabel();
        cxJetNome = new javax.swing.JTextField();
        rotJetTipo = new javax.swing.JLabel();
        cxJetTipo = new javax.swing.JTextField();
        rotJetCap = new javax.swing.JLabel();
        cxJetCap = new javax.swing.JTextField();
        rotJetPot = new javax.swing.JLabel();
        cxJetPot = new javax.swing.JTextField();
        rotJetEfi = new javax.swing.JLabel();
        cxJetEfi = new javax.swing.JTextField();
        btJetCad = new javax.swing.JButton();
        btJetLimp = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblJet = new javax.swing.JTable();
        ChamaCadJetTab = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        rotJetSki.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        rotJetSki.setForeground(new java.awt.Color(0, 0, 255));
        rotJetSki.setText("JetSki");

        rotJetCod.setText("Codigo:");

        rotJetNome.setText("Nome:");

        rotJetTipo.setText("Tipo:");

        rotJetCap.setText("Capacidade do Tanque de Combustivel:");

        rotJetPot.setText("Potencia:");

        rotJetEfi.setText("Eficiencia em litros/h:");

        btJetCad.setText("Cadastrar");
        btJetCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btJetCadActionPerformed(evt);
            }
        });

        btJetLimp.setText("Limpar");
        btJetLimp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btJetLimpActionPerformed(evt);
            }
        });

        tblJet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nome", "Tipo", "Potencia", "Eficiencia", "Autonomia"
            }
        ));
        jScrollPane1.setViewportView(tblJet);
        if (tblJet.getColumnModel().getColumnCount() > 0) {
            tblJet.getColumnModel().getColumn(0).setPreferredWidth(20);
            tblJet.getColumnModel().getColumn(2).setPreferredWidth(55);
            tblJet.getColumnModel().getColumn(3).setPreferredWidth(20);
            tblJet.getColumnModel().getColumn(4).setPreferredWidth(35);
            tblJet.getColumnModel().getColumn(5).setPreferredWidth(25);
        }

        ChamaCadJetTab.setText("Chama 3?? Formulario");
        ChamaCadJetTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChamaCadJetTabActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(rotJetSki)
                                .addGap(162, 162, 162))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(rotJetTipo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cxJetTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(rotJetCod)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cxJetCod, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(rotJetNome)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cxJetNome, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(rotJetPot)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cxJetPot, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(rotJetEfi)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(cxJetEfi, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(rotJetCap))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cxJetCap, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btJetCad)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btJetLimp))))
                        .addGap(105, 105, 105))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ChamaCadJetTab)
                        .addGap(18, 18, 18)
                        .addComponent(btSair)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rotJetSki)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotJetCod)
                    .addComponent(cxJetCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotJetNome)
                    .addComponent(cxJetNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotJetTipo)
                    .addComponent(cxJetTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotJetCap)
                    .addComponent(cxJetCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotJetPot)
                    .addComponent(cxJetPot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotJetEfi)
                    .addComponent(cxJetEfi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btJetCad)
                    .addComponent(btJetLimp))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChamaCadJetTab)
                    .addComponent(btSair))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void btJetCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btJetCadActionPerformed
        cadJet();
        ListJet();
    }//GEN-LAST:event_btJetCadActionPerformed

    private void btJetLimpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btJetLimpActionPerformed
        LimparJet();
    }//GEN-LAST:event_btJetLimpActionPerformed

    private void ChamaCadJetTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChamaCadJetTabActionPerformed
        CadJetTab cadJetTab = new CadJetTab();
        cadJetTab.ListJet2(ger);
        cadJetTab.setVisible(true);
    }//GEN-LAST:event_ChamaCadJetTabActionPerformed

    public void ListJet(){
        jetski = new JetSki();
        
        DefaultTableModel modelo = (DefaultTableModel) tblJet.getModel();
        modelo.setRowCount(0);
        
        for(int posLin = 0; posLin < ger.getBdJet().size(); posLin++){
            
            try{
                jetski.setCodigo(ger.getBdJet().get(posLin).getCodigo());
                jetski.setNome(ger.getBdJet().get(posLin).getNome());
                jetski.setTipo(ger.getBdJet().get(posLin).getTipo());
                jetski.setCapacidade(ger.getBdJet().get(posLin).getCapacidade());
                jetski.setPotencia(ger.getBdJet().get(posLin).getPotencia());
                jetski.setEficiencia(ger.getBdJet().get(posLin).getEficiencia());  
                
                modelo.insertRow(posLin, new Object[]{jetski.getCodigo(), jetski.nomeEmbarc(), 
                jetski.getTipo(), jetski.getPotencia(), jetski.getEficiencia(),
                jetski.autonomia()});
            }
            catch(NumNegatException nne){
                 nne.impNNE();                
             }
            catch(BlankStringException bse){
                bse.impBlank();
            }
            catch(SupCapacidade SPC){
                SPC.impSCP();
            }
        }
    }
   
   public void LimparJet(){
        cxJetCod.setText("");
        cxJetNome.setText("");
        cxJetTipo.setText("");
        cxJetCap.setText("");
        cxJetPot.setText("");
        cxJetEfi.setText("");
        cxJetCod.requestFocus();
   }
   
   public void sair(){
        int resp = JOptionPane.showConfirmDialog(null, "Deseja Realmente sair?", "Saida", JOptionPane.YES_NO_OPTION);
        if(resp == 0)
            dispose();
   }
   
   public void cadJet(){
      
        try{
            jetski.setCodigo(Integer.parseInt(cxJetCod.getText()));
            jetski.setNome(cxJetNome.getText());
            jetski.setTipo(cxJetTipo.getText());
            jetski.setCapacidade(Double.parseDouble(cxJetCap.getText()));
            jetski.setPotencia(Double.parseDouble(cxJetPot.getText()));
            jetski.setEficiencia(Double.parseDouble(cxJetEfi.getText()));

            jetski = ger.cadJetSki(jetski);

            if(jetski != null){
                JOptionPane.showMessageDialog(null, "Cadastro confirmado", "Cadastro", JOptionPane.PLAIN_MESSAGE);
            }
            else
                JOptionPane.showMessageDialog(null, "Ja existe alguem com este JetSki, Cadastro nao executado", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        catch(NumNegatException nne){
            nne.impNNE();
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "Escreva um numero:", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        catch(BlankStringException bse){
            bse.impBlank();
        }
        catch(SupCapacidade SPC){
            SPC.impJscp();
        }      
   }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadNav.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadNav.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadNav.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadNav.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadJet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ChamaCadJetTab;
    private javax.swing.JButton btJetCad;
    private javax.swing.JButton btJetLimp;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField cxJetCap;
    private javax.swing.JTextField cxJetCod;
    private javax.swing.JTextField cxJetEfi;
    private javax.swing.JTextField cxJetNome;
    private javax.swing.JTextField cxJetPot;
    private javax.swing.JTextField cxJetTipo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel rotJetCap;
    private javax.swing.JLabel rotJetCod;
    private javax.swing.JLabel rotJetEfi;
    private javax.swing.JLabel rotJetNome;
    private javax.swing.JLabel rotJetPot;
    private javax.swing.JLabel rotJetSki;
    private javax.swing.JLabel rotJetTipo;
    private javax.swing.JTable tblJet;
    // End of variables declaration//GEN-END:variables
}
