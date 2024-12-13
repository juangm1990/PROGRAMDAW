package examen6;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Tractor extends Vehiculo {

    private double precioDia=10;
    private LocalDateTime fechaAl;
    private LocalDateTime fechaDev;


    public Tractor(String matricula, boolean alquilado) {
        super(matricula, alquilado);
       
    }

   

    public double getPrecioDia() {
        return precioDia;
    }


    public void setPrecioDia(double precioDia) {
        this.precioDia = precioDia;
    }


    public LocalDateTime getFechaAl() {
        return fechaAl;
    }


    public void setFechaAl(LocalDateTime fechaAl) {
        this.fechaAl = fechaAl;
    }


    public LocalDateTime getFechaDev() {
        return fechaDev;
    }


    public void setFechaDev(LocalDateTime fechaDev) {
        this.fechaDev = fechaDev;
    }


    @Override
    public String toString() {
        return "Tractor [precioDia=" + precioDia + ", fechaAl=" + fechaAl + ", fechaDev=" + fechaDev + "]";
    }

    @Override
    public void alquilar(){

        if(!alquilado){
        this.fechaAl=LocalDateTime.now();
        alquilado=true;
        }
        else{System.out.println("Error, este tractor esta alquilado");}

    }
    @Override
    public void devolver(){


        if(!alquilado){
            System.out.println("Error, este tractor no esta alquilado");
            }
            else{
                this.fechaDev=LocalDateTime.now();
                this.fechaDev=fechaDev.plusDays(3);
                alquilado=false;

                
            }    
    }

    public void importe(){

        double importe;

        importe=precioDia*((int)ChronoUnit.DAYS.between(this.fechaAl,this.fechaDev));
        System.out.println("El total de su importe es "+importe);
    }
  

    


    
}
