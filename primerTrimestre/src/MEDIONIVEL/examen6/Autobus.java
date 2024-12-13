package examen6;

public class Autobus extends Vehiculo {

    private double precioKm = 10;
    private double cantKmAl;
    private double cantKmDev;

    public Autobus(String matricula, boolean alquilado) {
        super(matricula, alquilado);
    }

    public double getPrecioKm() {
        return precioKm;
    }

    public void setPrecioKm(double precioKm) {
        this.precioKm = precioKm;
    }

    public double getCantKmAl() {
        return cantKmAl;
    }

    public void setCantKmAl(double cantKmAl) {
        this.cantKmAl = cantKmAl;
    }

    public double getCantKmDev() {
        return cantKmDev;
    }

    public void setCantKmDev(double cantKmDev) {
        this.cantKmDev = cantKmDev;
    }

    @Override
    public String toString() {
        return "Autobus [precioKm=" + precioKm + ", cantKmAl=" + cantKmAl + ", cantKmDev=" + cantKmDev + "]";
    }

  
    public void alquilar(double km) {

        this.cantKmAl = km;

        if (!alquilado) {
            alquilado = true;
        } else {
            System.out.println("Error, este autobus esta alquilado");
        }

    }

    
    public void devolver(double kmdev) {

        this.cantKmDev=kmdev;

        if (!alquilado) {
            System.out.println("Error, este autobus no esta alquilado");
        } else {

            alquilado = false;

        }

    }

    public void importe() {

        double importe;

        importe= precioKm * (cantKmDev - cantKmAl);
        System.out.println("el total de su importe es "+importe);
    }

}
