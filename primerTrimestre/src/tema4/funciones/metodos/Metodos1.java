package tema4.funciones.metodos;
public class Metodos1 {
    public static void main(String[] args) throws Exception {

        
        /*
         * Vamos a coger una frase y vamos a transformar las A en guiones
         */


        String frase = "castillo amarillo";

        frase.replace('a', '-');

        String nuevaFrase = frase.replace('a', '-');
        System.out.println(nuevaFrase);



    }
}
