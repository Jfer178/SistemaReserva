
package Controladores;


public class ControladorHora {
    public String FormatoHora(int Hora, int Minuto){
        String hora_presentar;
        if(Hora < 10 && Minuto < 10){
            hora_presentar = "0" + Hora +":0"+Minuto;    
        }else {
            if (Hora < 10 && Minuto >10){
                hora_presentar ="0"+ Hora + ":"+ Minuto;
            }else {
                if(Hora > 10 && Minuto <10){
                    hora_presentar = Hora + ":0"+ Minuto;
                } else {
                    hora_presentar = Hora +":"+Minuto;
                }
            }
        }
        return hora_presentar;
    }
    
}
