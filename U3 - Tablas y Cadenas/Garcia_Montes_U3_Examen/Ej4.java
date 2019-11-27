package com.company;

public class Ej4 {

    public static int[] filtraPrimos(int[] numeros){
        //Definicion de array.
        int[] arrayPrimos = new int[numeros.length];

        //Definicion de variables.
        boolean esPrimo = true;

        //recorremos el array.
        for (int i = 2; i < numeros.length; i++) {
            //Condiciones para los numeros primos.
            if (numeros[i]%i==0){
                esPrimo = false;
            }else {
                arrayPrimos[i] = numeros[i];
            }
        }

        return arrayPrimos;
    }

    public static void main(String[] args) {
        //Definicion de variables.
        int[] numeros = {3,7,13,22,27,50,61};

        //Llamada a la funcion.
        System.out.println(filtraPrimos(numeros));
    }
}
