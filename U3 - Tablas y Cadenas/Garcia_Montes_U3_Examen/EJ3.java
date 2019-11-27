package com.company;

public class EJ3 {

    public static void main(String[] args) {
        //Definicion de variables.
        int posX = 3, posY = 3;

        //Definicion de array bidimensional.
        int[][] tablero = new int[8][8];

        //Recorremos el array bidimensional.
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                //Condicion cuando "i" y "j" valen "posX" y "posY".
                if (i==posX && j ==posY){
                    System.out.print("A ");
                }else if ( i+j == tablero.length-2 || i==j){
                    System.out.print("X ");
                }else {
                    System.out.print("_ ");
                }

                //Condicion de movimientos del alfil.

            }
            System.out.println();
        }
    }
}
