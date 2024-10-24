package clases.ejercicio4;

public class Main {
    /*
     * Archivo para configurar y darle acción al programa.
     * 
     * Coche (verde): Objeto (nombre y variable).
     * Coche (amarillo): Función.
     * La clase hay que crearla en otro archivo para enlazarla dentro de otro archivo .Java.
     */

    public static void main(String[] args) throws Exception {

        Coche c1 = new Coche("1458BGK", "Audi", "A4", "Blanco");
        Coche c2 = new Coche("1668AAA", "Peugeot", "Peugeot", "Negro");

        c1.arrancar();
        c1.acelerar(20);
        c1.acelerar(100);

        c2.arrancar();
        c2.parar();

        System.out.println(c1);
        System.out.println(c2);

    }

}
