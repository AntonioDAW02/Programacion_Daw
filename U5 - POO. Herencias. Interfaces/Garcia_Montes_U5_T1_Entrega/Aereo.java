package com.company;

public abstract class Aereo extends Vehiculo{
    private double altitud;
    private String codigo;

    /**
     * Constructor Principal
     * @param nombre
     * @param nPersonas
     * @param altitud
     * @param codigo
     */
    public Aereo(String nombre, int nPersonas, double altitud, String codigo) {
        super(nombre, nPersonas);
        this.altitud = altitud;
        this.codigo = codigo;
    }

    /**
     * Constructor por defecto con código
     * @param codigo
     */
    public Aereo(String codigo) {
        super("",0);
        this.altitud = 0;
        this.codigo = codigo;
    }

    /**
     * Get de Altitud
     * @return
     */
    public double getAltitud() {
        return altitud;
    }

    /**
     * Set de altitud
     * @param altitud
     */
    public void setAltitud(double altitud) {
        this.altitud = altitud;
    }

    /**
     * Get de Código
     * @return
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Set de Código
     * @param codigo
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return super.toString() + " Aereo: " +
                "altitud = " + altitud +
                ", codigo = '" + codigo + '\'';
    }
}
