package tema1.operacionesMatematicas.scanner;

import java.util.Scanner;

public class Hipotenusa {
    public static void main(String[] args) throws Exception {

        /*
         * Mostrar por consola:
         * Hipotenusa de un triángulo rectángulo, sabiendo sus dos catetos.
         */

        Scanner input = new Scanner(System.in);

        double hipotenusa = 0;
        int cateto1 = 0;
        int cateto2 = 0;

        System.out.println("Introduce el primer cateto: ");
        cateto1 = input.nextInt();

        System.out.println("Introduce el segundo cateto");
        cateto2 = input.nextInt();

        hipotenusa = Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
        System.out.println("La hipotenusa del triángulo rectángulo es: "+ hipotenusa);

        input.close();
    }
}