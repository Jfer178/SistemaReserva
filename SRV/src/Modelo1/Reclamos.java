/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo1;

import static Controladores.conexionbasededatos.conectar;
import java.util.Date;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Reclamos {

    private int idReclamo;
    private int idCliente;
    private String descripcion;
    private Date fecha;

    public Reclamos(int idReclamo, int idCliente, String descripcion, Date fecha) {
        this.idReclamo = idReclamo;
        this.idCliente = idCliente;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public Reclamos() {

    }

    public int getIdReclamo() {
        return idReclamo;
    }

    public void setIdReclamo(int idReclamo) {
        this.idReclamo = idReclamo;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean agregarReclamo(Reclamos reclamo) {
        PreparedStatement pst = null;
        Connection con = conectar();  // Conexión a la base de datos

        // SQL de inserción en la base de datos (no necesitamos incluir IDRECLAMO)
        String sql = "INSERT INTO reclamos (IDCLIENTE, DESCRIPCION, FECHA) VALUES (?, ?, ?)";

        try {
            // Preparamos la consulta SQL para insertar el reclamo
            pst = con.prepareStatement(sql);
            pst.setInt(1, reclamo.getIdCliente());  // IDCLIENTE
            pst.setString(2, reclamo.getDescripcion());  // DESCRIPCION
            pst.setDate(3, new java.sql.Date(reclamo.getFecha().getTime()));  // FECHA (convertimos la fecha a SQL Date)

            // Ejecutamos la actualización en la base de datos
            pst.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.err.println("Error al agregar reclamo: " + e);
            return false;
        } finally {
            try {
                if (pst != null) {
                    pst.close();  // Cerramos el PreparedStatement
                }
                if (con != null) {
                    con.close();  // Cerramos la conexión a la base de datos
                }
            } catch (SQLException e) {
                System.err.println("Error al cerrar recursos: " + e);
            }
        }
    }

    // Método para verificar si el ID del reclamo ya está registrado
    private boolean idReclamoRegistrado(int idReclamo) {
        Connection con = conectar();
        String sql = "SELECT 1 FROM reclamos WHERE IDRECLAMO = ?";
        try (PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setInt(1, idReclamo);
            ResultSet rs = pst.executeQuery();
            return rs.next();  // Si existe, devuelve true
        } catch (SQLException e) {
            System.err.println("Error al verificar ID reclamo: " + e);
            return false;
        } finally {
            try {
                con.close();  // Cerramos la conexión
            } catch (SQLException e) {
                System.err.println("Error al cerrar la conexión: " + e);
            }
        }
    }

}
