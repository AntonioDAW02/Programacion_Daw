package com.company;

public class VectoresExamen {

    public static String[] unir(String[] v1, String[] v2){
        //Deinimos un nuevo array.
        String[] arrayFinal = new String[v1.length + v2.length];

        for (int i = 0; i <= arrayFinal.length; i++) {
            //union de dos arrays.
            arrayFinal[i] = v1[i]+v2[i];
        }
        return arrayFinal;
    }

    public static String[] rotar(String[] v1, int pos){
        //Definimos un nuevo array.
        String[] arrayRotado = new String[v1.length];

        for (int i = 0; i < v1.length; i++) {
            //rotacion de elementos del array.
        }
        return  arrayRotado;
    }

    public static void main(String[] args) {

    }
}
