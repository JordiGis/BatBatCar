package es.progcipfpbatoi.model.entities;
/*
 * Clase que representa a un viaje estándar
*/

import es.progcipfpbatoi.model.entities.Usuario;

public class Viaje {
    
    private int codigo;
    private Usuario propietario;
    private String ruta;
    private int duracion;
    private int plazasTotales;
    private int plazasOfertadas = 0;
    private double precio;
    private boolean cerrado;
    private boolean cancelado;
    private Reserva[] reservas;

    public Viaje() {
        this.codigo = 0;
    }

    public Viaje(int codigo, Usuario propietario, String ruta, int duracion, int plazasTotales, double precio) {
        this.codigo = codigo;
        this.propietario = propietario;
        this.ruta = ruta;
        this.duracion = duracion;
        this.plazasTotales = plazasTotales;
        this.precio = precio;
        this.cerrado = false;
        this.cancelado = false;
    }

    /* dar de alta viaje */

    public void altaViaje(Usuario propietario, String ruta, int duracion, int plazasTotales, double precio) {
        this.propietario = propietario;
        this.ruta = ruta;
        this.duracion = duracion;
        this.plazasTotales = plazasTotales;
        this.precio = precio;
    }

}


