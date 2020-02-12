package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Coche coche1 = new Coche("Coche", 7, "12345A", 2005, Color.AMARILLO);
        Coche coche2 = new Coche("Super Coche ", 5, "96645B", 2008, Color.ROJO);
        Coche coche3 = new Coche("Mega Coche", 7, "75345C", 2010, Color.AZUL);

        System.out.println(coche1.toString());
        System.out.println(coche2.toString());
        System.out.println(coche3.toString());

        Moto moto1 = new Moto("Moto", 1, "21345A", 2007, Color.AMARILLO);
        Moto moto2 = new Moto("Super Moto", 2, "21345C", 2008, Color.ROJO);
        Moto moto3 = new Moto("Mega Moto", 2, "21345B", 2009, Color.AZUL);

        Terrestre[] terrestre = new Terrestre[3];

        /*Comparador de coches*/
        System.out.println("Comparador de coches ordenados por la matrícula:");

        terrestre[0] = new Coche("Coche Amarillo ", 7, "92345A", 2005, Color.AMARILLO);
        terrestre[1] = new Coche("Super Rojo ", 5, "16645B", 2008, Color.ROJO);
        terrestre[2] = new Coche("Mega Azul", 7, "75345C", 2010, Color.AZUL);

        /*Comparador de coches*/
        System.out.println("Comparador de motos ordenados por la matrícula:");

        terrestre[0] = new Moto("Moto Amarilla", 1, "51345A", 2007, Color.AMARILLO);
        terrestre[1] = new Moto("Moto Roja", 2, "17345C", 2008, Color.ROJO);
        terrestre[2] = new Moto("Moto Azul", 2, "82345B", 2009, Color.AZUL);

        Arrays.sort(terrestre);
        System.out.println(Arrays.deepToString(terrestre));

        System.out.println(moto1.toString());
        System.out.println(moto2.toString());
        System.out.println(moto3.toString());

        Helicoptero helicoptero = new Helicoptero("Helicoptero", 7, 20000, "UP-A3001");
        Avioneta avioneta = new Avioneta("Avioneta", 4, 15000, "UQ-B3001");

        System.out.println(helicoptero.toString());
        System.out.println(avioneta.toString());
    }
}
