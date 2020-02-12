package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	   Elfo elfo1 = new Elfo("Elfi", false, TipoElfo.BOSQUE);
	   Orco orco1 = new Orco("Orcazo", false, 200);
	   Enano enano1 = new Enano("Enani", false, 1);
	   Guerrero guerrero1 = new Guerrero("Super Guerrero", false, 30);
	   Mago mago1 = new Mago("Mágico", false, 0.25);

        //Arrays.sort();

        System.out.println(elfo1.toString());
        System.out.println(orco1.toString());
        System.out.println(enano1.toString());
        System.out.println(guerrero1.toString());
        System.out.println(mago1.toString());
    }
}
