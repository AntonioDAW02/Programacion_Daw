package U9_T2;

public class Office {
    private int codigo;
    private String ciudad;
    private String telefono;

    public Office(int codigo, String ciudad, String telefono) {
        this.codigo = codigo;
        this.ciudad = ciudad;
        this.telefono = telefono;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Office: " +
                "código = " + codigo +
                ", ciudad = '" + ciudad + '\'' +
                ", teléfono = '" + telefono + '\'';
    }
}
