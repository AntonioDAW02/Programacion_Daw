package com.company;

import java.util.Scanner;

public class Ej1 {

    public static void main(String[] args) {
	    int altura = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, introduzca la altura. ( debe ser impar mayor o igual a 5)");
        altura = sc.nextInt();

        if (altura < 5 || altura%2 == 0){
            System.out.println("Por favor, introduzca la altura. ( debe ser impar mayor o igual a 5)");
            altura = sc.nextInt();
        } else {
            for (int i = 0; i < altura; i++){
                for (int j = 0; j < 6; j++){
                    if (i==0 || i==altura-1 || i==altura/2 || j==0 || j==5){
                        System.out.print("M");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
