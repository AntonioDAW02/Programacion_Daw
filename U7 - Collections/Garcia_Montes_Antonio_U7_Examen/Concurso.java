package com.company;

public class Concurso {
    String nombre;
    String localidad;
    Perro perro;

    public Concurso(String nombre, String localidad, Perro perro) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "Concurso{" +
                "nombre='" + nombre + '\'' +
                ", localidad='" + localidad + '\'' +
                ", perro=" + perro +
                '}';
    }


}