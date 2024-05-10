package entidades.tiposViajes;

import entidades.Viaje;
/**
 * @author Jordi Gisbert Ferriz
 */
public class ViajeCancelable extends Viaje{
    
    @Override
    public void cancelarReserva(int codigo){
        super.cancelarReserva(codigo);
    }
    
}
