package com.company;

public class Ingrediente {
    private String nombre;
    private double calorias;

    /**
     * Constructor con valores por parametro
     * @param nombre
     * @param calorias
     */
    Ingrediente(String nombre, double calorias){
        this.nombre = nombre;
        this.calorias = calorias;
    }

    /**
     * Constructor por defecto
     */

    Ingrediente(){
        this.nombre = "Queso";
        this.calorias = 250;
    }

    /**
     * Get del nombre
     * @return
     */

    public String getNombre() {
        return nombre;
    }

    /**
     * Get de calorias
     * @return
     */

    public double getCalorias() {
        return calorias;
    }

    /**
     * Set de nombre
     * @param nombre
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Set de calorias
     * @param calorias
     */

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }
}
