/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pacote;

import javax.swing.JOptionPane;

/**
 *
 * @author Jader
 */
public class frmPainelDeControle extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(frmPainelDeControle.class.getName());

    /**
     * Creates new form frmPainelDeControle
     */
    public frmPainelDeControle() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        LBL_SRV_Desktop = new javax.swing.JLabel();
        LBL_SRV_DesktopLegendado = new javax.swing.JLabel();
        BtnAtivarDesktop = new javax.swing.JToggleButton();
        LBL_SRV_Web = new javax.swing.JLabel();
        LBL_SRV_WebLegendado = new javax.swing.JLabel();
        LBL_SRV_Terceiros = new javax.swing.JLabel();
        LBL_SRV_TerceirosLegendado = new javax.swing.JLabel();
        BtnAtivarWeb = new javax.swing.JToggleButton();
        BtnAtivarTerceiros = new javax.swing.JToggleButton();
        LBL_SRV_Publicitario = new javax.swing.JLabel();
        LBL_SRV_PublicitarioLegendado = new javax.swing.JLabel();
        BtnAtivarPublicitario = new javax.swing.JToggleButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Painel de Controle");

        LBL_SRV_Desktop.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        LBL_SRV_Desktop.setText("Serviço Desktop");
        LBL_SRV_Desktop.setName(""); // NOI18N

        LBL_SRV_DesktopLegendado.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        LBL_SRV_DesktopLegendado.setForeground(new java.awt.Color(255, 0, 0));
        LBL_SRV_DesktopLegendado.setText("Inspirado no Whatsapp Desktop");

        BtnAtivarDesktop.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BtnAtivarDesktop.setText("Ativar");
        BtnAtivarDesktop.addActionListener(this::BtnAtivarDesktopActionPerformed);

        LBL_SRV_Web.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        LBL_SRV_Web.setText("Serviço Web");

        LBL_SRV_WebLegendado.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        LBL_SRV_WebLegendado.setForeground(new java.awt.Color(255, 0, 0));
        LBL_SRV_WebLegendado.setText("Inspirado no Whatsapp Desktop");

        LBL_SRV_Terceiros.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        LBL_SRV_Terceiros.setText("Serviço Terceiros");

        LBL_SRV_TerceirosLegendado.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        LBL_SRV_TerceirosLegendado.setForeground(new java.awt.Color(255, 0, 0));
        LBL_SRV_TerceirosLegendado.setText("Inspirado no Whatsapp Desktop");

        BtnAtivarWeb.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BtnAtivarWeb.setLabel("Ativar");
        BtnAtivarWeb.addActionListener(this::BtnAtivarWebActionPerformed);

        BtnAtivarTerceiros.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BtnAtivarTerceiros.setLabel("Ativar");
        BtnAtivarTerceiros.addActionListener(this::BtnAtivarTerceirosActionPerformed);

        LBL_SRV_Publicitario.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        LBL_SRV_Publicitario.setText("Serviço Publicitário");

        LBL_SRV_PublicitarioLegendado.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        LBL_SRV_PublicitarioLegendado.setForeground(new java.awt.Color(255, 0, 0));
        LBL_SRV_PublicitarioLegendado.setText("Envio de Propagandas em Multicast");

        BtnAtivarPublicitario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BtnAtivarPublicitario.setText("Ativar");
        BtnAtivarPublicitario.addActionListener(this::BtnAtivarPublicitarioActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(LBL_SRV_TerceirosLegendado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LBL_SRV_WebLegendado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LBL_SRV_DesktopLegendado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LBL_SRV_PublicitarioLegendado)
                        .addComponent(LBL_SRV_Terceiros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LBL_SRV_Web))
                    .addComponent(LBL_SRV_Publicitario)
                    .addComponent(LBL_SRV_Desktop))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnAtivarDesktop, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(BtnAtivarWeb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnAtivarTerceiros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnAtivarPublicitario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LBL_SRV_Desktop)
                            .addComponent(BtnAtivarDesktop))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LBL_SRV_DesktopLegendado)
                        .addGap(18, 18, 18)
                        .addComponent(LBL_SRV_Web)
                        .addGap(14, 14, 14)
                        .addComponent(LBL_SRV_WebLegendado)
                        .addGap(18, 18, 18)
                        .addComponent(LBL_SRV_Terceiros)
                        .addGap(14, 14, 14)
                        .addComponent(LBL_SRV_TerceirosLegendado)
                        .addGap(18, 18, 18)
                        .addComponent(LBL_SRV_Publicitario))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnAtivarWeb)
                        .addGap(46, 46, 46)
                        .addComponent(BtnAtivarTerceiros)
                        .addGap(38, 38, 38)
                        .addComponent(BtnAtivarPublicitario)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LBL_SRV_PublicitarioLegendado)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAtivarDesktopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtivarDesktopActionPerformed
        if (BtnAtivarDesktop.isSelected()) {
            try {
                Util.iniciarDesktop();
                BtnAtivarDesktop.setText("Desativar");
            } catch (java.io.IOException erro) {
                BtnAtivarDesktop.setSelected(false);
                BtnAtivarDesktop.setText("Ativar");
                JOptionPane.showMessageDialog(this, "Não foi possível ativar o serviço desktop: " + erro.getMessage());
            }
        } else {
            int resposta = JOptionPane.showConfirmDialog(this,
                    "Deseja realmente PARAR o serviço para os clientes DESKTOP?",
                    "CONFIRMAÇÃO", JOptionPane.YES_NO_OPTION);
            if (resposta != JOptionPane.YES_OPTION) {
                BtnAtivarDesktop.setSelected(true);
                return;
            }
            try {
                Util.pararDesktop();
            } catch (java.io.IOException erro) {
                JOptionPane.showMessageDialog(this,
                        "Erro ao desativar o serviço desktop: " + erro.getMessage());
            } finally {
                BtnAtivarDesktop.setText("Ativar");
            }
        }
    }//GEN-LAST:event_BtnAtivarDesktopActionPerformed

    private void BtnAtivarPublicitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtivarPublicitarioActionPerformed

        if (BtnAtivarPublicitario.isSelected() == true){
            BtnAtivarPublicitario.setText("Desativar");
        } else{
            BtnAtivarPublicitario.setText("Ativar");
        }
    }//GEN-LAST:event_BtnAtivarPublicitarioActionPerformed

    private void BtnAtivarWebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtivarWebActionPerformed
        // TODO add your handling code here:
        if (BtnAtivarWeb.isSelected() == true){
            BtnAtivarWeb.setText("Desativar");
        } else{
            BtnAtivarWeb.setText("Ativar");
        }
    }//GEN-LAST:event_BtnAtivarWebActionPerformed

    private void BtnAtivarTerceirosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtivarTerceirosActionPerformed
        // TODO add your handling code here:
        if (BtnAtivarTerceiros.isSelected() == true){
            BtnAtivarTerceiros.setText("Desativar");
        } else{
            BtnAtivarTerceiros.setText("Ativar");
        }
    }//GEN-LAST:event_BtnAtivarTerceirosActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new frmPainelDeControle().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BtnAtivarDesktop;
    private javax.swing.JToggleButton BtnAtivarPublicitario;
    private javax.swing.JToggleButton BtnAtivarTerceiros;
    private javax.swing.JToggleButton BtnAtivarWeb;
    private javax.swing.JLabel LBL_SRV_Desktop;
    private javax.swing.JLabel LBL_SRV_DesktopLegendado;
    private javax.swing.JLabel LBL_SRV_Publicitario;
    private javax.swing.JLabel LBL_SRV_PublicitarioLegendado;
    private javax.swing.JLabel LBL_SRV_Terceiros;
    private javax.swing.JLabel LBL_SRV_TerceirosLegendado;
    private javax.swing.JLabel LBL_SRV_Web;
    private javax.swing.JLabel LBL_SRV_WebLegendado;
    private javax.swing.JFrame jFrame1;
    // End of variables declaration//GEN-END:variables
}
