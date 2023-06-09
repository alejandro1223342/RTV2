/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas.Revisiones;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class frmRTV extends javax.swing.JFrame {

    public frmRTV() {

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        side_pane = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnRevisiones = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        pnl_overlay = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pnl_host = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        side_pane.setBackground(new java.awt.Color(102, 102, 102));
        side_pane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("RTV");
        side_pane.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 2));
        side_pane.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 80, 120, -1));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cerrar sesión");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(24, 24, 24))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        side_pane.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 170, 40));

        btnRevisiones.setBackground(new java.awt.Color(102, 102, 102));
        btnRevisiones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRevisionesMousePressed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Revisiones");

        javax.swing.GroupLayout btnRevisionesLayout = new javax.swing.GroupLayout(btnRevisiones);
        btnRevisiones.setLayout(btnRevisionesLayout);
        btnRevisionesLayout.setHorizontalGroup(
            btnRevisionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnRevisionesLayout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(23, 23, 23))
        );
        btnRevisionesLayout.setVerticalGroup(
            btnRevisionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        side_pane.add(btnRevisiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 170, -1));

        jPanel1.add(side_pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 620));

        pnl_overlay.setBackground(new java.awt.Color(153, 153, 153));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        jLabel1.setText("-");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnl_overlayLayout = new javax.swing.GroupLayout(pnl_overlay);
        pnl_overlay.setLayout(pnl_overlayLayout);
        pnl_overlayLayout.setHorizontalGroup(
            pnl_overlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_overlayLayout.createSequentialGroup()
                .addGap(0, 834, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnl_overlayLayout.setVerticalGroup(
            pnl_overlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_overlayLayout.createSequentialGroup()
                .addGroup(pnl_overlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 60, Short.MAX_VALUE))
        );

        jPanel1.add(pnl_overlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 880, 90));

        pnl_host.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnl_hostLayout = new javax.swing.GroupLayout(pnl_host);
        pnl_host.setLayout(pnl_hostLayout);
        pnl_hostLayout.setHorizontalGroup(
            pnl_hostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        pnl_hostLayout.setVerticalGroup(
            pnl_hostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );

        jPanel1.add(pnl_host, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 880, 530));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRevisionesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRevisionesMousePressed
        pnlRevisionTurnos pl= new pnlRevisionTurnos();
        pl.setSize(880, 530);
        pl.setLocation(0, 0);
        
        pnl_host.removeAll();
        pnl_host.add(pl, BorderLayout.CENTER);
        pnl_host.revalidate();
        pnl_host.repaint();
    }//GEN-LAST:event_btnRevisionesMousePressed

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        System.exit(0);
    }//GEN-LAST:event_jLabel2MousePressed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(frmRTV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRTV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRTV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRTV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRTV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnRevisiones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel pnl_host;
    private javax.swing.JPanel pnl_overlay;
    private javax.swing.JPanel side_pane;
    // End of variables declaration//GEN-END:variables

}
