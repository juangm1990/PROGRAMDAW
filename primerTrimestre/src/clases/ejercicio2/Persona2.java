package clases.ejercicio2;

public class Persona2 {

    private int edad;

    public Persona2(int e) {

       if (validarEdad(e)) {
        this.edad=e;
       }
       this.edad=e;
    }

    public void SetEdad(int e){
        if (e<0 && e<140) {
            this.edad=e;
        }
    }

    public String toString() {
        return "Edad " + this.edad;


    }

    private boolean validarEdad(int ed){

        if(ed>0 && ed <=150){
            return true;
        }

        return false;
    }
}
