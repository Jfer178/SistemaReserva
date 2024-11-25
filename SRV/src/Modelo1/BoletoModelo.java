/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo1;

import static Controladores.conexionbasededatos.conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.SQLException;

import java.sql.Date;
import java.time.LocalDate;

public class BoletoModelo {

    private int idBoleto;
    private int idCliente;
    private int idVuelo;
    private int idReserva;
    private int silla;
    private String origen;
    private String destino;
    private String fecha;
    private String Categoria;
    private String hora;
    private String nroVuelo;  // Nro de vuelo (Nuevo campo)

    // Constructor
    public BoletoModelo(int idBoleto, int idCliente, int idVuelo, int idReserva, int silla, String origen, String destino, String fecha, String Categoria, String hora, String nroVuelo) {
        this.idBoleto = idBoleto;
        this.idCliente = idCliente;
        this.idVuelo = idVuelo;
        this.idReserva = idReserva;
        this.silla = silla;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.Categoria = Categoria;
        this.hora = hora;
        this.nroVuelo = nroVuelo;
    }

    public int getIdBoleto() {
        return idBoleto;
    }

    public void setIdBoleto(int idBoleto) {
        this.idBoleto = idBoleto;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdVuelo() {
        return idVuelo;
    }

    public void setIdVuelo(int idVuelo) {
        this.idVuelo = idVuelo;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public int getSilla() {
        return silla;
    }

    public void setSilla(int silla) {
        this.silla = silla;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getNroVuelo() {
        return nroVuelo;
    }

    public void setNroVuelo(String nroVuelo) {
        this.nroVuelo = nroVuelo;
    }

    public boolean agregarBoleto(BoletoModelo boleto) {
        PreparedStatement pst = null;
        Connection con = conectar();  // Conexión a la base de datos

        // Consulta SQL para insertar un boleto (sin el campo ID BOLETO)
        String sql = "INSERT INTO `boleto`(`ID CLIENTE`, `ID VUELO`, `ID RESERVA`, `SILLA`, `ORIGEN`, `DESTINO`, `FECHA`, `HORA`, `NRO_VUELO`, `CATEGORIA`) "
                + "VALUES (?,?,?,?,?,?,?,?,?)";  // Eliminamos ID BOLETO ya que es auto-incremental

        try {
            // Preparamos la consulta SQL para insertar el boleto
            pst = con.prepareStatement(sql);

            // Configuramos los valores de la consulta con los datos del objeto 'boleto'
            pst.setInt(1, boleto.getIdCliente());      // ID del cliente
            pst.setInt(2, boleto.getIdVuelo());        // ID del vuelo
            pst.setInt(3, boleto.getIdReserva());      // ID de la reserva
            pst.setInt(4, boleto.getSilla());          // Número de silla asignada
            pst.setString(5, boleto.getOrigen());      // Origen del vuelo
            pst.setString(6, boleto.getDestino());     // Destino del vuelo
            pst.setString(7, boleto.getFecha());         // Fecha del vuelo
            pst.setString(8, boleto.getHora());        // Hora del vuelo
            pst.setString(9, boleto.getNroVuelo());   // Número de vuelo
            pst.setString(10, boleto.getCategoria());  // Categoría del boleto (por ejemplo, económica, primera clase)

            // Ejecutamos la actualización en la base de datos
            pst.executeUpdate();
            return true;  // Boleto agregado correctamente
        } catch (SQLException e) {
            System.err.print(e);
            return false;  // Error al agregar el boleto
        } finally {
            try {
                con.close();  // Cerramos la conexión a la base de datos
            } catch (SQLException e) {
                System.err.println(e);
            }
        }

    }
}
