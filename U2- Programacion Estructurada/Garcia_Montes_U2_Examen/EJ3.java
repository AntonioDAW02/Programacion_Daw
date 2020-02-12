package com.company;

import java.util.Scanner;

public class EJ3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero entero: ");
        Long num = sc.nextLong();
        String cad_num = num.toString();
        String numeros = new String();
        numeros = "0123456789";

        int cont_si = 0;
        int cont_no = 0;

        for (int i = 0 ; i < cad_num.length(); i++){
            if (cad_num.charAt(i) == '0' || cad_num.charAt(i) == '1' || cad_num.charAt(i) == '2' || cad_num.charAt(i) == '3'  || cad_num.charAt(i) == '4' || cad_num.charAt(i) == '5' || cad_num.charAt(i) == '6' || cad_num.charAt(i) == '7' || cad_num.charAt(i) == '8' || cad_num.charAt(i) == '9'){
                cont_si++;
            } else {
                cont_no++;
            }
        }
        System.out.println("Contiene :"+cont_si);
        System.out.println("No contiene :"+cont_no);
    }
}
