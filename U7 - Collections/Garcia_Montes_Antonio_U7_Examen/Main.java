package com.company;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        try {
            /*Lista de Perros*/

            ArrayList<Perro> listaPerros = new ArrayList<>();

            listaPerros.add(new Perro("Ben", 4, 10, true,
                    (new Propietario("Jesus", "Montes", 1, "Argentina")),
                    (new Raza("Galgo"))));
            listaPerros.add(new Perro("Willy", 3, 8.5, true,
                    (new Propietario("Antonio", "Garcia", 2, "España")),
                    (new Raza("Galgo"))));
            listaPerros.add(new Perro("Moly", 6, 12.8, true,
                    (new Propietario("Pedro", "Rodriguez", 3, "Francia")),
                    (new Raza("Galgo"))));
            Iterator it2 = listaPerros.iterator();

            while (it2.hasNext()){
                System.out.println(it2.next());
            }
        /*
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("perros.dat"));
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("perros.dat"));

            Iterator it2 = listaPerros.iterator();


            while (it2.hasNext()){
                oos.writeObject(it2.next());
            }

            oos.close();
        */
            /*Lista Propietarios*/

            ArrayList<Propietario> listaPropietarios = new ArrayList<>();

            listaPropietarios.add(new Propietario("Jesus", "Rodriguez", 2, "Argentina"));
            listaPropietarios.add(new Propietario("Carlos", "Martín", 3, "España"));
            listaPropietarios.add(new Propietario("Antonio", "García", 1, "España"));

            Iterator it3 = listaPropietarios.iterator();

            while (it3.hasNext()){
                System.out.println(it3.next());
            }

            /*Lista de razas*/

            HashSet<Raza> listaRazas = new HashSet<>();

            listaRazas.add(new Raza("Chiguagua"));
            listaRazas.add(new Raza("Galgo"));
            listaRazas.add(new Raza("Labrador"));

            Iterator it = listaRazas.iterator();

            while (it.hasNext()){
                System.out.println(it.next());
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}