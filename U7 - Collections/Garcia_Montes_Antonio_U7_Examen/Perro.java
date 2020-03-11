package com.company;

import java.io.*;
import java.util.*;

public class Perro implements Serializable {
    String nombre;
    int edad;
    double peso;
    boolean vacunas;
    Propietario propietario;
    Raza raza;

    public Perro(String nombre, int edad, double peso, boolean vacunas, Propietario propietario, Raza raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.vacunas = vacunas;
        this.propietario = propietario;
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perros: " +
                "nombre = '" + nombre + '\'' +
                ", edad = " + edad +
                ", peso = " + peso +
                ", vacunas = " + vacunas +
                ", propietario = " + propietario +
                ", raza = '" + raza + '\'';
    }

    ArrayList<Perro> listaPerros = new ArrayList<>();
    HashSet<Raza> listaRazas = new HashSet<>();


    //Método para añadir perros.
    public void addPerro(Raza Galgo, Perro perro1){
        //listaPerros.add(Raza (Galgo), Perro perro1);
    }

    //Método para eliminar perros.
    public void disqualifyDog(Perro perro1){
        listaPerros.clear();
    }

    //Método que muestra una lista de perros de una raza, ordenados por peso de manera decreciente.
    public void perrosPorPeso(){
        //sort para ordenar
        //listaPerros.sort();
    }

    //Método para leer la lista de perros desde fichero binario.
    public void cargarPerros(){

        //Lista de perros.
        Iterator it2 = listaPerros.iterator();

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("perros.dat"));

            while (it2.hasNext()){
                System.out.println(it2.next());
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    //Método para escribir en fichero binario.
    public void guardarPerros() {
        //Lista de perros.
        Iterator it2 = listaPerros.iterator();

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("perros.dat"));

            while (it2.hasNext()){
                oos.writeObject(it2.next());
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
