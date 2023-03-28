/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas.Recepcion;

import Vistas.Login.frmLogin;
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class frmRecepcion extends javax.swing.JFrame {

    public frmRecepcion() {

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        side_pane = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnRegistrarTurno = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnRptTurno = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnRegistrarCliente = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btnRegitrarVehiculo = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        pnl_overlay = new javax.swing.JPanel();
        lblcerrar = new javax.swing.JLabel();
        lblminimizar = new javax.swing.JLabel();
        pnl_host = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

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

        btnRegistrarTurno.setBackground(new java.awt.Color(102, 102, 102));
        btnRegistrarTurno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrarTurnoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrarTurnoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRegistrarTurnoMousePressed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Registrar Turno");

        javax.swing.GroupLayout btnRegistrarTurnoLayout = new javax.swing.GroupLayout(btnRegistrarTurno);
        btnRegistrarTurno.setLayout(btnRegistrarTurnoLayout);
        btnRegistrarTurnoLayout.setHorizontalGroup(
            btnRegistrarTurnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnRegistrarTurnoLayout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );
        btnRegistrarTurnoLayout.setVerticalGroup(
            btnRegistrarTurnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnRegistrarTurnoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel6)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        side_pane.add(btnRegistrarTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 170, 50));

        btnRptTurno.setBackground(new java.awt.Color(102, 102, 102));
        btnRptTurno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRptTurnoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRptTurnoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRptTurnoMousePressed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Reporte Turno");

        javax.swing.GroupLayout btnRptTurnoLayout = new javax.swing.GroupLayout(btnRptTurno);
        btnRptTurno.setLayout(btnRptTurnoLayout);
        btnRptTurnoLayout.setHorizontalGroup(
            btnRptTurnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnRptTurnoLayout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );
        btnRptTurnoLayout.setVerticalGroup(
            btnRptTurnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnRptTurnoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        side_pane.add(btnRptTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 170, -1));

        btnRegistrarCliente.setBackground(new java.awt.Color(102, 102, 102));
        btnRegistrarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrarClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrarClienteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRegistrarClienteMousePressed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Registrar Cliente");

        javax.swing.GroupLayout btnRegistrarClienteLayout = new javax.swing.GroupLayout(btnRegistrarCliente);
        btnRegistrarCliente.setLayout(btnRegistrarClienteLayout);
        btnRegistrarClienteLayout.setHorizontalGroup(
            btnRegistrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnRegistrarClienteLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap())
        );
        btnRegistrarClienteLayout.setVerticalGroup(
            btnRegistrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnRegistrarClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        side_pane.add(btnRegistrarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 170, -1));

        btnRegitrarVehiculo.setBackground(new java.awt.Color(102, 102, 102));
        btnRegitrarVehiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegitrarVehiculoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegitrarVehiculoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRegitrarVehiculoMousePressed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Registrar Vehiculo");

        javax.swing.GroupLayout btnRegitrarVehiculoLayout = new javax.swing.GroupLayout(btnRegitrarVehiculo);
        btnRegitrarVehiculo.setLayout(btnRegitrarVehiculoLayout);
        btnRegitrarVehiculoLayout.setHorizontalGroup(
            btnRegitrarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnRegitrarVehiculoLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );
        btnRegitrarVehiculoLayout.setVerticalGroup(
            btnRegitrarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnRegitrarVehiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        side_pane.add(btnRegitrarVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 170, -1));

        jPanel1.add(side_pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 620));

        pnl_overlay.setBackground(new java.awt.Color(153, 153, 153));

        lblcerrar.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        lblcerrar.setText("X");
        lblcerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblcerrarMousePressed(evt);
            }
        });

        lblminimizar.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        lblminimizar.setText("-");
        lblminimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblminimizarMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblminimizarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnl_overlayLayout = new javax.swing.GroupLayout(pnl_overlay);
        pnl_overlay.setLayout(pnl_overlayLayout);
        pnl_overlayLayout.setHorizontalGroup(
            pnl_overlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_overlayLayout.createSequentialGroup()
                .addGap(0, 834, Short.MAX_VALUE)
                .addComponent(lblminimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblcerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnl_overlayLayout.setVerticalGroup(
            pnl_overlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_overlayLayout.createSequentialGroup()
                .addGroup(pnl_overlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblminimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 60, Short.MAX_VALUE))
        );

        jPanel1.add(pnl_overlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 880, 90));

        pnl_host.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/raven/cell/Logo para Taller de Mecánica Rueda Dentada Clásico Negro y Beige.png"))); // NOI18N

        javax.swing.GroupLayout pnl_hostLayout = new javax.swing.GroupLayout(pnl_host);
        pnl_host.setLayout(pnl_hostLayout);
        pnl_hostLayout.setHorizontalGroup(
            pnl_hostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_hostLayout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(619, 619, 619)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_hostLayout.setVerticalGroup(
            pnl_hostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
            .addGroup(pnl_hostLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(pnl_host, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 880, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRptTurnoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRptTurnoMousePressed
        pnlReporteTurnos pl = new pnlReporteTurnos();
        pl.setSize(880, 530);
        pl.setLocation(0, 0);

        pnl_host.removeAll();
        pnl_host.add(pl, BorderLayout.CENTER);
        pnl_host.revalidate();
        pnl_host.repaint();
    }//GEN-LAST:event_btnRptTurnoMousePressed

    private void lblcerrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcerrarMousePressed
        System.exit(0);
    }//GEN-LAST:event_lblcerrarMousePressed

    private void lblminimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblminimizarMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lblminimizarMouseClicked

    private void btnRegistrarTurnoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarTurnoMousePressed
        // TODO add your handling code here:
        pnlRegistroTurno pl = new pnlRegistroTurno();
        pl.setSize(880, 530);
        pl.setLocation(0, 0);

        pnl_host.removeAll();
        pnl_host.add(pl, BorderLayout.CENTER);
        pnl_host.revalidate();
        pnl_host.repaint();
    }//GEN-LAST:event_btnRegistrarTurnoMousePressed

    private void btnRegistrarClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarClienteMousePressed
        // TODO add your handling code here:
        pnlRegistroClientes pl = new pnlRegistroClientes();
        pl.setSize(880, 530);
        pl.setLocation(0, 0);

        pnl_host.removeAll();
        pnl_host.add(pl, BorderLayout.CENTER);
        pnl_host.revalidate();
        pnl_host.repaint();
    }//GEN-LAST:event_btnRegistrarClienteMousePressed

    private void btnRegitrarVehiculoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegitrarVehiculoMousePressed
        // TODO add your handling code here:

        pnlRegistroVehiculo pl = new pnlRegistroVehiculo();
        pl.setSize(880, 530);
        pl.setLocation(0, 0);

        pnl_host.removeAll();
        pnl_host.add(pl, BorderLayout.CENTER);
        pnl_host.revalidate();
        pnl_host.repaint();
    }//GEN-LAST:event_btnRegitrarVehiculoMousePressed

    private void btnRegistrarClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarClienteMouseEntered
        btnRegistrarCliente.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_btnRegistrarClienteMouseEntered

    private void btnRegistrarClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarClienteMouseExited
        btnRegistrarCliente.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_btnRegistrarClienteMouseExited

    private void btnRegitrarVehiculoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegitrarVehiculoMouseEntered
        // TODO add your handling code here:
        btnRegitrarVehiculo.setBackground(new Color(153, 153, 153));

    }//GEN-LAST:event_btnRegitrarVehiculoMouseEntered

    private void btnRegitrarVehiculoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegitrarVehiculoMouseExited
        // TODO add your handling code here:
        btnRegitrarVehiculo.setBackground(new Color(102, 102, 102));

    }//GEN-LAST:event_btnRegitrarVehiculoMouseExited

    private void btnRegistrarTurnoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarTurnoMouseEntered
        btnRegistrarTurno.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_btnRegistrarTurnoMouseEntered

    private void btnRegistrarTurnoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarTurnoMouseExited
        btnRegistrarTurno.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_btnRegistrarTurnoMouseExited

    private void btnRptTurnoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRptTurnoMouseEntered
        btnRptTurno.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_btnRptTurnoMouseEntered

    private void btnRptTurnoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRptTurnoMouseExited
        btnRptTurno.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_btnRptTurnoMouseExited

    private void lblminimizarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblminimizarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblminimizarMousePressed

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
            java.util.logging.Logger.getLogger(frmRecepcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRecepcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRecepcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRecepcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new frmRecepcion().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnRegistrarCliente;
    private javax.swing.JPanel btnRegistrarTurno;
    private javax.swing.JPanel btnRegitrarVehiculo;
    private javax.swing.JPanel btnRptTurno;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblcerrar;
    private javax.swing.JLabel lblminimizar;
    private javax.swing.JPanel pnl_host;
    private javax.swing.JPanel pnl_overlay;
    private javax.swing.JPanel side_pane;
    // End of variables declaration//GEN-END:variables

}
