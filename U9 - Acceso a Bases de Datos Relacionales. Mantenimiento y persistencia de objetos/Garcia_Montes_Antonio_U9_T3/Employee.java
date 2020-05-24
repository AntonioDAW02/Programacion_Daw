package U9_T3;

public class Employee {
    private String nombre;
    private String apellidos;
    private int numero;

    public Employee(String nombre, String apellidos, int numero) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Employee: " +
                "nombre = '" + nombre + '\'' +
                ", apellidos = '" + apellidos + '\'' +
                ", número = " + numero;
    }
}
