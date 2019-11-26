package com.company;

public class ej5 {

    public static int aleatorioDeArray(int[] a){

        //Definimos variable que guarda aleatorio del array.
        int aleatorio =  (int)Math.floor(Math.random()*(a.length));

        return a[aleatorio];
    }

    public static void main(String[] args) {
        //Definimos array
        int[]x = {111,222,333,444};

        System.out.println(aleatorioDeArray(x));
    }
}
