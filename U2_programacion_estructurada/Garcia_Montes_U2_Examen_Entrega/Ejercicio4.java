package com.company;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        //Declaramos e iniciamos variables
        int numero = 0, contador = 2;
        boolean primo = true;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        numero = sc.nextInt();

        for (int i = numero; i < numero+5; i++) {
            if (numero%2== 0 || numero%3 == 0 || numero%5 == 0 || numero%7== 0){
                primo = false;
                System.out.println(i+" no es primo");
            }else {
                System.out.println(i+" es primo");
            }
        }
    }
}

