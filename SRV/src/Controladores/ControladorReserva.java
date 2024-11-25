
package Controladores;

import Modelo1.Reserva;
import Vista.PantaReservaCliente;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Controladores.ControldelLogin;

public class ControladorReserva implements ActionListener {

    private Reserva reserva;  // El modelo que contiene los datos de la reserva
    private PantaReservaCliente vista;  // La vista donde se ingresan los datos de la reserva
      private int idCliente; 

    // Constructor del controlador
    public ControladorReserva(Reserva reserva, PantaReservaCliente vista, int idCliente) {
        this.reserva = reserva;
        this.vista = vista;
        this.idCliente = idCliente;

        // Asignar los listeners de eventos a los botones
        this.vista.jButtonReserva.addActionListener(this);
    }

    // Método para iniciar el controlador
    public void iniciar() {
        vista.setTitle("Agregar Reserva Cliente");
        vista.setLocationRelativeTo(null);  // Centrar la ventana
    }

    // Método que maneja las acciones de los botones
    @Override
    public void actionPerformed(ActionEvent e) {
    System.out.println("Botón presionado");// Verificar si este mensaje aparece en la consola
    
    if (e.getSource() == vista.jButtonReserva) {
        try {
            reserva.setIdVuelo(Integer.parseInt(vista.jlabelIdvuelo.getText()));
            reserva.setIdCliente(idCliente);
            System.out.println();
            reserva.setIdAdministrador(1);

            // Obtener el siguiente asiento disponible
            String idVuelo = vista.jlabelIdvuelo.getText();
            int siguienteAsiento = obtenerSiguienteAsientoDisponible(idVuelo);

            // Verificar si se pudo obtener un asiento disponible
            if (siguienteAsiento == -1) {
                JOptionPane.showMessageDialog(null, "No hay asientos disponibles para este vuelo.", "Error", JOptionPane.ERROR_MESSAGE);
                return;  // Salir del método si no hay asientos
            }

            reserva.setSilla(siguienteAsiento);  // Asignar el asiento obtenido
            reserva.setPrecio(Integer.parseInt(vista.jTextFieldPRECIO.getText()));  // Asignar el precio
            reserva.setOrigen((String)vista.jComboBoxOrigen.getSelectedItem());  // Origen
            reserva.setDestino((String)vista.jComboBoxDestino.getSelectedItem());  // Destino
            reserva.setFecha(new java.sql.Date(vista.jDateChooserFecha.getDate().getTime()));  // Fecha
            reserva.setHora(vista.jTextFieldHORA.getText());
            reserva.setNro_Vuelo(vista.jTextFieldnumerovuelo.getText());
            reserva.setCategoria((String)vista.jComboBoxCategoria.getSelectedItem());  // Asignar la categoría
            reserva.setEstado("ACTIVA");
            

            // Llamar al método para agregar la reserva a la base de datos
            if (reserva.agregarReserva(reserva)) {
                // Si la reserva fue agregada con éxito
                JOptionPane.showMessageDialog(null, "Reserva Guardada Correctamente");
                limpiarCampos();  // Limpiar los campos de la vista
            } else {
                // Si hubo un error al guardar
                JOptionPane.showMessageDialog(null, "Error al guardar la reserva");
            }

        } catch (NumberFormatException ex) {
            // Si hay un error con los valores numéricos, mostrar un mensaje
            JOptionPane.showMessageDialog(null, "Por favor, ingrese valores válidos.");
        }
    }
}

    // Método que consulta la base de datos para obtener el siguiente asiento disponible
    private int obtenerSiguienteAsientoDisponible(String idVuelo) {
        int siguienteAsiento = -1;  // Valor predeterminado para cuando no haya asientos disponibles
        try (Connection con = new conexionbasededatos().conectar()) {
            // Consulta para obtener los asientos disponibles del vuelo
            String sql = "SELECT `ASIENTO_DISPONIBLES` FROM `vuelos` WHERE `IDVUELOS` = ?";
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setString(1, idVuelo);

                try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) {
                        int asientosDisponibles = rs.getInt("ASIENTO_DISPONIBLES");
                        if (asientosDisponibles > 0) {
                            siguienteAsiento = asientosDisponibles;
                            // Reducir los asientos disponibles en la base de datos
                            String updateSQL = "UPDATE `vuelos` SET `ASIENTO_DISPONIBLES` = ? WHERE `IDVUELOS` = ?";
                            try (PreparedStatement updatePs = con.prepareStatement(updateSQL)) {
                                updatePs.setInt(1, asientosDisponibles - 1);
                                updatePs.setString(2, idVuelo);
                                updatePs.executeUpdate();
                            }
                        }
                    }
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al consultar y actualizar los asientos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return siguienteAsiento;
    }

    // Método para limpiar los campos de la vista
    private void limpiarCampos() {
        vista.jTextFieldILLA.setText(null);
        vista.jTextFieldPRECIO.setText(null);
        vista.jComboBoxDestino.setSelectedIndex(0);
        vista.jComboBoxOrigen.setSelectedIndex(0);
        vista.jDateChooserFecha.setDate(null);
        vista.jTextFieldHORA.setText(null);
        vista.jComboBoxCategoria.setSelectedIndex(0);
    }
}