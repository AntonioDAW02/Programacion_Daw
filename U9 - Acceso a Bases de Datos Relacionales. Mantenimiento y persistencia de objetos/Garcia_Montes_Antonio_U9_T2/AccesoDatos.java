package U9_T2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class AccesoDatos {

    //Constructor por defecto.
    public AccesoDatos() {}

    /** Método que recorre la tabla "employees" y lo devuelve en un ArrayList.
     *
     * @return devuelve en el ArrayList "listEmple" los datos que pedimos de los empleados.
     * @throws SQLException
     */
    public ArrayList<Employee> getEmployees() throws SQLException {

        //Creamos una arrayList de empleados.
        ArrayList<Employee> listEmple = new ArrayList<>();

        //Creamos la conexión a la base de datos haciendo llamada al getConnection() de la clase ConexionBD.
        Connection conexion = ConexionBD.getConnection();

        //Creamos un objetos statment.
        Statement statement = conexion.createStatement();

        //Establecer tiempo de respuesta máxima a 30 segundos.
        statement.setQueryTimeout(30);

        //Ejecutamos la siguiente sentencia SQL.
        ResultSet res = statement.executeQuery("SELECT firstName, lastName, employeeNumber FROM employees");

        //Creamos un objeto Employee.
        Employee empleado = new Employee(res.getString("firstName"),res.getString("lastName"),res.getInt("employeeNumber"));

        //Recorremos la tabla, mientras siga habiendo empleados.
        while (res.next()) {
            //añadimos el empleado a la lista los empleados.
            listEmple.add(empleado);
        }

        //Cerramos el statment.
        res.close();

        //Mostramos el arrayList con los datos de los empleados.
        return listEmple;
    }


    /** Método que recorre la tabla "offices" y lo devuelve en un ArrayList.
     *
     * @return devuelve en el ArrayList "listOffi" los datos que pedimos de las oficinas.
     * @throws SQLException
     */
    public ArrayList<Office> getOffices() throws SQLException {
        //Creamos una arrayList de oficinas.
        ArrayList<Office> listOffi = new ArrayList<>();

        //Creamos la conexión a la base de datos haciendo llamada al getConnection() de la clase ConexionBD.
        Connection conexion = ConexionBD.getConnection();

        //Creamos un objetos statment.
        Statement statement = conexion.createStatement();

        //Establecer tiempo de respuesta máxima a 30 segundos.
        statement.setQueryTimeout(30);

        //Ejecutamos la siguiente sentencia SQL.
        ResultSet res = statement.executeQuery("SELECT officeCode, city, phone FROM offices");

        //Creamos un objeto Office.
        Office oficina = new Office(res.getInt("officeCode"), res.getString("city"), res.getString("phone"));

        //Recorremos la tabla, mientras siga habiendo oficinas.
        while (res.next()) {
            //añadimos la oficina a la lista las oficinas.
            listOffi.add(oficina);
        }

        //Cerramos el statment.
        res.close();

        //Mostramos el arrayList con los datos de las oficinas.
        return listOffi;
    }
}
