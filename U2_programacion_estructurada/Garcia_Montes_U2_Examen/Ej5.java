package com.company;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        String cadena = new String();
        int cont = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase");
        cadena = sc.nextLine();

        for (int i = 0; i < cadena.length(); i++){
            if (cadena.charAt(i)=='a' || cadena.charAt(i)=='e' || cadena.charAt(i)=='i' || cadena.charAt(i)=='o' || cadena.charAt(i) == 'u'){
                cont++;
            }
        }
        System.out.println("Numero de vocales: "+cont);
    }
}
