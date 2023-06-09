/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vistas.Revisiones;

import Conexion.Conexion;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import raven.cell.TableActionCellEditor;
import raven.cell.TableActionCellRender;
import raven.cell.TableActionEvent;

/**
 *
 * @author alejo
 */
public class pnlRevisionTurnos extends javax.swing.JPanel {

    Conexion cx;

    /**
     * Creates new form pnlRevisionTurnos
     */
    public pnlRevisionTurnos() {
        initComponents();
        cx = new Conexion("rtv_ist17j2");
       /* String query = "CALL sp_turnos(); ";
            Statement st = cx.conecta().createStatement();
            ResultSet rs = st.executeQuery(query);*/
        mostrarDatos();
        
        TableActionEvent event = new TableActionEvent() {
            @Override
            public void onRevision(int row) {
                /*
                if (cbxGasesa.isSelected()) {
                    frmPrueba_Gases frmg = new frmPrueba_Gases();
                    frmg.setVisible(true);
                }
                if (cbxFrenosa.isSelected()) {
                    frmPrueba_Frenos frmf = new frmPrueba_Frenos();
                    frmf.setVisible(true);
                }
                if (cbxLucesa.isSelected()) {
                    frmPrueba_Luces frml = new frmPrueba_Luces();
                    frml.setVisible(true);
                }
                lblTotala.setText(String.valueOf(mensaje));

                /* SEPARADOR*//*
                if (cbxGasesa.isSelected() && cbxFrenosa.isSelected()) {
                    frmPrueba_Gases frmg = new frmPrueba_Gases();
                    frmg.setVisible(true);
                    frmPrueba_Frenos frmf = new frmPrueba_Frenos();
                    frmf.setVisible(true);
                }
                if (cbxFrenosa.isSelected() && cbxLucesa.isSelected()) {
                    frmPrueba_Frenos frmf = new frmPrueba_Frenos();
                    frmf.setVisible(true);
                    frmPrueba_Luces frml = new frmPrueba_Luces();
                    frml.setVisible(true);

                }
                if (cbxLucesa.isSelected() && cbxGasesa.isSelected()) {
                    frmPrueba_Gases frmg = new frmPrueba_Gases();
                    frmg.setVisible(true);
                    frmPrueba_Luces frml = new frmPrueba_Luces();
                    frml.setVisible(true);
                }
                /* SEPARADOR*//*
                if (cbxGasesa.isSelected() && cbxFrenosa.isSelected() && cbxLucesa.isSelected()) {
                    frmPrueba_Gases frmg = new frmPrueba_Gases();
                    frmg.setVisible(true);
                    frmPrueba_Frenos frmf = new frmPrueba_Frenos();
                    frmf.setVisible(true);
                    frmPrueba_Luces frml = new frmPrueba_Luces();
                    frml.setVisible(true);
                }*/
               frmPrueba_Gases frmg = new frmPrueba_Gases();
                    frmg.setVisible(true);
                    frmg.dispose();
                    frmPrueba_Frenos frmf = new frmPrueba_Frenos();
                    frmf.setVisible(true);
                    frmf.dispose();
                    frmPrueba_Luces frml = new frmPrueba_Luces();
                    frml.setVisible(true);
                    frml.dispose();
            }
        };
        tabla.getColumnModel().getColumn(5).setCellRenderer(new TableActionCellRender());
        tabla.getColumnModel().getColumn(5).setCellEditor(new TableActionCellEditor(event));
    }

    public void mostrarDatos() {
        DefaultTableModel tcliente = new DefaultTableModel();
        tcliente.addColumn("TURNO");
        tcliente.addColumn("PLACA");
        tcliente.addColumn("FECHA");
        tcliente.addColumn("COSTO");
        tcliente.addColumn("PRUEBAS");
        tcliente.addColumn("REVISION");
        tabla.setModel(tcliente);

        String[] datos = new String[5];

        try {
            String query = "CALL sp_reporte_turno() ";
            Statement st = cx.conecta().createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);

                tcliente.addRow(datos);

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e + "Error en la consulta");
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(880, 530));

        jPanel1.setPreferredSize(new java.awt.Dimension(880, 530));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setRequestFocusEnabled(false);
        tabla.setRowHeight(40);
        jScrollPane2.setViewportView(tabla);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 789, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
