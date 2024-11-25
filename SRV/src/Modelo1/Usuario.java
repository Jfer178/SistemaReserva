/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo1;

import Controladores.conexionbasededatos;
import static Controladores.conexionbasededatos.conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Usuario {

    private int IdUsuario;
    private String Nombre;
    private String Correo;
    private String Sexo;
    private String Telefono;
    private String Contraseña;
    private int Edad;

    // Constructor
    public Usuario(int idUsuario, String nombre, String correo, String sexo, String telefono, String contraseña, int edad) {
        this.IdUsuario = idUsuario;
        this.Nombre = nombre;
        this.Correo = correo;
        this.Sexo = sexo;
        this.Telefono = telefono;
        this.Contraseña = contraseña;
        this.Edad = edad;
    }
    
    public Usuario(){
        
    }

    // Métodos de acceso
    public int getIdUsuario() {
        return IdUsuario;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getCorreo() {
        return Correo;
    }

    public String getSexo() {
        return Sexo;
    }

    public String getTelefono() {
        return Telefono;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public int getEdad() {
        return Edad;
    }

    public void setIdUsuario(int IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public void setConstraseña(String Constraseña) {
        this.Contraseña = Constraseña;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public static boolean validarCredenciales(int IDCLIENTE, String CONTRASEÑA) {
        String sql = "SELECT `IDCLIENTE`, `CONTRASEÑA` FROM `clientes` WHERE `IDCLIENTE` = ? AND `CONTRASEÑA` = ?";
        try (Connection con = conexionbasededatos.conectar(); PreparedStatement stmt = con.prepareStatement(sql)) {

            stmt.setInt(1, IDCLIENTE);
            stmt.setString(2, CONTRASEÑA);

            ResultSet rs = stmt.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean insertarUsuario(int IDCLIENTE, String NOMBRE, String CONTRASEÑA, String SEXO, int TELEFONO, String CORREO, int EDAD) {
        String query = "INSERT INTO `clientes`(`IDCLIENTE`, `NOMBRE`, `CONTRASEÑA`, `SEXO`, `TELEFONO`, `CORREO`, `EDAD`) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection con = conectar(); PreparedStatement pst = con.prepareStatement(query)) {
            pst.setInt(1, IDCLIENTE);       // Cambiado a setInt para IDCLIENTE
            pst.setString(2, NOMBRE);       // Ahora usa el argumento NOMBRE
            pst.setString(3, CONTRASEÑA);   // Ahora usa el argumento CONTRASEÑA
            pst.setString(4, SEXO);         // Añadido el argumento SEXO
            pst.setInt(5, TELEFONO);        // Cambiado a setInt para TELEFONO
            pst.setString(6, CORREO);       // Ahora usa el argumento CORREO
            pst.setInt(7, EDAD);            // Ahora usa el argumento EDAD

            pst.executeUpdate();
            System.out.println("Usuario insertado exitosamente");

            return true; // Indica que la inserción fue exitosa
        } catch (SQLException e) {
            System.out.println("Error al insertar usuario: " + e.getMessage());
            return false; // Indica que ocurrió un error
        }
    }

    // Método para agregar un usuario
    public boolean agregarUsuario() {
        PreparedStatement pst = null;
        Connection con = conectar(); // Asumimos que conectar() es un método que establece la conexión con la base de datos

        String sql = "INSERT INTO clientes (IDCLIENTE, NOMBRE, CONTRASEÑA, SEXO, TELEFONO, CORREO, EDAD) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, getIdUsuario());
            pst.setString(2, getNombre());
            pst.setString(3, getContraseña());
            pst.setString(4, getSexo());
            pst.setString(5, getTelefono());
            pst.setString(6, getCorreo());
            pst.setInt(7, getEdad());
            pst.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.err.println("Error al agregar usuario: " + e);
            return false;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    // Método para editar un usuario
    public boolean editarUsuario() {
        PreparedStatement pst = null;
        Connection con = conectar();

        String sql = "UPDATE clientes SET NOMBRE = ?, CONTRASEÑA = ?, SEXO = ?, TELEFONO = ?, CORREO = ?, EDAD = ? WHERE IDCLIENTE = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, getNombre());
            pst.setString(2, getContraseña());
            pst.setString(3, getSexo());
            pst.setString(4, getTelefono());
            pst.setString(5, getCorreo());
            pst.setInt(6, getEdad());
            pst.setInt(7, getIdUsuario());
            pst.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.err.println("Error al editar usuario: " + e);
            return false;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    // Método para eliminar un usuario
    public boolean eliminarUsuario() {
        PreparedStatement pst = null;
        Connection con = conectar();

        String sql = "DELETE FROM clientes WHERE IDCLIENTE = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, getIdUsuario());
            pst.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.err.println("Error al eliminar usuario: " + e);
            return false;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    // Método para buscar un usuario por su ID
    public boolean buscarUsuario() {
        PreparedStatement pst = null;
        ResultSet rs = null;
        Connection con = conectar();

        String sql = "SELECT * FROM clientes WHERE IDCLIENTE = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, getIdUsuario());
            rs = pst.executeQuery();

            if (rs.next()) {
                // Asignar valores a los atributos de la clase Usuario
                setNombre(rs.getString("NOMBRE"));
                setConstraseña(rs.getString("CONTRASEÑA"));
                setSexo(rs.getString("SEXO"));
                setTelefono(rs.getString("TELEFONO"));
                setCorreo(rs.getString("CORREO"));
                setEdad(rs.getInt("EDAD"));
                return true;
            }
            return false;
        } catch (SQLException e) {
            System.err.println("Error al buscar usuario: " + e);
            return false;
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    // Método para verificar si el ID de cliente ya está registrado
    public boolean idClienteRegistrado(String idCliente) {
        PreparedStatement pst = null;
        ResultSet rs = null;
        Connection con = conectar();

        String sql = "SELECT COUNT(*) FROM clientes WHERE IDCLIENTE = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, idCliente);
            rs = pst.executeQuery();

            if (rs.next()) {
                return rs.getInt(1) > 0; // Si el conteo es mayor que 0, el ID ya existe
            }
        } catch (SQLException e) {
            System.err.println("Error al verificar ID: " + e);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
        return false; // Por defecto, si ocurre un error, asumimos que no está registrado
    }

}
