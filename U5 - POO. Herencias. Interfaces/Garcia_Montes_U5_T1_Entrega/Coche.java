package com.company;

public class Coche extends Terrestre {
    /**
     * Cosntructor Principal
     * @param nombre
     * @param nPersonas
     * @param matricula
     * @param añoFabricacion
     * @param color
     */
    public Coche(String nombre, int nPersonas, String matricula, int añoFabricacion, Color color) {
        super(nombre, nPersonas, matricula, añoFabricacion, color);
    }
}
