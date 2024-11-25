/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelo1.Usuario;
import Vista.RegistroClientes;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;

public class ControladorUsuario implements ActionListener{
    
    
    private Usuario fcol;                // Instancia de la clase Usuario
    private RegistroClientes vista;      // Vista del JFrame RegistroUsuarios

    // Constructor
    public ControladorUsuario(Usuario fcol, RegistroClientes vista) {
        this.fcol = fcol;
        this.vista = vista;

        // Agregar ActionListeners para los botones
        this.vista.AGREGAR.addActionListener(this);
        this.vista.EDITAR.addActionListener(this);
        this.vista.ELIMINAR.addActionListener(this);
        this.vista.BUSCAR.addActionListener(this);
        this.vista.LIMPIAR.addActionListener(this);
    }

    // Método para inicializar la vista
    public void iniciar() {
        vista.setTitle("REGISTRO DE USUARIOS");
        vista.setLocationRelativeTo(null);  // Centrar el JFrame
    }

     public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.AGREGAR) {

            try {
                // Obtener los valores de la vista y asignarlos al objeto Usuario
                fcol.setIdUsuario(Integer.parseInt(vista.TextIdUsuarios.getText()));
                fcol.setNombre(vista.TextNOMBRE.getText());
                fcol.setCorreo(vista.TxtICorreo.getText());
                fcol.setSexo((String) vista.jComboBoxSexo.getSelectedItem());
                fcol.setTelefono(vista.TxtITEL.getText());
                fcol.setConstraseña(vista.TxtCONTRASEÑA.getText());
                fcol.setEdad(Integer.parseInt(vista.TxtIEDAD.getText()));

                // Intentar agregar el usuario
                if (fcol.agregarUsuario()) {
                    JOptionPane.showMessageDialog(null, "REGISTRO GUARDADO");
                    limpiar();  // Limpiar los campos después de agregar
                } else {
                    JOptionPane.showMessageDialog(null, "ERROR AL GUARDAR");
                    limpiar();  // Limpiar los campos en caso de error
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese valores válidos.");
            }

        } else if (e.getSource() == vista.EDITAR) {

            try {
                // Obtener los valores de la vista y asignarlos al objeto Usuario
                fcol.setIdUsuario(Integer.parseInt(vista.TextIdUsuarios.getText()));
                fcol.setNombre(vista.TextNOMBRE.getText());
                fcol.setCorreo(vista.TxtICorreo.getText());
                fcol.setSexo((String) vista.jComboBoxSexo.getSelectedItem());
                fcol.setTelefono(vista.TxtITEL.getText());
                fcol.setConstraseña(vista.TxtCONTRASEÑA.getText());
                fcol.setEdad(Integer.parseInt(vista.TxtIEDAD.getText()));

                // Intentar editar el usuario
                if (fcol.editarUsuario()) {
                    JOptionPane.showMessageDialog(null, "REGISTRO MODIFICADO");
                    limpiar();  // Limpiar los campos después de editar
                } else {
                    JOptionPane.showMessageDialog(null, "ERROR AL MODIFICAR");
                    limpiar();  // Limpiar los campos en caso de error
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese valores válidos.");
            }

        } else if (e.getSource() == vista.ELIMINAR) {

            try {
                fcol.setIdUsuario(Integer.parseInt(vista.TextIdUsuarios.getText()));

                // Intentar eliminar el usuario
                if (fcol.eliminarUsuario()) {
                    JOptionPane.showMessageDialog(null, "REGISTRO ELIMINADO");
                    limpiar();  // Limpiar los campos después de eliminar
                } else {
                    JOptionPane.showMessageDialog(null, "ERROR AL ELIMINAR");
                    limpiar();  // Limpiar los campos en caso de error
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un ID válido.");
            }

        } else if (e.getSource() == vista.BUSCAR) {

            try {
                fcol.setIdUsuario(Integer.parseInt(vista.TextIdUsuarios.getText()));

                // Intentar buscar el usuario
                if (fcol.buscarUsuario()) {
                    // Mostrar los datos en la vista
                    vista.TextIdUsuarios.setText(String.valueOf(fcol.getIdUsuario()));
                    vista.TextNOMBRE.setText(fcol.getNombre());
                    vista.TxtICorreo.setText(fcol.getCorreo());
                    vista.TxtITEL.setText(fcol.getTelefono());
                    vista.TxtCONTRASEÑA.setText(fcol.getContraseña());
                    vista.TxtIEDAD.setText(String.valueOf(fcol.getEdad()));
                    vista.jComboBoxSexo.setSelectedItem(fcol.getSexo());

                    JOptionPane.showMessageDialog(null, "REGISTRO ENCONTRADO");

                } else {
                    JOptionPane.showMessageDialog(null, "ERROR NO ENCONTRADO");
                    limpiar();  // Limpiar los campos si no se encuentra el usuario
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un ID válido.");
            }

        } else if (e.getSource() == vista.LIMPIAR) {
            limpiar();  // Limpiar todos los campos
        }
    }

    // Método para limpiar los campos del formulario
    public void limpiar() {
        vista.TextIdUsuarios.setText(null);
        vista.TextNOMBRE.setText(null);
        vista.TxtICorreo.setText(null);
        vista.TxtITEL.setText(null);
        vista.TxtCONTRASEÑA.setText(null);
        vista.TxtIEDAD.setText(null);
        vista.jComboBoxSexo.setSelectedIndex(0);  // Resetear el combo box
    }
}