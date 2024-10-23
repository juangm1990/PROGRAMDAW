package clases.ejercicio4;

public class Coche {

    // PRIMERO
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private int velocidadActual;
    private boolean arrancado;

    private final static int velocidadMaxima = 120; // Crear la velocidad de 120 Km/h.
    // PRIMERO

    public Coche(String mat, String mar, String mod, String col) {

        // SEGUNDO
        this.matricula = mat;
        this.marca = mar;
        this.modelo = mod;
        this.color = col;
        this.velocidadActual = 0;
        this.arrancado = false;
        // SEGUNDO

    }

    // CUARTO
    public boolean arrancar() {
        if (this.velocidadActual == 0 && !this.arrancado) { // !this.arrancado = this.arrancado == false.
            this.arrancado = true;
            return true;

        }

        return false;

    }

    public boolean parar() {
        if (this.velocidadActual == 0 && this.arrancado) {
            this.arrancado = false;
            return true;
        }

        return false;
    }

    public void acelerar(int vel) {
        if (this.arrancado) {
            if (this.velocidadActual + vel >= velocidadMaxima) { // 120 Km/h no se va a modificar así que hay que crear
                                                                 // una constante en la clase.
                this.velocidadActual = velocidadMaxima;
            } else {
                this.velocidadActual += vel; // this.velocidadActual = this.velocidadActual + vel.
            }
        }

    }

    // TERCERO: CONSTRUCTOR
    public String toString() {
        return "Matrícula " + this.matricula +
                " Marca " + this.marca +
                " Modelo " + this.modelo +
                " Color " + this.color +
                " Velocidad Actual " + this.velocidadActual +
                " Arrancado " + this.arrancado;
    }
    // TERCERO: CONSTRUCTOR

}
