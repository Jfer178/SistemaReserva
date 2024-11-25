/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo1;

import java.sql.Date;
import static Controladores.conexionbasededatos.conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Reserva {
    
    private int IdReserva;
    private int IdVuelo;
    private int IdCliente;
    private int IdAdministrador;
    private int Silla;
    private int Precio;
    private String Origen;
    private String Destino; 
    private Date Fecha;
    private String Hora;
    private String Nro_Vuelo;
    private String Categoria;  // Añadimos la categoría
    private String Estado;

    public Reserva(int IdReserva, int IdVuelo, int IdCliente, int IdAdministrador, int Silla, int Precio, String Origen, String Destino, Date Fecha, String Hora, String Nro_Vuelo, String Categoria, String Estado) {
        this.IdReserva = IdReserva;
        this.IdVuelo = IdVuelo;
        this.IdCliente = IdCliente;
        this.IdAdministrador = IdAdministrador;
        this.Silla = Silla;
        this.Precio = Precio;
        this.Origen = Origen;
        this.Destino = Destino;
        this.Fecha = Fecha;
        this.Hora = Hora;
        this.Nro_Vuelo = Nro_Vuelo;
        this.Categoria = Categoria;
        this.Estado = Estado;
    }

    
    public Reserva(){
        
    }

    public int getIdReserva() {
        return IdReserva;
    }

    public void setIdReserva(int IdReserva) {
        this.IdReserva = IdReserva;
    }

    public int getIdVuelo() {
        return IdVuelo;
    }

    public void setIdVuelo(int IdVuelo) {
        this.IdVuelo = IdVuelo;
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }

    public int getIdAdministrador() {
        return IdAdministrador;
    }

    public void setIdAdministrador(int IdAdministrador) {
        this.IdAdministrador = IdAdministrador;
    }

    public int getSilla() {
        return Silla;
    }

    public void setSilla(int Silla) {
        this.Silla = Silla;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public String getOrigen() {
        return Origen;
    }

    public void setOrigen(String Origen) {
        this.Origen = Origen;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public String getNro_Vuelo() {
        return Nro_Vuelo;
    }

    public void setNro_Vuelo(String Nro_Vuelo) {
        this.Nro_Vuelo = Nro_Vuelo;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
    

    // Método para agregar reserva con la categoría
    public boolean agregarReserva(Reserva reserva) {
    // Verificar si ya existe una reserva con el ID registrado
    if (idReservaRegistrada(reserva.getIdReserva())) {
        System.err.println("ID Reserva ya registrada");
        return false;
    }

    PreparedStatement pst = null;
    Connection con = conectar();  // Conexión a la base de datos

    // Nueva consulta SQL para insertar una reserva
    String sql = "INSERT INTO `reserva`(`IDRESERVA`, `IDVUELO`, `IDCLIENTE`, `IDADMINISTRADOR`, `SILLA`, `PRECIO`, `CATEGORIA`, `FECHA`, `HORA`, `NRO_VUELO`, `DESTINO`, `ORIGEN`, `ESTADO`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";

    try {
        // Preparamos la consulta SQL para insertar la reserva
        pst = con.prepareStatement(sql);
        pst.setInt(1, reserva.getIdReserva());  // ID de la reserva
        pst.setInt(2, reserva.getIdVuelo());    // ID del vuelo
        pst.setInt(3, reserva.getIdCliente());  // ID del cliente
        pst.setInt(4, reserva.getIdAdministrador());  // ID del administrador
        pst.setInt(5, reserva.getSilla());   // Número de silla asignada
        pst.setInt(6, reserva.getPrecio());     // Precio de la reserva
        pst.setString(7, reserva.getCategoria());  // Categoría de la reserva
        pst.setDate(8, reserva.getFecha());     // Fecha de la reserva
        pst.setString(9, reserva.getHora());   // Hora de la reserva
        pst.setString(10, reserva.getNro_Vuelo()); // Número de vuelo (NRO_VUELO)
        pst.setString(11, reserva.getDestino()); // Destino
        pst.setString(12, reserva.getOrigen());  // Origen
        pst.setString(13, reserva.getEstado()); // Estado de la reserva

        // Ejecutamos la actualización en la base de datos
        pst.executeUpdate();
        return true;  // Reserva agregada correctamente
    } catch (SQLException e) {
        System.err.print(e);
        return false;  // Error al agregar la reserva
    } finally {
        try {
            con.close();  // Cerramos la conexión a la base de datos
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
}

    // Verificar si ya existe una reserva con el ID
    private boolean idReservaRegistrada(int idReserva) {
        String sql = "SELECT 1 FROM reserva WHERE IDRESERVA = ?";
        try (Connection con = conectar(); PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setInt(1, idReserva);
            try (ResultSet rs = pst.executeQuery()) {
                return rs.next(); // Si encuentra un resultado, significa que ya está registrada
            }
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }
    }
}
