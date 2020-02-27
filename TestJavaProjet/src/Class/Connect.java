/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;
import Class.Fenetre;
/**
 *
 * @author itsia
 */
public class Connect extends javax.swing.JFrame {

    /**
     * Creates new form Connect
     */
    public Connect() {
        initComponents();
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EntetePanel = new javax.swing.JPanel();
        EnteteLabel = new javax.swing.JLabel();
        FormPanel = new javax.swing.JPanel();
        caseNom = new javax.swing.JTextField();
        caseMDP = new javax.swing.JPasswordField();
        ConnexionButton = new javax.swing.JButton();
        MDPLabel = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        EntetePanel.setBackground(new java.awt.Color(153, 153, 153));

        EnteteLabel.setBackground(new java.awt.Color(153, 153, 153));
        EnteteLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        EnteteLabel.setForeground(new java.awt.Color(255, 255, 255));
        EnteteLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EnteteLabel.setLabelFor(this);
        EnteteLabel.setText("Connexion");
        EnteteLabel.setToolTipText("");

        javax.swing.GroupLayout EntetePanelLayout = new javax.swing.GroupLayout(EntetePanel);
        EntetePanel.setLayout(EntetePanelLayout);
        EntetePanelLayout.setHorizontalGroup(
            EntetePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EntetePanelLayout.createSequentialGroup()
                .addGap(307, 307, 307)
                .addComponent(EnteteLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(299, 299, 299))
        );
        EntetePanelLayout.setVerticalGroup(
            EntetePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EnteteLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );

        FormPanel.setBackground(new java.awt.Color(153, 153, 153));

        caseMDP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caseMDPActionPerformed(evt);
            }
        });

        ConnexionButton.setBackground(new java.awt.Color(102, 102, 102));
        ConnexionButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ConnexionButton.setForeground(new java.awt.Color(255, 255, 255));
        ConnexionButton.setText("Connexion");
        ConnexionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConnexionButtonActionPerformed(evt);
            }
        });

        MDPLabel.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        MDPLabel.setForeground(new java.awt.Color(255, 255, 255));
        MDPLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MDPLabel.setText("Mot de passe");
        MDPLabel.setToolTipText("");

        NameLabel.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        NameLabel.setForeground(new java.awt.Color(255, 255, 255));
        NameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NameLabel.setText("Nom");

        javax.swing.GroupLayout FormPanelLayout = new javax.swing.GroupLayout(FormPanel);
        FormPanel.setLayout(FormPanelLayout);
        FormPanelLayout.setHorizontalGroup(
            FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormPanelLayout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addGroup(FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MDPLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(caseNom, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caseMDP)
                    .addComponent(NameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(151, 151, 151))
            .addGroup(FormPanelLayout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(ConnexionButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FormPanelLayout.setVerticalGroup(
            FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(NameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(caseNom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(MDPLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(caseMDP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(ConnexionButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EntetePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(FormPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(EntetePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(FormPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConnexionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConnexionButtonActionPerformed
        String nomSaisi = caseNom.getText();
        String MDPSaisi= caseMDP.getText();
        
        // données pour le test en attendant la base de données
        String FirstName = "marion";
        String mdp = "chouchou";
        
        if (nomSaisi.equals(FirstName) && MDPSaisi.equals(mdp)) {
            this.dispose();
            Fenetre taches= new Fenetre("Tâches",800,400,nomSaisi);
        }else{
            System.out.println("Données incorrectes");
        }
        
    }//GEN-LAST:event_ConnexionButtonActionPerformed

    private void caseMDPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caseMDPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caseMDPActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Connect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Connect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Connect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Connect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Connect().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConnexionButton;
    private javax.swing.JLabel EnteteLabel;
    private javax.swing.JPanel EntetePanel;
    private javax.swing.JPanel FormPanel;
    private javax.swing.JLabel MDPLabel;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JPasswordField caseMDP;
    private javax.swing.JTextField caseNom;
    // End of variables declaration//GEN-END:variables
}
