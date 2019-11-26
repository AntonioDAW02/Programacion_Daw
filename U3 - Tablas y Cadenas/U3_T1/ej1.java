package com.company;

import java.util.Scanner;

public class ej1 {

    public static void main(String[] args) {
        int no_personas = 0;
        boolean vacio = true;

        //Definimos scanner
        Scanner sc = new Scanner(System.in);

        //Definimos arrays;
        int[] no_mesa = {1,2,3,4,5,6,7,8,9,10};
        int[] ocupacion = new int[10];

        System.out.print("Numero de sitios ocupados: ");
        for (int i = 0; i < ocupacion.length; i++) {
            ocupacion[i] = (int) (Math.floor(Math.random()*4));

            System.out.print(+ocupacion[i]+" ");
        }

        System.out.println();

        System.out.print("Numero de mesa: ");
        for (int i = 0; i < no_mesa.length; i++) {
            System.out.print(no_mesa[i]+" ");
        }
        System.out.println();

        do {

            System.out.println("¿Cuántos son? (Introduzca -1 para salir del programa)");
            no_personas = sc.nextInt();

            if (no_personas ==  -1){
                System.out.println("Gracias. Hasta pronto.");
                break;
            }

            if (no_personas > 4){
                System.out.println("Lo siento, no admitimos grupos de "+no_personas+", haga grupos de 4 personas.\n" +
                        "como máximo e intente de nuevo.");
            }

        }while (no_personas ==-1 || no_personas > 4);

        if (no_personas <=4 && no_personas>=0) {
            for (int i = 0; i < ocupacion.length; i++) {
                if (ocupacion[i] == 0) {
                    ocupacion[i] += no_personas;
                    System.out.println("Sientese en la mesa numero: " + no_mesa[i]);
                    break;
                }

                //System.out.print(ocupacion[i]+" ");

                if (!vacio && ocupacion[i]+no_personas <= 4){
                    ocupacion[i] += no_personas;
                    System.out.println("Tendran que compartir la mesa numero "+no_mesa);
                }
            }
            //System.out.println("¿Cuántos son? (Introduzca -1 para salir del programa)");
            //no_personas = sc.nextInt();
        }
    }
}
