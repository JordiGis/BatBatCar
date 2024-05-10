package controladores;

import entidades.Usuario;
import entidades.Viaje;
import gestores.ViajesManager;
import views.GestorIO;
import views.ListadoViajesView;

import java.util.List;

public class ViajesController {

    private Usuario usuario;
    private ViajesManager gestor;

    public ViajesController() {
        this.gestor = new ViajesManager();
        
        /* Por defecto, no hay establecido ningún usuario. Se deberá establecer a posteriori
         Si no quieres realizar el caso de uso 1 hasta el final puedes establecer un usuario
         por defecto. Por ejemplo: this.usuario = new Usuario("roberto1979", "12345"); */
        this.usuario = null;
    }
    
    /**
     * Lista todos los viajes del sistema.
     */
    public void listarViajes() {
        List<Viaje> viajes = gestor.findAll();
        (new ListadoViajesView(viajes)).visualizar();
    }

    /**
     * Añade un viaje al sistema, preguntando previamente por toda la información necesaria para crearlo.
     */
    public void anyadirViaje() {
        this.gestor.add(new Viaje());
        GestorIO.print("Viaje añadido con éxito");
    }
}
