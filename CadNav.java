//Aluno: Rafael Cruz - RA: 2266261
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class CadNav extends javax.swing.JFrame {

    Navio navio = new Navio();
    Veleiro veleiro = new Veleiro();
    JetSki jetski = new JetSki();
    GerEmb ger = new GerEmb();
    /**
     * Creates new form CadEmb
     */
    public CadNav() {
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

        rotNavio = new javax.swing.JLabel();
        rotNavCod = new javax.swing.JLabel();
        rotNavNome = new javax.swing.JLabel();
        rotNavTipo = new javax.swing.JLabel();
        rotNavTrip = new javax.swing.JLabel();
        rotNavComp = new javax.swing.JLabel();
        rotNavVel = new javax.swing.JLabel();
        cxNavNome = new javax.swing.JTextField();
        cxNavTipo = new javax.swing.JTextField();
        cxNavTrip = new javax.swing.JTextField();
        cxNavComp = new javax.swing.JTextField();
        cxNavVel = new javax.swing.JTextField();
        btNavCad = new javax.swing.JButton();
        btNavLimp = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        cxNavCod = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNavio = new javax.swing.JTable();
        rotNavProp = new javax.swing.JLabel();
        cxNavProp = new javax.swing.JTextField();
        ChamaCadNavTab = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        rotNavio.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        rotNavio.setForeground(new java.awt.Color(255, 204, 0));
        rotNavio.setText("Navio");

        rotNavCod.setText("Codigo:");

        rotNavNome.setText("Nome:");

        rotNavTipo.setText("Tipo:");

        rotNavTrip.setText("Tripulacao:");

        rotNavComp.setText("Comprimento do Navio:");

        rotNavVel.setText("Velocidade do Navio:");

        btNavCad.setText("Cadastrar");
        btNavCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNavCadActionPerformed(evt);
            }
        });

        btNavLimp.setText("Limpar");
        btNavLimp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNavLimpActionPerformed(evt);
            }
        });

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        tblNavio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nome", "Tipo", "Tripulacao", "Propulsao", "Comprimento", "Velocidade"
            }
        ));
        jScrollPane1.setViewportView(tblNavio);
        if (tblNavio.getColumnModel().getColumnCount() > 0) {
            tblNavio.getColumnModel().getColumn(0).setPreferredWidth(20);
            tblNavio.getColumnModel().getColumn(2).setPreferredWidth(55);
            tblNavio.getColumnModel().getColumn(3).setPreferredWidth(20);
            tblNavio.getColumnModel().getColumn(4).setPreferredWidth(55);
            tblNavio.getColumnModel().getColumn(5).setPreferredWidth(25);
            tblNavio.getColumnModel().getColumn(6).setPreferredWidth(25);
        }

        rotNavProp.setText("Propulsao:");

        ChamaCadNavTab.setText("Chama 3º Formulario");
        ChamaCadNavTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChamaCadNavTabActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 38, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rotNavTipo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cxNavTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(rotNavNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rotNavCod))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cxNavNome, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cxNavCod, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(rotNavio))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rotNavTrip)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cxNavTrip, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rotNavProp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cxNavProp, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btNavCad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btNavLimp))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(rotNavVel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cxNavVel))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(rotNavComp)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cxNavComp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(178, 178, 178))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ChamaCadNavTab)
                        .addGap(18, 18, 18)
                        .addComponent(btSair)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rotNavio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotNavCod)
                    .addComponent(cxNavCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotNavNome)
                    .addComponent(cxNavNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotNavTipo)
                    .addComponent(cxNavTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotNavTrip)
                    .addComponent(cxNavTrip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotNavProp)
                    .addComponent(cxNavProp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotNavComp)
                    .addComponent(cxNavComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotNavVel)
                    .addComponent(cxNavVel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNavCad)
                    .addComponent(btNavLimp))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChamaCadNavTab)
                    .addComponent(btSair))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btNavLimpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNavLimpActionPerformed
        LimparNav();
    }//GEN-LAST:event_btNavLimpActionPerformed

    private void btNavCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNavCadActionPerformed
        cadNav();
        ListNav();
    }//GEN-LAST:event_btNavCadActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void ChamaCadNavTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChamaCadNavTabActionPerformed
        CadNavTab cadNavTab = new CadNavTab();
        cadNavTab.ListNav2(ger);
        cadNavTab.setVisible(true);
    }//GEN-LAST:event_ChamaCadNavTabActionPerformed

    public void ListNav(){
        navio = new Navio();
        
        DefaultTableModel modelo = (DefaultTableModel) tblNavio.getModel();
        modelo.setRowCount(0);
        
        for(int posLin = 0; posLin < ger.getBdNav().size(); posLin++){
            
            try{
                navio.setCodigo(ger.getBdNav().get(posLin).getCodigo());
                navio.setNome(ger.getBdNav().get(posLin).getNome());
                navio.setTipo(ger.getBdNav().get(posLin).getTipo());
                navio.setTripulacao(ger.getBdNav().get(posLin).getTripulacao());
                navio.setPropulsao(ger.getBdNav().get(posLin).getPropulsao());
                navio.setComprimento(ger.getBdNav().get(posLin).getComprimento());
                navio.setVelocidade(ger.getBdNav().get(posLin).getVelocidade());  
                
                modelo.insertRow(posLin, new Object[]{navio.getCodigo(), navio.nomeEmbarc(), 
                navio.getTipo(), navio.getTripulacao(), navio.getPropulsao(), navio.getComprimento(),
                navio.getVelocidade()});
            }
            catch(NumNegatException nne){
                 nne.impNNE();                
             }
            catch(BlankStringException bse){
                bse.impBlank();
            }
        }
    }
    
   public void LimparNav(){
       cxNavCod.setText("");
        cxNavNome.setText("");
        cxNavTipo.setText("");
        cxNavTrip.setText("");
        cxNavProp.setText("");
        cxNavComp.setText("");
        cxNavVel.setText("");
        cxNavCod.requestFocus();
   }
  
   public void sair(){
        int resp = JOptionPane.showConfirmDialog(null, "Deseja Realmente sair?", "Saida", JOptionPane.YES_NO_OPTION);
        if(resp == 0)
            dispose();
   }
    
   public void cadNav(){
       navio = new Navio();
       
        try{
            navio.setCodigo(Integer.parseInt(cxNavCod.getText()));
            navio.setNome(cxNavNome.getText());
            navio.setTipo(cxNavTipo.getText());
            navio.setTripulacao(Integer.parseInt(cxNavTrip.getText()));
            navio.setPropulsao(cxNavProp.getText());
            navio.setComprimento(Double.parseDouble(cxNavComp.getText()));
            navio.setVelocidade(Double.parseDouble(cxNavVel.getText()));  
            
            navio = ger.cadastroNavio(navio);

            if(navio != null){
                JOptionPane.showMessageDialog(null, "Cadastro confirmado", "Cadastro", JOptionPane.PLAIN_MESSAGE);
            }
            else
                JOptionPane.showMessageDialog(null, "Ja existe alguem com este Navio, Cadastro nao executado", "Erro", JOptionPane.ERROR_MESSAGE);  
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
                new CadNav().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ChamaCadNavTab;
    private javax.swing.JButton btNavCad;
    private javax.swing.JButton btNavLimp;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField cxNavCod;
    private javax.swing.JTextField cxNavComp;
    private javax.swing.JTextField cxNavNome;
    private javax.swing.JTextField cxNavProp;
    private javax.swing.JTextField cxNavTipo;
    private javax.swing.JTextField cxNavTrip;
    private javax.swing.JTextField cxNavVel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel rotNavCod;
    private javax.swing.JLabel rotNavComp;
    private javax.swing.JLabel rotNavNome;
    private javax.swing.JLabel rotNavProp;
    private javax.swing.JLabel rotNavTipo;
    private javax.swing.JLabel rotNavTrip;
    private javax.swing.JLabel rotNavVel;
    private javax.swing.JLabel rotNavio;
    private javax.swing.JTable tblNavio;
    // End of variables declaration//GEN-END:variables
}