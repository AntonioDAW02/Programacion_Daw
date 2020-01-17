package com.company;

public class Pizza {
    private enum Size{mediana, familiar};
    private Size siz;
    private Ingrediente[] ingrediente = new Ingrediente[3];
    private int numIngredientes;

    /**
     * Constructor con valores por parametro
     * @param tam
     * @param ingrediente
     */

    Pizza(Size tam, Ingrediente[] ingrediente){
        this.siz = tam;
        this.ingrediente = ingrediente;
        this.numIngredientes = 0;
    }

    /**
     * Contructor por defecto
     */

    Pizza(){
        this.siz = Size.familiar;
        Ingrediente Jamon = new Ingrediente("Jamon",150);
        Ingrediente Queso = new Ingrediente();
        this.numIngredientes = 2;
    }

    /**
     * Devuelve el número de ingredientes
     * @return
     */
    public int getNumIngredientes() {
        return numIngredientes;
    }

    /**
     *
     * @return
     */
    public  boolean insertarIngrediente(){
        if (numIngredientes < 3){
            return true;
        }else {
            return false;
        }
    }

    /**
     * información de la pizza
     */
    public void infoPizza(){
        String lista[] = new String[getNumIngredientes()];

        for (int i = 0; i < lista.length; i++) {
            System.out.println("Lista de ingredientes: "+ingrediente[i].getNombre()+" con unas calorias de: "+ingrediente[i].getCalorias());
        }
        System.out.println("Su pizza es tamaño "+siz);
    }



}
