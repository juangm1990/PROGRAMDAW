package Tareas.Tema_5;

public class Persona {
    
    private String telefono, email, fechaNac, dni;

    public Persona() {

        this.telefono = "765892541";
        this.email = "correo@alu.medac.es";
        this.fechaNac = "01/01/2000";
        this.dni = "30529789A";
    }

    public Persona(String tel, String em, String nac, String d) {

        this.telefono = tel;
        this.email = em;
        this.fechaNac = nac;
        this.dni = d;
    }

    public String getTelefono() {

        return this.telefono;
    }

    public void setTelefono(String tel) {

        this.telefono = tel;
    }

    public String getEmail() {

        return this.email;
    }

    public void setEmail(String em) {

        this.email = em;
    }

    public String getFechaNac() {

        return this.fechaNac;
    }

    public void setFechaNac(String nac) {

        this.fechaNac = nac;
    }

    public String getDni() {

        return this.dni;
    }

    public void setDni(String d) {

        this.dni = d;
    }

    public String toString() {

        return "Teléfono: " + telefono + " " +
                "Email: " + email + " " +
                "Fecha de Nacimiento: " + fechaNac + " " +
                "DNI: " + dni;
    }
}
