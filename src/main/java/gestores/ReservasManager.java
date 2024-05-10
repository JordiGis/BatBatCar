package gestores;

import java.util.HashSet;

import entidades.Reserva;

/**
 * @author Jordi Gisbert Ferriz
 */
public class ReservasManager {

    private HashSet<Reserva> reservas;

    public ReservasManager() {
        reservas = new HashSet<>();
        init();
    }
    
    
    public boolean add(Reserva reserva){
        return reservas.add(reserva);
    }
    
    public boolean remove(Reserva reserva){
        return reservas.remove(reserva);
    }
    
    public void init() {

    }

}
