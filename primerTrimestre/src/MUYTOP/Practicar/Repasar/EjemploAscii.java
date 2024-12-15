package Practicar.Repasar;

public class EjemploAscii {
    public static void main(String[] args) {

        System.out.println("Muestra todos los caracteres ASCII");

        /*
         * Muestro los caracteres con sout
         * Utilizo for para crear un bucle que vaya del 0 al 127 y muestre los
         * caracteres ascii con el sout
         */

        for (int codigo = 0; codigo < 128; codigo++) {

            System.out.println("El codigo ASCII es " + (char) codigo);
        }
    }
}
