package Tareas.Tema_7;

public class Persona {
        
    private String telefono;
    private String email;
    private String fechaNac;
    private String dni;

    public Persona(String tel, String e, String fec, String d) {

        this.telefono = tel;
        this.email = e;
        this.fechaNac = fec;
        this.dni = d;

    }

    public Persona() {

        this.telefono = "957112233";
        this.email = "nombreapellido@gmail.com";
        this.fechaNac = "01/01/2000";
        this.dni = "30112233N";
    }

    public Persona(Persona copia) {

        this.telefono = copia.telefono;
        this.email = copia.email;
        this.fechaNac = copia.fechaNac;
        this.dni = copia.dni;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public boolean calcularLetra() {

        char [] letras= {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        int numero = Integer.parseInt(this.dni.charAt(0) + "" + this.dni.charAt(1) + "" + this.dni.charAt(2) + "" +
                        this.dni.charAt(3) + "" + this.dni.charAt(4) + "" + this.dni.charAt(5) + "" +
                        this.dni.charAt(6) + "" + this.dni.charAt(7));
        
        int resto = numero % 23;

        char letra = letras[resto];

        if (this.dni.charAt(8) == letra) {

            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return "Persona [telefono=" + telefono + ", email=" + email + ", fechaNac=" + fechaNac + ", dni=" + dni + "]";
    }
}
