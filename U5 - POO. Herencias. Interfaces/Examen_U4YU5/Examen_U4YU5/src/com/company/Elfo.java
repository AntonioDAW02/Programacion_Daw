package com.company;

public class Elfo extends Personaje implements Atacar{
    private TipoElfo tipo;

    public Elfo(String nombre, boolean encantados, TipoElfo tipo) {
        super(nombre, encantados);
        this.tipo = tipo;
    }

    public TipoElfo getTipo() {
        return tipo;
    }

    public void setTipo(TipoElfo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + " tipo = " + tipo ;
    }

    @Override
    public String atacarPersonaje(Personaje[] personaje) {
        return "Elfo - JUIIIIIIIIII";
    }
}
