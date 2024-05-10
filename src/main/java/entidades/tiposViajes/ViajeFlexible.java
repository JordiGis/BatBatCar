package entidades.tiposViajes;

import entidades.Reserva;
import entidades.Viaje;

/**
 * @author Jordi Gisbert Ferriz
 */
public class ViajeFlexible extends Viaje{
    
    public void cancelar(){
        super.setCancelado(true);
    }
    
    @Override
    public void cambiarPlazasReserva(Reserva reserva, int plazas) {
        super.cambiarPlazasReserva(reserva, plazas);
    }
    
    public void cambiarPrecio(double precio){
        super.setPrecio(precio);
    }
}
