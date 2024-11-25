/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo1;

import static Controladores.conexionbasededatos.conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Empleado {

    private int IDEMPLEADO;
    private int IDADMINISTRADOR;
    private String NOMBRE;
    private int HORAS_VUELO;
    private String PROFESION;
    private String SEXO;
    private int SALARIO;

    public Empleado(int IDEMPLEADO, int IDADMINISTRADOR, String NOMBRE, int HORAS_VUELO, String PROFESION, String SEXO, int SALARIO) {
        this.IDEMPLEADO = IDEMPLEADO;
        this.IDADMINISTRADOR = IDADMINISTRADOR;
        this.NOMBRE = NOMBRE;
        this.HORAS_VUELO = HORAS_VUELO;
        this.PROFESION = PROFESION;
        this.SEXO = SEXO;
        this.SALARIO = SALARIO;
    }

    public Empleado() {

    }

    public int getIDEMPLEADO() {
        return IDEMPLEADO;
    }

    public void setIDEMPLEADO(int IDEMPLEADO) {
        this.IDEMPLEADO = IDEMPLEADO;
    }

    public int getIDADMINISTRADOR() {
        return IDADMINISTRADOR;
    }

    public void setIDADMINISTRADOR(int IDADMINISTRADOR) {
        this.IDADMINISTRADOR = IDADMINISTRADOR;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public int getHORAS_VUELO() {
        return HORAS_VUELO;
    }

    public void setHORAS_VUELO(int HORAS_VUELO) {
        this.HORAS_VUELO = HORAS_VUELO;
    }

    public String getPROFESION() {
        return PROFESION;
    }

    public void setPROFESION(String PROFESION) {
        this.PROFESION = PROFESION;
    }

    public String getSEXO() {
        return SEXO;
    }

    public void setSEXO(String SEXO) {
        this.SEXO = SEXO;
    }

    public int getSALARIO() {
        return SALARIO;
    }

    public void setSALARIO(int SALARIO) {
        this.SALARIO = SALARIO;
    }

    // Método para agregar un avión
    public boolean agregarEmpleado(Empleado empleado) {

        PreparedStatement pst = null;
        Connection con = conectar();  // Asegúrate de tener el método `conectar()` para obtener la conexión

        // Consulta SQL con los nombres de columnas correctos
        String sql = "INSERT INTO `empleados`(`IDEMPLEADOS`, `NOMBRE`, `HORAS_VUELO`, `SALARIO`, `SEXO`, `PROFESION`, `IDADMINISTRADOR`) VALUES (?,?,?,?,?,?,?)";

        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, empleado.getIDEMPLEADO());
            pst.setString(2, empleado.getNOMBRE());
            pst.setInt(3, empleado.getHORAS_VUELO());
            pst.setInt(4, empleado.getSALARIO());
            pst.setString(5, empleado.getSEXO());
            pst.setString(6, empleado.getPROFESION());
            pst.setInt(7, empleado.getIDADMINISTRADOR());

            pst.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.err.print(e);
            return false;
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    // Método para editar un avión
    public boolean editarEmpleado(Empleado empleado) {

        PreparedStatement pst = null;
        Connection con = conectar();  // Asegúrate de tener el método `conectar()`

        // Consulta SQL para editar los datos de un empleado
        String sql = "UPDATE `empleados` SET `NOMBRE`= ?, `HORAS_VUELO`= ?, `SALARIO`= ?, `SEXO`= ?, `PROFESION`= ?, `IDADMINISTRADOR`= ? WHERE `IDEMPLEADOS`= ?";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, empleado.getNOMBRE());
            pst.setInt(2, empleado.getHORAS_VUELO());
            pst.setInt(3, empleado.getSALARIO());
            pst.setString(4, empleado.getSEXO());
            pst.setString(5, empleado.getPROFESION());
            pst.setInt(6, empleado.getIDADMINISTRADOR());
            pst.setInt(7, empleado.getIDEMPLEADO());

            pst.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.err.print(e);
            return false;
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    // Método para eliminar un avión
    public boolean eliminarEmpleado(Empleado empleado) {

        PreparedStatement pst = null;
        Connection con = conectar();

        // Consulta SQL para eliminar un empleado
        String sql = "DELETE FROM `empleados` WHERE `IDEMPLEADOS`= ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, getIDEMPLEADO());
            pst.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.err.print(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    // Método para buscar un avión
    public boolean buscarEmpleado(Empleado empleado) {

        PreparedStatement pst = null;
        ResultSet rs = null;
        Connection con = conectar();  // Asegúrate de tener el método `conectar()`

        // Consulta SQL para buscar un empleado por su ID
        String sql = "SELECT * FROM `empleados` WHERE `IDEMPLEADOS`= ?";

        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, empleado.getIDEMPLEADO());
            rs = pst.executeQuery();

            if (rs.next()) {
                empleado.setIDEMPLEADO(rs.getInt("IDEMPLEADOS"));
                empleado.setNOMBRE(rs.getString("NOMBRE"));
                empleado.setHORAS_VUELO(rs.getInt("HORAS_VUELO"));
                empleado.setSALARIO(rs.getInt("SALARIO"));
                empleado.setSEXO(rs.getString("SEXO"));
                empleado.setPROFESION(rs.getString("PROFESION"));
                empleado.setIDADMINISTRADOR(rs.getInt("IDADMINISTRADOR"));
                return true;
            }
            return false;
        } catch (SQLException e) {
            System.err.print(e);
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
}
