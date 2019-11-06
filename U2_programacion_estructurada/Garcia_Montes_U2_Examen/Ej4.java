package com.company;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {

        //Declaracion de variables.
        int cont = 0;
        int max = 0;
        int min = 0;
        double media = 0;
        boolean esPrimo = false;
        String cadena = new String();

        Scanner sc = new Scanner(System.in);

        //Mientras no es primo pide numeros.
        while (!esPrimo) {
            System.out.println("Introduce numeros enteros. Para finalizar introduca un número primo ");
            Integer num = sc.nextInt();

            for (int i=2; i<num; i++) {
                if (num%i == 0) {
                    esPrimo=false;

                    //Suma para media
                    media = media + num;

                    //Guardo los numeros en un String para luego mostrar la lista de numeros
                    String s = num.toString();
                    cadena = cadena + s + " ";

                    //Comparo los numeros para saber cual es el mayor y cual el menor.
                    if (cont == 0) {
                        max = num;
                        min = num;
                    } else {
                        if (num >= max) {
                            max = num;
                        }
                        if (num <= min) {
                            min = num;
                        }
                    }

                    //Cantidad de numeros que pasa el usuario.
                    cont++;
                    break;
                } else {
                    esPrimo = true;
                }
            }
        }
        System.out.println("Los números introducidos son: " + cadena);
        System.out.println("La cantidad de números es " + cont);
        System.out.println("El máximo es " + max);
        System.out.println("El mínimo es " + min);
        System.out.println("La media es " + media/cont);
    }
}
