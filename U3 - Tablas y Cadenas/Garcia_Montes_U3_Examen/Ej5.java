package com.company;

public class Ej5 {
    public static void main(String[] args) {

        //Definicion de array.
        String[] v1 = {"a","b","c"};
        String[] v2 = {"d","e","f"};

        String[] v3 = {"abcdef"};
        int pos = 2;

        //Importamos librerias.

        //Llamada a la funcion unir(union de dos vectores).
        VectoresExamen.unir(v1,v2);

        //Llamada a la funcion rotar.
        VectoresExamen.rotar(v3,pos);
    }
}
