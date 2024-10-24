package clases.ejercicio1;

public class Main {

    public static void main(String[] args) throws Exception {

        /*
         * Archivo para configurar y darle acción al programa.
         * 
         * Coche (verde): Objeto (nombre y variable).
         * Coche (amarillo): Función.
         * La clase hay que crearla en otro archivo para enlazarla dentro de otro
         * archivo .Java.
         */

        Persona p1 = new Persona("Paco", "10/09/1990");
        Persona p2 = new Persona("Juan", "07/07/1990");

        System.out.println(p1.toString());
        System.out.println(p2.toString());

        Persona[] personas = { p1, p2 };

        for (int i = 0; i < personas.length; i++) {

            // Se omite poner .toString
            System.out.println(personas[i]);
        }

    }

}
