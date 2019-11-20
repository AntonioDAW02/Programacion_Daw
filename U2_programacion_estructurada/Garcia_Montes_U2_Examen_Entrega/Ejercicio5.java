package com.company;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        int hora = 0;
        int minutos = 0;
        int segundos = 0;
        int incremento = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la hora");
        hora = sc.nextInt();

        System.out.println("Introduce los minutos");
        minutos = sc.nextInt();

        System.out.println("Introduce los segundos");
        segundos = sc.nextInt();

        System.out.println("Introduce los segundos que quieres incrementar");
        incremento = sc.nextInt();

        System.out.println("Aumentando la hora...");
        for (int i = 0; i < incremento; i++) {
            //System.out.println(i);
            if (segundos > 59){
                segundos = 0;
                minutos++;
            }else if (minutos > 59){
                minutos = 1;
                hora++;
            }else if (hora > 23){
                hora = 0;
            }
            segundos++;

            System.out.println(hora+":"+minutos+":"+segundos);
        }
    }
}
