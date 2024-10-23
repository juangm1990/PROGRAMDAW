package clases.ejercicio1;

public class Clases {
    public static void main(String[] args) throws Exception {

        /*
         * Persona (verde): objeto (nombre y variable).
         * Persona (amarillo): función.
         * La clase hay que crearla en otro archivo para enlazarla dentro de una
         * carpeta.
         */

        Persona p1 = new Persona("Paco", "10/09/1990");
        Persona p2 = new Persona("Juan", "07/07/1990");

        System.out.println(p1.toString());
        System.out.println(p2.toString());

        Persona [] personas = {p1,p2};

        for (int i = 0; i < personas.length; i++){

            // Se omite poner .toString
            System.out.println(personas[i]);
        } 
        
    }
}
