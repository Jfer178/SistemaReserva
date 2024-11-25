package Controladores;

import Modelo1.BoletoModelo;  // Asegúrate de que estos nombres coincidan con tus clases
import Vista.Boleto;          // Vista de la interfaz gráfica

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;

public class ControladorBoleto implements ActionListener {

    private BoletoModelo boletoModelo;  // Cambio el nombre de fcol a boletoModelo para mayor claridad
    private Boleto vista;  // La vista que contiene los componentes de la interfaz gráfica

    public ControladorBoleto(BoletoModelo boletoModelo, Boleto vista) {
        this.boletoModelo = boletoModelo;
        this.vista = vista;

        // Asociamos el evento de "AGREGAR" al controlador
        this.vista.AGREGARRR.addActionListener(this);
    }
    
    public void iniciar() {
        vista.setTitle("REGISTRO DE BOLETO");  // Título de la ventana
        vista.setLocationRelativeTo(null);  // Centra la ventana
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.AGREGARRR) {  // Si el usuario hace clic en AGREGAR

            try {
                // Asignamos los valores desde los campos de la vista al objeto BoletoModelo
                boletoModelo.setIdCliente(Integer.parseInt(vista.jTextCedula.getText()));    // ID Cliente
                boletoModelo.setIdVuelo(Integer.parseInt(vista.jLabel4IDVUELO1.getText()));        // ID Vuelo
                boletoModelo.setIdReserva(Integer.parseInt(vista.jLabel4IReserva.getText()));    // ID Reserva
                boletoModelo.setSilla(Integer.parseInt(vista.jTextFieldSILLA.getText()));            // Número de Silla
                boletoModelo.setOrigen(vista.jTextFieldORIGEN1.getText());                           // Origen del vuelo
                boletoModelo.setDestino(vista.jTextFieldDestino.getText());                         // Destino del vuelo
                boletoModelo.setFecha(vista.jTextFieldFECHA.getText());      // Fecha del vuelo
                boletoModelo.setHora(vista.jTextFieldHORA.getText());                               // Hora del vuelo
                boletoModelo.setNroVuelo(vista.jTextFieldNUMVUELO.getText());                       // Número de Vuelo
                boletoModelo.setCategoria(vista.jTextFieldCategoria.getText());                    // Categoría

                // Llamamos al método agregarBoleto en el modelo BoletoModelo
                if (boletoModelo.agregarBoleto(boletoModelo)) {
                    JOptionPane.showMessageDialog(null, "REGISTRO GUARDADO");
                    limpiar();  // Limpiamos los campos de la vista
                } else {
                    JOptionPane.showMessageDialog(null, "ERROR AL GUARDAR");
                    limpiar();  // Limpiamos los campos en caso de error
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese valores válidos.");
            }

        }  
    }

    public void limpiar() {
        // Limpiamos los campos de texto en la vista
      
    } 
}
