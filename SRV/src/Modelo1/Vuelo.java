package Modelo1;

import Controladores.conexionbasededatos;
import static Controladores.conexionbasededatos.conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.Date;

public class Vuelo {

    // Atributos de la clase
    private int IDVUELO;
    private int IDEMPLEADOS;
    private int IDAVION;
    private String NRO_VUELO;
    private String ORIGEN;
    private String DESTINO;
    private Date FECHA;
    private String HORA;
    private int ASIENTO_DISPONIBLES;
    private int IDADMINISTRADOR;

    public Vuelo(int IDVUELO, int IDEMPLEADOS, int IDAVION, String NRO_VUELO, String ORIGEN, String DESTINO, Date FECHA, String HORA, int ASIENTO_DISPONIBLES, int IDADMINISTRADOR) {
        this.IDVUELO = IDVUELO;
        this.IDEMPLEADOS = IDEMPLEADOS;
        this.IDAVION = IDAVION;
        this.NRO_VUELO = NRO_VUELO;
        this.ORIGEN = ORIGEN;
        this.DESTINO = DESTINO;
        this.FECHA = FECHA;
        this.HORA = HORA;
        this.ASIENTO_DISPONIBLES = ASIENTO_DISPONIBLES;
        this.IDADMINISTRADOR = IDADMINISTRADOR;
    }

    public Vuelo() {

    }

    public int getIDVUELO() {
        return IDVUELO;
    }

    public void setIDVUELO(int IDVUELO) {
        this.IDVUELO = IDVUELO;
    }

    public int getIDEMPLEADOS() {
        return IDEMPLEADOS;
    }

    public void setIDEMPLEADOS(int IDEMPLEADOS) {
        this.IDEMPLEADOS = IDEMPLEADOS;
    }

    public int getIDAVION() {
        return IDAVION;
    }

    public void setIDAVION(int IDAVION) {
        this.IDAVION = IDAVION;
    }

    public String getNRO_VUELO() {
        return NRO_VUELO;
    }

    public void setNRO_VUELO(String NRO_VUELO) {
        this.NRO_VUELO = NRO_VUELO;
    }

    public String getORIGEN() {
        return ORIGEN;
    }

    public void setORIGEN(String ORIGEN) {
        this.ORIGEN = ORIGEN;
    }

    public String getDESTINO() {
        return DESTINO;
    }

    public void setDESTINO(String DESTINO) {
        this.DESTINO = DESTINO;
    }

    public Date getFECHA() {
        return FECHA;
    }

    public void setFECHA(Date FECHA) {
        this.FECHA = FECHA;
    }

    public String getHORA() {
        return HORA;
    }

    public void setHORA(String HORA) {
        this.HORA = HORA;
    }

    public int getASIENTO_DISPONIBLES() {
        return ASIENTO_DISPONIBLES;
    }

    public void setASIENTO_DISPONIBLES(int ASIENTO_DISPONIBLES) {
        this.ASIENTO_DISPONIBLES = ASIENTO_DISPONIBLES;
    }

    public int getIDADMINISTRADOR() {
        return IDADMINISTRADOR;
    }

