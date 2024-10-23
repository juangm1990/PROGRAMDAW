package PRIMER_TRIMESTRE.tema4.funciones.metodos;

public class Metodos2 {
    public static void main(String[] args) throws Exception {

        /*
         * Vamos a coger una frase y vamos a transformar las A en guiones
         */

        String frase = "castillo amarillo";
        String nuevaFrase = frase.replace('a', '-');

        System.out.println(nuevaFrase);

        for (int i = 0; i < frase.length(); i++){

            if (frase.charAt(i) == 'a') {

                System.out.println('-');

            } else {
                System.out.println(frase.charAt(i));
            }

        }

    }
}
