package U9_T3;

import java.io.IOException;
import java.sql.*;
import java.util.Scanner;


public class AccesoDatos {

    //Constructor por defecto.
    public AccesoDatos() {}

    /**
     * Insertar cliente (solicitará los datos del cliente y lo insertará en la base de datos)
     */
    public void insertarCliente(){
        try{
            //Creamos la conexión a la base de datos haciendo llamada al getConnection() de la clase ConexionBD.
            Connection conexion = ConexionBD.getConnection();

            //creamos el objeto para ejecutar la sentencia sql.
            String sql = "INSERT INTO (customerName, contactLastName, contactFirstName, phone, addressLine1, addressLine2, city, state, postalCode, salesRepEmployeeNumber,creditLimit)" +
                    " VALUES ('Pepe', 'Perez', 'Pedro', '689876543', 'Sevilla 1', 'Sevilla 2', 'Sevilla', 'Sevilla', '31099', 586, 200.00)";

            PreparedStatement statement = conexion.prepareStatement(sql);

            //Ejecutamos la consulta.
            ResultSet rs = statement.executeQuery();

            //Recorremos los resultados
            while(rs.next()){
                String customerName = rs.getString("CustomerName");
                String contactLastName = rs.getString("ContactLastName");
                String contactName = rs.getString("ContactLastName");
                String phone = rs.getString("phone");
                String addressLine1 = rs.getString("addressLine1");
                String addressLine2 = rs.getString("addressLine2");
                String city = rs.getString("city");
                String state = rs.getString("state");
                String postalCode = rs.getString("postalCode");
                int salesRepEmployeeNumber = rs.getInt("salesRepEmployeeNumber");
                double creditLimit = rs.getDouble("creditLimit");

                System.out.println("***********************************");

                System.out.println("CustomerName: " + customerName);
                System.out.println("contactLastName: " + contactLastName);
                System.out.println("contactName: " + contactName);
                System.out.println("phone: " + phone);
                System.out.println("addressLine1: " + addressLine1);
                System.out.println("addressLine2:" + addressLine2);
                System.out.println("city:" + city);
                System.out.println("state:" + state);
                System.out.println("postalCode:" + postalCode);
                System.out.println("salesRepEmployeeNumber: " + salesRepEmployeeNumber);
                System.out.println("creditLimit: " + creditLimit);
            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
    public void asignarEmpleado(/*Customer numCli, Employee numEmple*/){

        try {
            //Creamos la conexión a la base de datos haciendo llamada al getConnection() de la clase ConexionBD.
            Connection conexion = ConexionBD.getConnection();

            //Solicito los datos del cliente
            Scanner sc = new Scanner(System.in);

            System.out.println("Introduzca el número del cliente");
            int numCli = sc.nextInt();

            System.out.println("Introduzca el número del empleado");
            int numEmple = sc.nextInt();

            //Creo el objeto para ejecutar la sentencias SQL
            String sql = "UPDATE customers SET salesRepEmployeeNumber = ? WHERE customerNumber = ?";
            PreparedStatement statement = conexion.prepareStatement(sql);

            //Establezco los parámetros
            statement.setInt(1,numCli);
            statement.setInt(2,numEmple);

            //Ejecuta la consulta y almacena el resultado en el ResultSet.
            ResultSet rs = statement.executeQuery();

            while(rs.next()){
                int idCustomer = rs.getInt("customerNumber");
                int idEmployee = rs.getInt("salesRepEmployeeNumber");

                System.out.println("***********************************");

                System.out.println("ID customer" + idCustomer);
                System.out.println("ID Employee" + idEmployee);
            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public void asignarProducto(){

        try {
            //Creamos la conexión a la base de datos haciendo llamada al getConnection() de la clase ConexionBD.
            Connection conexion = ConexionBD.getConnection();

            //Solicito los datos del pedido.
            Scanner sc = new Scanner(System.in);

            System.out.println("Introduzca el número del pedido");
            int numPedido = sc.nextInt();

            //Solicito los datos del producto.
            System.out.println("Introduzca el número del producto");
            int numProducto = sc.nextInt();

            //Creo el objeto para ejecutar la sentencias SQL
            String sql = "UPDATE orderdetails SET productCode = ? WHERE orderNumber = ?";
            PreparedStatement statement = conexion.prepareStatement(sql);

            //Establezco los parámetros
            statement.setInt(1,numPedido);
            statement.setInt(2,numProducto);

            //Ejecuta la consulta y almacena el resultado en el ResultSet.
            ResultSet rs = statement.executeQuery();

            while(rs.next()){
                int idOrder = rs.getInt("orderNumber");
                int idProduct = rs.getInt("productCode");

                System.out.println("***********************************");

                System.out.println("ID Order" + idOrder);
                System.out.println("ID Product" + idProduct);
            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
