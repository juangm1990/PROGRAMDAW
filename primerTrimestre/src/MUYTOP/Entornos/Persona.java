package Entornos;

public class Persona {

    private String nombre;
    private String apellidos;
    private String fechaNac;
    private int edad;
    private Dni dni;

    public Persona(String n, String ape, String fec, int e) {

        this.nombre = n;
        this.apellidos = ape;
        this.fechaNac = fec;
        this.edad = e;
    }

    public String getNombre() {

        return this.nombre;
    }

    public void setNombre(String n) {

        this.nombre = n;
    }

    public String getApellidos() {

        return this.apellidos;
    }

    public void setApellidos(String ape) {

        this.apellidos = ape;
    }

    public String getFechaNac() {

        return this.fechaNac;
    }

    public void setFechaNac(String fec) {

        this.fechaNac = fec;
    }

    public int getEdad() {

        return this.edad;
    }

    public void setEdad(int e) {

        this.edad = e;
    }

    public Dni getDni() {

        return this.dni;
    }

    public void setDni(Dni d) {

        this.dni = d;
    }

    public String toString() {

        return "Nombre: " + this.nombre + " - " +
                "Apellidos: " + this.apellidos + " - " +
                "Fecha de Nacimientos: " + this.fechaNac + " - " +
                "Edad: " + this.edad;
    }
}
