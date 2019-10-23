package com.company;

import java.util.Scanner;

public class Clase_Ej4 {

    public static void main(String[] args) {

        int altura;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la altura");
        altura = sc.nextInt();

        if (altura >=3){

            for (int i=0; i <= altura/2; i++){

                for (int j=i; j<=altura; j++){

                    System.out.print(" ");

                }

                System.out.println("*     *");

                /*for (int j=0; j<=altura; j++){

                    System.out.print(" ");

                }

                System.out.println("*     *");*/

            }


        } else {

            System.out.println("ERROR.La altura debe ser un numero impar mayor o igual a 3");

        }

    }

}
