package com.company;

import java.util.Arrays;

public class ej3 {
    public static int[] filtraCon7(int x[]){
        String xString = "";
        int cont = 0;

        for (int i = 0; i < x.length; i++) {
            xString = String.valueOf(x[i]);
            if (xString.contains("7")){
                cont++;
            }
        }

        return x;

    }

    public static void main(String[] args) {
        //Definimos el array.
        int[] x = {7,27,782,1};

        System.out.println(Arrays.toString(filtraCon7(x)));
    }
}
