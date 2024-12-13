package examen6;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Vehiculo {

    protected String matricula;
    protected boolean alquilado = false;

    public Vehiculo(String matricula, boolean alquilado) {
        this.matricula = matricula;
        this.alquilado = alquilado;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public boolean isAlquilado() {
        return alquilado;
    }

    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }

    @Override
    public String toString() {
        return "Vehiculo [matricula=" + matricula + ", alquilado=" + alquilado + "]";
    }
    
    public void alquilar() {

        if (!alquilado) {
            alquilado = true;
        } else {
            System.out.println("Error, este vehiculo esta alquilado");
        }

    }
    
    public void devolver() {

        if (!alquilado) {
            System.out.println("Error, este vehiculo no esta alquilado");
        } 
        else{alquilado = true;}

    }

}
