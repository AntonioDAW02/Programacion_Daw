package com.company;

public class Orco extends Personaje implements Atacar{
    private int tonelaje;

    public Orco(String nombre, boolean encantados, int tonelaje) {
        super(nombre, encantados);
        this.tonelaje = tonelaje;
    }

    public int getTonelaje() {
        return tonelaje;
    }

    public void setTonelaje(int tonelaje) {
        this.tonelaje = tonelaje;
    }

    @Override
    public String toString() {
        return super.toString()+ " tonelaje = " + tonelaje;
    }

    @Override
    public String atacarPersonaje(Personaje[] personaje) {
        return "Orco - OOOOOOOOOORG";
    }
}
