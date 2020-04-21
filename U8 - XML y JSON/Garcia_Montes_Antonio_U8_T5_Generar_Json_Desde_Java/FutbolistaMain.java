package U8_T5;

import com.google.gson.Gson;

public class FutbolistaMain {
    public static void main(String[] args) {
        //Creamos el array de desmarcaciones.
        String[] posicionCasillas = {"Portero"};
        String[] posicionSergioRamos = {"Lateral derecho", "Medio centro"};
        String[] posicionPique = {"Central"};
        String[] posicionPuyol = {"Central"};
        String[] posicionCapdevila = {"Lateral izquierdo"};
        String[] posicionXabiAlonso = {"Defensa mediocampo", "Mediocampo"};
        String[] posicionBusquets = {"Defensa mediocampo"};
        String[] posicionXaviHernandez = {"Mediocampo"};
        String[] posicionPedrito = {"Extremo izquierdo", "Falso extremo"};
        String[] posicionIniesta = {"Extremo derecho", "Mediocampo"};
        String[] posicionVilla = {"Delantero centro"};


        //Creamos el objeto futbolista.
        Futbolista futbolista1 = new Futbolista(1, "Casillas",posicionCasillas,"Real Madrid");
        Futbolista futbolista2 = new Futbolista(15, "Sergio Ramos",posicionSergioRamos,"Real Madrid");
        Futbolista futbolista3 = new Futbolista(3, "Pique",posicionPique,"Barcelona");
        Futbolista futbolista4 = new Futbolista(5, "Puyol",posicionPuyol,"Barcelona");
        Futbolista futbolista5 = new Futbolista(11, "Capdevila",posicionCapdevila,"Villareal");
        Futbolista futbolista6 = new Futbolista(14, "Xavi Alonso",posicionXabiAlonso,"Real Madrid");
        Futbolista futbolista7 = new Futbolista(16, "Busquets",posicionBusquets,"Barcelona");
        Futbolista futbolista8 = new Futbolista(8, "Xavi Hernandez",posicionXaviHernandez,"Barcelona");
        Futbolista futbolista9 = new Futbolista(18, "Pedrito",posicionPedrito,"Barcelona");
        Futbolista futbolista10 = new Futbolista(6, "Iniesta",posicionIniesta,"Barcelona");
        Futbolista futbolista11 = new Futbolista(7, "Villa",posicionVilla,"Barcelona");

        //Crear objeto Gson que se encargará de las conversiones.
        Gson gson = new Gson();

        //Convertimos un objeto sencillo a Json
        System.out.println(gson.toJson(futbolista1));
        System.out.println(gson.toJson(futbolista2));
        System.out.println(gson.toJson(futbolista3));
        System.out.println(gson.toJson(futbolista4));
        System.out.println(gson.toJson(futbolista5));
        System.out.println(gson.toJson(futbolista6));
        System.out.println(gson.toJson(futbolista7));
        System.out.println(gson.toJson(futbolista8));
        System.out.println(gson.toJson(futbolista9));
        System.out.println(gson.toJson(futbolista10));
        System.out.println(gson.toJson(futbolista11));
    }
}
