package com.company;

public class ej2 {
    public static void main(String[] args) {
        //Definimos el array.
        int[][] array = new int[5][6];
        int suma = 0;
        for (int i=0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == array.length - 1 || j == array[i].length - 1){
                    array[i][j] = 0;
                } else {
                    array[i][j] = (int) (Math.random()*9+1);
                }
                System.out.print(array[i][j]);
            }

            System.out.println();
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                suma = suma + array[i][j];
                array[i][j] = suma;
            }
        }
    }
}
