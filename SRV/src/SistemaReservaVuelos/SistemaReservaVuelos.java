
package SistemaReservaVuelos;

import Controladores.ControladorAvion;
import Controladores.ControldelLogin;
import Modelo1.Avion;
import Vista.Login; // Asegúrate de que esta importación sea correcta
import Vista.RegistroAvion;
import javax.swing.SwingUtilities;

public class SistemaReservaVuelos {
    
    public static void main(String[] args) {
        
        Avion Fcol = new Avion();
        RegistroAvion Vista = new RegistroAvion();
        
        
        ControladorAvion CtrolAvion = new ControladorAvion(Fcol,Vista);
        CtrolAvion.iniciar();
        
        
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Crear y mostrar la ventana de Login
                Login loginFrame = new Login(); // Instancia de Login
                loginFrame.setDefaultCloseOperation(Login.EXIT_ON_CLOSE); // Cerrar la aplicación al cerrar el JFrame
                
                // Crear instancia del controlador, pasando la ventana de login
                ControldelLogin Ctrol = new ControldelLogin(loginFrame);
                
                // Hacer visible el JFrame
                loginFrame.setVisible(true);
            }
        });
        System.out.print(" ESTAS ADENTRO DEL SISTEMA");
    }
}