    public void setIDADMINISTRADOR(int IDADMINISTRADOR) {
        this.IDADMINISTRADOR = IDADMINISTRADOR;
    }

  
    // Método para agregar un vuelo a la base de datos
    public boolean agregarVuelo(Vuelo vuelo) {
        // Verificar si ya existe el vuelo con el ID registrado
        if (idVueloRegistrado(vuelo.getIDVUELO())) {
            System.err.println("ID VUELO YA REGISTRADO");
            return false;
        }

        PreparedStatement pst = null;
        Connection con = conectar();  // Conexión a la base de datos

        String sql = "INSERT INTO vuelos (IDVUELOS, IDEMPLEADOS, IDAVION, NRO_VUELO, ORIGEN, DESTINO, FECHA, HORA, ASIENTO_DISPONIBLES, IDADMINISTRADOR) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            // Preparamos la consulta SQL para insertar el vuelo
            pst = con.prepareStatement(sql);
            pst.setInt(1, vuelo.getIDVUELO());
            pst.setInt(2, vuelo.getIDEMPLEADOS());
            pst.setInt(3, vuelo.getIDAVION());
            pst.setString(4, vuelo.getNRO_VUELO());
            pst.setString(5, vuelo.getORIGEN());
            pst.setString(6, vuelo.getDESTINO());
            pst.setDate(7, new java.sql.Date(vuelo.getFECHA().getTime()));  // Convertimos la fecha
            pst.setString(8, vuelo.getHORA());  // Convertimos la hora
            pst.setInt(9, vuelo.getASIENTO_DISPONIBLES());
            pst.setInt(10, vuelo.getIDADMINISTRADOR());

            // Ejecutamos la actualización en la base de datos
            pst.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.err.print(e);
            return false;
        } finally {
            try {
                con.close();  // Cerramos la conexión a la base de datos
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    public boolean editarVuelo(Vuelo vuelo) {
        PreparedStatement pst = null;
        Connection con = conectar();  // Conexión a la base de datos

        String sql = "UPDATE vuelos SET IDEMPLEADOS = ?, IDAVION = ?, NRO_VUELO = ?, ORIGEN = ?, DESTINO = ?, FECHA = ?, HORA = ?, ASIENTO_DISPONIBLES = ?, IDADMINISTRADOR = ? WHERE IDVUELOS = ?";

        try {
            // Preparamos la consulta SQL para actualizar el vuelo
            pst = con.prepareStatement(sql);
            pst.setInt(1, vuelo.getIDEMPLEADOS());
            pst.setInt(2, vuelo.getIDAVION());
            pst.setString(3, vuelo.getNRO_VUELO());
            pst.setString(4, vuelo.getORIGEN());
            pst.setString(5, vuelo.getDESTINO());
            pst.setDate(6, new java.sql.Date(vuelo.getFECHA().getTime()));  // Convertimos la fecha
            pst.setString(7, vuelo.getHORA());  // Convertimos la hora
            pst.setInt(8, vuelo.getASIENTO_DISPONIBLES());
            pst.setInt(9, vuelo.getIDADMINISTRADOR());
            pst.setInt(10, vuelo.getIDVUELO());

            // Ejecutamos la actualización en la base de datos
            pst.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.err.print(e);
            return false;
        } finally {
            try {
                con.close();  // Cerramos la conexión a la base de datos
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    // Método para eliminar un vuelo de la base de datos
    public boolean eliminarVuelo(Vuelo vuelo) {
        PreparedStatement pst = null;
        Connection con = conectar();  // Conexión a la base de datos

        String sql = "DELETE FROM vuelos WHERE IDVUELOS = ?";

        try {
            // Preparamos la consulta SQL para eliminar el vuelo
            pst = con.prepareStatement(sql);
            pst.setInt(1, vuelo.getIDVUELO());  // Establecemos el parámetro IDVUELO
            pst.executeUpdate();  // Ejecutamos la eliminación en la base de datos
            return true;
        } catch (SQLException e) {
            System.err.print(e);
            return false;
        } finally {
            try {
                con.close();  // Cerramos la conexión a la base de datos
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    public boolean buscarVuelo(Vuelo vuelo) {
        PreparedStatement pst = null;
        ResultSet rs = null;
        Connection con = conectar();  // Conexión a la base de datos

        String sql = "SELECT * FROM vuelos WHERE IDVUELOS = ?";

        try {
            // Preparamos la consulta SQL para buscar el vuelo por IDVUELO
            pst = con.prepareStatement(sql);
            pst.setInt(1, vuelo.getIDVUELO());  // Establecemos el parámetro IDVUELO
            rs = pst.executeQuery();  // Ejecutamos la consulta

            if (rs.next()) {
                // Si encontramos el vuelo, asignamos los valores al objeto 'vuelo'
                vuelo.setIDVUELO(rs.getInt("IDVUELOS"));
                vuelo.setIDEMPLEADOS(rs.getInt("IDEMPLEADOS"));
                vuelo.setIDAVION(rs.getInt("IDAVION"));
                vuelo.setNRO_VUELO(rs.getString("NRO_VUELO"));
                vuelo.setORIGEN(rs.getString("ORIGEN"));
                vuelo.setDESTINO(rs.getString("DESTINO"));
                vuelo.setFECHA(rs.getDate("FECHA"));
                vuelo.setHORA(rs.getString("HORA"));
                vuelo.setASIENTO_DISPONIBLES(rs.getInt("ASIENTO_DISPONIBLES"));
                vuelo.setIDADMINISTRADOR(rs.getInt("IDADMINISTRADOR"));
                return true;
            }
            return false;  // Si no encontramos el vuelo, retornamos false
        } catch (SQLException e) {
            System.err.print(e);
            return false;
        } finally {
            try {
                if (con != null) {
                    con.close();  // Cerramos la conexión a la base de datos
                }
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    // Método para verificar si un vuelo con el ID ya está registrado
    public boolean idVueloRegistrado(int IDVUELO) {
        PreparedStatement pst = null;
        ResultSet rs = null;
        Connection con = conectar();  // Conexión a la base de datos

        String sql = "SELECT COUNT(*) FROM vuelos WHERE IDVUELOS = ?";

        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, IDVUELO);  // Establecemos el parámetro IDVUELO
            rs = pst.executeQuery();  // Ejecutamos la consulta

            if (rs.next()) {
                int count = rs.getInt(1);  // Obtenemos el número de registros encontrados
                return count > 0;  // Si count > 0, significa que el vuelo ya está registrado
            }
            return false;  // Si no se encuentra el vuelo, retornamos false
        } catch (SQLException e) {
            System.err.print(e);
            return false;  // En caso de error, retornamos false
        } finally {
            try {
                if (con != null) {
                    con.close();  // Cerramos la conexión a la base de datos
                }
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

}
