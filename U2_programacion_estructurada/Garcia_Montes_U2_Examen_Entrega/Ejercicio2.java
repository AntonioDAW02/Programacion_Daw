package com.company;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        //Declaramos e iniciamos variables
        int numero = 0, res, cont = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        numero = sc.nextInt();

        //condicion que pide el numero repetidamente al usuario mientras sea negativo
        while (numero <= 0){
            System.out.println("Introduce un numero");
            numero = sc.nextInt();
        }

        while (numero > 0){
            res = numero % 10;
            numero = numero / 10;

            if (numero == 0 || numero == 8){
                //Borrar

            }
        }

        //System.out.println(cont);
    }
}
