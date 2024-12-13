import java.util.regex.Pattern;

public class Persona {
    private String nombre;
    private String Apellidos;
    private String telefono;
    private Contrato Contrato;

    //por defecto
    public Persona(){
        
        this.nombre=" nombre";
        this.Apellidos = "Apellidos";
        this.telefono = "+3400000";

    }
    //parametros
    public Persona (String n, String a, String t){
        this();
        if (n.length()>=3&&n.length()<=20&&a.length()>=3&&a.length()<=60&&verificarTelefono(t)) {
            this.nombre=n;  
            this.Apellidos=a;
            this.telefono=t;
        }

       
    }
    //copia 
    public Persona (Persona copia){
        this.nombre=copia.nombre;
        this.Apellidos=copia.Apellidos;
        this.telefono=copia.telefono;
    }
    
    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        if (nombre.length()>3&&nombre.length()<20) {
            this.nombre=nombre;
        }
  
    }




    public String getApellidos() {
        return Apellidos;
    }



    public void setApellidos(String apellidos) {
         if (apellidos.length()>3&&apellidos.length()<60) {
            this.Apellidos=apellidos;
        }

    }



    public String getTelefono() {
        return telefono;
    }



    public void setTelefono(String telefono) {
        if (verificarTelefono(telefono)) {
            this.telefono=telefono;
        }
  
    }



    public Contrato getContrato() {
        return Contrato;
    }
    public void setContrato(Contrato contrato) {
        Contrato = contrato;
    }


    public boolean verificarTelefono(String n){
        String regla= "^\\+34\\d{12}$";
        boolean comprobar =Pattern.matches(regla, n);
        if (comprobar) {
            return true;
        }
        else{
            return false;
        }
    }
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", Apellidos=" + Apellidos + ", telefono=" + telefono + "]";
    }
    
}
