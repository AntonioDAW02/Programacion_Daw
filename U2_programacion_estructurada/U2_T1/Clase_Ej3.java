package com.company;

import java.util.Scanner;

public class Clase_Ej3 {

    public static void main(String[] args) {

        int num;
        String binario = new String();

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero");
        num = sc.nextInt();

        if (num > 0){

            while (num > 0){

                if (num % 2 == 0){

                    binario = binario + "0";

                }else {

                    binario = binario + "1";

                }

                num =(int) num /2;

            }

        } else if (num == 0){

            binario = "0";

        } else {

            System.out.println("Un numero negativo no se puede convertir a binario");
            System.out.println("introduzca un numero positivo");
            num = sc.nextInt();

        }

        System.out.println("El número convertido a binario es: " + binario);

    }

}
