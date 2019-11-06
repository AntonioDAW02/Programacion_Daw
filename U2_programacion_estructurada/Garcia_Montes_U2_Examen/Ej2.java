package com.company;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        int cont = 0;

        //Leemos datos y guardamos en variables.
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero para partirlo en dos partes: ");
        int num = sc.nextInt();

        System.out.println("Introduzca la posicion en la que quiere partir el numero: ");
        int posicion = sc.nextInt();

        //Variable auxiliar de valiable 'num'.
        int aux = num;

        //cuanta las posiciones del numero.
        while (aux!=0) {
            aux = aux/10;
            cont++;
        }

        //Asignamos valor de 'num' a 'aux'.
        aux = num;

        //Mensaje de error.
        if (posicion < 2 || posicion > cont) {
            System.out.println("La posicion debe ser mayor o igual a 2 y menor que la longitud del numero introducido.");
        } else if (posicion == cont) {
            //caso en el que posicion sea igual a la longitud del numero.
            System.out.println(num);
        } else {
            for (int i = 0; i < cont-posicion; i++) {
                aux = aux/10;
            }
            System.out.println("Primera parte: " + aux);

            for (int i = 0; i < cont-posicion; i++) {
                aux = aux*10;
            }
            System.out.println("Segunda parte: " + (num-aux));
        }
    }
}
