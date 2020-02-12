package com.company;

public class Enano extends Personaje implements Atacar{
    private double altura;

    public Enano(String nombre, boolean encantados, double altura) {
        super(nombre, encantados);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return super.toString() + " altura = " + altura;
    }

    @Override
    public String atacarPersonaje(Personaje[] personaje) {
        return "Enano - ÑIIIIIIIIII";
    }
}
