package U8_T6;

import java.util.Arrays;

public class Futbolista {
    private int  dorsal;
    private String nombre;
    private String desmarcaciones[];
    private String equipo;

    //Constructor principal.
    public Futbolista(int dorsal, String nombre, String[] desmarcaciones, String equipo) {
        this.dorsal = dorsal;
        this.nombre = nombre;
        this.desmarcaciones = desmarcaciones;
        this.equipo = equipo;
    }

    //Getter y setter.
    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String[] getDesmarcaciones() {
        return desmarcaciones;
    }

    public void setDesmarcaciones(String[] desmarcaciones) {
        this.desmarcaciones = desmarcaciones;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    //Metodo toSting.


    @Override
    public String toString() {
        return "Futbolista: " +
                "dorsal = " + dorsal +
                ", nombre = '" + nombre + '\'' +
                ", desmarcaciones = " + Arrays.toString(desmarcaciones) +
                ", equipo = '" + equipo + '\'';
    }
}
