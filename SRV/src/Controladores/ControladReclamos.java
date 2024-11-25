/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;


import Modelo1.Reclamos;
import Vista.QRusuario;
import Vista.QRadmin;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;

public class ControladReclamos  implements ActionListener{
    
    private Reclamos fcol;
    private QRusuario vista;

    public ControladReclamos(Reclamos fcol, QRusuario vista) {
        this.fcol = fcol;
        this.vista = vista;
    }
    
    public void iniciar() {

        vista.setTitle("REGISTRO RECLAMOS");
        vista.setLocationRelativeTo(null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
    if (e.getSource() == vista.AGREGAR) {

        try {
            // Obtener los datos del reclamo desde los campos de la vista
          
            fcol.setIdCliente(Integer.parseInt(vista.jTextFieldCedula.getText()));
            fcol.setDescripcion(vista.jTextFieldDescripcion.getText());
            fcol.setFecha(vista.jDateChooserFECHA.getDate());  // Supón que la fecha es un String en formato "dd/MM/yyyy"

            // Intentar agregar el reclamo a la base de datos
            if (fcol.agregarReclamo(fcol)) {
                JOptionPane.showMessageDialog(null, "RECLAMO REGISTRADO");
                limpiar();  // Limpiar los campos después de agregar el reclamo
            } else {
                JOptionPane.showMessageDialog(null, "ERROR AL GUARDAR RECLAMO");
                limpiar();  // Limpiar los campos en caso de error
            }
        } catch (NumberFormatException ex) {
            // Manejo de errores si los valores no son válidos
            JOptionPane.showMessageDialog(null, "Por favor, ingrese valores válidos.");
        }
    }
    // Aquí van otras acciones si es necesario para Editar, Eliminar, etc.
}

public void limpiar() {
    // Limpiar los campos de la vista después de la acción
   
    vista.jTextFieldCedula.setText(null);
    vista.jTextFieldDescripcion.setText(null);
    vista.jDateChooserFECHA.setDate(null);  // Limpiar el campo de fecha
}
    
}
