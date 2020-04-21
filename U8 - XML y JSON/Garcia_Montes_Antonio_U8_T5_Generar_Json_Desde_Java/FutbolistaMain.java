package U8_T5;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Iterator;

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
        ArrayList<Futbolista> futbolistas = new ArrayList<>();
        futbolistas.add(new Futbolista(1, "Casillas",posicionCasillas,"Real Madrid"));
        futbolistas.add(new Futbolista(15, "Sergio Ramos",posicionSergioRamos,"Real Madrid"));
        futbolistas.add(new Futbolista(3, "Pique",posicionPique,"Barcelona"));
        futbolistas.add(new Futbolista(5, "Puyol",posicionPuyol,"Barcelona"));
        futbolistas.add(new Futbolista(11, "Capdevila",posicionCapdevila,"Villareal"));
        futbolistas.add(new Futbolista(14, "Xavi Alonso",posicionXabiAlonso,"Real Madrid"));
        futbolistas.add(new Futbolista(16, "Busquets",posicionBusquets,"Barcelona"));
        futbolistas.add(new Futbolista(8, "Xavi Hernandez",posicionXaviHernandez,"Barcelona"));
        futbolistas.add(new Futbolista(18, "Pedrito",posicionPedrito,"Barcelona"));
        futbolistas.add(new Futbolista(6, "Iniesta",posicionIniesta,"Barcelona"));
        futbolistas.add(new Futbolista(7, "Villa",posicionVilla,"Barcelona"));





        //Crear objeto Gson que se encargará de las conversiones.
        Gson gson = new Gson();

        //Convertimos un objeto sencillo a Json
        Iterator it = futbolistas.iterator();

        while (it.hasNext()) {
            System.out.println(gson.toJson(it.next()));
        }
    }
}
