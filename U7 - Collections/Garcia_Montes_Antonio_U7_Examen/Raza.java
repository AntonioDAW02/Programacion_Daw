package com.company;

public class Raza {
    String nombre;

    public Raza(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Raza: " +
                "nombre = '" + nombre + '\'';
    }
}
