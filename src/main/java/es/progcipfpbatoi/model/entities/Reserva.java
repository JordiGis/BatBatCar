package es.progcipfpbatoi.model.entities;

public class Reserva {
    private int codigo;
    private Usuario usuario;
    private int plazas;


    public Reserva(int codigo, Usuario usuario, int plazas) {
        this.codigo = codigo;
        this.usuario = usuario;
        this.plazas = plazas;
    }

}
