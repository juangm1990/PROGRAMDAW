package clases.ejercicio4;

public class Coche {

    // PRIMERO
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private int velocidadActual;
    private boolean arrancado;
    // PRIMERO

    public Coche(String mat, String mar, String mod, String col) {

        // SEGUNDO
        this.matricula = mat;
        this.marca = mar;
        this.modelo = mod;
        this.color = col;
        this.velocidadActual = 0;
        this.arrancado = false;

    }

    //CUARTO
    public boolean arrancar(){
        if (this.velocidadActual==0 && !this.arrancado) { // !this.arrancado = this.arrancado == false.
            this.arrancado = true;
            return true;

        }

        return false;

    }


    // TERCERO: CONSTRUCTOR
    public String toString(){
        return "Matrícula" + this.matricula +
        "Marca" + this.marca +
        "Modelo" + this.modelo +
        "Color" + this.color +
        "Velocidad Actual" + this.velocidadActual +
        "Arrancado" + this.arrancado;
    }

}
