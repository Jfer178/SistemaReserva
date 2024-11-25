
package Modelo1;

import java.sql.Time;
import java.sql.Date;

public class Factura {
    
    private int IdFactura;
    private int IdUsuario;
    private int IdVuelo;
    private int IdAdministrador;
    private int total_Neto;
    private String Origen;
    private String Destino; 
    private Date Fecha;
    private Time Hora;
    private int Tickects_Vendidos;

    public Factura(int IdFactura, int IdUsuario, int IdVuelo, int IdAdministrador, int total_Neto, String Origen, String Destino, Date Fecha, Time Hora, int Tickects_Vendidos) {
        this.IdFactura = IdFactura;
        this.IdUsuario = IdUsuario;
        this.IdVuelo = IdVuelo;
        this.IdAdministrador = IdAdministrador;
        this.total_Neto = total_Neto;
        this.Origen = Origen;
        this.Destino = Destino;
        this.Fecha = Fecha;
        this.Hora = Hora;
        this.Tickects_Vendidos = Tickects_Vendidos;
    }

    public int getIdFactura() {
        return IdFactura;
    }

    public void setIdFactura(int IdFactura) {
        this.IdFactura = IdFactura;
    }

    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    public int getIdVuelo() {
        return IdVuelo;
    }

    public void setIdVuelo(int IdVuelo) {
        this.IdVuelo = IdVuelo;
    }

    public int getIdAdministrador() {
        return IdAdministrador;
    }

    public void setIdAdministrador(int IdAdministrador) {
        this.IdAdministrador = IdAdministrador;
    }

    public int getTotal_Neto() {
        return total_Neto;
    }

    public void setTotal_Neto(int total_Neto) {
        this.total_Neto = total_Neto;
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

    public Time getHora() {
        return Hora;
    }

    public void setHora(Time Hora) {
        this.Hora = Hora;
    }

    public int getTickects_Vendidos() {
        return Tickects_Vendidos;
    }

    public void setTickects_Vendidos(int Tickects_Vendidos) {
        this.Tickects_Vendidos = Tickects_Vendidos;
    }

    
    
    
}
