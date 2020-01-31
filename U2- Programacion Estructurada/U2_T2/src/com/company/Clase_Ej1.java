package com.company;

import java.util.Scanner;

public class Clase_Ej1 {

    public static void main(String[] args) {

        float nota1, nota2, nota3, suma, media;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la primera nota");
        nota1 = sc.nextFloat();

        System.out.println("Introduce la segunda nota");
        nota2 = sc.nextFloat();

        System.out.println("Introduce la tercera nota");
        nota3 = sc.nextFloat();

        suma = nota1+nota2+nota3;
        media = suma/3;
        String recuperacion= new String();
        recuperacion = sc.nextLine();

        if (media <5){

            System.out.println("La media es: "+media+". Suspenso");

        }else if (media >= 5 && media < 6){

            System.out.println("La media es: "+media+". Suficiente");

        }else if (media >= 6 && media < 7){

            System.out.println("La media es: "+media+". Bien");

        }else if (media >= 7 && media < 9){

            System.out.println("la media es: "+media+". Notable");

        } else {

            System.out.println("La media es: "+media+". Sobresaliente");

        }

        if (media < 5){

            System.out.println("El alumno debe presentarse a un examen de recuperación.¿Cual es la nota de la recuperacion Apto/No apto?");
            recuperacion = sc.nextLine();
            if (recuperacion.equals("Apto")){

                System.out.println("El alumno ha recuperado. La nota es 5");

            } else if (recuperacion.equals("No apto")){

                System.out.println("El alumno ha suspendido. la media es: "+media);

            }

        }

    }

}
