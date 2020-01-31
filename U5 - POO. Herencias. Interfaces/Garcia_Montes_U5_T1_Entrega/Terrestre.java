package com.company;

import java.util.Objects;

public abstract class Terrestre  extends Vehiculo implements Comparable{
    private String matricula;
    private int añoFabricacion;
    private Color color;

    /**
     * Constructor Principal
     * @param nombre
     * @param nPersonas
     * @param matricula
     * @param añoFabricacion
     * @param color
     */
    public Terrestre(String nombre, int nPersonas, String matricula, int añoFabricacion, Color color) {
        super(nombre, nPersonas);
        this.matricula = matricula;
        this.añoFabricacion = añoFabricacion;
        this.color = color;
    }

    /**
     * Get de Matricula
     * @return
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Set de Matricula
     * @param matricula
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * Get de Año de fabricación
     * @return
     */
    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    /**
     * Set de Año de fabricación
     * @param añoFabricacion
     */
    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    /**
     * Get de Color
     * @return
     */
    public Color getColor() {
        return color;
    }

    /**
     * Set de Color
     * @param color
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * Metodo to String
     * @return
     */
    @Override
    public String toString() {
        return super.toString()+ " Terrestre: " +
                "matricula = '" + matricula + '\'' +
                ", añoFabricacion = " + añoFabricacion +
                ", color = " + color +"\n";
    }

    /**
     * Metoso equals basado en la matrícula
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Terrestre terrestre = (Terrestre) o;
        return Objects.equals(matricula, terrestre.matricula);
    }

    /**
     * Metodo Compare To
     * @param o
     * @return
     */
    @Override
    public int compareTo(Object o) {
        Terrestre t = (Terrestre) o;
        return getMatricula().compareTo(t.getMatricula());
    }
}
