
package conexionbasedatos;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;


public class CConexion {
    
    Connection conectar = null;
    
    String bd = "sistemareservadevuelos";
    String user = "root12";
    String password = "";
    String puerto = "3306";
    String ip = "localhost";
    
    String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    Connection cx;

    public Connection establecerconexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection(cadena,user,password);
            JOptionPane.showMessageDialog(null,"SE CONECETO A LA BASE DATOS");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"NO SE CONECETO A LA BASE DATOS" + e.toString());
        }
        return conectar;
    }

   
}
