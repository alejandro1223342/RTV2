package Vistas.Recepcion;

import Conexion.Conexion;
import java.awt.Dimension;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public class pnlRegistroVehiculo extends javax.swing.JPanel {

    Conexion cx;

    public pnlRegistroVehiculo() {
        setPreferredSize(new Dimension(880, 530));
        initComponents();
        cx = new Conexion("rtv_ist17j");
        comboModelo();
        comboClase();
        comboMarca();
        comboCliente();
        comboTipo();

        AutoCompleteDecorator.decorate(comboClase);
        AutoCompleteDecorator.decorate(comboCliente);
        AutoCompleteDecorator.decorate(comboMarca);
        AutoCompleteDecorator.decorate(comboModelo);
        AutoCompleteDecorator.decorate(comboTipo);

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblPlacaVehiculo = new javax.swing.JLabel();
        lblClase = new javax.swing.JLabel();
        lblCedulaCliente = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        lblMarca = new javax.swing.JLabel();
        lblModelo = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        lblChasis = new javax.swing.JLabel();
        txtChasis = new javax.swing.JTextField();
        comboModelo = new javax.swing.JComboBox<>();
        comboMarca = new javax.swing.JComboBox<>();
        comboClase = new javax.swing.JComboBox<>();
        comboCliente = new javax.swing.JComboBox<>();
        comboTipo = new javax.swing.JComboBox<>();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(880, 530));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("REGISTRO DE VEHICULOS");

        lblPlacaVehiculo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPlacaVehiculo.setText("Placa del Vehiculo:");

        lblClase.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblClase.setText("Clase:");

        lblCedulaCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCedulaCliente.setText("Cédula-Cliente:");

        txtPlaca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPlacaKeyTyped(evt);
            }
        });

        lblMarca.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMarca.setText("Marca:");

        lblModelo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblModelo.setText("Modelo:");

        lblTipo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTipo.setText("Tipo:");

        btnRegistrar.setBackground(new java.awt.Color(153, 153, 153));
        btnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRegistrarMousePressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("  REGISTRAR");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnRegistrarLayout = new javax.swing.GroupLayout(btnRegistrar);
        btnRegistrar.setLayout(btnRegistrarLayout);
        btnRegistrarLayout.setHorizontalGroup(
            btnRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnRegistrarLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        btnRegistrarLayout.setVerticalGroup(
            btnRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnRegistrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblChasis.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblChasis.setText("Nro de Chasis:");

        txtChasis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtChasisKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(jLabel1)
                .addContainerGap(208, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblChasis)
                            .addComponent(lblPlacaVehiculo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPlaca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                            .addComponent(lblCedulaCliente, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblModelo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboModelo, javax.swing.GroupLayout.Alignment.LEADING, 0, 287, Short.MAX_VALUE)
                            .addComponent(comboCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblClase)
                            .addComponent(lblMarca)
                            .addComponent(lblTipo)
                            .addComponent(comboMarca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboClase, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(txtChasis, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(123, 123, 123))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPlacaVehiculo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblClase, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboClase, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCedulaCliente)
                    .addComponent(lblMarca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboMarca, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(comboCliente))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboTipo, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblModelo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboModelo, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(lblChasis)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtChasis, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
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

    public void comboModelo() {
        String query = "call sp_catalogos(2)";
        try {

            Statement st = cx.conecta().createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                String tipoId = rs.getString("mod_id");
                String tipoNombre = rs.getString("mod_nombre");
                tipos.put(tipoNombre, tipoId); // Agregar el tipo de vehículo y su id al mapa
                comboModelo.addItem(tipoNombre); // Agregar el nombre del tipo de vehículo al JComboBox
            }
        } catch (SQLException ex) {
            Logger.getLogger(pnlRegistroTurno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void comboClase() {
        String query = "call sp_catalogos(0)";
        try {

            Statement st = cx.conecta().createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                String tipoId = rs.getString("cla_id");
                String tipoNombre = rs.getString("cla_nombre");
                tipos.put(tipoNombre, tipoId); // Agregar el tipo de vehículo y su id al mapa
                comboClase.addItem(tipoNombre); // Agregar el nombre del tipo de vehículo al JComboBox

            }
        } catch (SQLException ex) {
            Logger.getLogger(pnlRegistroTurno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void comboMarca() {
        String query = "call sp_catalogos(1)";
        try {

            Statement st = cx.conecta().createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                String tipoId = rs.getString("mar_id");
                String tipoNombre = rs.getString("mar_nombre");
                tipos.put(tipoNombre, tipoId); // Agregar el tipo de vehículo y su id al mapa
                comboMarca.addItem(tipoNombre); // Agregar el nombre del tipo de vehículo al JComboBox
            }
        } catch (SQLException ex) {
            Logger.getLogger(pnlRegistroTurno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void comboCliente() {
        String query = "call sp_catalogos(4)";
        try {

            Statement st = cx.conecta().createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                comboCliente.addItem(rs.getString("cli_cedula"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(pnlRegistroTurno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    Map<String, String> tipos = new HashMap<>();

    public void comboTipo() {
        String query = "call sp_catalogos(3)";
        try {

            Statement st = cx.conecta().createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                String tipoId = rs.getString("tip_id");
                String tipoNombre = rs.getString("tip_nombre");
                tipos.put(tipoNombre, tipoId); // Agregar el tipo de vehículo y su id al mapa
                comboTipo.addItem(tipoNombre); // Agregar el nombre del tipo de vehículo al JComboBox
            }
        } catch (SQLException ex) {
            Logger.getLogger(pnlRegistroVehiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void btnRegistrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMousePressed
        try {
            String txtPlaca = this.txtPlaca.getText();
            String comboCliente = this.comboCliente.getSelectedItem().toString();

//            String comboModelo = this.comboModelo.getSelectedItem().toString().substring(0, 1);
            String selectedModelo = this.comboModelo.getSelectedItem().toString();
            String modeloId = tipos.get(selectedModelo);
//            String comboClase = this.comboClase.getSelectedItem().toString().substring(0, 1);
            String selectedClase = this.comboClase.getSelectedItem().toString();
            String claseId = tipos.get(selectedClase);

//            String comboMarca = this.comboMarca.getSelectedItem().toString().substring(0, 1);
            String selectedMarca = this.comboMarca.getSelectedItem().toString();
            String marcaId = tipos.get(selectedMarca);

// String comboTipo = this.comboTipo.getSelectedItem().toString().substring(0, 1);
            String selectedTipo = this.comboTipo.getSelectedItem().toString();
            String tipoId = tipos.get(selectedTipo);

            String txtChasis = this.txtChasis.getText();

            String query = "CALL sp_insert_vehiculo('"
                    + txtPlaca + "','" + comboCliente + "','" + modeloId + "','" + claseId + "' ,'" + marcaId + "','" + tipoId + "' , '" + txtChasis + "' )";
            Statement st = cx.conecta().createStatement();
            ResultSet rs = st.executeQuery(query);

            JOptionPane.showMessageDialog(null, "datos guardados");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "no se guardaron los datos" + ex.toString());
        }
    }//GEN-LAST:event_btnRegistrarMousePressed

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
    }//GEN-LAST:event_jLabel8MouseExited

    private void txtPlacaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlacaKeyTyped
        // TODO add your handling code here:

        int contadorLetras = 0;
        int contadorNumeros = 0;
        String texto = txtPlaca.getText().trim();
        char c = evt.getKeyChar();
        if ((Character.isLetter(c) && Character.isUpperCase(c) && contadorLetras < 3) || (Character.isDigit(c) && contadorNumeros < 4 && texto.length() < 7)) {
            evt.setKeyChar(Character.toUpperCase(c));
            if (Character.isLetter(c)) {
                contadorLetras++;
            } else {
                contadorNumeros++;
            }
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_txtPlacaKeyTyped

    private void txtChasisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtChasisKeyTyped
        int contadorLetras = 0;
        int contadorNumeros = 0;
        String texto = txtChasis.getText().trim();
        char c = evt.getKeyChar();
        if ((Character.isLetter(c) && Character.isUpperCase(c) && contadorLetras < 17) || (Character.isDigit(c) && contadorNumeros < 17 && texto.length() < 17)) {
            evt.setKeyChar(Character.toUpperCase(c));
            if (Character.isLetter(c)) {
                contadorLetras++;
            } else {
                contadorNumeros++;
            }
        } else {
            evt.consume();
        }


    }//GEN-LAST:event_txtChasisKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnRegistrar;
    private javax.swing.JComboBox<String> comboClase;
    private javax.swing.JComboBox<String> comboCliente;
    private javax.swing.JComboBox<String> comboMarca;
    private javax.swing.JComboBox<String> comboModelo;
    private javax.swing.JComboBox<String> comboTipo;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCedulaCliente;
    private javax.swing.JLabel lblChasis;
    private javax.swing.JLabel lblClase;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblPlacaVehiculo;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JTextField txtChasis;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables
}
