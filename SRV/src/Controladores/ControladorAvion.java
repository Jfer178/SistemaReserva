/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelo1.Avion;
import Vista.RegistroAvion;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;

public class ControladorAvion implements ActionListener {

    private Avion fcol;
    private RegistroAvion vista;

    public ControladorAvion(Avion fcol, RegistroAvion vista) {
        this.fcol = fcol;
        this.vista = vista;

        this.vista.AGREGAR.addActionListener(this);
        this.vista.EDITAR.addActionListener(this);
        this.vista.ELIMINAR.addActionListener(this);
        this.vista.BUSCAR.addActionListener(this);
        this.vista.LIMPIAR.addActionListener(this);

    }

    public void iniciar() {

        vista.setTitle("REGISTRO AVION");
        vista.setLocationRelativeTo(null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.AGREGAR) {

            try {
                fcol.setIDAVION(Integer.parseInt(vista.TextIDavion.getText()));
                fcol.setIDADMINISTRADOR(Integer.parseInt(vista.TxtIDADMINISTRADOR.getText()));
                fcol.setCODIGO(vista.TextCodigo.getText());
                fcol.setMODELO((String) vista.CajitaOpcionesModelo.getSelectedItem());
                fcol.setTIPO((String) vista.CajitaOpcinesTipo.getSelectedItem());
                fcol.setCAPACIDAD(Integer.parseInt(vista.TextCapacidad.getText()));

                if (fcol.agregarAvion(fcol)) {
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
                fcol.setIDAVION(Integer.parseInt(vista.TextIDavion.getText()));
                fcol.setCODIGO(vista.TextCodigo.getText());
                fcol.setMODELO((String) vista.CajitaOpcionesModelo.getSelectedItem());
                fcol.setTIPO((String) vista.CajitaOpcinesTipo.getSelectedItem());
                fcol.setCAPACIDAD(Integer.parseInt(vista.TextCapacidad.getText()));

                if (fcol.editarAvion(fcol)) {
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
                fcol.setIDAVION(Integer.parseInt(vista.TextIDavion.getText()));

                if (fcol.eliminarAvion(fcol)) {
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
                fcol.setIDAVION(Integer.parseInt(vista.TextIDavion.getText()));

                if (fcol.buscarAvion(fcol)) {
                    vista.TextIDavion.setText(String.valueOf(fcol.getIDAVION()));
                    vista.TxtIDADMINISTRADOR.setText(String.valueOf(fcol.getIDADMINISTRADOR()));
                    vista.TextCodigo.setText(fcol.getCODIGO());
                    vista.TextCapacidad.setText(String.valueOf(fcol.getCAPACIDAD()));
                    vista.CajitaOpcionesModelo.setSelectedItem(fcol.getMODELO());
                    vista.CajitaOpcinesTipo.setSelectedItem(fcol.getTIPO());

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

    public void limpiar() {
        vista.TextIDavion.setText(null);
        vista.TxtIDADMINISTRADOR.setText(null);
        vista.TextCapacidad.setText(null);
        vista.TextCodigo.setText(null);
        vista.CajitaOpcinesTipo.setSelectedIndex(0);
        vista.CajitaOpcionesModelo.setSelectedIndex(0);
    }
}
