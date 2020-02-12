package com.company;

public class Mago extends Hombre  implements Magia{
    private double longBarba;

    public Mago(String nombre, boolean encantados, double longBarba) {
        super(nombre, encantados);
        this.longBarba = longBarba;
    }

    public double getLongBarba() {
        return longBarba;
    }

    public void setLongBarba(double longBarba) {
        this.longBarba = longBarba;
    }

    @Override
    public String toString() {
        return super.toString()+ " longitud de la barba = " + longBarba;
    }

    @Override
    public boolean encantar(Personaje[] personaje) {
        return false;
    }

    @Override
    public boolean desencantar(Personaje[] personaje) {
        return false;
    }
}
