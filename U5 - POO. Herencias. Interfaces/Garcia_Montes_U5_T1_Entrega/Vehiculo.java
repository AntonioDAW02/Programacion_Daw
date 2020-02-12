package com.company;

import java.util.Objects;

public abstract class Vehiculo {

    private String nombre;
    private int nPersonas;
    private int capacidadMax;

    /**
     * Constructor Principal
     * @param nombre
     * @param nPersonas
     */
    public Vehiculo(String nombre, int nPersonas) {
        this.nombre = nombre;
        this.capacidadMax = nPersonas;
    }

    /**
     * Get de Nombre
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set de nombre
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Get de numero de personas
     * @return
     */
    public int getnPersonas() {
        return nPersonas;
    }

    /**
     * Set de numero de persona
     * @param nPersonas
     */
    public void transportar(int nPersonas) {
        if (nPersonas < capacidadMax){
            this.nPersonas = nPersonas;
        }
    }


    /**
     * Metodo toString
     * @return
     */
    @Override
    public String toString() {
        return "Vehiculo: " +
                "nombre = '" + nombre + '\'' +
                ", nPersonas = " + nPersonas ;
    }

    /**
     * Metodo equals
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return nPersonas == vehiculo.nPersonas &&
                Objects.equals(nombre, vehiculo.nombre);
    }

    /**
     * Metodo hashCode
     * @return
     */
    @Override
    public int hashCode() {
        return Objects.hash(nombre, nPersonas);
    }
}
