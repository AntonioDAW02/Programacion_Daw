package com.company;

public class Ej2 {
    public static int[] insertarValor(int[] array,int valor, int posicion){
        int[] arrayNuevo = new int[array.length+1];

        //Recorremos el array.
        for (int i = 0; i < arrayNuevo.length; i++) {
            arrayNuevo[posicion] = valor;

            System.out.println(arrayNuevo[i]);

        }
        return arrayNuevo;
    }

    public static void main(String[] args) {
        //Definicion de variables
        int valor  = 7;
        int posicion = 0;
        int[] array = {1,2,3,4,8};

        //Llamada a la funcion.
        System.out.println(insertarValor(array,valor,posicion));
    }
}
