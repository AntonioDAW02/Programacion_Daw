package com.company;

import java.util.Scanner;

public class Clase_Ej5 {

    public static void main(String[] args) {

        int tam ;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el tamaño del rombo");
        tam = sc.nextInt();

        //Triangulo de arriba
        for (int i=0; i < tam; i++){

            for (int j=0; j<tam-i; j++){

                System.out.print(" ");

            }

            for (int j=0; j<(i*2)-1; j++){

                System.out.print("*");

            }

            System.out.println();

        }

        //Triangulo de abajo
        for (int i=tam-1; i >= 1; i--){

            for (int j=i; j<=tam; j++){

                System.out.print(" ");

            }

            for(int j=i*2-3;j>0;j--)  {

                System.out.print("*");
            }

            System.out.println();

        }

    }

}
