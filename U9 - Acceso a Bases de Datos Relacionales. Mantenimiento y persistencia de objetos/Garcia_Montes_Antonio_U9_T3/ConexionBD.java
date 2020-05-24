package U9_T3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    //Creamos la conexión.
    private static Connection connection = null;

    //Método para la conexión.
    public static Connection getConnection() {
        try {
            //si la conexión es null.
            if (connection == null) {
                String driver = "com.mysql.jdbc.Driver";
                String url = "jdbc:mysql://localhost:3307/classicmodels?autoReconnect=true";
                String pass = "admin";
                String usu = "root";

                Class.forName(driver);

                connection = DriverManager.getConnection(url,usu,pass);

                System.out.println("Se ha establecido la conexión.");
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }

    //Método para cerrar la conexión.
    public static void closeConnection(){
        try{
            connection.close();
            System.out.println("Se ha cerrado la conexión.");
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
}
