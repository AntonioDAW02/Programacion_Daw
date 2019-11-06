package com.company;

import java.util.Scanner;

public class Clase_Ej2 {

    public static void main(String[] args) {

        long num_usu;
        long n_reves = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número");
        num_usu = sc.nextLong();

        long numero = num_usu;

        while (numero > 0) {

            n_reves = (n_reves * 10) + (numero % 10);
            numero /= 10;

        }

        //System.out.println("El número al revés es: " + volteado);
        if (n_reves == num_usu) {
            System.out.println("El número: "+num_usu+" es capicúo");
        } else {
            System.out.println("el número: "+num_usu+" no es capicúo");
        }

    }

}
