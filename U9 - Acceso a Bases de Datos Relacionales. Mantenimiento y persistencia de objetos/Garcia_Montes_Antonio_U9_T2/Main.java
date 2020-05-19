package U9_T2;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        //Creamos un objeto de la clase "AccesoDatos".
        AccesoDatos accesoDatos = new AccesoDatos();

        //Llamamos al metodo getEmpleados() de la clase "AccesoDatos".
        accesoDatos.getEmployees();

        //Llamamos al metodo getOffices() de la clase "AccesoDatos".
        accesoDatos.getOffices();

        //Cerramos la conexión.
        ConexionBD cerrarConexion = new ConexionBD();
        cerrarConexion.closeConnection();
    }
}
