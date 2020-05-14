package U9_T1;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        Connection connection = null;

        try {
            //Crear una conexión a una base de datos.
            connection = DriverManager.getConnection("jdbc:sqlite:sampledatabase.db");

            Statement statement = connection.createStatement();

            //Establecer tiempo de respuesta máxima a 30 segundos.
            statement.setQueryTimeout(30);

            //Listado de los "customers" que no tienen "state" (el campo "state" es nulo).
            System.out.println();
            ResultSet resultS = statement.executeQuery("SELECT state FROM customers WHERE state IS NULL");

            while (resultS.next()){
                System.out.println("state " + resultS.getString("state"));
            }

            System.out.println();
            //Listado de los "payments" cuyo "amount" sea mayor de 30.000.
            ResultSet resultS2 = statement.executeQuery("Select amount FROM payments WHERE amount > 30000");

            while (resultS2.next()){
                System.out.println("amount " + resultS2.getString("amount"));
            }

            System.out.println();
            //Listado de los "employees" que dan cuenta (reportsTo) al empleado con Id = 1143.
            ResultSet resultS3 = statement.executeQuery("Select lastName FROM employees WHERE reportsTo = 1143");

            while (resultS3.next()){
                System.out.println("last name " + resultS3.getString("lastName"));
            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }finally {
            try {
                if (connection != null){
                    connection.close();
                }
            }catch (SQLException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
