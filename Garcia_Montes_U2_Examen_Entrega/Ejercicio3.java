package com.company;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        //Declaramos variables
        int num1,num2,num3;
        String nLot;
        int cont = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        num1 = sc.nextInt();
        System.out.println("Introduce el segundo numero");
        num2 = sc.nextInt();
        System.out.println("Introduce el tercer numero");
        num3 = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduce el numero de la loteria");
        nLot = sc.nextLine();

        for (int i = 0; i < nLot.length(); i++) {
            if (nLot.contains(Character.toString(num1))){
                System.out.println("SI");
                cont++;
            }else if (nLot.contains(Character.toString(num2))){
                System.out.println("SI");
                cont++;
            }else if (nLot.contains(Character.toString(num3))){
                System.out.println("SI");
                cont++;
            }
        }
        System.out.println(cont);
    }
}
