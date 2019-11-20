package com.company;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        //Declaramos e iniciamos variables
        int altura = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la altura de los calcetines");
        altura = sc.nextInt();

        //condicion que pide la altura repetidamente mientras altura sea menor a 4.
        while (altura < 4){
            System.out.println("La altura debe ser mayor o igual a 4");
            altura = sc.nextInt();
        }

        //Dibujo la figura.
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < 14; j++) {
                if ((i == altura-2) || (i == altura-1) || (j == 0) || (j==1) || (j==2) || (j==8) || (j==9) || (j==10)){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
