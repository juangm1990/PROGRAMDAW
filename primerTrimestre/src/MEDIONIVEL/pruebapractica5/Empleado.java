package pruebapractica5;

public class Empleado {

    private String nombre;
    private String apellidos;
    private String telefono;
    private Contrato contrato;

    public Empleado(String n, String ape, String tel, Contrato c) {

        if ( n.length() >= 3 && n.length() <= 20) {
            this.nombre = n;
        }else this.nombre="";

        this.apellidos = ape;
        this.telefono = tel;
        this.contrato = c;
    }

    public Empleado() {

        this.nombre = "";
        this.apellidos = "";
        this.telefono = "+00000000000";

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {

        if (nombre.length() >= 3 && nombre.length() <= 20) {
            this.nombre = nombre;
        } else
            new Empleado();
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {

        if (apellidos.length() >= 3 && apellidos.length() <= 60) {
            this.apellidos = apellidos;
        } else
            new Empleado();
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {

        if (telefono.length() == 12) {

            this.telefono = telefono;
        }

    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    @Override
    public String toString() {
        return "Empleado [nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono + ", contrato="
                + contrato + "]";
    }

}
