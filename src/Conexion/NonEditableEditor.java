/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

/**
 *
 * @author alejo
 */
import javax.swing.DefaultCellEditor;
import javax.swing.JTextField;

public class NonEditableEditor extends DefaultCellEditor {

    public NonEditableEditor() {
        super(new JTextField());
    }

    @Override
    public boolean isCellEditable(java.util.EventObject e) {
        return false;
    }
}
