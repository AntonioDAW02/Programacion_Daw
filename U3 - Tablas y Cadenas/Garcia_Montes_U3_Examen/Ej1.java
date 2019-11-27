package com.company;

import java.util.Scanner;

public class Ej1 {

    public static int maxMatriz(int[][] array1){
        //Definicion de variables
        int mayor = 0;

        //Recorremos el array bidimensional.
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                if (array1[i][j] > mayor){
                    mayor = array1[i][j];
                }
            }
        }
        return mayor;
    }

    public static void main(String[] args) {
        //Definicion de variables.
        int filas = 0;
        int columnas = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el numero de filas");
        filas = sc.nextInt();
        System.out.println("Introduzca el numero de columnas");
        columnas = sc.nextInt();

        //Asignamos los tamaños del usuario al array bidimensional.
        int[][] array = new int[filas][columnas];

        //Rellenamos el array con numeros aleatorios.
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) Math.floor(Math.random()*1000);
            }
        }

        //Mostramos el array.
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+ " | ");
            }
            System.out.println();
        }

        //Lamada a la funcion.
        System.out.println("El mayor numero es el: "+maxMatriz(array));
    }
}
