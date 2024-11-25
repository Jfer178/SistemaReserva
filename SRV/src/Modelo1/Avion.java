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

public class Avion {

    private int IDAVION;
    private int IDADMINISTRADOR;
    private String CODIGO;
    private String TIPO;
    private String MODELO;
    private int CAPACIDAD;

    public Avion(int IDAVION, int IDADMINISTRADOR, String CODIGO, String TIPO, String MODELO, int CAPACIDAD) {
        this.IDAVION = IDAVION;
        this.IDADMINISTRADOR = IDADMINISTRADOR;
        this.CODIGO = CODIGO;
        this.TIPO = TIPO;
        this.MODELO = MODELO;
        this.CAPACIDAD = CAPACIDAD;
    }

    public Avion() {

    }

    public int getIDAVION() {
        return IDAVION;
    }

    public void setIDAVION(int IDAVION) {
        this.IDAVION = IDAVION;
    }

    public int getIDADMINISTRADOR() {
        return IDADMINISTRADOR;
    }

    public void setIDADMINISTRADOR(int IDADMINISTRADOR) {
        this.IDADMINISTRADOR = IDADMINISTRADOR;
    }

    public String getCODIGO() {
        return CODIGO;
    }

    public void setCODIGO(String CODIGO) {
        this.CODIGO = CODIGO;
    }

    public String getTIPO() {
        return TIPO;
    }

    public void setTIPO(String TIPO) {
        this.TIPO = TIPO;
    }

    public String getMODELO() {
        return MODELO;
    }

    public void setMODELO(String MODELO) {
        this.MODELO = MODELO;
    }

    public int getCAPACIDAD() {
        return CAPACIDAD;
    }

    public void setCAPACIDAD(int CAPACIDAD) {
        this.CAPACIDAD = CAPACIDAD;
    }

    // Método para agregar un avión
    public boolean agregarAvion(Avion avion) {
        
         if (idAvionRegistrado(avion.getIDAVION())) {
        System.err.println("ID AVIÓN YA REGISTRADO");
        return false; 
    }
        
        PreparedStatement pst = null;
        Connection con = conectar();
        
        String sql = "INSERT INTO `avion`(IDAVION, IDADMINISTRADOR,CODIGO, TIPO, MODELO, CAPACIDAD) VALUES (?,?,?,?,?,?)";
        try { 
            pst = con.prepareStatement(sql);
            pst.setInt(1, getIDAVION());
            pst.setInt(2, getIDADMINISTRADOR());
            pst.setString(3, getCODIGO());
            pst.setString(4, getTIPO());
            pst.setString(5, getMODELO());
            pst.setInt(6, getCAPACIDAD());
            pst.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.err.print(e);
            return false;
        }finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    // Método para editar un avión
    public boolean editarAvion(Avion avion) {
        
        PreparedStatement pst = null;
        Connection con = conectar();
        
        String sql = "UPDATE avion SET IDADMINISTRADOR = ? , CODIGO = ?, TIPO = ?, MODELO = ?, CAPACIDAD = ? WHERE IDAVION = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, getIDADMINISTRADOR());
            pst.setString(2, getCODIGO());
            pst.setString(3, getTIPO());
            pst.setString(4, getMODELO());
            pst.setInt(5, getCAPACIDAD());
            pst.setInt(6, getIDAVION());
            pst.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.err.print(e);
            return false;
        }finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    // Método para eliminar un avión
    public boolean eliminarAvion(Avion avion) {
        
        PreparedStatement pst = null;
        Connection con = conectar();
        
        String sql = "DELETE FROM avion WHERE IDAVION = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, getIDAVION());
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
    public boolean buscarAvion(Avion avion) {
        
        PreparedStatement pst = null;
        ResultSet rs = null;
        Connection con = conectar();
        
        
        
        String sql = "SELECT * FROM avion WHERE IDAVION = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, getIDAVION());
            rs = pst.executeQuery();
            
            
            if (rs.next()) {
                avion.setIDAVION(Integer.parseInt(rs.getString("IDAVION")));
                avion.setIDADMINISTRADOR(Integer.parseInt(rs.getString("IDADMINISTRADOR")));
                avion.setCODIGO(rs.getString("CODIGO"));
                avion.setTIPO(rs.getString("TIPO"));
                avion.setMODELO(rs.getString("MODELO"));
                avion.setCAPACIDAD(Integer.parseInt(rs.getString("CAPACIDAD")));
                return true;
            }
            return false;
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
    
    public boolean idAvionRegistrado(int idAvion) {
    PreparedStatement pst = null;
    ResultSet rs = null;
    Connection con = conectar();
    
    String sql = "SELECT COUNT(*) FROM avion WHERE IDAVION = ?";
    try {
        pst = con.prepareStatement(sql);
        pst.setInt(1, idAvion);
        rs = pst.executeQuery();
        
        if (rs.next()) {
            return rs.getInt(1) > 0; // Si el conteo es mayor que 0, el ID ya existe
        }
    } catch (SQLException e) {
        System.err.print(e);
    } finally {
        try {
            if (rs != null) rs.close();
            if (pst != null) pst.close();
            con.close();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
    return false; // Por defecto, si ocurre un error, asumimos que no está registrado
}

}
