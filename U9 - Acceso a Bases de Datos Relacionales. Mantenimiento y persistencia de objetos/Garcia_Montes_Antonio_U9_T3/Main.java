package U9_T3;



import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) {
        //Creamos un objeto de la clase "AccesoDatos".
        AccesoDatos accesoDatos = new AccesoDatos();



        //Llamamos al metodo insertarCliente() de la clase "AccesoDatos".
        //accesoDatos.insertarCliente();

        accesoDatos.asignarEmpleado();
    }
}
