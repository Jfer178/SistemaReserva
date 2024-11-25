/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelo1.Empleado;
import Vista.RegistroEmpleado;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;

public class ControladoresEmpleados implements ActionListener {

    private Empleado empleado;
    private RegistroEmpleado vista;

    public ControladoresEmpleados(Empleado empleado, RegistroEmpleado vista) {
        this.empleado = empleado;
        this.vista = vista;

        this.vista.AGREGAR.addActionListener(this);
        this.vista.EDITAR.addActionListener(this);
        this.vista.ELIMINAR.addActionListener(this);
        this.vista.BUSCAR.addActionListener(this);
        this.vista.LIMPIAR.addActionListener(this);

    }

    public void iniciar() {

        vista.setTitle("REGISTRO EMPLEADO");
        vista.setLocationRelativeTo(null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.AGREGAR) {
            try {
                // Tomar los valores desde la vista y asignarlos al empleado
                empleado.setIDEMPLEADO(Integer.parseInt(vista.TextIDEmplado.getText()));
                empleado.setNOMBRE(vista.TextNombreEmplado.getText());
                empleado.setHORAS_VUELO(Integer.parseInt(vista.TextHraVuelo.getText()));
                empleado.setSALARIO(Integer.parseInt(vista.TextSalario.getText()));
                empleado.setSEXO((String) vista.CajitaSexo.getSelectedItem());
                empleado.setPROFESION((String) vista.CajitaProfesion.getSelectedItem());
                empleado.setIDADMINISTRADOR(Integer.parseInt(vista.TxtIDADMINISTRADOR.getText()));

                // Agregar el empleado a la base de datos
                if (empleado.agregarEmpleado(empleado)) {
                    JOptionPane.showMessageDialog(null, "REGISTRO GUARDADO");
                    limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "ERROR AL GUARDAR");
                    limpiar();
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese valores válidos.");
            }

        } else if (e.getSource() == vista.EDITAR) {
            try {
                // Tomar los valores desde la vista y asignarlos al empleado
                empleado.setIDEMPLEADO(Integer.parseInt(vista.TextIDEmplado.getText()));
                empleado.setNOMBRE(vista.TextNombreEmplado.getText());
                empleado.setHORAS_VUELO(Integer.parseInt(vista.TextHraVuelo.getText()));
                empleado.setSALARIO(Integer.parseInt(vista.TextSalario.getText()));
                empleado.setSEXO((String) vista.CajitaSexo.getSelectedItem());
                empleado.setPROFESION((String) vista.CajitaProfesion.getSelectedItem());

                // Editar el empleado en la base de datos
                if (empleado.editarEmpleado(empleado)) {
                    JOptionPane.showMessageDialog(null, "REGISTRO MODIFICADO");
                    limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "ERROR AL MODIFICAR");
                    limpiar();
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese valores válidos.");
            }

        } else if (e.getSource() == vista.ELIMINAR) {
            try {
                // Tomar el ID del empleado desde la vista y eliminarlo
                empleado.setIDEMPLEADO(Integer.parseInt(vista.TextIDEmplado.getText()));

                // Eliminar el empleado de la base de datos
                if (empleado.eliminarEmpleado(empleado)) {
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
            try {
                // Tomar el ID del empleado desde la vista y buscarlo
                empleado.setIDEMPLEADO(Integer.parseInt(vista.TextIDEmplado.getText()));

                // Buscar el empleado en la base de datos
                if (empleado.buscarEmpleado(empleado)) {
                    // Si el empleado se encuentra, mostrar los datos
                    vista.TextNombreEmplado.setText(empleado.getNOMBRE());
                    vista.TextHraVuelo.setText(String.valueOf(empleado.getHORAS_VUELO()));
                    vista.TextSalario.setText(String.valueOf(empleado.getSALARIO()));
                    vista.CajitaSexo.setSelectedItem(empleado.getSEXO());
                    vista.CajitaProfesion.setSelectedItem(empleado.getPROFESION());
                    vista.TxtIDADMINISTRADOR.setText(String.valueOf(empleado.getIDADMINISTRADOR()));

                    JOptionPane.showMessageDialog(null, "REGISTRO ENCONTRADO");
                } else {
                    JOptionPane.showMessageDialog(null, "ERROR NO ENCONTRADO");
                    limpiar();
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un ID válido.");
            }

        } else if (e.getSource() == vista.LIMPIAR) {
            limpiar();
        }
    }

    // Limpiar los campos del formulario
    public void limpiar() {
        vista.TextIDEmplado.setText(null);
        vista.TxtIDADMINISTRADOR.setText(null);
        vista.TextHraVuelo.setText(null);
        vista.TextSalario.setText(null);
        vista.CajitaProfesion.setSelectedIndex(0);
        vista.CajitaSexo.setSelectedIndex(0);
        vista.TextNombreEmplado.setText(null);
    }
}
