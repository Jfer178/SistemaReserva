/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelo1.Vuelo;
import Vista.RegistroVuelos;

import Modelo1.Vuelo;
import Vista.RegistroVuelos;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;

public class ControladorVuelo implements ActionListener {

    private Vuelo vuelo;
    private RegistroVuelos vista;

    public ControladorVuelo(Vuelo vuelo, RegistroVuelos vista) {
        this.vuelo = vuelo;
        this.vista = vista;

        // Asociamos los botones con los eventos correspondientes
        this.vista.AGREGAR.addActionListener(this);
        this.vista.EDITAR.addActionListener(this);
        this.vista.ELIMINAR.addActionListener(this);
        this.vista.BUSCAR.addActionListener(this);
        this.vista.LIMPIAR.addActionListener(this);
    }

    public void iniciar() {
        // Inicializamos la vista (por ejemplo, el título y la ubicación)
        vista.setTitle("REGISTRO VUELO");
        vista.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.AGREGAR) {
            try {

                vuelo.setIDVUELO(Integer.parseInt(vista.TEXTIDVUELO.getText()));
                vuelo.setIDEMPLEADOS((int) vista.jComboBoxIDEMPLEADO.getSelectedItem());  // Cambiar getText() por getSelectedItem()
                vuelo.setIDAVION((int) vista.jComboBoxIDAVION.getSelectedItem());  // 
                vuelo.setNRO_VUELO(vista.TEXT_NROVUELO.getText());
                vuelo.setORIGEN((String) vista.jComboBOXORIGEN.getSelectedItem());
                vuelo.setDESTINO((String) vista.jComboBOXDESTINO.getSelectedItem());
                vuelo.setFECHA(vista.jDateChooserFECHA.getDate());
                vuelo.setHORA(vista.TEXT_HORA.getText());
                vuelo.setASIENTO_DISPONIBLES(Integer.parseInt(vista.TEXT_ASIENTOS.getText()));
                vuelo.setIDADMINISTRADOR(Integer.parseInt(vista.TEXT_ADMIN.getText()));

                // Llamamos al método para agregar el vuelo a la base de datos
                if (vuelo.agregarVuelo(vuelo)) {
                    JOptionPane.showMessageDialog(null, "REGISTRO GUARDADO");
                    limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "ERROR AL GUARDAR");
                    limpiar();
                }
            } catch (NumberFormatException ex) {

                JOptionPane.showMessageDialog(null, "Por favor, ingrese valores válidos.");
            } catch (NullPointerException ex) {
                JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
            }
        } else if (e.getSource() == vista.EDITAR) {

            try {
                vuelo.setIDVUELO(Integer.parseInt(vista.TEXTIDVUELO.getText()));
                vuelo.setIDEMPLEADOS((int) vista.jComboBoxIDEMPLEADO.getSelectedItem());  // Cambiar getText() por getSelectedItem()
                vuelo.setIDAVION((int) vista.jComboBoxIDAVION.getSelectedItem());  // Cambiar getText() por getSelectedItem()
                vuelo.setNRO_VUELO(vista.TEXT_NROVUELO.getText());
                vuelo.setORIGEN((String) vista.jComboBOXORIGEN.getSelectedItem());
                vuelo.setDESTINO((String) vista.jComboBOXDESTINO.getSelectedItem());
                vuelo.setFECHA(vista.jDateChooserFECHA.getDate());
                vuelo.setHORA(vista.TEXT_HORA.getText());
                vuelo.setASIENTO_DISPONIBLES(Integer.parseInt(vista.TEXT_ASIENTOS.getText()));
                vuelo.setIDADMINISTRADOR(Integer.parseInt(vista.TEXT_ADMIN.getText()));

                // Llamamos al método para editar el vuelo en la base de datos
                if (vuelo.editarVuelo(vuelo)) {
                    JOptionPane.showMessageDialog(null, "REGISTRO MODIFICADO");
                    limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "ERROR AL MODIFICAR");
                    limpiar();
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese valores válidos.");
            } catch (NullPointerException ex) {
                JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
            }
        } else if (e.getSource() == vista.ELIMINAR) {
            // Al presionar ELIMINAR, eliminamos el vuelo por ID
            try {
                vuelo.setIDVUELO(Integer.parseInt(vista.TEXTIDVUELO.getText()));

                // Llamamos al método para eliminar el vuelo de la base de datos
                if (vuelo.eliminarVuelo(vuelo)) {
                    JOptionPane.showMessageDialog(null, "REGISTRO ELIMINADO");
                    limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "ERROR AL ELIMINAR");
                    limpiar();
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un ID válido.");
            }
        } else if (e.getSource() == vista.BUSCAR) {
            // Al presionar BUSCAR, buscamos el vuelo por ID
            try {
                vuelo.setIDVUELO(Integer.parseInt(vista.TEXTIDVUELO.getText()));

                if (vuelo.buscarVuelo(vuelo)) {

                    vista.TEXTIDVUELO.setText(String.valueOf(vuelo.getIDVUELO()));
                    vista.jComboBoxIDEMPLEADO.setSelectedItem(vuelo.getIDEMPLEADOS());
                    vista.jComboBoxIDAVION.setSelectedItem(vuelo.getIDAVION());
                    vista.TEXT_NROVUELO.setText(vuelo.getNRO_VUELO());
                    vista.jComboBOXORIGEN.setSelectedItem(vuelo.getORIGEN());
                    vista.jComboBOXDESTINO.setSelectedItem(vuelo.getDESTINO());
                    vista.jDateChooserFECHA.setDate(vuelo.getFECHA());
                    vista.TEXT_HORA.setText(vuelo.getHORA());
                    vista.TEXT_ASIENTOS.setText(String.valueOf(vuelo.getASIENTO_DISPONIBLES()));
                    vista.TEXT_ADMIN.setText(String.valueOf(vuelo.getIDADMINISTRADOR()));

                    JOptionPane.showMessageDialog(null, "REGISTRO ENCONTRADO");
                } else {
                    JOptionPane.showMessageDialog(null, "ERROR NO ENCONTRADO");
                    limpiar();
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un ID válido.");
            }
        } else if (e.getSource() == vista.LIMPIAR) {
            // Al presionar LIMPIAR, limpiamos todos los campos
            limpiar();
        }
    }

    public void limpiar() {
        // Limpiamos los campos de texto
        vista.TEXTIDVUELO.setText(null);
        vista.jComboBoxIDEMPLEADO.setSelectedIndex(0);
        vista.jComboBoxIDAVION.setSelectedIndex(0);
        vista.TEXT_NROVUELO.setText(null);
        vista.jComboBOXORIGEN.setSelectedIndex(0); // Establece el primer valor en el JComboBox
        vista.jComboBOXDESTINO.setSelectedIndex(0); // Establece el primer valor en el JComboBox
        vista.jDateChooserFECHA.setDate(null);
        vista.TEXT_HORA.setText(null);  // Asumiendo que timePicker1 es un componente Time
        vista.TEXT_ASIENTOS.setText(null);
        vista.TEXT_ADMIN.setText(null);

    }
}
