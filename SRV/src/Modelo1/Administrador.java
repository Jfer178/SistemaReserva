package Modelo1;

import Controladores.conexionbasededatos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;

public class Administrador {

    private int IdAdministrador;
    private String Nombre;
    private String Sexo;
    private int Telefono;
    private String Contraseña;
    private String Email;

    public Administrador(int IdAdministrador, String Nombre, String Sexo, int Telefono, String Contraseña, String Email) {
        this.IdAdministrador = IdAdministrador;
        this.Nombre = Nombre;
        this.Sexo = Sexo;
        this.Telefono = Telefono;
        this.Contraseña = Contraseña;
        this.Email = Email;
    }

    public int getIdAdministrador() {
        return IdAdministrador;
    }

    public void setIdAdministrador(int IdAdministrador) {
        this.IdAdministrador = IdAdministrador;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public static boolean validarCredencialesAdmin(int IDADMINISTRADOR, String CONTRASEÑA) {
        String sql = "SELECT `IDADMINISTRADOR`, `CONTRASEÑA` FROM `administradores` WHERE `IDADMINISTRADOR` = ? AND `CONTRASEÑA` = ?";
        try (Connection con = conexionbasededatos.conectar(); PreparedStatement stmt = con.prepareStatement(sql)) {

            stmt.setInt(1, IDADMINISTRADOR);
            stmt.setString(2, CONTRASEÑA);

            ResultSet rs = stmt.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean administradorExiste(int idAdministrador) {
        String sql = "SELECT COUNT(*) FROM administradores WHERE IDADMINISTRADOR = ?";
        try (Connection con = conexionbasededatos.conectar(); PreparedStatement stmt = con.prepareStatement(sql)) {

            stmt.setInt(1, idAdministrador);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }


}
