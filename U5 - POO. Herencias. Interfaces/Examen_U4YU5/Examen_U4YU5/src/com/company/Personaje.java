package com.company;

import java.util.*;

public abstract class Personaje implements Comparable {
    private String nombre;
    private int energia ;
    private int capacidadAtaque;
    private int capacidadDefensa;
    private boolean encantados;
    private Personaje[] personaje;
    private int nPersonajes;

    public Personaje(String nombre, boolean encantados) {
        this.nombre = nombre;
        this.energia = 1000;
        this.capacidadAtaque = 100;
        this.capacidadDefensa = 100;
        this.encantados = encantados;
        this.personaje = new Personaje[10];
        this.nPersonajes = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getCapacidadAtaque() {
        return capacidadAtaque;
    }

    public void setCapacidadAtaque(int capacidadAtaque) {
        this.capacidadAtaque = capacidadAtaque;
    }

    public int getCapacidadDefensa() {
        return capacidadDefensa;
    }

    public void setCapacidadDefensa(int capacidadDefensa) {
        this.capacidadDefensa = capacidadDefensa;
    }

    public boolean isEncantados() {
        return encantados;
    }

    public void setEncantados(boolean encantados) {
        this.encantados = encantados;
    }

    public boolean addPersonaje(Personaje[] personaje){
        if (personaje.length > 10){
            return false;
        }
        for (int i = 0; i < personaje.length; i++) {
            //personaje[i] = new Personaje();
        }
        nPersonajes++;
        return true;
    }

    public boolean borrarMuertos(){
        if (this.energia <= 0){
            return true;
        }
        nPersonajes--;
        return false;
    }

    /*public boolean mostrarEstado(){

    }*/

    public String personajeGanador(){
        if (nPersonajes == 1){
            for (int i = 0; i < personaje.length; i++) {
                System.out.println(personaje[i]);
            }
        }
        return "Ganador!";
    }

    @Override
    public String toString() {
        return "Personaje: " +
                "nombre = '" + nombre + '\'' +
                ", energia = " + energia +
                ", capacidad de ataque = " + capacidadAtaque +
                ", capacidad de defensa = " + capacidadDefensa +
                ", encantados = " + encantados;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

}
