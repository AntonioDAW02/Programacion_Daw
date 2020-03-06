package com.company;

public class Guerrero extends Hombre implements Atacar{
    private int edad;

    public Guerrero(String nombre, boolean encantados, int edad) {
        super(nombre, encantados);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return super.toString() + " edad = " + edad;
    }

    @Override
    public String atacarPersonaje(Personaje[] personaje) {
        return "Guerrero - AAAAAAAAAARG";
    }
}
