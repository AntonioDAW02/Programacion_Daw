package com.company;

public class ej4 {

    public static String convierteArrayEnString(int[] a){
        //Definimos variables
        String cadena = "";

        //Recorremos el array.
        for (int i = 0; i < a.length; i++) {
            cadena = cadena + String.valueOf(a[i]);
        }
        return cadena;
    }

    public static void main(String[] args) {
        //Definimos el array.
        int[] a = {6,2,5,0,1};

        System.out.println(convierteArrayEnString(a));
    }
}
