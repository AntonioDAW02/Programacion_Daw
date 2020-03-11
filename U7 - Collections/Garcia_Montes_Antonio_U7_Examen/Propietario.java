package com.company;

public class Propietario {
    String nombre;
    String apellidos;
    int numSocio;
    String paisOrigen;

    public Propietario(String nombre, String apellidos, int numSocio, String paisOrigen) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numSocio = numSocio;
        this.paisOrigen = paisOrigen;
    }

    @Override
    public String toString() {
        return "Propietarios: " +
                "nombre = '" + nombre + '\'' +
                ", apellidos = '" + apellidos + '\'' +
                ", numSocio = " + numSocio +
                ", paisOrigen = '" + paisOrigen + '\'';
    }
}
