package controladores;

import entidades.Reserva;
import gestores.ReservasManager;
import views.GestorIO;

/**
 * @author Jordi Gisbert Ferriz
 */
public class ReservasController {

    private ReservasManager gestor;

    public void anyadirViaje(Reserva reserva) {
        if (this.gestor.add(reserva)) {
            GestorIO.print("Reserva añadida con éxito");
        }else{
            GestorIO.print("Reserva no se ha podido añadir");
        }
    }
    
    
}
