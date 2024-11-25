package Controladores;

import Vista.Login;
import Modelo1.Usuario;
import Modelo1.Administrador;
import Modelo1.Reserva;
import Vista.PantAdminitrador;
import Vista.PantUsuario;
import javax.swing.JOptionPane;
import Vista.PantaReservaCliente;

public class ControldelLogin {

    private Login loginView;
    public static int LogiadoReser; // Almacena el ID del usuario logueado

    public ControldelLogin(Login loginView) {
        this.loginView = loginView;
    }

    public int getLogiadoReser() {
        return LogiadoReser;
    }

    public void setLogiadoReser(int LogiadoReser) {
        this.LogiadoReser = LogiadoReser;
    }

    public void autenticarYAbrir() {
        try {
            int identificacion = Integer.parseInt(loginView.getUsuario());
            String contraseña = loginView.getContraseña();

            // Validar credenciales y abrir la pantalla correspondiente
            if (Usuario.validarCredenciales(identificacion, contraseña)) {
                JOptionPane.showMessageDialog(loginView, "Credenciales de usuario válidas.");
                PantUsuario usuarioPantalla = new PantUsuario(); // Pasamos el controlador al crear la pantalla
                usuarioPantalla.setVisible(true);
                loginView.dispose(); // Cierra la ventana de login
                LogiadoReser = identificacion;
                System.out.println("LOGIN: " + LogiadoReser);

                Reserva reserva = new Reserva();
                PantaReservaCliente vistaReserva = new PantaReservaCliente(LogiadoReser); // Asumiendo que esta es la vista para la reserva
                ControladorReserva controladorReserva = new ControladorReserva(reserva, vistaReserva, LogiadoReser);
                controladorReserva.iniciar();

            } else if (Administrador.validarCredencialesAdmin(identificacion, contraseña)) {
                JOptionPane.showMessageDialog(loginView, "Credenciales de administrador válidas.");
                PantAdminitrador adminPantalla = new PantAdminitrador();
                adminPantalla.setVisible(true);
                loginView.dispose();
            } else {
                JOptionPane.showMessageDialog(loginView, "Las credenciales no son correctas.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(loginView, "La identificación debe ser un número.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(loginView, "Se produjo un error inesperado: " + e.getMessage());
        }
    }

}
